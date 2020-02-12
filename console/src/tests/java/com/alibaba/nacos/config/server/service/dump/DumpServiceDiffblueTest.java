package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DumpServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void initTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new DumpService()).init();
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DumpService actualDumpService = new DumpService();

    // Assert
    assertEquals(Boolean.valueOf(false), actualDumpService.isQuickStart);
    assertEquals(0, actualDumpService.total);
  }
}

