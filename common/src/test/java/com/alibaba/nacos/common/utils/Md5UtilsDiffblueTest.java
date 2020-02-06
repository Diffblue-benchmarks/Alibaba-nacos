package com.alibaba.nacos.common.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Md5UtilsDiffblueTest {
  @Test
  public void getMD5Test2() {
    // Arrange, Act and Assert
    assertEquals("", Md5Utils.getMD5("aaaaa", "aaaaa"));
  }

  @Test
  public void getMD5Test() {
    // Arrange, Act and Assert
    assertEquals("1681ffc6e046c7af98c9e6c232a3fe0a", Md5Utils.getMD5(new byte[24]));
  }
}

