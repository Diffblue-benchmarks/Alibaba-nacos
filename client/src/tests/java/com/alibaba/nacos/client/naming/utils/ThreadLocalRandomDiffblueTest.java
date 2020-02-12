package com.alibaba.nacos.client.naming.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ThreadLocalRandomDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void nextDoubleTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new ThreadLocalRandom()).nextDouble(10.0, 10.0);
  }

  @Test(timeout=10000)
  public void nextLongTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new ThreadLocalRandom()).nextLong(1L, 1L);
  }

  @Test(timeout=10000)
  public void setSeedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ThreadLocalRandom()).setSeed(42L);
  }

  @Test(timeout=10000)
  public void nextIntTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new ThreadLocalRandom()).nextInt(1, 1);
  }

  @Test(timeout=10000)
  public void nextLongTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ThreadLocalRandom()).nextLong(1L));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new ThreadLocalRandom()).initialized);
  }

  @Test(timeout=10000)
  public void currentTest() {
    // Arrange, Act and Assert
    assertTrue(ThreadLocalRandom.current().initialized);
  }
}

