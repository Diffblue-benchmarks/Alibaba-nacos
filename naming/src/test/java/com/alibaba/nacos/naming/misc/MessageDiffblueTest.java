package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MessageDiffblueTest {
  @Test
  public void setDataTest() {
    // Arrange
    Message message = new Message();

    // Act
    message.setData("aaaaa");

    // Assert
    assertEquals("aaaaa", message.getData());
  }

  @Test
  public void getDataTest() {
    // Arrange, Act and Assert
    assertNull((new Message()).getData());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new Message()).getData());
  }
}

