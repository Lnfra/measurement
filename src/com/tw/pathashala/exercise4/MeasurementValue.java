package com.tw.pathashala.exercise4;

//Represents a value with a corresponding unit.
public class MeasurementValue {
  private final int value;
  private final Unit unit;

  public MeasurementValue(int value, Unit unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    MeasurementValue that = (MeasurementValue) o;

    return this.unit.isCompatibleUnitType(that.unit) &&
        (this.unit.convertToBase(this.value) == that.unit.convertToBase(that.value));
  }

  @Override
  public int hashCode() {
    int result = value;
    result = 31 * result + (unit != null ? unit.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MeasurementValue{" +
        "value=" + value +
        ", unit=" + unit +
        '}';
  }
}
