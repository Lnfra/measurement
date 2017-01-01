package com.tw.pathashala.exercise4;

public enum Unit {
  FOOT(12), INCH(1);

  private final int conversionFactor;

  Unit(int conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  int convertToBase( int value ) {
    return value * conversionFactor;
  }
}
