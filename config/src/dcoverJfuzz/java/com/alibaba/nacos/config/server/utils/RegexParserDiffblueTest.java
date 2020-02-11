package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RegexParserDiffblueTest {
  @Test(timeout=10000)
  public void containsWildcardTest() {
    // Arrange
    boolean actualContainsWildcardResult = RegexParser.containsWildcard("foo");

    // Act and Assert
    assertFalse(actualContainsWildcardResult);
    assertTrue(RegexParser.containsWildcard("?"));
  }

  @Test(timeout=10000)
  public void regexFormatTest() {
    // Arrange
    String actualRegexFormatResult = RegexParser.regexFormat("foo");

    // Act and Assert
    assertEquals("^foo$", actualRegexFormatResult);
    assertEquals("^\\^$", RegexParser.regexFormat("^"));
  }
}

