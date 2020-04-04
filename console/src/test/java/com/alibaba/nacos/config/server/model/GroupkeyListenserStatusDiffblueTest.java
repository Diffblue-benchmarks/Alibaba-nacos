package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.HashMap;
import org.junit.Test;

public class GroupkeyListenserStatusDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    GroupkeyListenserStatus actualGroupkeyListenserStatus = new GroupkeyListenserStatus();

    // Assert
    assertEquals(0, actualGroupkeyListenserStatus.getCollectStatus());
    assertNull(actualGroupkeyListenserStatus.getLisentersGroupkeyStatus());
  }

  @Test
  public void testSetCollectStatus() {
    // Arrange
    GroupkeyListenserStatus groupkeyListenserStatus = new GroupkeyListenserStatus();

    // Act
    groupkeyListenserStatus.setCollectStatus(1);

    // Assert
    assertEquals(1, groupkeyListenserStatus.getCollectStatus());
  }

  @Test
  public void testSetLisentersGroupkeyStatus() {
    // Arrange
    GroupkeyListenserStatus groupkeyListenserStatus = new GroupkeyListenserStatus();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    groupkeyListenserStatus.setLisentersGroupkeyStatus(stringStringMap);

    // Assert
    assertSame(stringStringMap, groupkeyListenserStatus.getLisentersGroupkeyStatus());
  }
}

