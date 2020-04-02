package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RegexParserDiffblueTest {
  @Test
  public void testContainsWildcard() {
    // Arrange
    boolean actualContainsWildcardResult = RegexParser.containsWildcard("*");

    // Act and Assert
    assertTrue(actualContainsWildcardResult);
    assertFalse(RegexParser.containsWildcard("regex"));
  }

  @Test
  public void testRegexFormat() {
    // Arrange
    String actualRegexFormatResult = RegexParser.regexFormat("*");
    String actualRegexFormatResult1 = RegexParser.regexFormat("^");
    String actualRegexFormatResult2 = RegexParser.regexFormat("?");

    // Act and Assert
    assertEquals("^.*$", actualRegexFormatResult);
    assertEquals("^\\^$", actualRegexFormatResult1);
    assertEquals("^.{1}$", actualRegexFormatResult2);
    assertEquals("^regex$", RegexParser.regexFormat("regex"));
  }
}

