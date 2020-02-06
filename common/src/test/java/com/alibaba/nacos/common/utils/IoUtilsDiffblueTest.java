package com.alibaba.nacos.common.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IoUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toStringTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(
        "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001",
        IoUtils.toString(new ByteArrayInputStream(byteArray), "UTF-8"));
  }

  @Test
  public void copyFileTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    IoUtils.copyFile("foo", "foo");
  }

  @Test
  public void isGzipStreamTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertFalse(IoUtils.isGzipStream(byteArray));
  }

  @Test
  public void tryDecompressTest2() throws Exception {
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

  @Test
  public void tryDecompressTest() throws Exception {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertNull(IoUtils.tryDecompress(new ByteArrayInputStream(byteArray)));
  }
}

