package com.tw.pathashala.exercise4;

import static com.tw.pathashala.exercise4.UnitType.LENGTH;
import static com.tw.pathashala.exercise4.UnitType.WEIGHT;

public enum Unit {
  INCH(1, LENGTH), FOOT(12, LENGTH),
  CENTIMETRE(1, LENGTH), METRE(100, LENGTH),
  KILOMETRE(100000, LENGTH), GRAM(1, WEIGHT), KILOGRAM(1000, WEIGHT);

  private final int conversionFactor;
  final UnitType unitType;

  Unit(int conversionFactor, UnitType unitType) {
    this.conversionFactor = conversionFactor;
    this.unitType = unitType;
  }

  int convertToBase( int value ) {
    return value * conversionFactor;
  }

  boolean isCompatibleUnitType(Unit otherUnit) {
    return this.unitType.equals(otherUnit.unitType);
  }
}
