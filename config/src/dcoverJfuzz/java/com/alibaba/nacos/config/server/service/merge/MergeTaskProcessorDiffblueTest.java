package com.alibaba.nacos.config.server.service.merge;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.config.server.service.PersistService;
import org.junit.Test;

public class MergeTaskProcessorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    PersistService persistService = new PersistService();

    // Act and Assert
    assertEquals(10000,
        (new MergeTaskProcessor(persistService, new MergeDatumService(new PersistService()))).PAGE_SIZE);
  }
}

