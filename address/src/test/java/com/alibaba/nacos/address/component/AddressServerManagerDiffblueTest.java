package com.alibaba.nacos.address.component;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddressServerManagerDiffblueTest {
  @Test
  public void getDefaultClusterNameIfEmptyTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new AddressServerManager()).getDefaultClusterNameIfEmpty("name"));
  }

  @Test
  public void getRawProductNameTest3() {
    // Arrange, Act and Assert
    assertEquals("nacos", (new AddressServerManager()).getRawProductName(""));
  }

  @Test
  public void getRawProductNameTest2() {
    // Arrange, Act and Assert
    assertEquals("name", (new AddressServerManager()).getRawProductName("name"));
  }

  @Test
  public void getRawProductNameTest() {
    // Arrange, Act and Assert
    assertEquals("nacos", (new AddressServerManager()).getRawProductName("nacos"));
  }

  @Test
  public void splitIpsTest2() {
    // Arrange, Act and Assert
    assertEquals(1, (new AddressServerManager()).splitIps("foo").length);
  }

  @Test
  public void splitIpsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AddressServerManager()).splitIps("").length);
  }

  @Test
  public void getRawClusterNameTest3() {
    // Arrange, Act and Assert
    assertEquals("name", (new AddressServerManager()).getRawClusterName("name"));
  }

  @Test
  public void getRawClusterNameTest2() {
    // Arrange, Act and Assert
    assertEquals("serverlist", (new AddressServerManager()).getRawClusterName("serverlist"));
  }

  @Test
  public void getRawClusterNameTest() {
    // Arrange, Act and Assert
    assertEquals("serverlist", (new AddressServerManager()).getRawClusterName(""));
  }
}

