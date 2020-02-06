package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class GroupkeyListenserStatusDiffblueTest {
  @Test
  public void getLisentersGroupkeyStatusTest() {
    // Arrange, Act and Assert
    assertNull((new GroupkeyListenserStatus()).getLisentersGroupkeyStatus());
  }

  @Test
  public void getCollectStatusTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new GroupkeyListenserStatus()).getCollectStatus());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    GroupkeyListenserStatus actualGroupkeyListenserStatus = new GroupkeyListenserStatus();

    // Assert
    int actualCollectStatus = actualGroupkeyListenserStatus.getCollectStatus();
    assertEquals(0, actualCollectStatus);
    assertNull(actualGroupkeyListenserStatus.getLisentersGroupkeyStatus());
  }

  @Test
  public void setCollectStatusTest() {
    // Arrange
    GroupkeyListenserStatus groupkeyListenserStatus = new GroupkeyListenserStatus();

    // Act
    groupkeyListenserStatus.setCollectStatus(1);

    // Assert
    assertEquals(1, groupkeyListenserStatus.getCollectStatus());
  }

  @Test
  public void setLisentersGroupkeyStatusTest() {
    // Arrange
    GroupkeyListenserStatus groupkeyListenserStatus = new GroupkeyListenserStatus();

    // Act
    groupkeyListenserStatus.setLisentersGroupkeyStatus(null);

    // Assert
    assertNull(groupkeyListenserStatus.getLisentersGroupkeyStatus());
  }
}

