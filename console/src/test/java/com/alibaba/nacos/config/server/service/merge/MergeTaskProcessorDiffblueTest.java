package com.alibaba.nacos.config.server.service.merge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.config.server.model.ConfigInfo;
import com.alibaba.nacos.config.server.model.ConfigInfoAggr;
import com.alibaba.nacos.config.server.service.PersistService;
import java.util.ArrayList;
import org.junit.Test;

public class MergeTaskProcessorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    PersistService persistService = new PersistService();

    // Act and Assert
    assertEquals(10000,
        (new MergeTaskProcessor(persistService, new MergeDatumService(new PersistService()))).PAGE_SIZE);
  }

  @Test
  public void testMerge() {
    // Arrange
    ArrayList<ConfigInfoAggr> configInfoAggrList = new ArrayList<ConfigInfoAggr>();
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
    configInfoAggr.setAppName("appName");
    configInfoAggrList.add(configInfoAggr);

    // Act
    ConfigInfo actualMergeResult = MergeTaskProcessor.merge("remove", "remove", "remove", configInfoAggrList);

    // Assert
    assertEquals("remove", actualMergeResult.getDataId());
    assertEquals("appName", actualMergeResult.getAppName());
    assertEquals("remove", actualMergeResult.getTenant());
    assertEquals("remove", actualMergeResult.getGroup());
    assertEquals("37a6259cc0c1dae299a7866489dff0bd", actualMergeResult.getMd5());
    assertEquals("null", actualMergeResult.getContent());
  }

  @Test
  public void testMerge2() {
    // Arrange
    ArrayList<ConfigInfoAggr> configInfoAggrList = new ArrayList<ConfigInfoAggr>();
    configInfoAggrList.add(new ConfigInfoAggr());

    // Act
    ConfigInfo actualMergeResult = MergeTaskProcessor.merge("remove", "remove", "remove", configInfoAggrList);

    // Assert
    assertEquals("remove", actualMergeResult.getDataId());
    assertNull(actualMergeResult.getAppName());
    assertEquals("remove", actualMergeResult.getTenant());
    assertEquals("remove", actualMergeResult.getGroup());
    assertEquals("37a6259cc0c1dae299a7866489dff0bd", actualMergeResult.getMd5());
    assertEquals("null", actualMergeResult.getContent());
  }
}

