package com.alibaba.nacos.client.config.filter.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConfigRequestDiffblueTest {
  @Test
  public void setGroupTest() {
    // Arrange
    ConfigRequest configRequest = new ConfigRequest();

    // Act
    configRequest.setGroup("content");

    // Assert
    assertNull(configRequest.getDataId());
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    ConfigRequest configRequest = new ConfigRequest();

    // Act
    configRequest.setDataId("content");

    // Assert
    assertEquals("content", configRequest.getDataId());
  }

  @Test
  public void setTenantTest() {
    // Arrange
    ConfigRequest configRequest = new ConfigRequest();

    // Act
    configRequest.setTenant("content");

    // Assert
    assertNull(configRequest.getDataId());
  }

  @Test
  public void setContentTest() {
    // Arrange
    ConfigRequest configRequest = new ConfigRequest();

    // Act
    configRequest.setContent("content");

    // Assert
    assertNull(configRequest.getDataId());
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigRequest()).getTenant());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigRequest()).getGroup());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigRequest actualConfigRequest = new ConfigRequest();

    // Assert
    String actualDataId = actualConfigRequest.getDataId();
    assertNull(actualDataId);
    assertTrue(actualConfigRequest.getConfigContext() instanceof ConfigContext);
  }

  @Test
  public void getParameterTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigRequest()).getParameter("content"));
  }

  @Test
  public void getConfigContextTest() {
    // Arrange, Act and Assert
    assertTrue((new ConfigRequest()).getConfigContext() instanceof ConfigContext);
  }

  @Test
  public void getContentTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigRequest()).getContent());
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigRequest()).getDataId());
  }
}

