package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class PropertiesChangeParserDiffblueTest {
  @Test
  public void doParseTest3() throws IOException {
    // Arrange, Act and Assert
    assertEquals(1, (new PropertiesChangeParser()).doParse("", "foo", "foo").size());
  }

  @Test
  public void doParseTest2() throws IOException {
    // Arrange, Act and Assert
    assertEquals(1, (new PropertiesChangeParser()).doParse("foo", "", "foo").size());
  }

  @Test
  public void doParseTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals(0, (new PropertiesChangeParser()).doParse("foo", "foo", "foo").size());
  }
}

