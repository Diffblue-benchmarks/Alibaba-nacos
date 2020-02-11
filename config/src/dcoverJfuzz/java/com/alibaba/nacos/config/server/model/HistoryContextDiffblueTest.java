package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HistoryContextDiffblueTest {
  @Test(timeout=10000)
  public void setAppNameTest() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setAppName("name");

    // Assert
    assertEquals("name", historyContext.getAppName());
  }

  @Test(timeout=10000)
  public void getStatusCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new HistoryContext()).getStatusCode());
  }

  @Test(timeout=10000)
  public void getConfigsTest() {
    // Arrange, Act and Assert
    assertNull((new HistoryContext()).getConfigs());
  }

  @Test(timeout=10000)
  public void setGroupTest() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setGroup("foo");

    // Assert
    assertEquals("foo", historyContext.getGroup());
  }

  @Test(timeout=10000)
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertNull((new HistoryContext()).getAppName());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    HistoryContext actualHistoryContext = new HistoryContext("123", "123", "foo", 200, "foo",
        new Page<ConfigHistoryInfo>());

    // Assert
    Page<ConfigHistoryInfo> expectedConfigs = actualHistoryContext.configs;
    String actualDataId = actualHistoryContext.getDataId();
    String actualStatusMsg = actualHistoryContext.getStatusMsg();
    String actualGroup = actualHistoryContext.getGroup();
    boolean actualIsSuccessResult = actualHistoryContext.isSuccess();
    Page<ConfigHistoryInfo> actualConfigs = actualHistoryContext.getConfigs();
    String actualServerId = actualHistoryContext.getServerId();
    assertEquals("123", actualDataId);
    assertEquals(200, actualHistoryContext.getStatusCode());
    assertEquals("123", actualServerId);
    assertSame(expectedConfigs, actualConfigs);
    assertEquals("foo", actualStatusMsg);
    assertTrue(actualIsSuccessResult);
    assertEquals("foo", actualGroup);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    Page<ConfigHistoryInfo> page = new Page<ConfigHistoryInfo>();

    // Act
    HistoryContext actualHistoryContext = new HistoryContext("123", "123", "foo", 1, "foo", page);

    // Assert
    String actualDataId = actualHistoryContext.getDataId();
    String actualStatusMsg = actualHistoryContext.getStatusMsg();
    String actualGroup = actualHistoryContext.getGroup();
    boolean actualIsSuccessResult = actualHistoryContext.isSuccess();
    Page<ConfigHistoryInfo> actualConfigs = actualHistoryContext.getConfigs();
    String actualServerId = actualHistoryContext.getServerId();
    assertEquals("123", actualDataId);
    assertEquals(1, actualHistoryContext.getStatusCode());
    assertEquals("123", actualServerId);
    assertSame(page, actualConfigs);
    assertEquals("foo", actualStatusMsg);
    assertFalse(actualIsSuccessResult);
    assertEquals("foo", actualGroup);
  }

  @Test(timeout=10000)
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new HistoryContext()).getDataId());
  }

  @Test(timeout=10000)
  public void setServerIdTest() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setServerId("123");

    // Assert
    assertEquals("123", historyContext.getServerId());
  }

  @Test(timeout=10000)
  public void getServerIdTest() {
    // Arrange, Act and Assert
    assertNull((new HistoryContext()).getServerId());
  }

  @Test(timeout=10000)
  public void setStatusMsgTest() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setStatusMsg("foo");

    // Assert
    assertEquals("foo", historyContext.getStatusMsg());
  }

  @Test(timeout=10000)
  public void setTenantTest() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setTenant("foo");

    // Assert
    assertEquals("foo", historyContext.getTenant());
  }

  @Test(timeout=10000)
  public void setDataIdTest() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setDataId("123");

    // Assert
    assertEquals("123", historyContext.getDataId());
  }

  @Test(timeout=10000)
  public void setConfigsTest() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();
    Page<ConfigHistoryInfo> page = new Page<ConfigHistoryInfo>();

    // Act
    historyContext.setConfigs(page);

    // Assert
    assertSame(page, historyContext.getConfigs());
  }

  @Test(timeout=10000)
  public void setStatusCodeTest() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setStatusCode(1);

    // Assert
    assertEquals(1, historyContext.getStatusCode());
  }

  @Test(timeout=10000)
  public void isSuccessTest() {
    // Arrange, Act and Assert
    assertFalse((new HistoryContext()).isSuccess());
  }

  @Test(timeout=10000)
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new HistoryContext()).getTenant());
  }

  @Test(timeout=10000)
  public void setSuccessTest() {
    // Arrange
    HistoryContext historyContext = new HistoryContext();

    // Act
    historyContext.setSuccess(true);

    // Assert
    assertTrue(historyContext.isSuccess());
  }

  @Test(timeout=10000)
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new HistoryContext()).getGroup());
  }

  @Test(timeout=10000)
  public void getStatusMsgTest() {
    // Arrange, Act and Assert
    assertNull((new HistoryContext()).getStatusMsg());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    HistoryContext actualHistoryContext = new HistoryContext();

    // Assert
    String actualDataId = actualHistoryContext.getDataId();
    String actualStatusMsg = actualHistoryContext.getStatusMsg();
    String actualGroup = actualHistoryContext.getGroup();
    String actualTenant = actualHistoryContext.getTenant();
    boolean actualIsSuccessResult = actualHistoryContext.isSuccess();
    String actualAppName = actualHistoryContext.getAppName();
    Page<ConfigHistoryInfo> actualConfigs = actualHistoryContext.getConfigs();
    String actualServerId = actualHistoryContext.getServerId();
    assertNull(actualDataId);
    assertEquals(0, actualHistoryContext.getStatusCode());
    assertNull(actualServerId);
    assertNull(actualConfigs);
    assertNull(actualAppName);
    assertFalse(actualIsSuccessResult);
    assertNull(actualTenant);
    assertNull(actualGroup);
    assertNull(actualStatusMsg);
  }
}

