package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class SubscriberDiffblueTest {
  @Test
  public void getAddrStrTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa")).getAddrStr());
  }

  @Test
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa")).getServiceName());
  }

  @Test
  public void setAgentTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa");

    // Act
    subscriber.setAgent("aaaaa");

    // Assert
    assertEquals("aaaaa", subscriber.getAgent());
  }

  @Test
  public void setAppTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa");

    // Act
    subscriber.setApp("aaaaa");

    // Assert
    assertEquals("aaaaa", subscriber.getApp());
  }

  @Test
  public void getAgentTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa")).getAgent());
  }

  @Test
  public void getIpTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa")).getIp());
  }

  @Test
  public void setAddrStrTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa");

    // Act
    subscriber.setAddrStr("aaaaa");

    // Assert
    assertEquals("aaaaa", subscriber.getAddrStr());
  }

  @Test
  public void setNamespaceIdTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa");

    // Act
    subscriber.setNamespaceId("aaaaa");

    // Assert
    assertEquals("aaaaa", subscriber.getNamespaceId());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Subscriber actualSubscriber = new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa");

    // Assert
    String actualNamespaceId = actualSubscriber.getNamespaceId();
    String actualIp = actualSubscriber.getIp();
    String actualAgent = actualSubscriber.getAgent();
    String actualApp = actualSubscriber.getApp();
    String actualServiceName = actualSubscriber.getServiceName();
    assertEquals("aaaaa", actualNamespaceId);
    assertEquals("aaaaa", actualSubscriber.getAddrStr());
    assertEquals("aaaaa", actualServiceName);
    assertEquals("aaaaa", actualApp);
    assertEquals("aaaaa", actualAgent);
    assertEquals("aaaaa", actualIp);
  }

  @Test
  public void setServiceNameTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa");

    // Act
    subscriber.setServiceName("aaaaa");

    // Assert
    assertEquals("aaaaa", subscriber.getServiceName());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa")).equals("aaaaa"));
  }

  @Test
  public void getAppTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa")).getApp());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-1182552159, (new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa")).hashCode());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals(
        "Subscriber{addrStr='aaaaa', agent='aaaaa', app='aaaaa',"
            + " ip='aaaaa', namespaceId='aaaaa', serviceName='aaaaa" + "'}",
        (new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa")).toString());
  }

  @Test
  public void setIpTest() {
    // Arrange
    Subscriber subscriber = new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa");

    // Act
    subscriber.setIp("aaaaa");

    // Assert
    assertEquals("aaaaa", subscriber.getIp());
  }

  @Test
  public void getNamespaceIdTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Subscriber("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa")).getNamespaceId());
  }
}

