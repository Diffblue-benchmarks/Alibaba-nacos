package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class PropertiesChangeParserDiffblueTest {
  @Test
  public void doParseTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals(0, (new PropertiesChangeParser()).doParse("properties", "properties", "properties").size());
  }
}

