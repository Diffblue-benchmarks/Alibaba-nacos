package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ServiceManagerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getServiceCount());
  }

  @Test
  public void testServiceChecksumConstructor() {
    // Arrange, Act and Assert
    assertEquals("public", (new ServiceManager.ServiceChecksum()).namespaceId);
  }

  @Test
  public void testServiceChecksumConstructor2() {
    // Arrange, Act and Assert
    assertEquals("public", (new ServiceManager.ServiceChecksum("public")).namespaceId);
  }
}

