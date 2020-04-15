package com.alibaba.nacos.config.server.service.merge;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.config.server.model.ConfigInfoChanged;
import java.util.ArrayList;
import org.junit.Test;

public class MergeDatumServiceDiffblueTest {
  @Test
  public void testSplitList() {
    // Arrange
    ArrayList<ConfigInfoChanged> configInfoChangedList = new ArrayList<ConfigInfoChanged>();
    configInfoChangedList.add(new ConfigInfoChanged());

    // Act and Assert
    assertEquals(3, MergeDatumService.splitList(configInfoChangedList, 3).size());
  }
}

