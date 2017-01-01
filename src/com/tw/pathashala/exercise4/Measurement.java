package com.tw.pathashala.exercise4;

import static com.tw.pathashala.exercise4.Unit.*;

//Represents a value for length
public class Measurement {

  private final int value;
  private final Unit unit;

  public Measurement(int value, Unit unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Measurement that = (Measurement) o;
    return this.unit.convertToBase(this.value) == that.unit.convertToBase(that.value);
  }

  @Override
  public int hashCode() {
    int result = value;
    result = 31 * result + (unit != null ? unit.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Measurement{" +
        "value=" + value +
        ", unit='" + unit + '\'' +
        '}';
  }
}
