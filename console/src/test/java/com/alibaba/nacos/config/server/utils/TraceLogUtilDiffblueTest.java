package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TraceLogUtilDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    org.slf4j.Logger logger = (new TraceLogUtil()).requestLog;
    org.slf4j.Logger logger1 = TraceLogUtil.requestLog;
    assertSame(logger, logger1);
    assertTrue(logger1 instanceof ch.qos.logback.classic.Logger);
    assertSame(logger, logger1);
  }
}

