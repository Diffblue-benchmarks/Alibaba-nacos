package com.alibaba.nacos.address.component;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddressServerManagerDiffblueTest {
  @Test
  public void getDefaultClusterNameIfEmptyTest() {
    // Arrange, Act and Assert
    assertEquals("nacos", (new AddressServerManager()).getDefaultClusterNameIfEmpty("nacos"));
  }

  @Test
  public void getRawProductNameTest() {
    // Arrange, Act and Assert
    assertEquals("nacos", (new AddressServerManager()).getRawProductName("nacos"));
  }

  @Test
  public void splitIpsTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new AddressServerManager()).splitIps("nacos").length);
  }

  @Test
  public void getRawClusterNameTest() {
    // Arrange, Act and Assert
    assertEquals("nacos", (new AddressServerManager()).getRawClusterName("nacos"));
  }
}

