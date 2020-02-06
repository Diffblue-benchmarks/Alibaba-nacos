package com.alibaba.nacos.common.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IoUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toStringTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedEncodingException.class);
    IoUtils.toString(new ByteArrayInputStream(new byte[24]), "");
  }

  @Test
  public void copyFileTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    IoUtils.copyFile("", "");
  }

  @Test
  public void isGzipStreamTest() {
    // Arrange, Act and Assert
    assertFalse(IoUtils.isGzipStream(new byte[24]));
  }

  @Test
  public void tryDecompressTest2() throws Exception {
    // Arrange and Act
    byte[] actualTryDecompressResult = IoUtils.tryDecompress(new byte[24]);

    // Assert
    assertEquals(24, actualTryDecompressResult.length);
    assertEquals((byte) 0, actualTryDecompressResult[0]);
    assertEquals((byte) 0, actualTryDecompressResult[1]);
    assertEquals((byte) 0, actualTryDecompressResult[2]);
    assertEquals((byte) 0, actualTryDecompressResult[3]);
    assertEquals((byte) 0, actualTryDecompressResult[4]);
    assertEquals((byte) 0, actualTryDecompressResult[5]);
    assertEquals((byte) 0, actualTryDecompressResult[18]);
    assertEquals((byte) 0, actualTryDecompressResult[19]);
    assertEquals((byte) 0, actualTryDecompressResult[20]);
    assertEquals((byte) 0, actualTryDecompressResult[21]);
    assertEquals((byte) 0, actualTryDecompressResult[22]);
    assertEquals((byte) 0, actualTryDecompressResult[23]);
  }

  @Test
  public void tryDecompressTest() throws Exception {
    // Arrange, Act and Assert
    assertNull(IoUtils.tryDecompress(new ByteArrayInputStream(new byte[24])));
  }
}

