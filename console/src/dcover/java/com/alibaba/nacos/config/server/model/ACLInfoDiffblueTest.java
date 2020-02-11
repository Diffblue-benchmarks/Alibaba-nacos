package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ACLInfoDiffblueTest {
  @Test(timeout=10000)
  public void setIpsTest() {
    // Arrange
    ACLInfo aclInfo = new ACLInfo();

    // Act
    aclInfo.setIps(null);

    // Assert
    assertNull(aclInfo.getIps());
  }

  @Test(timeout=10000)
  public void getIpsTest() {
    // Arrange, Act and Assert
    assertNull((new ACLInfo()).getIps());
  }

  @Test(timeout=10000)
  public void setIsOpenTest() {
    // Arrange
    ACLInfo aclInfo = new ACLInfo();

    // Act
    aclInfo.setIsOpen(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), aclInfo.getIsOpen());
  }

  @Test(timeout=10000)
  public void getIsOpenTest() {
    // Arrange, Act and Assert
    assertNull((new ACLInfo()).getIsOpen());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ACLInfo actualAclInfo = new ACLInfo();

    // Assert
    Boolean actualIsOpen = actualAclInfo.getIsOpen();
    assertNull(actualIsOpen);
    assertNull(actualAclInfo.getIps());
  }
}

