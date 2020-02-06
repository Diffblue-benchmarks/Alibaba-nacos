package com.alibaba.nacos.config.server.model.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ApplicationPublishRecordDiffblueTest {
  @Test
  public void setAppNameTest() {
    // Arrange
    ApplicationPublishRecord applicationPublishRecord = new ApplicationPublishRecord("aaaaa", "aaaaa", "aaaaa");

    // Act
    applicationPublishRecord.setAppName("aaaaa");

    // Assert
    assertEquals("aaaaa", applicationPublishRecord.getAppName());
  }

  @Test
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new ApplicationPublishRecord("aaaaa", "aaaaa", "aaaaa")).getAppName());
  }

  @Test
  public void setConfigInfoTest() {
    // Arrange
    ApplicationPublishRecord applicationPublishRecord = new ApplicationPublishRecord("aaaaa", "aaaaa", "aaaaa");
    GroupKey groupKey = new GroupKey("aaaaa");

    // Act
    applicationPublishRecord.setConfigInfo(groupKey);

    // Assert
    assertSame(groupKey, applicationPublishRecord.getConfigInfo());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ApplicationPublishRecord actualApplicationPublishRecord = new ApplicationPublishRecord("aaaaa", "aaaaa", "aaaaa");

    // Assert
    GroupKey configInfo = actualApplicationPublishRecord.getConfigInfo();
    String actualAppName = actualApplicationPublishRecord.getAppName();
    String actualDataId = configInfo.getDataId();
    assertEquals("aaaaa", actualAppName);
    assertEquals("aaaaa", configInfo.getGroup());
    assertEquals("aaaaa", actualDataId);
  }
}

