package com.tw.pathashala.exercise4;

import static com.tw.pathashala.exercise4.Unit.*;

//Represents a value for length
public class Measurement {
  MeasurementValue value;

  public Measurement(int value, Unit unit) {
    this.value = new MeasurementValue(value, unit);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Measurement that = (Measurement) o;
    return this.value.equals(that.value);
  }

  @Override
  public int hashCode() {
    return value != null ? value.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Measurement{" +
        "value=" + value +
        '}';
  }
}
