package com.alibaba.nacos.console.filter;

import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.console.utils.JwtTokenUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.support.StandardServletEnvironment;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class JwtAuthenticationTokenFilterDiffblueTest {
  @Autowired
  private JwtTokenUtils jwtTokenUtils;
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue(((StandardServletEnvironment) (new JwtAuthenticationTokenFilter(this.jwtTokenUtils)).getEnvironment())
        .getConversionService() instanceof org.springframework.core.convert.support.DefaultConversionService);
  }
}

