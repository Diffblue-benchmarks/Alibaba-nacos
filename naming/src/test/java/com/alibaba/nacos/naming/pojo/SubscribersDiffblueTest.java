package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SubscribersDiffblueTest {
  @Test
  public void setSubscribersTest() {
    // Arrange
    Subscribers subscribers = new Subscribers();

    // Act
    subscribers.setSubscribers(null);

    // Assert
    assertNull(subscribers.getSubscribers());
  }

  @Test
  public void getSubscribersTest() {
    // Arrange, Act and Assert
    assertNull((new Subscribers()).getSubscribers());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new Subscribers()).getSubscribers());
  }
}

