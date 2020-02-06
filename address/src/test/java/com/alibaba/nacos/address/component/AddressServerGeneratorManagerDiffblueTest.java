package com.alibaba.nacos.address.component;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AddressServerGeneratorManagerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void generateInstancesByIpsTest() {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    (new AddressServerGeneratorManager()).generateInstancesByIps(":", ":", ":", new String[]{":", ":", ":"});
  }

  @Test
  public void generateIpAndPortTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new AddressServerGeneratorManager()).generateIpAndPort(":").length);
  }

  @Test
  public void generateNacosServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("DEFAULT_GROUP@@:", (new AddressServerGeneratorManager()).generateNacosServiceName(":"));
  }

  @Test
  public void generateProductNameTest() {
    // Arrange, Act and Assert
    assertEquals("nacos.as.:", (new AddressServerGeneratorManager()).generateProductName(":"));
  }
}

