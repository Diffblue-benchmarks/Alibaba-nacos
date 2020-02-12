package com.alibaba.nacos.address.component;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddressServerManagerDiffblueTest {
  @Test(timeout=10000)
  public void getDefaultClusterNameIfEmptyTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new AddressServerManager()).getDefaultClusterNameIfEmpty("name"));
  }

  @Test(timeout=10000)
  public void getRawProductNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new AddressServerManager()).getRawProductName("name"));
  }

  @Test(timeout=10000)
  public void splitIpsTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new AddressServerManager()).splitIps("foo").length);
  }

  @Test(timeout=10000)
  public void getRawClusterNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new AddressServerManager()).getRawClusterName("name"));
  }
}

