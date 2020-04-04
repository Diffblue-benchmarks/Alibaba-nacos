package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class SubscriberDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Subscriber actualSubscriber = new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr");

    // Assert
    assertEquals("123", actualSubscriber.getNamespaceId());
    assertEquals("addrStr", actualSubscriber.getAddrStr());
    assertEquals("addrStr", actualSubscriber.getServiceName());
    assertEquals("app", actualSubscriber.getApp());
    assertEquals("agent", actualSubscriber.getAgent());
    assertEquals("127.0.0.1", actualSubscriber.getIp());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr")).equals(null));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr")).equals("o"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(507796560, (new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr")).hashCode());
  }

  @Test
  public void testSetAddrStr() {
    // Arrange
    Subscriber subscriber = new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr");

    // Act
    subscriber.setAddrStr("agent");

    // Assert
    assertEquals("agent", subscriber.getAddrStr());
  }

  @Test
  public void testSetAgent() {
    // Arrange
    Subscriber subscriber = new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr");

    // Act
    subscriber.setAgent("agent");

    // Assert
    assertEquals("agent", subscriber.getAgent());
  }

  @Test
  public void testSetApp() {
    // Arrange
    Subscriber subscriber = new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr");

    // Act
    subscriber.setApp("agent");

    // Assert
    assertEquals("agent", subscriber.getApp());
  }

  @Test
  public void testSetIp() {
    // Arrange
    Subscriber subscriber = new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr");

    // Act
    subscriber.setIp("agent");

    // Assert
    assertEquals("agent", subscriber.getIp());
  }

  @Test
  public void testSetNamespaceId() {
    // Arrange
    Subscriber subscriber = new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr");

    // Act
    subscriber.setNamespaceId("agent");

    // Assert
    assertEquals("agent", subscriber.getNamespaceId());
  }

  @Test
  public void testSetServiceName() {
    // Arrange
    Subscriber subscriber = new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr");

    // Act
    subscriber.setServiceName("agent");

    // Assert
    assertEquals("agent", subscriber.getServiceName());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Subscriber{addrStr='addrStr', agent='agent', app='app',"
        + " ip='127.0.0.1', namespaceId='123', serviceName=" + "'addrStr'}",
        (new Subscriber("addrStr", "agent", "app", "127.0.0.1", "123", "addrStr")).toString());
  }
}

