package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import org.junit.Test;

public class IpAddressInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    IpAddressInfo actualIpAddressInfo = new IpAddressInfo();

    // Assert
    assertNull(actualIpAddressInfo.getMetadata());
    assertFalse(actualIpAddressInfo.isValid());
    assertNull(actualIpAddressInfo.getWeight());
    assertNull(actualIpAddressInfo.getPort());
    assertFalse(actualIpAddressInfo.isEnabled());
    assertNull(actualIpAddressInfo.getIp());
  }

  @Test
  public void testSetEnabled() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setEnabled(true);

    // Assert
    assertTrue(ipAddressInfo.isEnabled());
  }

  @Test
  public void testSetIp() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setIp("127.0.0.1");

    // Assert
    assertEquals("127.0.0.1", ipAddressInfo.getIp());
  }

  @Test
  public void testSetMetadata() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    ipAddressInfo.setMetadata(stringStringMap);

    // Assert
    assertSame(stringStringMap, ipAddressInfo.getMetadata());
  }

  @Test
  public void testSetPort() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setPort(8080);

    // Assert
    assertEquals(8080, ipAddressInfo.getPort().intValue());
  }

  @Test
  public void testSetValid() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setValid(true);

    // Assert
    assertTrue(ipAddressInfo.isValid());
  }

  @Test
  public void testSetWeight() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setWeight(10.0);

    // Assert
    assertEquals(10.0, ipAddressInfo.getWeight().doubleValue(), 0.0);
  }
}

