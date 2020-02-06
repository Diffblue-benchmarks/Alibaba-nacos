package com.alibaba.nacos.config.server.service.merge;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.config.server.service.PersistService;
import com.alibaba.nacos.config.server.service.dump.DumpTask;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MergeTaskProcessorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void processTest() {
    // Arrange
    PersistService persistService = new PersistService();
    MergeTaskProcessor mergeTaskProcessor = new MergeTaskProcessor(persistService,
        new MergeDatumService(new PersistService()));

    // Act and Assert
    thrown.expect(ClassCastException.class);
    mergeTaskProcessor.process("remove", new DumpTask("remove", 1L, "remove"));
  }

  @Test
  public void constructorTest() {
    // Arrange
    PersistService persistService = new PersistService();

    // Act and Assert
    assertEquals(10000,
        (new MergeTaskProcessor(persistService, new MergeDatumService(new PersistService()))).PAGE_SIZE);
  }
}

