package com.alibaba.nacos.naming.acl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class AuthInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    AuthInfo actualAuthInfo = new AuthInfo(",", ",");

    // Assert
    assertEquals(",", actualAuthInfo.getAppKey());
    assertEquals(",", actualAuthInfo.getOperator());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    AuthInfo actualAuthInfo = new AuthInfo();

    // Assert
    assertEquals("-111,-118,-109,-109,-59,-111,-118,-109,-109", actualAuthInfo.toString());
    assertNull(actualAuthInfo.getAppKey());
    assertNull(actualAuthInfo.getOperator());
  }

  @Test
  public void testFromString() {
    // Arrange
    AuthInfo actualFromStringResult = AuthInfo.fromString(",", ",");
    AuthInfo actualFromStringResult1 = AuthInfo.fromString(":", ",");

    // Act and Assert
    assertNull(actualFromStringResult);
    assertNull(actualFromStringResult1);
    assertNull(AuthInfo.fromString(",", "UTF-8"));
  }

  @Test
  public void testSetAppKey() {
    // Arrange
    AuthInfo authInfo = new AuthInfo();

    // Act
    authInfo.setAppKey(",");

    // Assert
    assertEquals(",", authInfo.getAppKey());
  }

  @Test
  public void testSetOperator() {
    // Arrange
    AuthInfo authInfo = new AuthInfo();

    // Act
    authInfo.setOperator(",");

    // Assert
    assertEquals(",", authInfo.getOperator());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("-111,-118,-109,-109,-59,-111,-118,-109,-109", (new AuthInfo()).toString());
  }
}

