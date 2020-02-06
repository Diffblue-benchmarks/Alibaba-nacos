package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ManagerListenerWrapDiffblueTest {
  @Test
  public void constructorTest3() {
    // Arrange and Act
    ManagerListenerWrap actualManagerListenerWrap = new ManagerListenerWrap(null, "aaaaa", "aaaaa");

    // Assert
    assertEquals("aaaaa", actualManagerListenerWrap.lastContent);
    assertNull(actualManagerListenerWrap.listener);
    assertEquals("aaaaa", actualManagerListenerWrap.lastCallMd5);
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
    ManagerListenerWrap actualManagerListenerWrap = new ManagerListenerWrap(null, "aaaaa");

    // Assert
    assertNull(actualManagerListenerWrap.lastContent);
    assertNull(actualManagerListenerWrap.listener);
    assertEquals("aaaaa", actualManagerListenerWrap.lastCallMd5);
  }
}

