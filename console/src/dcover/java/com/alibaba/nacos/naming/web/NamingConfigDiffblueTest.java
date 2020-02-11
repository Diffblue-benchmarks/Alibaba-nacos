package com.alibaba.nacos.naming.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import javax.servlet.Filter;
import org.junit.Test;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

public class NamingConfigDiffblueTest {
  @Test(timeout=10000)
  public void distroFilterRegistrationTest() {
    // Arrange and Act
    FilterRegistrationBean actualDistroFilterRegistrationResult = (new NamingConfig()).distroFilterRegistration();

    // Assert
    String actualToStringResult = actualDistroFilterRegistrationResult.toString();
    int actualOrder = actualDistroFilterRegistrationResult.getOrder();
    boolean actualIsAsyncSupportedResult = actualDistroFilterRegistrationResult.isAsyncSupported();
    boolean actualIsEnabledResult = actualDistroFilterRegistrationResult.isEnabled();
    Filter filter = actualDistroFilterRegistrationResult.getFilter();
    assertEquals("distroFilter urls=[/v1/ns/*]", actualToStringResult);
    assertFalse(actualDistroFilterRegistrationResult.isMatchAfter());
    assertTrue(filter instanceof DistroFilter);
    assertTrue(actualIsEnabledResult);
    assertTrue(actualIsAsyncSupportedResult);
    assertEquals(6, actualOrder);
  }

  @Test(timeout=10000)
  public void authFilterRegistrationTest() {
    // Arrange and Act
    FilterRegistrationBean actualAuthFilterRegistrationResult = (new NamingConfig()).authFilterRegistration();

    // Assert
    String actualToStringResult = actualAuthFilterRegistrationResult.toString();
    int actualOrder = actualAuthFilterRegistrationResult.getOrder();
    boolean actualIsAsyncSupportedResult = actualAuthFilterRegistrationResult.isAsyncSupported();
    boolean actualIsEnabledResult = actualAuthFilterRegistrationResult.isEnabled();
    Filter filter = actualAuthFilterRegistrationResult.getFilter();
    assertEquals("authFilter urls=[/api/*, /raft/*]", actualToStringResult);
    assertFalse(actualAuthFilterRegistrationResult.isMatchAfter());
    assertTrue(filter instanceof AuthFilter);
    assertTrue(actualIsEnabledResult);
    assertTrue(actualIsAsyncSupportedResult);
    assertEquals(5, actualOrder);
  }

  @Test(timeout=10000)
  public void trafficReviseFilterRegistrationTest() {
    // Arrange and Act
    FilterRegistrationBean actualTrafficReviseFilterRegistrationResult = (new NamingConfig())
        .trafficReviseFilterRegistration();

    // Assert
    String actualToStringResult = actualTrafficReviseFilterRegistrationResult.toString();
    int actualOrder = actualTrafficReviseFilterRegistrationResult.getOrder();
    boolean actualIsAsyncSupportedResult = actualTrafficReviseFilterRegistrationResult.isAsyncSupported();
    boolean actualIsEnabledResult = actualTrafficReviseFilterRegistrationResult.isEnabled();
    Filter filter = actualTrafficReviseFilterRegistrationResult.getFilter();
    assertEquals("trafficReviseFilter urls=[/v1/ns/*]", actualToStringResult);
    assertFalse(actualTrafficReviseFilterRegistrationResult.isMatchAfter());
    assertTrue(filter instanceof TrafficReviseFilter);
    assertTrue(actualIsEnabledResult);
    assertTrue(actualIsAsyncSupportedResult);
    assertEquals(1, actualOrder);
  }
}

