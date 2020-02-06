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
    subscriberStatus.setLastTime(Long.valueOf(1L));

    // Assert
    assertEquals(Long.valueOf(1L), subscriberStatus.getLastTime());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    SubscriberStatus actualSubscriberStatus = new SubscriberStatus("foo", Boolean.valueOf(true), "foo",
        Long.valueOf(1L));

    // Assert
    String actualMd5 = actualSubscriberStatus.getMd5();
    String actualGroupKey = actualSubscriberStatus.getGroupKey();
    Boolean actualStatus = actualSubscriberStatus.getStatus();
    assertEquals("foo", actualMd5);
    assertEquals(Long.valueOf(1L), actualSubscriberStatus.getLastTime());
    assertEquals(Boolean.valueOf(true), actualStatus);
    assertEquals("foo", actualGroupKey);
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
    subscriberStatus.setServerIp("foo");

    // Assert
    assertEquals("foo", subscriberStatus.getServerIp());
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
    subscriberStatus.setStatus(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), subscriberStatus.getStatus());
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
    subscriberStatus.setMd5("foo");

    // Assert
    assertEquals("foo", subscriberStatus.getMd5());
  }

  @Test
  public void setGroupKeyTest() {
    // Arrange
    SubscriberStatus subscriberStatus = new SubscriberStatus();

    // Act
    subscriberStatus.setGroupKey("foo");

    // Assert
    assertEquals("foo", subscriberStatus.getGroupKey());
  }
}

