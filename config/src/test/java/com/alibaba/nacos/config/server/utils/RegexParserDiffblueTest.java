package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RegexParserDiffblueTest {
  @Test
  public void containsWildcardTest() {
    // Arrange
    boolean actualContainsWildcardResult = RegexParser.containsWildcard("foo");
    boolean actualContainsWildcardResult1 = RegexParser.containsWildcard("?");

    // Act and Assert
    assertFalse(actualContainsWildcardResult);
    assertTrue(actualContainsWildcardResult1);
    assertTrue(RegexParser.containsWildcard("*"));
  }

  @Test
  public void regexFormatTest() {
    // Arrange
    String actualRegexFormatResult = RegexParser.regexFormat("foo");

    // Act and Assert
    assertEquals("^foo$", actualRegexFormatResult);
    assertEquals("^\\^$", RegexParser.regexFormat("^"));
  }
}

