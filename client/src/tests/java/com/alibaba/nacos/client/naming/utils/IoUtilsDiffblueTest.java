package com.alibaba.nacos.client.naming.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import org.junit.Test;

public class IoUtilsDiffblueTest {
  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(
        "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001",
        IoUtils.toString(new ByteArrayInputStream(byteArray), "UTF-8"));
  }

  @Test(timeout=10000)
  public void isGzipStreamTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertFalse(IoUtils.isGzipStream(byteArray));
  }

  @Test(timeout=10000)
  public void tryDecompressTest() throws Exception {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    byte[] actualTryDecompressResult = IoUtils.tryDecompress(byteArray);

    // Assert
    assertEquals(24, actualTryDecompressResult.length);
    assertEquals((byte) 1, actualTryDecompressResult[0]);
    assertEquals((byte) 1, actualTryDecompressResult[1]);
    assertEquals((byte) 1, actualTryDecompressResult[2]);
    assertEquals((byte) 1, actualTryDecompressResult[3]);
    assertEquals((byte) 1, actualTryDecompressResult[4]);
    assertEquals((byte) 1, actualTryDecompressResult[5]);
    assertEquals((byte) 1, actualTryDecompressResult[18]);
    assertEquals((byte) 1, actualTryDecompressResult[19]);
    assertEquals((byte) 1, actualTryDecompressResult[20]);
    assertEquals((byte) 1, actualTryDecompressResult[21]);
    assertEquals((byte) 1, actualTryDecompressResult[22]);
    assertEquals((byte) 1, actualTryDecompressResult[23]);
  }
}

