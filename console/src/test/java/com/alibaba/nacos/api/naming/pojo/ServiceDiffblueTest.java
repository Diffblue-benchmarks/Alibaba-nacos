package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ServiceDiffblueTest {
  @Test
  public void setAppNameTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setAppName("aaaaa");

    // Assert
    assertEquals("aaaaa", service.getAppName());
  }

  @Test
  public void getProtectThresholdTest() {
    // Arrange, Act and Assert
    assertEquals(0.0f, (new Service()).getProtectThreshold(), 0.0f);
  }

  @Test
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertNull((new Service()).getAppName());
  }

  @Test
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).getMetadata().size());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Service actualService = new Service("aaaaa");

    // Assert
    String actualName = actualService.getName();
    String actualToStringResult = actualService.toString();
    assertEquals(0.0f, actualService.getProtectThreshold(), 0.0f);
    assertEquals("Service{name='aaaaa', protectThreshold=0.0," + " appName='null', groupName='null', metadata={}}",
        actualToStringResult);
    assertEquals("aaaaa", actualName);
  }

  @Test
  public void setProtectThresholdTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setProtectThreshold(1.0f);

    // Assert
    assertEquals(1.0f, service.getProtectThreshold(), 0.0f);
  }

  @Test
  public void setMetadataTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setMetadata(null);

    // Assert
    assertNull(service.getMetadata());
  }

  @Test
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertNull((new Service()).getGroupName());
  }

  @Test
  public void setGroupNameTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setGroupName("aaaaa");

    // Assert
    assertEquals("aaaaa", service.getGroupName());
  }

  @Test
  public void setNameTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setName("aaaaa");

    // Assert
    assertEquals("aaaaa", service.getName());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Service actualService = new Service();

    // Assert
    String actualToStringResult = actualService.toString();
    assertEquals(0.0f, actualService.getProtectThreshold(), 0.0f);
    assertEquals("Service{name='null', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        actualToStringResult);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Service{name='null', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        (new Service()).toString());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertNull((new Service()).getName());
  }
}

