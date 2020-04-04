package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import org.junit.Test;

public class SystemUtilsDiffblueTest {
  @Test
  public void testGetConfFilePath() {
    // Arrange and Act
    String actualConfFilePath = SystemUtils.getConfFilePath();

    // Assert
    assertEquals(String.join("", Paths.get(System.getProperty("user.home"), "nacos", "conf").toString(), "/"),
        actualConfFilePath);
  }

  @Test
  public void testGetIPsBySystemEnv() {
    // Arrange, Act and Assert
    assertEquals(0, SystemUtils.getIPsBySystemEnv("UTF-8").size());
  }

  @Test
  public void testGetLoad() {
    // Arrange, Act and Assert
    assertEquals(2.12f, SystemUtils.getLoad(), 0.0f);
  }

  @Test
  public void testGetSystemEnv() {
    // Arrange, Act and Assert
    assertNull(SystemUtils.getSystemEnv("UTF-8"));
  }

  @Test
  public void testReadClusterConf() throws IOException {
    // Arrange and Act
    List<String> actualReadClusterConfResult = SystemUtils.readClusterConf();

    // Assert
    assertEquals(2, actualReadClusterConfResult.size());
    assertEquals("192.168.1.2:8848", actualReadClusterConfResult.get(0));
    assertEquals("192.168.1.3", actualReadClusterConfResult.get(1));
  }
}

