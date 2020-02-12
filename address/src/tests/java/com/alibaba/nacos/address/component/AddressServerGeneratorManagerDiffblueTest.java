package com.alibaba.nacos.address.component;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddressServerGeneratorManagerDiffblueTest {
  @Test(timeout=10000)
  public void generateInstancesByIpsTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new AddressServerGeneratorManager())
        .generateInstancesByIps("name", "name", "name", new String[]{"foo", "name", "name"}).size());
  }

  @Test(timeout=10000)
  public void generateIpAndPortTest2() {
    // Arrange, Act and Assert
    assertEquals(2, (new AddressServerGeneratorManager()).generateIpAndPort("127.0.0.1").length);
  }

  @Test(timeout=10000)
  public void generateIpAndPortTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new AddressServerGeneratorManager()).generateIpAndPort(":").length);
  }

  @Test(timeout=10000)
  public void generateNacosServiceNameTest2() {
    // Arrange, Act and Assert
    assertEquals("DEFAULT_GROUP@@name", (new AddressServerGeneratorManager()).generateNacosServiceName("name"));
  }

  @Test(timeout=10000)
  public void generateNacosServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("DEFAULT_GROUP", (new AddressServerGeneratorManager()).generateNacosServiceName("DEFAULT_GROUP"));
  }

  @Test(timeout=10000)
  public void generateProductNameTest2() {
    // Arrange, Act and Assert
    assertEquals("nacos.as.name", (new AddressServerGeneratorManager()).generateProductName("name"));
  }

  @Test(timeout=10000)
  public void generateProductNameTest() {
    // Arrange, Act and Assert
    assertEquals("nacos.as.default", (new AddressServerGeneratorManager()).generateProductName("nacos"));
  }
}

