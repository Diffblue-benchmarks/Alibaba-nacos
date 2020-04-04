package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;

public class ServiceDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Service actualService = new Service();

    // Assert
    assertEquals(0.0f, actualService.getProtectThreshold(), 0.0f);
    assertEquals("Service{name='null', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        actualService.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Service actualService = new Service("name");

    // Assert
    assertEquals(0.0f, actualService.getProtectThreshold(), 0.0f);
    assertEquals("Service{name='name', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        actualService.toString());
    assertEquals("name", actualService.getName());
  }

  @Test
  public void testSetAppName() {
    // Arrange
    Service service = new Service();

    // Act
    service.setAppName("appName");

    // Assert
    assertEquals("appName", service.getAppName());
  }

  @Test
  public void testSetGroupName() {
    // Arrange
    Service service = new Service();

    // Act
    service.setGroupName("groupName");

    // Assert
    assertEquals("groupName", service.getGroupName());
  }

  @Test
  public void testSetMetadata() {
    // Arrange
    Service service = new Service();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    service.setMetadata(stringStringMap);

    // Assert
    assertEquals(
        "Service{name='null', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={foo=foo}}",
        service.toString());
  }

  @Test
  public void testSetName() {
    // Arrange
    Service service = new Service();

    // Act
    service.setName("name");

    // Assert
    assertEquals("name", service.getName());
  }

  @Test
  public void testSetProtectThreshold() {
    // Arrange
    Service service = new Service();

    // Act
    service.setProtectThreshold(0.0f);

    // Assert
    assertEquals(0.0f, service.getProtectThreshold(), 0.0f);
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Service{name='null', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        (new Service()).toString());
  }
}

