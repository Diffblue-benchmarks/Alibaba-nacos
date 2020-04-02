package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DumpProcessorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    DumpService dumpService = new DumpService();

    // Act and Assert
    assertSame((new DumpProcessor(dumpService)).dumpService, dumpService);
  }
}

