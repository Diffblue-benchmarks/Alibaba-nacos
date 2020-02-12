package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SubscribersDiffblueTest {
  @Test(timeout=10000)
  public void setSubscribersTest() {
    // Arrange
    Subscribers subscribers = new Subscribers();

    // Act
    subscribers.setSubscribers(null);

    // Assert
    assertNull(subscribers.getSubscribers());
  }

  @Test(timeout=10000)
  public void getSubscribersTest() {
    // Arrange, Act and Assert
    assertNull((new Subscribers()).getSubscribers());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new Subscribers()).getSubscribers());
  }
}

