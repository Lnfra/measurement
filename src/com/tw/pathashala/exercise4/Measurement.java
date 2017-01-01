package com.tw.pathashala.exercise4;

//Represents a value for length
public class Measurement {

  private final int value;
  private final String unit;

  public Measurement(int value, String unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Measurement that = (Measurement) o;
    return this.convertToInch() == that.convertToInch();
  }

  private int convertToInch(){
    if (this.unit.equals("foot")) {
      return value * 12;
    }
    return value;
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
