package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ServiceDiffblueTest {
  @Test(timeout=10000)
  public void setAppNameTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setAppName("name");

    // Assert
    assertEquals("name", service.getAppName());
  }

  @Test(timeout=10000)
  public void getProtectThresholdTest() {
    // Arrange, Act and Assert
    assertEquals(0.0f, (new Service()).getProtectThreshold(), 0.0f);
  }

  @Test(timeout=10000)
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertNull((new Service()).getAppName());
  }

  @Test(timeout=10000)
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).getMetadata().size());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    Service actualService = new Service("name");

    // Assert
    String actualName = actualService.getName();
    String actualToStringResult = actualService.toString();
    assertEquals(0.0f, actualService.getProtectThreshold(), 0.0f);
    assertEquals("Service{name='name', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        actualToStringResult);
    assertEquals("name", actualName);
  }

  @Test(timeout=10000)
  public void setProtectThresholdTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setProtectThreshold(10.0f);

    // Assert
    assertEquals(10.0f, service.getProtectThreshold(), 0.0f);
  }

  @Test(timeout=10000)
  public void setMetadataTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setMetadata(null);

    // Assert
    assertNull(service.getMetadata());
  }

  @Test(timeout=10000)
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertNull((new Service()).getGroupName());
  }

  @Test(timeout=10000)
  public void setGroupNameTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setGroupName("name");

    // Assert
    assertEquals("name", service.getGroupName());
  }

  @Test(timeout=10000)
  public void setNameTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setName("name");

    // Assert
    assertEquals("name", service.getName());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Service actualService = new Service();

    // Assert
    String actualToStringResult = actualService.toString();
    assertEquals(0.0f, actualService.getProtectThreshold(), 0.0f);
    assertEquals("Service{name='null', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        actualToStringResult);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Service{name='null', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        (new Service()).toString());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertNull((new Service()).getName());
  }
}

