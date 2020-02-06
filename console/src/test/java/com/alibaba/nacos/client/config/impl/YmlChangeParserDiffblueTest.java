package com.alibaba.nacos.client.config.impl;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.yaml.snakeyaml.parser.ParserException;

public class YmlChangeParserDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void doParseTest() {
    // Arrange, Act and Assert
    thrown.expect(ParserException.class);
    (new YmlChangeParser()).doParse("[", "[", "[");
  }
}

