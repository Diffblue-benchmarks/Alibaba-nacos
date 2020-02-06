package com.alibaba.nacos.core.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import javax.servlet.Filter;
import org.junit.Test;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

public class AuthConfigsDiffblueTest {
  @Test
  public void authFilterRegistrationTest() {
    // Arrange and Act
    FilterRegistrationBean actualAuthFilterRegistrationResult = (new AuthConfigs()).authFilterRegistration();

    // Assert
    String actualToStringResult = actualAuthFilterRegistrationResult.toString();
    int actualOrder = actualAuthFilterRegistrationResult.getOrder();
    boolean actualIsAsyncSupportedResult = actualAuthFilterRegistrationResult.isAsyncSupported();
    boolean actualIsEnabledResult = actualAuthFilterRegistrationResult.isEnabled();
    Filter filter = actualAuthFilterRegistrationResult.getFilter();
    assertEquals("authFilter urls=[/*]", actualToStringResult);
    assertFalse(actualAuthFilterRegistrationResult.isMatchAfter());
    assertTrue(filter instanceof AuthFilter);
    assertTrue(actualIsEnabledResult);
    assertTrue(actualIsAsyncSupportedResult);
    assertEquals(6, actualOrder);
  }

  @Test
  public void getNacosAuthSystemTypeTest() {
    // Arrange, Act and Assert
    assertNull((new AuthConfigs()).getNacosAuthSystemType());
  }

  @Test
  public void getTokenValidityInSecondsTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new AuthConfigs()).getTokenValidityInSeconds());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    AuthConfigs actualAuthConfigs = new AuthConfigs();

    // Assert
    String actualSecretKey = actualAuthConfigs.getSecretKey();
    long actualTokenValidityInSeconds = actualAuthConfigs.getTokenValidityInSeconds();
    assertNull(actualSecretKey);
    assertNull(actualAuthConfigs.getNacosAuthSystemType());
    assertEquals(0L, actualTokenValidityInSeconds);
  }

  @Test
  public void getSecretKeyTest() {
    // Arrange, Act and Assert
    assertNull((new AuthConfigs()).getSecretKey());
  }
}

