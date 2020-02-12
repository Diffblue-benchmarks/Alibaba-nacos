package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DumpAllProcessorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new DumpAllProcessor(new DumpService())).persistService);
  }
}

