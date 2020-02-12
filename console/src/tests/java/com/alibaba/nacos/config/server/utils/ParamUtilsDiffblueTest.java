package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.exception.NacosException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ParamUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void checkParamTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("", "foo", "123", "foo");
  }

  @Test(timeout=10000)
  public void checkParamTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("invalid dataId", "foo", "123", "foo");
  }

  @Test(timeout=10000)
  public void checkParamTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "foo", "", "foo");
  }

  @Test(timeout=10000)
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue(ParamUtils.isValid("foo"));
  }
}

