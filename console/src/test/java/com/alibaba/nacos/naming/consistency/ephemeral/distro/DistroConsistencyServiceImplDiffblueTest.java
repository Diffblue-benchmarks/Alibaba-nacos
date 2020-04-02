package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DistroConsistencyServiceImplDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(0, (new DistroConsistencyServiceImpl()).notifier.getTaskSize());
  }
}

