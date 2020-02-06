package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SubscriberStatusDiffblueTest {
  @Test
  public void setLastTimeTest() {
    // Arrange
    SubscriberStatus subscriberStatus = new SubscriberStatus();

    // Act
    subscriberStatus.setLastTime(null);

    // Assert
    assertNull(subscriberStatus.getLastTime());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    SubscriberStatus actualSubscriberStatus = new SubscriberStatus("aaaaa", null, "aaaaa", null);

    // Assert
    String actualMd5 = actualSubscriberStatus.getMd5();
    String actualGroupKey = actualSubscriberStatus.getGroupKey();
    Boolean actualStatus = actualSubscriberStatus.getStatus();
    assertEquals("aaaaa", actualMd5);
    assertNull(actualSubscriberStatus.getLastTime());
    assertNull(actualStatus);
    assertEquals("aaaaa", actualGroupKey);
  }

  @Test
  public void getLastTimeTest() {
    // Arrange, Act and Assert
    assertNull((new SubscriberStatus()).getLastTime());
  }

  @Test
  public void setServerIpTest() {
    // Arrange
    SubscriberStatus subscriberStatus = new SubscriberStatus();

    // Act
    subscriberStatus.setServerIp("aaaaa");

    // Assert
    assertEquals("aaaaa", subscriberStatus.getServerIp());
  }

  @Test
  public void getServerIpTest() {
    // Arrange, Act and Assert
    assertNull((new SubscriberStatus()).getServerIp());
  }

  @Test
  public void getStatusTest() {
    // Arrange, Act and Assert
    assertNull((new SubscriberStatus()).getStatus());
  }

  @Test
  public void setStatusTest() {
    // Arrange
    SubscriberStatus subscriberStatus = new SubscriberStatus();

    // Act
    subscriberStatus.setStatus(null);

    // Assert
    assertNull(subscriberStatus.getStatus());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    SubscriberStatus actualSubscriberStatus = new SubscriberStatus();

    // Assert
    String actualMd5 = actualSubscriberStatus.getMd5();
    String actualGroupKey = actualSubscriberStatus.getGroupKey();
    Boolean actualStatus = actualSubscriberStatus.getStatus();
    String actualServerIp = actualSubscriberStatus.getServerIp();
    assertNull(actualMd5);
    assertNull(actualSubscriberStatus.getLastTime());
    assertNull(actualServerIp);
    assertNull(actualStatus);
    assertNull(actualGroupKey);
  }

  @Test
  public void getGroupKeyTest() {
    // Arrange, Act and Assert
    assertNull((new SubscriberStatus()).getGroupKey());
  }

  @Test
  public void getMd5Test() {
    // Arrange, Act and Assert
    assertNull((new SubscriberStatus()).getMd5());
  }

  @Test
  public void setMd5Test() {
    // Arrange
    SubscriberStatus subscriberStatus = new SubscriberStatus();

    // Act
    subscriberStatus.setMd5("aaaaa");

    // Assert
    assertEquals("aaaaa", subscriberStatus.getMd5());
  }

  @Test
  public void setGroupKeyTest() {
    // Arrange
    SubscriberStatus subscriberStatus = new SubscriberStatus();

    // Act
    subscriberStatus.setGroupKey("aaaaa");

    // Assert
    assertEquals("aaaaa", subscriberStatus.getGroupKey());
  }
}

