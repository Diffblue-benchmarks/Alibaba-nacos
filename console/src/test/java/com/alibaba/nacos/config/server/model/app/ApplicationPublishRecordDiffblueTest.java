package com.alibaba.nacos.config.server.model.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ApplicationPublishRecordDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ApplicationPublishRecord actualApplicationPublishRecord = new ApplicationPublishRecord("appName", "123", "123");

    // Assert
    GroupKey configInfo = actualApplicationPublishRecord.getConfigInfo();
    String actualGroup = configInfo.getGroup();
    assertEquals("appName", actualApplicationPublishRecord.getAppName());
    assertEquals("123", actualGroup);
    assertEquals("123", configInfo.getDataId());
  }

  @Test
  public void testSetAppName() {
    // Arrange
    ApplicationPublishRecord applicationPublishRecord = new ApplicationPublishRecord("appName", "123", "123");

    // Act
    applicationPublishRecord.setAppName("appName");

    // Assert
    assertEquals("appName", applicationPublishRecord.getAppName());
  }

  @Test
  public void testSetConfigInfo() {
    // Arrange
    ApplicationPublishRecord applicationPublishRecord = new ApplicationPublishRecord("appName", "123", "123");
    GroupKey groupKey = new GroupKey("appName");

    // Act
    applicationPublishRecord.setConfigInfo(groupKey);

    // Assert
    assertSame(groupKey, applicationPublishRecord.getConfigInfo());
  }
}

