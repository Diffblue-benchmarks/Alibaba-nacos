package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class DiskUtilDiffblueTest {
  @Test(timeout=10000)
  public void getLocalConfigMd5Test() throws IOException {
    // Arrange
    String actualLocalConfigMd5 = DiskUtil.getLocalConfigMd5("123", "foo", "foo");
    String actualLocalConfigMd51 = DiskUtil.getLocalConfigMd5("", "foo", "foo");

    // Act and Assert
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", actualLocalConfigMd5);
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", actualLocalConfigMd51);
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", DiskUtil.getLocalConfigMd5("123", "foo", ""));
  }

  @Test(timeout=10000)
  public void relativePathTest() {
    // Arrange, Act and Assert
    assertEquals("/data/config-data/123/foo", DiskUtil.relativePath("123", "foo"));
  }

  @Test(timeout=10000)
  public void getConfigTest() throws IOException {
    // Arrange
    String actualConfig = DiskUtil.getConfig("123", "foo", "foo");
    String actualConfig1 = DiskUtil.getConfig("", "foo", "foo");

    // Act and Assert
    assertEquals("", actualConfig);
    assertEquals("", actualConfig1);
    assertEquals("", DiskUtil.getConfig("123", "foo", ""));
  }
}

