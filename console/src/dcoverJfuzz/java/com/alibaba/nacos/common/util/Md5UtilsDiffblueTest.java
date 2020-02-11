package com.alibaba.nacos.common.util;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class Md5UtilsDiffblueTest {
  @Test(timeout=10000)
  public void getMD5Test2() {
    // Arrange, Act and Assert
    assertEquals("", Md5Utils.getMD5("value", "foo"));
  }

  @Test(timeout=10000)
  public void getMD5Test() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals("14548bed5b3ce76eb53b75a859e1280c", Md5Utils.getMD5(byteArray));
  }
}

