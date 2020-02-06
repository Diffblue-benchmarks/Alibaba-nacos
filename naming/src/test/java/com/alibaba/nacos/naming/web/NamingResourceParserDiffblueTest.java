package com.alibaba.nacos.naming.web;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NamingResourceParserDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void parseNameTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new NamingResourceParser()).parseName("foo");
  }
}

