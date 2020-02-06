package com.alibaba.nacos.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.exception.NacosException;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NacosFactoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void createMaintainServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NacosFactory.createMaintainService((Properties) null);
  }

  @Test
  public void createConfigServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NacosFactory.createConfigService((Properties) null);
  }

  @Test
  public void createNamingServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NacosFactory.createNamingService((Properties) null);
  }

  @Test
  public void createMaintainServiceTest() throws NacosException {
    // Arrange, Act and Assert
    assertTrue(NacosFactory
        .createMaintainService("aaaaa") instanceof com.alibaba.nacos.client.naming.NacosNamingMaintainService);
  }

  @Test
  public void createConfigServiceTest() throws NacosException {
    // Arrange, Act and Assert
    assertEquals("UP", NacosFactory.createConfigService("aaaaa").getServerStatus());
  }

  @Test
  public void createNamingServiceTest() throws NacosException {
    // Arrange, Act and Assert
    assertTrue(NacosFactory.createNamingService("aaaaa") instanceof com.alibaba.nacos.client.naming.NacosNamingService);
  }
}

