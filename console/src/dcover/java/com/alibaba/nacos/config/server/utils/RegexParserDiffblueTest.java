package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class RegexParserDiffblueTest {
  @Test(timeout=10000)
  public void containsWildcardTest() {
    // Arrange, Act and Assert
    assertFalse(RegexParser.containsWildcard("foo"));
  }

  @Test(timeout=10000)
  public void regexFormatTest() {
    // Arrange, Act and Assert
    assertEquals("^foo$", RegexParser.regexFormat("foo"));
  }
}

