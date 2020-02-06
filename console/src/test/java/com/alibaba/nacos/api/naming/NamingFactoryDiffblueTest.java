package com.alibaba.nacos.api.naming;

import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.exception.NacosException;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NamingFactoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void createNamingServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    NamingFactory.createNamingService((Properties) null);
  }

  @Test
  public void createNamingServiceTest() throws NacosException {
    // Arrange, Act and Assert
    assertTrue(
        NamingFactory.createNamingService("aaaaa") instanceof com.alibaba.nacos.client.naming.NacosNamingService);
  }
}

