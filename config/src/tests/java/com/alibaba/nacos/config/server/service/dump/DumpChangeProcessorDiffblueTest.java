package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DumpChangeProcessorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    DumpService dumpService = new DumpService();

    // Act
    DumpChangeProcessor actualDumpChangeProcessor = new DumpChangeProcessor(dumpService, null, null);

    // Assert
    assertNull(actualDumpChangeProcessor.persistService);
    assertSame(dumpService, actualDumpChangeProcessor.dumpService);
    assertNull(actualDumpChangeProcessor.endTime);
    assertNull(actualDumpChangeProcessor.startTime);
  }
}

