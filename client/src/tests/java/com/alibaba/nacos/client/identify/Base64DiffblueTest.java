package com.alibaba.nacos.client.identify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Base64DiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void encodeBase64Test2() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Base64.encodeBase64(byteArray, true, true, 3);
  }

  @Test(timeout=10000)
  public void encodeBase64Test() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    byte[] actualEncodeBase64Result = Base64.encodeBase64(byteArray);

    // Assert
    assertEquals(32, actualEncodeBase64Result.length);
    assertEquals((byte) 65, actualEncodeBase64Result[0]);
    assertEquals((byte) 81, actualEncodeBase64Result[1]);
    assertEquals((byte) 69, actualEncodeBase64Result[2]);
    assertEquals((byte) 66, actualEncodeBase64Result[3]);
    assertEquals((byte) 65, actualEncodeBase64Result[4]);
    assertEquals((byte) 81, actualEncodeBase64Result[5]);
    assertEquals((byte) 69, actualEncodeBase64Result[26]);
    assertEquals((byte) 66, actualEncodeBase64Result[27]);
    assertEquals((byte) 65, actualEncodeBase64Result[28]);
    assertEquals((byte) 81, actualEncodeBase64Result[29]);
    assertEquals((byte) 69, actualEncodeBase64Result[30]);
    assertEquals((byte) 66, actualEncodeBase64Result[31]);
  }

  @Test(timeout=10000)
  public void isInAlphabetTest() {
    // Arrange, Act and Assert
    assertFalse((new Base64()).isInAlphabet((byte) 1));
  }

  @Test(timeout=10000)
  public void decodeBase64Test() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(0, Base64.decodeBase64(byteArray).length);
  }
}

