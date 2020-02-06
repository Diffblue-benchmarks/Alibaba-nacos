package com.alibaba.nacos.client.naming;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NacosNamingMaintainServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void queryServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingMaintainService("")).queryService("", "");
  }
  @Test
  public void updateServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingMaintainService("")).updateService("", "", 1.0f, null);
  }
  @Test
  public void deleteServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingMaintainService("")).deleteService("", "");
  }
  @Test
  public void createServiceTest4() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingMaintainService("")).createService("", "", 1.0f);
  }
  @Test
  public void deleteServiceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingMaintainService("")).deleteService("");
  }
  @Test
  public void createServiceTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingMaintainService("")).createService("", "", 1.0f, "");
  }
  @Test
  public void queryServiceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingMaintainService("")).queryService("");
  }
  @Test
  public void createServiceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingMaintainService("")).createService("", "");
  }
  @Test
  public void updateInstanceTest2() throws NacosException {
    // Arrange
    NacosNamingMaintainService nacosNamingMaintainService = new NacosNamingMaintainService("");

    // Act and Assert
    thrown.expect(NacosException.class);
    nacosNamingMaintainService.updateInstance("", "", new Instance());
  }
  @Test
  public void updateInstanceTest() throws NacosException {
    // Arrange
    NacosNamingMaintainService nacosNamingMaintainService = new NacosNamingMaintainService("");

    // Act and Assert
    thrown.expect(NacosException.class);
    nacosNamingMaintainService.updateInstance("", new Instance());
  }
  @Test
  public void createServiceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingMaintainService("")).createService("");
  }
  @Test
  public void updateServiceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingMaintainService("")).updateService("", "", 1.0f);
  }
}

