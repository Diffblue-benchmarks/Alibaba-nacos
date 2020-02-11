package com.alibaba.nacos.client.config.filter.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConfigRequestDiffblueTest {
  @Test(timeout=10000)
  public void setGroupTest() {
    // Arrange
    ConfigRequest configRequest = new ConfigRequest();

    // Act
    configRequest.setGroup("foo");

    // Assert
    assertNull(configRequest.getDataId());
  }

  @Test(timeout=10000)
  public void setDataIdTest() {
    // Arrange
    ConfigRequest configRequest = new ConfigRequest();

    // Act
    configRequest.setDataId("123");

    // Assert
    assertEquals("123", configRequest.getDataId());
  }

  @Test(timeout=10000)
  public void setTenantTest() {
    // Arrange
    ConfigRequest configRequest = new ConfigRequest();

    // Act
    configRequest.setTenant("foo");

    // Assert
    assertNull(configRequest.getDataId());
  }

  @Test(timeout=10000)
  public void setContentTest() {
    // Arrange
    ConfigRequest configRequest = new ConfigRequest();

    // Act
    configRequest.setContent("foo");

    // Assert
    assertNull(configRequest.getDataId());
  }

  @Test(timeout=10000)
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigRequest()).getTenant());
  }

  @Test(timeout=10000)
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigRequest()).getGroup());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ConfigRequest actualConfigRequest = new ConfigRequest();

    // Assert
    String actualDataId = actualConfigRequest.getDataId();
    assertNull(actualDataId);
    assertTrue(actualConfigRequest.getConfigContext() instanceof ConfigContext);
  }

  @Test(timeout=10000)
  public void getParameterTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigRequest()).getParameter("foo"));
  }

  @Test(timeout=10000)
  public void getConfigContextTest() {
    // Arrange, Act and Assert
    assertTrue((new ConfigRequest()).getConfigContext() instanceof ConfigContext);
  }

  @Test(timeout=10000)
  public void getContentTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigRequest()).getContent());
  }

  @Test(timeout=10000)
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigRequest()).getDataId());
  }
}

