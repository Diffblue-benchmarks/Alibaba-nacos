package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class SubscriberDiffblueTest {
  @Test
  public void getAddrStrTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo")).getAddrStr());
  }

  @Test
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo")).getServiceName());
  }

  @Test
  public void setAgentTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo");

    // Act
    subscriber.setAgent("foo");

    // Assert
    assertEquals("foo", subscriber.getAgent());
  }

  @Test
  public void setAppTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo");

    // Act
    subscriber.setApp("foo");

    // Assert
    assertEquals("foo", subscriber.getApp());
  }

  @Test
  public void getAgentTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo")).getAgent());
  }

  @Test
  public void getIpTest() {
    // Arrange, Act and Assert
    assertEquals("127.0.0.1", (new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo")).getIp());
  }

  @Test
  public void setAddrStrTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo");

    // Act
    subscriber.setAddrStr("foo");

    // Assert
    assertEquals("foo", subscriber.getAddrStr());
  }

  @Test
  public void setNamespaceIdTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo");

    // Act
    subscriber.setNamespaceId("foo");

    // Assert
    assertEquals("foo", subscriber.getNamespaceId());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Subscriber actualSubscriber = new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo");

    // Assert
    String actualNamespaceId = actualSubscriber.getNamespaceId();
    String actualIp = actualSubscriber.getIp();
    String actualAgent = actualSubscriber.getAgent();
    String actualApp = actualSubscriber.getApp();
    String actualServiceName = actualSubscriber.getServiceName();
    assertEquals("123", actualNamespaceId);
    assertEquals("foo", actualSubscriber.getAddrStr());
    assertEquals("foo", actualServiceName);
    assertEquals("foo", actualApp);
    assertEquals("foo", actualAgent);
    assertEquals("127.0.0.1", actualIp);
  }

  @Test
  public void setServiceNameTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo");

    // Act
    subscriber.setServiceName("foo");

    // Assert
    assertEquals("foo", subscriber.getServiceName());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo")).equals("foo"));
  }

  @Test
  public void getAppTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo")).getApp());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-918599540, (new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo")).hashCode());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Subscriber{addrStr='foo', agent='foo', app='foo'," + " ip='127.0.0.1', namespaceId='123', serviceName"
        + "='foo'}", (new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo")).toString());
  }

  @Test
  public void setIpTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo");

    // Act
    subscriber.setIp("foo");

    // Assert
    assertEquals("foo", subscriber.getIp());
  }

  @Test
  public void getNamespaceIdTest() {
    // Arrange, Act and Assert
    assertEquals("123", (new Subscriber("foo", "foo", "foo", "127.0.0.1", "123", "foo")).getNamespaceId());
  }
}

