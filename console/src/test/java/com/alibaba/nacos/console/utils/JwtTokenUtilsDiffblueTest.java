package com.alibaba.nacos.console.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.TestingAuthenticationToken;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class JwtTokenUtilsDiffblueTest {
  @Autowired
  private JwtTokenUtils jwtTokenUtils;
  @Test
  public void testCreateToken() {
    // Arrange, Act and Assert
    assertEquals(
        "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJwcmluY2lwYWwiLCJhd" + "XRoIjoiIiwiZXhwIjoxNTg2OTUwMzAzfQ.XHln5HsAzGDTyVKb"
            + "equwrMyPIls05YSpbtJNa6kt-hk",
        this.jwtTokenUtils.createToken(new TestingAuthenticationToken("principal", "principal")));
  }
  @Test
  public void testValidateToken() {
    // Arrange, Act and Assert
    assertFalse(this.jwtTokenUtils.validateToken("ABC123"));
  }
}

