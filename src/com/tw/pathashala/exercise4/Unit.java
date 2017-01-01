package com.tw.pathashala.exercise4;

public enum Unit {
  INCH(1), FOOT(12), CENTIMETRE(1), METRE(100), KILOMETRE(100000);

  private final int conversionFactor;

  Unit(int conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  int convertToBase( int value ) {
    return value * conversionFactor;
  }
}
