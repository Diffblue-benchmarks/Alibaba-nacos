package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class DistroMapperDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    List<String> healthyList = (new DistroMapper()).getHealthyList();
    assertTrue(healthyList instanceof java.util.ArrayList);
    assertEquals(0, healthyList.size());
  }
}

