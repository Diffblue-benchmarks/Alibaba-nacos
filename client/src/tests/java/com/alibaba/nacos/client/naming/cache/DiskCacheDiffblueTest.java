package com.alibaba.nacos.client.naming.cache;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DiskCacheDiffblueTest {
  @Test(timeout=10000)
  public void readTest() {
    // Arrange, Act and Assert
    assertEquals(0, DiskCache.read("foo").size());
  }

  @Test(timeout=10000)
  public void getLineSeparatorTest() {
    // Arrange, Act and Assert
    assertEquals("\n", DiskCache.getLineSeparator());
  }
}

