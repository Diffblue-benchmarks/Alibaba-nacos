package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class DiskUtilDiffblueTest {
  @Test
  public void testGetConfig() throws IOException {
    // Arrange
    String actualConfig = DiskUtil.getConfig("123", "UTF-8", "UTF-8");

    // Act and Assert
    assertEquals("", actualConfig);
    assertEquals("", DiskUtil.getConfig("123", "UTF-8", ""));
  }

  @Test
  public void testGetLocalConfigMd5() throws IOException {
    // Arrange, Act and Assert
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", DiskUtil.getLocalConfigMd5("123", "UTF-8", "UTF-8"));
  }

  @Test
  public void testRelativePath() {
    // Arrange, Act and Assert
    assertEquals("/data/config-data/123/UTF-8", DiskUtil.relativePath("123", "UTF-8"));
  }
}

