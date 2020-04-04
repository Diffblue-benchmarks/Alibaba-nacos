package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SimpleReadWriteLockDiffblueTest {
  @Test
  public void testTryReadLock() {
    // Arrange, Act and Assert
    assertTrue((new SimpleReadWriteLock()).tryReadLock());
  }

  @Test
  public void testTryWriteLock() {
    // Arrange, Act and Assert
    assertTrue((new SimpleReadWriteLock()).tryWriteLock());
  }
}

