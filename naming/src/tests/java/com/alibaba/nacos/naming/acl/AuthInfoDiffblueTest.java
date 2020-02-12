package com.alibaba.nacos.naming.acl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class AuthInfoDiffblueTest {
  @Test(timeout=10000)
  public void getAppKeyTest() {
    // Arrange, Act and Assert
    assertNull((new AuthInfo()).getAppKey());
  }

  @Test(timeout=10000)
  public void setAppKeyTest() {
    // Arrange
    AuthInfo authInfo = new AuthInfo();

    // Act
    authInfo.setAppKey("foo");

    // Assert
    assertEquals("foo", authInfo.getAppKey());
  }

  @Test(timeout=10000)
  public void fromStringTest() {
    // Arrange
    AuthInfo actualFromStringResult = AuthInfo.fromString("foo", "UTF-8");

    // Act and Assert
    assertNull(actualFromStringResult);
    assertNull(AuthInfo.fromString(",", "UTF-8"));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    AuthInfo actualAuthInfo = new AuthInfo();

    // Assert
    String actualToStringResult = actualAuthInfo.toString();
    String actualOperator = actualAuthInfo.getOperator();
    assertEquals("-111,-118,-109,-109,-59,-111,-118,-109,-109", actualToStringResult);
    assertNull(actualAuthInfo.getAppKey());
    assertNull(actualOperator);
  }

  @Test(timeout=10000)
  public void getOperatorTest() {
    // Arrange, Act and Assert
    assertNull((new AuthInfo()).getOperator());
  }

  @Test(timeout=10000)
  public void setOperatorTest() {
    // Arrange
    AuthInfo authInfo = new AuthInfo();

    // Act
    authInfo.setOperator("foo");

    // Assert
    assertEquals("foo", authInfo.getOperator());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("-111,-118,-109,-109,-59,-111,-118,-109,-109", (new AuthInfo()).toString());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    AuthInfo actualAuthInfo = new AuthInfo("foo", "foo");

    // Assert
    String actualOperator = actualAuthInfo.getOperator();
    assertEquals("foo", actualAuthInfo.getAppKey());
    assertEquals("foo", actualOperator);
  }
}

