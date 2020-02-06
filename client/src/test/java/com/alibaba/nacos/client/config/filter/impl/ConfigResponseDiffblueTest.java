package com.alibaba.nacos.client.config.filter.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConfigResponseDiffblueTest {
  @Test
  public void setGroupTest() {
    // Arrange
    ConfigResponse configResponse = new ConfigResponse();

    // Act
    configResponse.setGroup("foo");

    // Assert
    assertNull(configResponse.getDataId());
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    ConfigResponse configResponse = new ConfigResponse();

    // Act
    configResponse.setDataId("123");

    // Assert
    assertEquals("123", configResponse.getDataId());
  }

  @Test
  public void setTenantTest() {
    // Arrange
    ConfigResponse configResponse = new ConfigResponse();

    // Act
    configResponse.setTenant("foo");

    // Assert
    assertNull(configResponse.getDataId());
  }

  @Test
  public void setContentTest() {
    // Arrange
    ConfigResponse configResponse = new ConfigResponse();

    // Act
    configResponse.setContent("foo");

    // Assert
    assertNull(configResponse.getDataId());
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigResponse()).getTenant());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigResponse()).getGroup());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigResponse actualConfigResponse = new ConfigResponse();

    // Assert
    String actualDataId = actualConfigResponse.getDataId();
    assertNull(actualDataId);
    assertTrue(actualConfigResponse.getConfigContext() instanceof ConfigContext);
  }

  @Test
  public void getParameterTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigResponse()).getParameter("foo"));
  }

  @Test
  public void getConfigContextTest() {
    // Arrange, Act and Assert
    assertTrue((new ConfigResponse()).getConfigContext() instanceof ConfigContext);
  }

  @Test
  public void getContentTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigResponse()).getContent());
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigResponse()).getDataId());
  }
}

