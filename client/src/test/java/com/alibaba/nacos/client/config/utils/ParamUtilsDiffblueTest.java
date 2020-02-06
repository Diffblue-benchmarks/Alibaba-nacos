package com.alibaba.nacos.client.config.utils;

import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.exception.NacosException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ParamUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void checkKeyParamTest11() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam((List<String>) null, "foo");
  }
  @Test
  public void checkParamTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "foo", "");
  }
  @Test
  public void checkTDGTest4() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTDG("foo", "123", "group invalid");
  }
  @Test
  public void checkTDGTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTDG("foo", "dataId invalid", "foo");
  }
  @Test
  public void checkTDGTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTDG("foo", "123", "");
  }
  @Test
  public void checkTDGTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTDG("foo", "", "foo");
  }
  @Test
  public void checkParamTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "foo", "123", "");
  }
  @Test
  public void checkBetaIpsTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkBetaIps("foo");
  }
  @Test
  public void checkBetaIpsTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkBetaIps("");
  }
  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue(ParamUtils.isValid("foo"));
  }
  @Test
  public void checkKeyParamTest10() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("123", "foo", "datumId invalid");
  }
  @Test
  public void checkKeyParamTest9() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("123", "group invalid", "123");
  }
  @Test
  public void checkKeyParamTest8() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("dataId invalid", "foo", "123");
  }
  @Test
  public void checkKeyParamTest7() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("123", "foo", "");
  }
  @Test
  public void checkKeyParamTest6() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("123", "", "123");
  }
  @Test
  public void checkKeyParamTest5() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("", "foo", "123");
  }
  @Test
  public void checkContentTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkContent("");
  }
  @Test
  public void checkTenantTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTenant("tenant invalid");
  }
  @Test
  public void checkTenantTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTenant("");
  }
  @Test
  public void checkKeyParamTest4() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("123", "group invalid");
  }
  @Test
  public void checkKeyParamTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("dataId invalid", "foo");
  }
  @Test
  public void checkKeyParamTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("", "foo");
  }
  @Test
  public void checkKeyParamTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("123", "");
  }
}

