package com.alibaba.nacos.client.naming.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JvmRandomDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void setSeedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new JvmRandom()).setSeed(42L);
  }
  @Test(timeout=10000)
  public void nextLongTest() {
    // Arrange, Act and Assert
    assertEquals(0L, JvmRandom.nextLong(1L));
  }
  @Test(timeout=10000)
  public void nextIntTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new JvmRandom()).nextInt(1));
  }
  @Test(timeout=10000)
  public void nextGaussianTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new JvmRandom()).nextGaussian();
  }
}

