package com.alibaba.nacos.core.auth;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DefaultResourceParserDiffblueTest {
  @Test
  public void parseNameTest() {
    // Arrange, Act and Assert
    assertEquals("", (new DefaultResourceParser()).parseName("aaaaa"));
  }
}

