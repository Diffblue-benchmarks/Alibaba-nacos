package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SubscriberStatusDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    SubscriberStatus actualSubscriberStatus = new SubscriberStatus();

    // Assert
    assertNull(actualSubscriberStatus.getMd5());
    assertNull(actualSubscriberStatus.getLastTime());
    assertNull(actualSubscriberStatus.getServerIp());
    assertNull(actualSubscriberStatus.getStatus());
    assertNull(actualSubscriberStatus.getGroupKey());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    SubscriberStatus actualSubscriberStatus = new SubscriberStatus("groupKey", true, "md5", 1L);

    // Assert
    assertEquals("md5", actualSubscriberStatus.getMd5());
    assertEquals(1L, actualSubscriberStatus.getLastTime().longValue());
    assertTrue(actualSubscriberStatus.getStatus());
    assertEquals("groupKey", actualSubscriberStatus.getGroupKey());
  }

  @Test
  public void testSetGroupKey() {
    // Arrange
    SubscriberStatus subscriberStatus = new SubscriberStatus();

    // Act
    subscriberStatus.setGroupKey("groupKey");

    // Assert
    assertEquals("groupKey", subscriberStatus.getGroupKey());
  }

  @Test
  public void testSetLastTime() {
    // Arrange
    SubscriberStatus subscriberStatus = new SubscriberStatus();

    // Act
    subscriberStatus.setLastTime(1L);

    // Assert
    assertEquals(1L, subscriberStatus.getLastTime().longValue());
  }

  @Test
  public void testSetMd5() {
    // Arrange
    SubscriberStatus subscriberStatus = new SubscriberStatus();

    // Act
    subscriberStatus.setMd5("md5");

    // Assert
    assertEquals("md5", subscriberStatus.getMd5());
  }

  @Test
  public void testSetServerIp() {
    // Arrange
    SubscriberStatus subscriberStatus = new SubscriberStatus();

    // Act
    subscriberStatus.setServerIp("serverIp");

    // Assert
    assertEquals("serverIp", subscriberStatus.getServerIp());
  }

  @Test
  public void testSetStatus() {
    // Arrange
    SubscriberStatus subscriberStatus = new SubscriberStatus();

    // Act
    subscriberStatus.setStatus(true);

    // Assert
    assertTrue(subscriberStatus.getStatus());
  }
}

