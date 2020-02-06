package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DumpAllBetaProcessorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new DumpAllBetaProcessor(new DumpService())).persistService);
  }
}

