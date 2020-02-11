package com.alibaba.nacos.client.naming.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChooserDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Chooser<Object, Object>("foo")).equals("foo"));
  }

  @Test(timeout=10000)
  public void randomTest() {
    // Arrange, Act and Assert
    assertNull((new Chooser<Object, Object>("foo")).random());
  }

  @Test(timeout=10000)
  public void getUniqueKeyTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Chooser<Object, Object>("foo")).getUniqueKey());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(101574, (new Chooser<Object, Object>("foo")).hashCode());
  }

  @Test(timeout=10000)
  public void randomWithWeightTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    (new Chooser<Object, Object>("foo")).randomWithWeight();
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new Chooser<Object, Object>("foo")).getUniqueKey() instanceof String);
  }
}

