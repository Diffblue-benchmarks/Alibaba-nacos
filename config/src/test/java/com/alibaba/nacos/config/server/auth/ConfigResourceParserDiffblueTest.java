package com.alibaba.nacos.config.server.auth;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConfigResourceParserDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void parseNameTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new ConfigResourceParser()).parseName("foo");
  }
}

