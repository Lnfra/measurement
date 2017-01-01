package com.tw.pathashala.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeasurementTest {

  @Test
  public void expect1FootEquals12Inch() {
    assertEquals(new Measurement(1, "foot"), new Measurement(12, "inch"));
  }

  @Test
  public void expect12InchEquals1Foot() {
    assertEquals(new Measurement(12, "inch"), new Measurement(1, "foot"));
  }
}