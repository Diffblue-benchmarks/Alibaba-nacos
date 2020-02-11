package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.junit.Test;

public class IpAddressInfoDiffblueTest {
  @Test(timeout=10000)
  public void isValidTest() {
    // Arrange, Act and Assert
    assertFalse((new IpAddressInfo()).isValid());
  }

  @Test(timeout=10000)
  public void isEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new IpAddressInfo()).isEnabled());
  }

  @Test(timeout=10000)
  public void getIpTest() {
    // Arrange, Act and Assert
    assertNull((new IpAddressInfo()).getIp());
  }

  @Test(timeout=10000)
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertNull((new IpAddressInfo()).getMetadata());
  }

  @Test(timeout=10000)
  public void setMetadataTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setMetadata(null);

    // Assert
    assertNull(ipAddressInfo.getMetadata());
  }

  @Test(timeout=10000)
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertNull((new IpAddressInfo()).getWeight());
  }

  @Test(timeout=10000)
  public void getPortTest() {
    // Arrange, Act and Assert
    assertNull((new IpAddressInfo()).getPort());
  }

  @Test(timeout=10000)
  public void setEnabledTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setEnabled(true);

    // Assert
    assertTrue(ipAddressInfo.isEnabled());
  }

  @Test(timeout=10000)
  public void setPortTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setPort(Integer.valueOf(8080));

    // Assert
    assertEquals(Integer.valueOf(8080), ipAddressInfo.getPort());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    IpAddressInfo actualIpAddressInfo = new IpAddressInfo();

    // Assert
    Map<String, String> actualMetadata = actualIpAddressInfo.getMetadata();
    String actualIp = actualIpAddressInfo.getIp();
    boolean actualIsEnabledResult = actualIpAddressInfo.isEnabled();
    Integer actualPort = actualIpAddressInfo.getPort();
    Double actualWeight = actualIpAddressInfo.getWeight();
    assertNull(actualMetadata);
    assertFalse(actualIpAddressInfo.isValid());
    assertNull(actualWeight);
    assertNull(actualPort);
    assertFalse(actualIsEnabledResult);
    assertNull(actualIp);
  }

  @Test(timeout=10000)
  public void setValidTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setValid(true);

    // Assert
    assertTrue(ipAddressInfo.isValid());
  }

  @Test(timeout=10000)
  public void setWeightTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setWeight(Double.valueOf(10.0));

    // Assert
    assertEquals(Double.valueOf(10.0), ipAddressInfo.getWeight());
  }

  @Test(timeout=10000)
  public void setIpTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setIp("127.0.0.1");

    // Assert
    assertEquals("127.0.0.1", ipAddressInfo.getIp());
  }
}

