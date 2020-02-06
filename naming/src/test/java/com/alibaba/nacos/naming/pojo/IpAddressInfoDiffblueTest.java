package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.junit.Test;

public class IpAddressInfoDiffblueTest {
  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertFalse((new IpAddressInfo()).isValid());
  }

  @Test
  public void isEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new IpAddressInfo()).isEnabled());
  }

  @Test
  public void getIpTest() {
    // Arrange, Act and Assert
    assertNull((new IpAddressInfo()).getIp());
  }

  @Test
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertNull((new IpAddressInfo()).getMetadata());
  }

  @Test
  public void setMetadataTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setMetadata(null);

    // Assert
    assertNull(ipAddressInfo.getMetadata());
  }

  @Test
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertNull((new IpAddressInfo()).getWeight());
  }

  @Test
  public void getPortTest() {
    // Arrange, Act and Assert
    assertNull((new IpAddressInfo()).getPort());
  }

  @Test
  public void setEnabledTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setEnabled(true);

    // Assert
    assertTrue(ipAddressInfo.isEnabled());
  }

  @Test
  public void setPortTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setPort(Integer.valueOf(8080));

    // Assert
    assertEquals(Integer.valueOf(8080), ipAddressInfo.getPort());
  }

  @Test
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

  @Test
  public void setValidTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setValid(true);

    // Assert
    assertTrue(ipAddressInfo.isValid());
  }

  @Test
  public void setWeightTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setWeight(Double.valueOf(10.0));

    // Assert
    assertEquals(Double.valueOf(10.0), ipAddressInfo.getWeight());
  }

  @Test
  public void setIpTest() {
    // Arrange
    IpAddressInfo ipAddressInfo = new IpAddressInfo();

    // Act
    ipAddressInfo.setIp("127.0.0.1");

    // Assert
    assertEquals("127.0.0.1", ipAddressInfo.getIp());
  }
}

