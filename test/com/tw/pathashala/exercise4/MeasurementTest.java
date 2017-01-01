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

  @Test
  public void expect1KilometreEquals100000Centimetre() {
    assertEquals(new Measurement(1, KILOMETRE), new Measurement(100000, CENTIMETRE));
  }

  @Test
  public void expect100000CentimetreEquals1Kilometre() {
    assertEquals(new Measurement(100000, CENTIMETRE), new Measurement(1, KILOMETRE));
  }

  @Test
  public void expect1KilometreEquals1000Metre() {
    assertEquals(new Measurement(1, KILOMETRE), new Measurement(1000, METRE));
  }

  @Test
  public void expect100MetreEquals1Kilometre() {
    assertEquals(new Measurement(1000, METRE), new Measurement(1, KILOMETRE));
  }

  @Test
  public void expect1KilometreNotEquals99Metre() {
    assertNotEquals(new Measurement(1, KILOMETRE), new Measurement(99, METRE));
  }

  @Test
  public void expect1KilogramEquals1000Gram() {
    assertEquals(new Measurement(1, KILOGRAM), new Measurement(1000, GRAM));
  }

  @Test
  public void expect1000GramEquals1Kilogram() {
    assertEquals(new Measurement(1000, GRAM), new Measurement(1, KILOGRAM));
  }

  @Test
  public void expect1KilogramNotEquals999Gram() {
    assertNotEquals(new Measurement(1, KILOGRAM), new Measurement(999, GRAM));
  }

  @Test
  public void expect1KilogramNotEquals1Kilometre() {
    assertNotEquals(new Measurement(1, KILOGRAM), new Measurement(1, KILOMETRE));
  }
}