package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class DiskUtilDiffblueTest {
  @Test(timeout=10000)
  public void getLocalConfigMd5Test() throws IOException {
    // Arrange, Act and Assert
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", DiskUtil.getLocalConfigMd5("123", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void relativePathTest() {
    // Arrange, Act and Assert
    assertEquals("/data/config-data/123/foo", DiskUtil.relativePath("123", "foo"));
  }

  @Test(timeout=10000)
  public void getConfigTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals("", DiskUtil.getConfig("123", "foo", "foo"));
  }
}

