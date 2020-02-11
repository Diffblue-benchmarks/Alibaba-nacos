package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DumpAllBetaProcessorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    DumpService dumpService = new DumpService();

    // Act
    DumpAllBetaProcessor actualDumpAllBetaProcessor = new DumpAllBetaProcessor(dumpService);

    // Assert
    assertNull(actualDumpAllBetaProcessor.persistService);
    assertSame(dumpService, actualDumpAllBetaProcessor.dumpService);
  }
}

