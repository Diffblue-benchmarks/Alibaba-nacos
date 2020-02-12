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
  @Test(timeout=10000)
  public void getAkTest() {
    // Arrange, Act and Assert
    assertNull(SpasAdapter.getAk());
  }
  @Test(timeout=10000)
  public void getSkTest() {
    // Arrange, Act and Assert
    assertNull(SpasAdapter.getSk());
  }
  @Test(timeout=10000)
  public void getSignHeadersTest4() {
    // Arrange, Act and Assert
    assertNull(SpasAdapter.getSignHeaders((List<String>) null, "foo"));
  }
  @Test(timeout=10000)
  public void signWithhmacSHA1EncryptTest2() {
    // Arrange, Act and Assert
    assertEquals("sputg0LPIDrWDLp2X2pdKQ6NJiI=", SpasAdapter.signWithhmacSHA1Encrypt("foo", "foo"));
  }
  @Test(timeout=10000)
  public void signWithhmacSHA1EncryptTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    SpasAdapter.signWithhmacSHA1Encrypt("foo", "");
  }
  @Test(timeout=10000)
  public void getSignHeadersTest3() {
    // Arrange and Act
    List<String> actualSignHeaders = SpasAdapter.getSignHeaders("", "foo");

    // Assert
    assertEquals(4, actualSignHeaders.size());
    assertEquals("Timestamp", actualSignHeaders.get(0));
    assertEquals("Spas-Signature", actualSignHeaders.get(2));
  }
  @Test(timeout=10000)
  public void getSignHeadersTest2() {
    // Arrange and Act
    List<String> actualSignHeaders = SpasAdapter.getSignHeaders("foo", "foo");

    // Assert
    assertEquals(4, actualSignHeaders.size());
    assertEquals("Timestamp", actualSignHeaders.get(0));
    assertEquals("Spas-Signature", actualSignHeaders.get(2));
  }
  @Test(timeout=10000)
  public void getSignHeadersTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    SpasAdapter.getSignHeaders("foo", "");
  }
}

