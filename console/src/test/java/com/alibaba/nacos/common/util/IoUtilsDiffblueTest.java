package com.alibaba.nacos.common.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class IoUtilsDiffblueTest {
  @Test
  public void testReadLines() throws IOException {
    // Arrange and Act
    List<String> actualReadLinesResult = IoUtils.readLines(new StringReader("foo"));

    // Assert
    assertEquals(1, actualReadLinesResult.size());
    assertEquals("foo", actualReadLinesResult.get(0));
  }

  @Test
  public void testTryDecompress() throws Exception {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);

    // Act and Assert
    assertNull(IoUtils.tryDecompress(new ByteArrayInputStream(byteArray)));
  }
}

