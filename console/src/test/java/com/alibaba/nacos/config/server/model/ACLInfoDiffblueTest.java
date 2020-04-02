package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class ACLInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ACLInfo actualAclInfo = new ACLInfo();

    // Assert
    assertNull(actualAclInfo.getIsOpen());
    assertNull(actualAclInfo.getIps());
  }

  @Test
  public void testSetIps() {
    // Arrange
    ACLInfo aclInfo = new ACLInfo();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    aclInfo.setIps(stringList);

    // Assert
    assertSame(stringList, aclInfo.getIps());
  }

  @Test
  public void testSetIsOpen() {
    // Arrange
    ACLInfo aclInfo = new ACLInfo();

    // Act
    aclInfo.setIsOpen(true);

    // Assert
    assertTrue(aclInfo.getIsOpen());
  }
}

