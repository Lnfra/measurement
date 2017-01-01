package com.tw.pathashala.exercise4;

import org.junit.Test;

import static com.tw.pathashala.exercise4.Unit.*;
import static org.junit.Assert.*;

public class MeasurementTest {

  @Test
  public void expect1FootEquals12Inch() {
    assertEquals(new Measurement(1, FOOT), new Measurement(12, INCH));
  }

  @Test
  public void expect12InchEquals1Foot() {
    assertEquals(new Measurement(12, INCH), new Measurement(1, FOOT));
  }

  @Test
  public void expect1FootNotEquals13Inch() {
    assertNotEquals(new Measurement(1, FOOT), new Measurement(13, INCH));
  }

  @Test
  public void expect1MetreEquals100Centimetre() {
    assertEquals(new Measurement(1, METRE), new Measurement(100, CENTIMETRE));
  }

  @Test
  public void expect100CentimetreEquals1Metre() {
    assertEquals(new Measurement(100, CENTIMETRE), new Measurement(1, METRE));
  }

  @Test
  public void expect1MetreNotEquals99Centimetre() {
    assertNotEquals(new Measurement(1, METRE), new Measurement(99, CENTIMETRE));
  }
}