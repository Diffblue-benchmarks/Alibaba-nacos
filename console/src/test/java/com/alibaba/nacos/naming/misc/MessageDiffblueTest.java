package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MessageDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new Message()).getData());
  }

  @Test
  public void testSetData() {
    // Arrange
    Message message = new Message();

    // Act
    message.setData("data");

    // Assert
    assertEquals("data", message.getData());
  }
}

