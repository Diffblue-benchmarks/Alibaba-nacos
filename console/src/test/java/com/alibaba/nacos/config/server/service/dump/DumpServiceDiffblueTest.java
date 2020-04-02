package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.alibaba.nacos.config.server.model.ConfigInfoChanged;
import java.util.ArrayList;
import org.junit.Test;

public class DumpServiceDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    DumpService actualDumpService = new DumpService();

    // Assert
    assertFalse(actualDumpService.isQuickStart);
    assertEquals(0, actualDumpService.total);
  }

  @Test
  public void testSplitList() {
    // Arrange
    ArrayList<ConfigInfoChanged> configInfoChangedList = new ArrayList<ConfigInfoChanged>();
    configInfoChangedList.add(new ConfigInfoChanged());

    // Act and Assert
    assertEquals(3, DumpService.splitList(configInfoChangedList, 3).size());
  }
}

