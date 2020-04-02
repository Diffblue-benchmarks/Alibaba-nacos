package com.alibaba.nacos.console.filter;

import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.console.utils.JwtTokenUtils;
import org.junit.Test;
import org.springframework.web.context.support.StandardServletEnvironment;

public class JwtAuthenticationTokenFilterDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue(((StandardServletEnvironment) (new JwtAuthenticationTokenFilter(new JwtTokenUtils())).getEnvironment())
        .getConversionService() instanceof org.springframework.core.convert.support.DefaultConversionService);
  }
}

