package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DumpAllProcessorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    DumpService dumpService = new DumpService();

    // Act
    DumpAllProcessor actualDumpAllProcessor = new DumpAllProcessor(dumpService);

    // Assert
    assertNull(actualDumpAllProcessor.persistService);
    assertSame(dumpService, actualDumpAllProcessor.dumpService);
  }
}

