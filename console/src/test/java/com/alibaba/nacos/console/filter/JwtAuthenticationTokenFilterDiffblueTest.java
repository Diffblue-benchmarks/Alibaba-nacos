package com.alibaba.nacos.console.filter;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.console.utils.JwtTokenUtils;
import org.junit.Test;

public class JwtAuthenticationTokenFilterDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    JwtAuthenticationTokenFilter actualJwtAuthenticationTokenFilter = new JwtAuthenticationTokenFilter(
        new JwtTokenUtils());

    // Assert
    assertTrue(actualJwtAuthenticationTokenFilter
        .getEnvironment() instanceof org.springframework.web.context.support.StandardServletEnvironment);
    assertNull(actualJwtAuthenticationTokenFilter.getFilterConfig());
  }
}

