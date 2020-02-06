package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class DiskUtilDiffblueTest {
  @Test
  public void getLocalConfigMd5Test() throws IOException {
    // Arrange, Act and Assert
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", DiskUtil.getLocalConfigMd5("123", "foo", "foo"));
  }

  @Test
  public void relativePathTest() {
    // Arrange, Act and Assert
    assertEquals("/data/config-data/123/foo", DiskUtil.relativePath("123", "foo"));
  }

  @Test
  public void getConfigTest() throws IOException {
    // Arrange
    String actualConfig = DiskUtil.getConfig("123", "foo", "foo");
    String actualConfig1 = DiskUtil.getConfig("UTF-8", "foo", "foo");
    String actualConfig2 = DiskUtil.getConfig("", "foo", "foo");

    // Act and Assert
    assertEquals("foo", actualConfig);
    assertEquals("", actualConfig1);
    assertEquals("", actualConfig2);
    assertEquals("", DiskUtil.getConfig("123", "foo", ""));
  }
}

