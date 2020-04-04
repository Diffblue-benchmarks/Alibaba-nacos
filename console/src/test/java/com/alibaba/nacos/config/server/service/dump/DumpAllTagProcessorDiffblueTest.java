package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DumpAllTagProcessorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new DumpAllTagProcessor(new DumpService())).persistService);
  }
}

