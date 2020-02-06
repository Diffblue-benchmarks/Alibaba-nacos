package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.exception.NacosException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ParamUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void checkParamTest6() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "", "123", "foo");
  }

  @Test
  public void checkParamTest5() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("", "foo", "123", "foo");
  }

  @Test
  public void checkParamTest4() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "invalid group", "123", "foo");
  }

  @Test
  public void checkParamTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "foo", "content is blank", "");
  }

  @Test
  public void checkParamTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "foo", "123", "");
  }

  @Test
  public void checkParamTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("invalid dataId", "foo", "123", "foo");
  }

  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue(ParamUtils.isValid("foo"));
  }
}

