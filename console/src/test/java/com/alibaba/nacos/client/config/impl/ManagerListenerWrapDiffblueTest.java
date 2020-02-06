package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ManagerListenerWrapDiffblueTest {
  @Test
  public void constructorTest3() {
    // Arrange and Act
    ManagerListenerWrap actualManagerListenerWrap = new ManagerListenerWrap(null, "foo", "foo");

    // Assert
    assertEquals("foo", actualManagerListenerWrap.lastContent);
    assertNull(actualManagerListenerWrap.listener);
    assertEquals("foo", actualManagerListenerWrap.lastCallMd5);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ManagerListenerWrap actualManagerListenerWrap = new ManagerListenerWrap(null);

    // Assert
    assertNull(actualManagerListenerWrap.lastContent);
    assertNull(actualManagerListenerWrap.listener);
    assertEquals("", actualManagerListenerWrap.lastCallMd5);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ManagerListenerWrap actualManagerListenerWrap = new ManagerListenerWrap(null, "foo");

    // Assert
    assertNull(actualManagerListenerWrap.lastContent);
    assertNull(actualManagerListenerWrap.listener);
    assertEquals("foo", actualManagerListenerWrap.lastCallMd5);
  }
}

