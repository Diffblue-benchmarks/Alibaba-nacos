package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SpasAdapterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getAkTest() {
    // Arrange, Act and Assert
    assertNull(SpasAdapter.getAk());
  }
  @Test
  public void getSkTest() {
    // Arrange, Act and Assert
    assertNull(SpasAdapter.getSk());
  }
  @Test
  public void getSignHeadersTest4() {
    // Arrange, Act and Assert
    assertNull(SpasAdapter.getSignHeaders((List<String>) null, "foo"));
  }
  @Test
  public void signWithhmacSHA1EncryptTest() {
    // Arrange, Act and Assert
    assertEquals("sputg0LPIDrWDLp2X2pdKQ6NJiI=", SpasAdapter.signWithhmacSHA1Encrypt("foo", "foo"));
  }
  @Test
  public void getSignHeadersTest3() {
    // Arrange and Act
    List<String> actualSignHeaders = SpasAdapter.getSignHeaders("", "foo");

    // Assert
    assertEquals(4, actualSignHeaders.size());
    assertEquals("Timestamp", actualSignHeaders.get(0));
    assertEquals("Spas-Signature", actualSignHeaders.get(2));
  }
  @Test
  public void getSignHeadersTest2() {
    // Arrange and Act
    List<String> actualSignHeaders = SpasAdapter.getSignHeaders("foo", "foo");

    // Assert
    assertEquals(4, actualSignHeaders.size());
    assertEquals("Timestamp", actualSignHeaders.get(0));
    assertEquals("Spas-Signature", actualSignHeaders.get(2));
  }
  @Test
  public void getSignHeadersTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    SpasAdapter.getSignHeaders("foo", "");
  }
}

