package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class GroupkeyListenserStatusDiffblueTest {
  @Test(timeout=10000)
  public void getLisentersGroupkeyStatusTest() {
    // Arrange, Act and Assert
    assertNull((new GroupkeyListenserStatus()).getLisentersGroupkeyStatus());
  }

  @Test(timeout=10000)
  public void getCollectStatusTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new GroupkeyListenserStatus()).getCollectStatus());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    GroupkeyListenserStatus actualGroupkeyListenserStatus = new GroupkeyListenserStatus();

    // Assert
    int actualCollectStatus = actualGroupkeyListenserStatus.getCollectStatus();
    assertEquals(0, actualCollectStatus);
    assertNull(actualGroupkeyListenserStatus.getLisentersGroupkeyStatus());
  }

  @Test(timeout=10000)
  public void setCollectStatusTest() {
    // Arrange
    GroupkeyListenserStatus groupkeyListenserStatus = new GroupkeyListenserStatus();

    // Act
    groupkeyListenserStatus.setCollectStatus(1);

    // Assert
    assertEquals(1, groupkeyListenserStatus.getCollectStatus());
  }

  @Test(timeout=10000)
  public void setLisentersGroupkeyStatusTest() {
    // Arrange
    GroupkeyListenserStatus groupkeyListenserStatus = new GroupkeyListenserStatus();

    // Act
    groupkeyListenserStatus.setLisentersGroupkeyStatus(null);

    // Assert
    assertNull(groupkeyListenserStatus.getLisentersGroupkeyStatus());
  }
}

