package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.junit.Test;

public class MD5UtilDiffblueTest {
  @Test(timeout=10000)
  public void toStringTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(
        "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001",
        MD5Util.toString(new ByteArrayInputStream(byteArray), "UTF-8"));
  }

  @Test(timeout=10000)
  public void compareMd5ResultStringTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals("", MD5Util.compareMd5ResultString(null));
  }

  @Test(timeout=10000)
  public void getClientMd5MapTest() {
    // Arrange, Act and Assert
    assertEquals(0, MD5Util.getClientMd5Map("foo").size());
  }
}

