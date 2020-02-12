package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MessageDiffblueTest {
  @Test(timeout=10000)
  public void setDataTest() {
    // Arrange
    Message message = new Message();

    // Act
    message.setData("foo");

    // Assert
    assertEquals("foo", message.getData());
  }

  @Test(timeout=10000)
  public void getDataTest() {
    // Arrange, Act and Assert
    assertNull((new Message()).getData());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new Message()).getData());
  }
}

