package com.tw.pathashala.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeasurementValueTest {
  @Test
  public void expect1KilogramAdd2KilogramEquals3Kilogram() {
    assertEquals(new MeasurementValue(1, Unit.KILOGRAM).addition(new MeasurementValue(2, Unit.KILOGRAM)),
        new MeasurementValue(3, Unit.KILOGRAM));
  }
}