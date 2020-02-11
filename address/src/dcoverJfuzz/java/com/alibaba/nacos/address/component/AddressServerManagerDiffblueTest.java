package com.alibaba.nacos.address.component;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddressServerManagerDiffblueTest {
  @Test(timeout=10000)
  public void getDefaultClusterNameIfEmptyTest2() {
    // Arrange, Act and Assert
    assertEquals("serverlist", (new AddressServerManager()).getDefaultClusterNameIfEmpty("serverlist"));
  }

  @Test(timeout=10000)
  public void getDefaultClusterNameIfEmptyTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new AddressServerManager()).getDefaultClusterNameIfEmpty("name"));
  }

  @Test(timeout=10000)
  public void getRawProductNameTest3() {
    // Arrange, Act and Assert
    assertEquals("nacos", (new AddressServerManager()).getRawProductName(""));
  }

  @Test(timeout=10000)
  public void getRawProductNameTest2() {
    // Arrange, Act and Assert
    assertEquals("name", (new AddressServerManager()).getRawProductName("name"));
  }

  @Test(timeout=10000)
  public void getRawProductNameTest() {
    // Arrange, Act and Assert
    assertEquals("nacos", (new AddressServerManager()).getRawProductName("nacos"));
  }

  @Test(timeout=10000)
  public void splitIpsTest2() {
    // Arrange, Act and Assert
    assertEquals(1, (new AddressServerManager()).splitIps("foo").length);
  }

  @Test(timeout=10000)
  public void splitIpsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AddressServerManager()).splitIps("").length);
  }

  @Test(timeout=10000)
  public void getRawClusterNameTest2() {
    // Arrange, Act and Assert
    assertEquals("serverlist", (new AddressServerManager()).getRawClusterName("serverlist"));
  }

  @Test(timeout=10000)
  public void getRawClusterNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new AddressServerManager()).getRawClusterName("name"));
  }
}

