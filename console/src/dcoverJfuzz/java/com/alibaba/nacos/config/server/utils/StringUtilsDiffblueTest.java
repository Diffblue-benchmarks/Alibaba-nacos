package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringUtilsDiffblueTest {
  @Test(timeout=10000)
  public void isEmptyTest() {
    // Arrange
    boolean actualIsEmptyResult = StringUtils.isEmpty("foo");

    // Act and Assert
    assertFalse(actualIsEmptyResult);
    assertTrue(StringUtils.isEmpty(""));
  }

  @Test(timeout=10000)
  public void substringBetweenTest() {
    // Arrange
    String actualSubstringBetweenResult = StringUtils.substringBetween("foo", "foo", "foo");

    // Act and Assert
    assertNull(actualSubstringBetweenResult);
    assertNull(StringUtils.substringBetween("", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void defaultIfEmptyTest() {
    // Arrange
    String actualDefaultIfEmptyResult = StringUtils.defaultIfEmpty("foo", "foo");

    // Act and Assert
    assertEquals("foo", actualDefaultIfEmptyResult);
    assertEquals("foo", StringUtils.defaultIfEmpty("", "foo"));
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtils.equals("foo", "foo"));
  }

  @Test(timeout=10000)
  public void isNotEmptyTest() {
    // Arrange
    boolean actualIsNotEmptyResult = StringUtils.isNotEmpty("foo");

    // Act and Assert
    assertTrue(actualIsNotEmptyResult);
    assertFalse(StringUtils.isNotEmpty(""));
  }

  @Test(timeout=10000)
  public void isBlankTest() {
    // Arrange
    boolean actualIsBlankResult = StringUtils.isBlank("foo");

    // Act and Assert
    assertFalse(actualIsBlankResult);
    assertTrue(StringUtils.isBlank(""));
  }
}

