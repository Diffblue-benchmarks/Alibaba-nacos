package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.sql.Timestamp;
import org.junit.Test;

public class DumpChangeProcessorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Timestamp startTime = new Timestamp(1L);

    // Act
    DumpChangeProcessor actualDumpChangeProcessor = new DumpChangeProcessor(new DumpService(), startTime, startTime);

    // Assert
    assertNull(actualDumpChangeProcessor.persistService);
    Timestamp timestamp = actualDumpChangeProcessor.endTime;
    assertSame(actualDumpChangeProcessor.startTime, timestamp);
    assertSame(timestamp, actualDumpChangeProcessor.startTime);
  }
}

