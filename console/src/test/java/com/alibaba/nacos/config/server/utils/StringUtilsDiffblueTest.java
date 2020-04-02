package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringUtilsDiffblueTest {
  @Test
  public void testDefaultIfEmpty() {
    // Arrange
    String actualDefaultIfEmptyResult = StringUtils.defaultIfEmpty("str", "defaultStr");

    // Act and Assert
    assertEquals("str", actualDefaultIfEmptyResult);
    assertEquals("defaultStr", StringUtils.defaultIfEmpty(null, "defaultStr"));
  }

  @Test
  public void testEquals() {
    // Arrange
    boolean actualEqualsResult = StringUtils.equals("str1", "str2");
    boolean actualEqualsResult1 = StringUtils.equals(null, "str2");

    // Act and Assert
    assertFalse(actualEqualsResult);
    assertFalse(actualEqualsResult1);
    assertTrue(StringUtils.equals(null, null));
  }

  @Test
  public void testIsBlank() {
    // Arrange
    boolean actualIsBlankResult = StringUtils.isBlank("str");

    // Act and Assert
    assertFalse(actualIsBlankResult);
    assertTrue(StringUtils.isBlank(null));
  }

  @Test
  public void testIsEmpty() {
    // Arrange, Act and Assert
    assertFalse(StringUtils.isEmpty("str"));
  }

  @Test
  public void testIsNotEmpty() {
    // Arrange
    boolean actualIsNotEmptyResult = StringUtils.isNotEmpty("str");

    // Act and Assert
    assertTrue(actualIsNotEmptyResult);
    assertFalse(StringUtils.isNotEmpty(null));
  }

  @Test
  public void testSubstringBetween() {
    // Arrange
    String actualSubstringBetweenResult = StringUtils.substringBetween("str", "open", "close");
    String actualSubstringBetweenResult1 = StringUtils.substringBetween(null, "open", "close");
    String actualSubstringBetweenResult2 = StringUtils.substringBetween("str", null, "close");

    // Act and Assert
    assertNull(actualSubstringBetweenResult);
    assertNull(actualSubstringBetweenResult1);
    assertNull(actualSubstringBetweenResult2);
    assertNull(StringUtils.substringBetween("str", "open", null));
  }
}

