package com.alibaba.nacos.api.naming;

import com.alibaba.nacos.api.exception.NacosException;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NamingMaintainFactoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void createMaintainServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NamingMaintainFactory.createMaintainService((Properties) null);
  }
  @Test
  public void createMaintainServiceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NamingMaintainFactory.createMaintainService("foo");
  }
}

