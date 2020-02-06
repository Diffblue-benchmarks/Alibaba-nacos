package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class YmlChangeParserDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void doParseTest3() {
    // Arrange, Act and Assert
    assertEquals(0, (new YmlChangeParser()).doParse("", "", "foo").size());
  }
  @Test
  public void doParseTest2() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new YmlChangeParser()).doParse("", "foo", "foo");
  }
  @Test
  public void doParseTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new YmlChangeParser()).doParse("foo", "foo", "foo");
  }
}

