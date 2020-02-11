package com.alibaba.nacos.api;

import com.alibaba.nacos.api.exception.NacosException;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NacosFactoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void createMaintainServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NacosFactory.createMaintainService((Properties) null);
  }
  @Test(timeout=10000)
  public void createConfigServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NacosFactory.createConfigService((Properties) null);
  }
  @Test(timeout=10000)
  public void createNamingServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NacosFactory.createNamingService((Properties) null);
  }
  @Test(timeout=10000)
  public void createMaintainServiceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NacosFactory.createMaintainService("foo");
  }
  @Test(timeout=10000)
  public void createConfigServiceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NacosFactory.createConfigService("foo");
  }
  @Test(timeout=10000)
  public void createNamingServiceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NacosFactory.createNamingService("foo");
  }
}

