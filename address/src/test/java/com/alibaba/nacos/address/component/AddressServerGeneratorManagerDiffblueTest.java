package com.alibaba.nacos.address.component;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddressServerGeneratorManagerDiffblueTest {
  @Test
  public void generateInstancesByIpsTest3() {
    // Arrange, Act and Assert
    assertEquals(3, (new AddressServerGeneratorManager())
        .generateInstancesByIps("name", "name", "name", new String[]{"foo", "name", "name"}).size());
  }

  @Test
  public void generateInstancesByIpsTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new AddressServerGeneratorManager())
        .generateInstancesByIps("", "name", "name", new String[]{"foo", "", "name"}).size());
  }

  @Test
  public void generateInstancesByIpsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AddressServerGeneratorManager())
        .generateInstancesByIps("name", "name", "", new String[]{"foo", "name", "name"}).size());
  }

  @Test
  public void generateIpAndPortTest2() {
    // Arrange, Act and Assert
    assertEquals(2, (new AddressServerGeneratorManager()).generateIpAndPort(":").length);
  }

  @Test
  public void generateIpAndPortTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new AddressServerGeneratorManager()).generateIpAndPort("127.0.0.1").length);
  }

  @Test
  public void generateNacosServiceNameTest2() {
    // Arrange, Act and Assert
    assertEquals("DEFAULT_GROUP", (new AddressServerGeneratorManager()).generateNacosServiceName("DEFAULT_GROUP"));
  }

  @Test
  public void generateNacosServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("DEFAULT_GROUP@@name", (new AddressServerGeneratorManager()).generateNacosServiceName("name"));
  }

  @Test
  public void generateProductNameTest3() {
    // Arrange, Act and Assert
    assertEquals("nacos.as.default", (new AddressServerGeneratorManager()).generateProductName("nacos"));
  }

  @Test
  public void generateProductNameTest2() {
    // Arrange, Act and Assert
    assertEquals("nacos.as.default", (new AddressServerGeneratorManager()).generateProductName(""));
  }

  @Test
  public void generateProductNameTest() {
    // Arrange, Act and Assert
    assertEquals("nacos.as.name", (new AddressServerGeneratorManager()).generateProductName("name"));
  }
}

