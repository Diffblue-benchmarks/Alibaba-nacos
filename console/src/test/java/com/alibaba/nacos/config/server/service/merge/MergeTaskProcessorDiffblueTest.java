package com.alibaba.nacos.config.server.service.merge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.config.server.model.ConfigInfo;
import com.alibaba.nacos.config.server.model.ConfigInfoAggr;
import java.util.ArrayList;
import org.junit.Test;

public class MergeTaskProcessorDiffblueTest {
  @Test
  public void testMerge() {
    // Arrange
    ConfigInfoAggr param0 = new ConfigInfoAggr("123", "group", "123", "appName", "content");
    ArrayList<ConfigInfoAggr> configInfoAggrList = new ArrayList<ConfigInfoAggr>();
    configInfoAggrList.add(param0);

    // Act
    ConfigInfo actualMergeResult = MergeTaskProcessor.merge("123", "remove", "remove", configInfoAggrList);

    // Assert
    assertEquals("123", actualMergeResult.getDataId());
    assertEquals("appName", actualMergeResult.getAppName());
    assertEquals("remove", actualMergeResult.getTenant());
    assertEquals("remove", actualMergeResult.getGroup());
    assertEquals("9a0364b9e99bb480dd25e1f0284c8555", actualMergeResult.getMd5());
    assertEquals("content", actualMergeResult.getContent());
  }

  @Test
  public void testMerge2() {
    // Arrange
    ArrayList<ConfigInfoAggr> configInfoAggrList = new ArrayList<ConfigInfoAggr>();
    configInfoAggrList.add(new ConfigInfoAggr());

    // Act
    ConfigInfo actualMergeResult = MergeTaskProcessor.merge("123", "remove", "remove", configInfoAggrList);

    // Assert
    assertEquals("123", actualMergeResult.getDataId());
    assertNull(actualMergeResult.getAppName());
    assertEquals("remove", actualMergeResult.getTenant());
    assertEquals("remove", actualMergeResult.getGroup());
    assertEquals("37a6259cc0c1dae299a7866489dff0bd", actualMergeResult.getMd5());
    assertEquals("null", actualMergeResult.getContent());
  }
}

