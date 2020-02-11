package com.alibaba.nacos.config.server.monitor;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResponseMonitorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void getStringForPrintTest() {
    // Arrange, Act and Assert
    thrown.expect(ArithmeticException.class);
    ResponseMonitor.getStringForPrint();
  }
}

