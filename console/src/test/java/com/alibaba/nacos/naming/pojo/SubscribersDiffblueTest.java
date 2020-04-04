package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Test;

public class SubscribersDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new Subscribers()).getSubscribers());
  }

  @Test
  public void testSetSubscribers() {
    // Arrange
    Subscribers subscribers = new Subscribers();
    Subscriber param0 = new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr");
    ArrayList<Subscriber> subscriberList = new ArrayList<Subscriber>();
    subscriberList.add(param0);

    // Act
    subscribers.setSubscribers(subscriberList);

    // Assert
    assertSame(subscriberList, subscribers.getSubscribers());
  }
}

