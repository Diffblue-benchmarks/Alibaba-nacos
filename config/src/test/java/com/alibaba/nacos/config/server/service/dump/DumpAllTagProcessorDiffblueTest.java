package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DumpAllTagProcessorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    DumpService dumpService = new DumpService();

    // Act
    DumpAllTagProcessor actualDumpAllTagProcessor = new DumpAllTagProcessor(dumpService);

    // Assert
    assertSame(dumpService, actualDumpAllTagProcessor.dumpService);
    assertNull(actualDumpAllTagProcessor.persistService);
  }
}

