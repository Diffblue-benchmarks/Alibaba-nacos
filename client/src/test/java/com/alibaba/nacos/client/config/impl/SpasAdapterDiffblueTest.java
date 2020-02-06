package com.alibaba.nacos.client.config.impl;

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
  public void getSignHeadersTest2() {
    // Arrange, Act and Assert
    assertNull(SpasAdapter.getSignHeaders((List<String>) null, ""));
  }
  @Test
  public void signWithhmacSHA1EncryptTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    SpasAdapter.signWithhmacSHA1Encrypt("", "");
  }
  @Test
  public void getSignHeadersTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    SpasAdapter.getSignHeaders("", "");
  }
}

