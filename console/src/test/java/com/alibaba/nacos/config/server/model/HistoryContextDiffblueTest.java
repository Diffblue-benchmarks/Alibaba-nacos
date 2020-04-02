package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HistoryContextDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    HistoryContext actualHistoryContext = new HistoryContext();

    // Assert
    assertNull(actualHistoryContext.getDataId());
    assertEquals(0, actualHistoryContext.getStatusCode());
    assertNull(actualHistoryContext.getServerId());
    assertNull(actualHistoryContext.getConfigs());
    assertNull(actualHistoryContext.getAppName());
    assertFalse(actualHistoryContext.isSuccess());
    assertNull(actualHistoryContext.getTenant());
    assertNull(actualHistoryContext.getGroup());
    assertNull(actualHistoryContext.getStatusMsg());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    HistoryContext actualHistoryContext = new HistoryContext("123", "123", "group", 0, "statusMsg",
        new Page<ConfigHistoryInfo>());

    // Assert
    assertEquals("123", actualHistoryContext.getDataId());
    assertEquals(0, actualHistoryContext.getStatusCode());
    assertEquals("123", actualHistoryContext.getServerId());
    Page<ConfigHistoryInfo> expectedConfigs = actualHistoryContext.configs;
    assertSame(expectedConfigs, actualHistoryContext.getConfigs());
    assertEquals("statusMsg", actualHistoryContext.getStatusMsg());
    assertFalse(actualHistoryContext.isSuccess());
    assertEquals("group", actualHistoryContext.getGroup());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    HistoryContext actualHistoryContext = new HistoryContext("123", "123", "group", 200, "statusMsg",
        new Page<ConfigHistoryInfo>());

    // Assert
    assertEquals("123", actualHistoryContext.getDataId());
    assertEquals(200, actualHistoryContext.getStatusCode());
    assertEquals("123", actualHistoryContext.getServerId());
    Page<ConfigHistoryInfo> expectedConfigs = actualHistoryContext.configs;
    assertSame(expectedConfigs, actualHistoryContext.getConfigs());
    assertEquals("statusMsg", actualHistoryContext.getStatusMsg());
    assertTrue(actualHistoryContext.isSuccess());
    assertEquals("group", actualHistoryContext.getGroup());
  }

  @Test
  public void testSetAppName() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setAppName("appName");

    // Assert
    assertEquals("appName", historyContext.getAppName());
  }

  @Test
  public void testSetConfigs() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();
    Page<ConfigHistoryInfo> page = new Page<ConfigHistoryInfo>();

    // Act
    historyContext.setConfigs(page);

    // Assert
    assertSame(page, historyContext.getConfigs());
  }

  @Test
  public void testSetDataId() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setDataId("123");

    // Assert
    assertEquals("123", historyContext.getDataId());
  }

  @Test
  public void testSetGroup() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setGroup("group");

    // Assert
    assertEquals("group", historyContext.getGroup());
  }

  @Test
  public void testSetServerId() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setServerId("123");

    // Assert
    assertEquals("123", historyContext.getServerId());
  }

  @Test
  public void testSetStatusCode() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setStatusCode(0);

    // Assert
    assertEquals(0, historyContext.getStatusCode());
  }

  @Test
  public void testSetStatusMsg() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setStatusMsg("statusMsg");

    // Assert
    assertEquals("statusMsg", historyContext.getStatusMsg());
  }

  @Test
  public void testSetSuccess() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setSuccess(true);

    // Assert
    assertTrue(historyContext.isSuccess());
  }

  @Test
  public void testSetTenant() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setTenant("tenant");

    // Assert
    assertEquals("tenant", historyContext.getTenant());
  }
}

