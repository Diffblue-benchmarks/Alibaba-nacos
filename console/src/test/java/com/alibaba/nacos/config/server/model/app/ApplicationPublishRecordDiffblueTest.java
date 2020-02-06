package com.alibaba.nacos.config.server.model.app;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ApplicationPublishRecordDiffblueTest {
  @Test
  public void setConfigInfoTest() {
    // Arrange
    ApplicationPublishRecord applicationPublishRecord = new ApplicationPublishRecord("name", "123", "123");
    GroupKey groupKey = new GroupKey("name");

    // Act
    applicationPublishRecord.setConfigInfo(groupKey);

    // Assert
    assertSame(groupKey, applicationPublishRecord.getConfigInfo());
  }
}

