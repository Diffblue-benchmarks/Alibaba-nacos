package com.alibaba.nacos.common.util;

import static org.junit.Assert.assertNull;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import org.junit.Test;

public class IoUtilsDiffblueTest {
  @Test(timeout=10000)
  public void tryDecompressTest() throws Exception {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertNull(IoUtils.tryDecompress(new ByteArrayInputStream(byteArray)));
  }
}

