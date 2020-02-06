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

  @Test
  public void encodeBase64Test8() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    byte[] actualEncodeBase64Result = Base64.encodeBase64(byteArray, true, true, 76);

    // Assert
    assertEquals(34, actualEncodeBase64Result.length);
    assertEquals((byte) 65, actualEncodeBase64Result[0]);
    assertEquals((byte) 81, actualEncodeBase64Result[1]);
    assertEquals((byte) 69, actualEncodeBase64Result[2]);
    assertEquals((byte) 66, actualEncodeBase64Result[3]);
    assertEquals((byte) 65, actualEncodeBase64Result[4]);
    assertEquals((byte) 81, actualEncodeBase64Result[5]);
    assertEquals((byte) 65, actualEncodeBase64Result[28]);
    assertEquals((byte) 81, actualEncodeBase64Result[29]);
    assertEquals((byte) 69, actualEncodeBase64Result[30]);
    assertEquals((byte) 66, actualEncodeBase64Result[31]);
    assertEquals((byte) 13, actualEncodeBase64Result[32]);
    assertEquals((byte) 10, actualEncodeBase64Result[33]);
  }

  @Test
  public void encodeBase64Test7() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Base64.encodeBase64(byteArray, true, true, 3);
  }

  @Test
  public void encodeBase64Test6() {
    // Arrange
    byte[] byteArray = new byte[34];
    byteArray[0] = 1;
    byteArray[1] = 1;
    byteArray[2] = 1;
    byteArray[3] = 1;
    byteArray[4] = 1;
    byteArray[5] = 1;
    byteArray[6] = 1;
    byteArray[7] = 1;
    byteArray[8] = 1;
    byteArray[9] = 1;
    byteArray[10] = 1;
    byteArray[11] = 1;
    byteArray[12] = 1;
    byteArray[13] = 1;
    byteArray[14] = 1;
    byteArray[15] = 1;
    byteArray[16] = 1;
    byteArray[17] = 1;
    byteArray[18] = 1;
    byteArray[19] = 1;
    byteArray[20] = 1;
    byteArray[21] = 1;
    byteArray[22] = 1;
    byteArray[23] = 1;

    // Act
    byte[] actualEncodeBase64Result = Base64.encodeBase64(byteArray, true, true, 76);

    // Assert
    assertEquals(48, actualEncodeBase64Result.length);
    assertEquals((byte) 65, actualEncodeBase64Result[0]);
    assertEquals((byte) 81, actualEncodeBase64Result[1]);
    assertEquals((byte) 69, actualEncodeBase64Result[2]);
    assertEquals((byte) 66, actualEncodeBase64Result[3]);
    assertEquals((byte) 65, actualEncodeBase64Result[4]);
    assertEquals((byte) 81, actualEncodeBase64Result[5]);
    assertEquals((byte) 65, actualEncodeBase64Result[42]);
    assertEquals((byte) 65, actualEncodeBase64Result[43]);
    assertEquals((byte) 65, actualEncodeBase64Result[44]);
    assertEquals((byte) 65, actualEncodeBase64Result[45]);
    assertEquals((byte) 13, actualEncodeBase64Result[46]);
    assertEquals((byte) 10, actualEncodeBase64Result[47]);
  }

  @Test
  public void encodeBase64Test5() {
    // Arrange
    byte[] byteArray = new byte[26];
    byteArray[0] = 1;
    byteArray[1] = 1;
    byteArray[2] = 1;
    byteArray[3] = 1;
    byteArray[4] = 1;
    byteArray[5] = 1;
    byteArray[6] = 1;
    byteArray[7] = 1;
    byteArray[8] = 1;
    byteArray[9] = 1;
    byteArray[10] = 1;
    byteArray[11] = 1;
    byteArray[12] = 1;
    byteArray[13] = 1;
    byteArray[14] = 1;
    byteArray[15] = 1;
    byteArray[16] = 1;
    byteArray[17] = 1;
    byteArray[18] = 1;
    byteArray[19] = 1;
    byteArray[20] = 1;
    byteArray[21] = 1;
    byteArray[22] = 1;
    byteArray[23] = 1;

    // Act
    byte[] actualEncodeBase64Result = Base64.encodeBase64(byteArray, true, true, 76);

    // Assert
    assertEquals(37, actualEncodeBase64Result.length);
    assertEquals((byte) 65, actualEncodeBase64Result[0]);
    assertEquals((byte) 81, actualEncodeBase64Result[1]);
    assertEquals((byte) 69, actualEncodeBase64Result[2]);
    assertEquals((byte) 66, actualEncodeBase64Result[3]);
    assertEquals((byte) 65, actualEncodeBase64Result[4]);
    assertEquals((byte) 81, actualEncodeBase64Result[5]);
    assertEquals((byte) 66, actualEncodeBase64Result[31]);
    assertEquals((byte) 65, actualEncodeBase64Result[32]);
    assertEquals((byte) 65, actualEncodeBase64Result[33]);
    assertEquals((byte) 65, actualEncodeBase64Result[34]);
    assertEquals((byte) 13, actualEncodeBase64Result[35]);
    assertEquals((byte) 10, actualEncodeBase64Result[36]);
  }

  @Test
  public void encodeBase64Test4() {
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

  @Test
  public void encodeBase64Test3() {
    // Arrange
    byte[] byteArray = new byte[61];
    byteArray[0] = 1;
    byteArray[1] = 1;
    byteArray[2] = 1;
    byteArray[3] = 1;
    byteArray[4] = 1;
    byteArray[5] = 1;
    byteArray[6] = 1;
    byteArray[7] = 1;
    byteArray[8] = 1;
    byteArray[9] = 1;
    byteArray[10] = 1;
    byteArray[11] = 1;
    byteArray[12] = 1;
    byteArray[13] = 1;
    byteArray[14] = 1;
    byteArray[15] = 1;
    byteArray[16] = 1;
    byteArray[17] = 1;
    byteArray[18] = 1;
    byteArray[19] = 1;
    byteArray[20] = 1;
    byteArray[21] = 1;
    byteArray[22] = 1;
    byteArray[23] = 1;

    // Act
    byte[] actualEncodeBase64Result = Base64.encodeBase64(byteArray);

    // Assert
    assertEquals(84, actualEncodeBase64Result.length);
    assertEquals((byte) 65, actualEncodeBase64Result[0]);
    assertEquals((byte) 81, actualEncodeBase64Result[1]);
    assertEquals((byte) 69, actualEncodeBase64Result[2]);
    assertEquals((byte) 66, actualEncodeBase64Result[3]);
    assertEquals((byte) 65, actualEncodeBase64Result[4]);
    assertEquals((byte) 81, actualEncodeBase64Result[5]);
    assertEquals((byte) 65, actualEncodeBase64Result[78]);
    assertEquals((byte) 65, actualEncodeBase64Result[79]);
    assertEquals((byte) 65, actualEncodeBase64Result[80]);
    assertEquals((byte) 65, actualEncodeBase64Result[81]);
    assertEquals((byte) 61, actualEncodeBase64Result[82]);
    assertEquals((byte) 61, actualEncodeBase64Result[83]);
  }

  @Test
  public void encodeBase64Test2() {
    // Arrange
    byte[] byteArray = new byte[32];
    byteArray[0] = 1;
    byteArray[1] = 1;
    byteArray[2] = 1;
    byteArray[3] = 1;
    byteArray[4] = 1;
    byteArray[5] = 1;
    byteArray[6] = 1;
    byteArray[7] = 1;
    byteArray[8] = 1;
    byteArray[9] = 1;
    byteArray[10] = 1;
    byteArray[11] = 1;
    byteArray[12] = 1;
    byteArray[13] = 1;
    byteArray[14] = 1;
    byteArray[15] = 1;
    byteArray[16] = 1;
    byteArray[17] = 1;
    byteArray[18] = 1;
    byteArray[19] = 1;
    byteArray[20] = 1;
    byteArray[21] = 1;
    byteArray[22] = 1;
    byteArray[23] = 1;

    // Act
    byte[] actualEncodeBase64Result = Base64.encodeBase64(byteArray);

    // Assert
    assertEquals(44, actualEncodeBase64Result.length);
    assertEquals((byte) 65, actualEncodeBase64Result[0]);
    assertEquals((byte) 81, actualEncodeBase64Result[1]);
    assertEquals((byte) 69, actualEncodeBase64Result[2]);
    assertEquals((byte) 66, actualEncodeBase64Result[3]);
    assertEquals((byte) 65, actualEncodeBase64Result[4]);
    assertEquals((byte) 81, actualEncodeBase64Result[5]);
    assertEquals((byte) 65, actualEncodeBase64Result[38]);
    assertEquals((byte) 65, actualEncodeBase64Result[39]);
    assertEquals((byte) 65, actualEncodeBase64Result[40]);
    assertEquals((byte) 65, actualEncodeBase64Result[41]);
    assertEquals((byte) 65, actualEncodeBase64Result[42]);
    assertEquals((byte) 61, actualEncodeBase64Result[43]);
  }

  @Test
  public void encodeBase64Test() {
    // Arrange
    byte[] byteArray = new byte[8192];
    byteArray[0] = 1;
    byteArray[1] = 1;
    byteArray[2] = 1;
    byteArray[3] = 1;
    byteArray[4] = 1;
    byteArray[5] = 1;
    byteArray[6] = 1;
    byteArray[7] = 1;
    byteArray[8] = 1;
    byteArray[9] = 1;
    byteArray[10] = 1;
    byteArray[11] = 1;
    byteArray[12] = 1;
    byteArray[13] = 1;
    byteArray[14] = 1;
    byteArray[15] = 1;
    byteArray[16] = 1;
    byteArray[17] = 1;
    byteArray[18] = 1;
    byteArray[19] = 1;
    byteArray[20] = 1;
    byteArray[21] = 1;
    byteArray[22] = 1;
    byteArray[23] = 1;

    // Act
    byte[] actualEncodeBase64Result = Base64.encodeBase64(byteArray);

    // Assert
    assertEquals(10924, actualEncodeBase64Result.length);
    assertEquals((byte) 65, actualEncodeBase64Result[0]);
    assertEquals((byte) 81, actualEncodeBase64Result[1]);
    assertEquals((byte) 69, actualEncodeBase64Result[2]);
    assertEquals((byte) 66, actualEncodeBase64Result[3]);
    assertEquals((byte) 65, actualEncodeBase64Result[4]);
    assertEquals((byte) 81, actualEncodeBase64Result[5]);
    assertEquals((byte) 65, actualEncodeBase64Result[10918]);
    assertEquals((byte) 65, actualEncodeBase64Result[10919]);
    assertEquals((byte) 65, actualEncodeBase64Result[10920]);
    assertEquals((byte) 65, actualEncodeBase64Result[10921]);
    assertEquals((byte) 65, actualEncodeBase64Result[10922]);
    assertEquals((byte) 61, actualEncodeBase64Result[10923]);
  }

  @Test
  public void isInAlphabetTest3() {
    // Arrange, Act and Assert
    assertFalse((new Base64()).isInAlphabet((byte) -128));
  }

  @Test
  public void isInAlphabetTest2() {
    // Arrange, Act and Assert
    assertFalse((new Base64()).isInAlphabet((byte) 1));
  }

  @Test
  public void isInAlphabetTest() {
    // Arrange, Act and Assert
    assertFalse((new Base64()).isInAlphabet((byte) 127));
  }

  @Test
  public void decodeBase64Test() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(0, Base64.decodeBase64(byteArray).length);
  }
}

