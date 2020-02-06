package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertFalse;
import com.alibaba.nacos.api.exception.NacosException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ParamUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void checkParamTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam(",", ",", ",", ",");
  }
  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertFalse(ParamUtils.isValid(","));
  }
  @Test
  public void checkParamTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ParamUtils.checkParam(",");
  }
  @Test
  public void checkTenantTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ParamUtils.checkTenant(",");
  }
}

