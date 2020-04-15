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
    boolean actualIsBlankResult1 = StringUtils.isBlank(null);

    // Act and Assert
    assertFalse(actualIsBlankResult);
    assertTrue(actualIsBlankResult1);
    assertTrue(StringUtils.isBlank(""));
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
    boolean actualIsNotEmptyResult1 = StringUtils.isNotEmpty(null);

    // Act and Assert
    assertTrue(actualIsNotEmptyResult);
    assertFalse(actualIsNotEmptyResult1);
    assertFalse(StringUtils.isNotEmpty(""));
  }

  @Test
  public void testSubstringBetween() {
    // Arrange
    String actualSubstringBetweenResult = StringUtils.substringBetween("str", "open", "close");
    String actualSubstringBetweenResult1 = StringUtils.substringBetween(null, "open", "close");
    String actualSubstringBetweenResult2 = StringUtils.substringBetween("str", null, "close");
    String actualSubstringBetweenResult3 = StringUtils.substringBetween("str", "open", null);
    String actualSubstringBetweenResult4 = StringUtils.substringBetween("str", "", "close");

    // Act and Assert
    assertNull(actualSubstringBetweenResult);
    assertNull(actualSubstringBetweenResult1);
    assertNull(actualSubstringBetweenResult2);
    assertNull(actualSubstringBetweenResult3);
    assertNull(actualSubstringBetweenResult4);
    assertEquals("", StringUtils.substringBetween("str", "", ""));
  }
}

