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
  @Test(timeout=10000)
  public void checkKeyParamTest8() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam((List<String>) null, "foo");
  }
  @Test(timeout=10000)
  public void checkParamTest10() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "", "foo");
  }
  @Test(timeout=10000)
  public void checkParamTest9() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("group invalid", "", "foo");
  }
  @Test(timeout=10000)
  public void checkParamTest8() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "foo", "");
  }
  @Test(timeout=10000)
  public void checkParamTest7() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "group invalid", "foo");
  }
  @Test(timeout=10000)
  public void checkTDGTest5() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTDG("foo", "123", "group invalid");
  }
  @Test(timeout=10000)
  public void checkTDGTest4() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTDG("foo", "123", "");
  }
  @Test(timeout=10000)
  public void checkTDGTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTDG("tenant invalid", "123", "foo");
  }
  @Test(timeout=10000)
  public void checkTDGTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTDG("foo", "", "foo");
  }
  @Test(timeout=10000)
  public void checkTDGTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTDG("", "123", "foo");
  }
  @Test(timeout=10000)
  public void checkParamTest6() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("dataId invalid", "foo", "123", "foo");
  }
  @Test(timeout=10000)
  public void checkParamTest5() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("", "foo", "123", "foo");
  }
  @Test(timeout=10000)
  public void checkParamTest4() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "foo", "datumId invalid", "foo");
  }
  @Test(timeout=10000)
  public void checkParamTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "foo", "123", "");
  }
  @Test(timeout=10000)
  public void checkParamTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "datumId invalid", "", "foo");
  }
  @Test(timeout=10000)
  public void checkParamTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkParam("123", "foo", "", "foo");
  }
  @Test(timeout=10000)
  public void checkBetaIpsTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkBetaIps("foo");
  }
  @Test(timeout=10000)
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue(ParamUtils.isValid("foo"));
  }
  @Test(timeout=10000)
  public void checkKeyParamTest7() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("dataId invalid", "foo", "123");
  }
  @Test(timeout=10000)
  public void checkKeyParamTest6() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("", "foo", "123");
  }
  @Test(timeout=10000)
  public void checkKeyParamTest5() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("123", "", "123");
  }
  @Test(timeout=10000)
  public void checkKeyParamTest4() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("123", "foo", "");
  }
  @Test(timeout=10000)
  public void checkContentTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkContent("");
  }
  @Test(timeout=10000)
  public void checkTenantTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTenant("tenant invalid");
  }
  @Test(timeout=10000)
  public void checkTenantTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkTenant("");
  }
  @Test(timeout=10000)
  public void checkKeyParamTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("123", "");
  }
  @Test(timeout=10000)
  public void checkKeyParamTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("dataId invalid", "foo");
  }
  @Test(timeout=10000)
  public void checkKeyParamTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam("", "foo");
  }
}

