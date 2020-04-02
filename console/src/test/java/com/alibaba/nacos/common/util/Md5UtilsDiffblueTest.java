package com.alibaba.nacos.common.util;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class Md5UtilsDiffblueTest {
  @Test
  public void testGetMD5() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);

    // Act and Assert
    assertEquals("721e28c91df93c1171714c23dfba06e5", Md5Utils.getMD5(byteArray));
  }

  @Test
  public void testGetMD52() {
    // Arrange, Act and Assert
    assertEquals("", Md5Utils.getMD5("value", "encode"));
  }
}

