package com.alibaba.nacos.console.filter;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.console.utils.JwtTokenUtils;
import org.junit.Test;
import org.springframework.core.env.Environment;

public class JwtAuthenticationTokenFilterDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    JwtAuthenticationTokenFilter actualJwtAuthenticationTokenFilter = new JwtAuthenticationTokenFilter(
        new JwtTokenUtils());

    // Assert
    Environment environment = actualJwtAuthenticationTokenFilter.getEnvironment();
    assertTrue(environment instanceof org.springframework.web.context.support.StandardServletEnvironment);
    assertNull(actualJwtAuthenticationTokenFilter.getFilterConfig());
  }
}

