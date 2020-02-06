package com.alibaba.nacos.config.server.controller.parameters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SameNamespaceCloneConfigBeanDiffblueTest {
  @Test
  public void setGroupTest() {
    // Arrange
    SameNamespaceCloneConfigBean sameNamespaceCloneConfigBean = new SameNamespaceCloneConfigBean();

    // Act
    sameNamespaceCloneConfigBean.setGroup("aaaaa");

    // Assert
    assertEquals("aaaaa", sameNamespaceCloneConfigBean.getGroup());
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    SameNamespaceCloneConfigBean sameNamespaceCloneConfigBean = new SameNamespaceCloneConfigBean();

    // Act
    sameNamespaceCloneConfigBean.setDataId("aaaaa");

    // Assert
    assertEquals("aaaaa", sameNamespaceCloneConfigBean.getDataId());
  }

  @Test
  public void setCfgIdTest() {
    // Arrange
    SameNamespaceCloneConfigBean sameNamespaceCloneConfigBean = new SameNamespaceCloneConfigBean();

    // Act
    sameNamespaceCloneConfigBean.setCfgId(null);

    // Assert
    assertNull(sameNamespaceCloneConfigBean.getCfgId());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new SameNamespaceCloneConfigBean()).getGroup());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    SameNamespaceCloneConfigBean actualSameNamespaceCloneConfigBean = new SameNamespaceCloneConfigBean();

    // Assert
    String actualDataId = actualSameNamespaceCloneConfigBean.getDataId();
    Long actualCfgId = actualSameNamespaceCloneConfigBean.getCfgId();
    assertNull(actualDataId);
    assertNull(actualSameNamespaceCloneConfigBean.getGroup());
    assertNull(actualCfgId);
  }

  @Test
  public void getCfgIdTest() {
    // Arrange, Act and Assert
    assertNull((new SameNamespaceCloneConfigBean()).getCfgId());
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new SameNamespaceCloneConfigBean()).getDataId());
  }
}

