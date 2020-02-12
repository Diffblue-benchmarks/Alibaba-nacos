package com.alibaba.nacos.api.config;

import com.alibaba.nacos.api.exception.NacosException;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConfigFactoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void createConfigServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ConfigFactory.createConfigService((Properties) null);
  }
  @Test(timeout=10000)
  public void createConfigServiceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ConfigFactory.createConfigService("foo");
  }
}

