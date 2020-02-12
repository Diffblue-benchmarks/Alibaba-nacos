package com.alibaba.nacos.client.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringUtilsDiffblueTest {
  @Test(timeout=10000)
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertFalse(StringUtils.isEmpty("foo"));
  }

  @Test(timeout=10000)
  public void joinTest() {
    // Arrange, Act and Assert
    assertNull(StringUtils.join(null, "foo"));
  }

  @Test(timeout=10000)
  public void escapeJavaScriptTest() {
    // Arrange, Act and Assert
    assertEquals("foo", StringUtils.escapeJavaScript("foo"));
  }

  @Test(timeout=10000)
  public void substringBetweenTest() {
    // Arrange, Act and Assert
    assertNull(StringUtils.substringBetween("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void isNotBlankTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtils.isNotBlank("foo"));
  }

  @Test(timeout=10000)
  public void defaultIfEmptyTest() {
    // Arrange, Act and Assert
    assertEquals("foo", StringUtils.defaultIfEmpty("foo", "foo"));
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtils.equals("foo", "foo"));
  }

  @Test(timeout=10000)
  public void isNotEmptyTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtils.isNotEmpty("foo"));
  }

  @Test(timeout=10000)
  public void isBlankTest() {
    // Arrange, Act and Assert
    assertFalse(StringUtils.isBlank("foo"));
  }
}

