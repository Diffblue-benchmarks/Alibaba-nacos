package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MD5UtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toStringTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedEncodingException.class);
    MD5Util.toString(new ByteArrayInputStream(new byte[24]), "");
  }

  @Test
  public void compareMd5ResultStringTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals("", MD5Util.compareMd5ResultString(null));
  }

  @Test
  public void getClientMd5MapTest() {
    // Arrange, Act and Assert
    assertEquals(0, MD5Util.getClientMd5Map("").size());
  }
}

