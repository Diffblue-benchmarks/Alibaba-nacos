package com.alibaba.nacos.config.server.model.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ApplicationPublishRecordDiffblueTest {
  @Test(timeout=10000)
  public void setAppNameTest() {
    // Arrange
    ApplicationPublishRecord applicationPublishRecord = new ApplicationPublishRecord("name", "123", "123");

    // Act
    applicationPublishRecord.setAppName("name");

    // Assert
    assertEquals("name", applicationPublishRecord.getAppName());
  }

  @Test(timeout=10000)
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new ApplicationPublishRecord("name", "123", "123")).getAppName());
  }

  @Test(timeout=10000)
  public void setConfigInfoTest() {
    // Arrange
    ApplicationPublishRecord applicationPublishRecord = new ApplicationPublishRecord("name", "123", "123");
    GroupKey groupKey = new GroupKey("name");

    // Act
    applicationPublishRecord.setConfigInfo(groupKey);

    // Assert
    assertSame(groupKey, applicationPublishRecord.getConfigInfo());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ApplicationPublishRecord actualApplicationPublishRecord = new ApplicationPublishRecord("name", "123", "123");

    // Assert
    GroupKey configInfo = actualApplicationPublishRecord.getConfigInfo();
    String actualAppName = actualApplicationPublishRecord.getAppName();
    String actualDataId = configInfo.getDataId();
    assertEquals("name", actualAppName);
    assertEquals("123", configInfo.getGroup());
    assertEquals("123", actualDataId);
  }
}

