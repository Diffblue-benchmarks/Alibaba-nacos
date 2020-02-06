package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RegexParserDiffblueTest {
  @Test
  public void containsWildcardTest() {
    // Arrange, Act and Assert
    assertTrue(RegexParser.containsWildcard("*"));
  }

  @Test
  public void regexFormatTest() {
    // Arrange, Act and Assert
    assertEquals("^.*$", RegexParser.regexFormat("*"));
  }
}

