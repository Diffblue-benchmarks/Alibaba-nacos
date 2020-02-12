package com.alibaba.nacos.client.naming.cache;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.api.naming.pojo.ServiceInfo;
import java.util.Map;
import org.junit.Test;

public class DiskCacheDiffblueTest {
  @Test(timeout=10000)
  public void readTest() {
    // Arrange
    Map<String, ServiceInfo> readResult = DiskCache.read("foo");
    Map<String, ServiceInfo> readResult1 = DiskCache.read("");

    // Act
    Map<String, ServiceInfo> actualReadResult = DiskCache.read("[NA] failed to read cache file");

    // Assert
    assertEquals(0, readResult.size());
    assertEquals(0, readResult1.size());
    assertEquals(0, actualReadResult.size());
  }

  @Test(timeout=10000)
  public void getLineSeparatorTest() {
    // Arrange, Act and Assert
    assertEquals("\n", DiskCache.getLineSeparator());
  }
}

