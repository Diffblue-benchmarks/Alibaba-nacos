package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MysqlHealthCheckProcessorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("MYSQL", (new MysqlHealthCheckProcessor()).getType());
  }
}

