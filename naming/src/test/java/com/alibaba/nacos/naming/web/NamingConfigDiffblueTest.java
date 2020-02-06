package com.alibaba.nacos.naming.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import javax.servlet.Filter;
import org.junit.Test;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

public class NamingConfigDiffblueTest {
  @Test
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

  @Test
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

