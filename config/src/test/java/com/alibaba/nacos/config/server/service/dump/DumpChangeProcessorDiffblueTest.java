package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DumpChangeProcessorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    DumpChangeProcessor actualDumpChangeProcessor = new DumpChangeProcessor(new DumpService(), null, null);

    // Assert
    assertNull(actualDumpChangeProcessor.persistService);
    assertNull(actualDumpChangeProcessor.endTime);
    assertNull(actualDumpChangeProcessor.startTime);
  }
}

