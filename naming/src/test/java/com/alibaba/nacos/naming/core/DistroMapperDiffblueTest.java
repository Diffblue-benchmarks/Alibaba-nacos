package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class DistroMapperDiffblueTest {
  @Test
  public void mapSrvTest() {
    // Arrange, Act and Assert
    assertEquals("10.42.2.68:0", (new DistroMapper()).mapSrv("aaaaa"));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    List<String> healthyList = (new DistroMapper()).getHealthyList();
    assertTrue(healthyList instanceof java.util.ArrayList);
    assertEquals(0, healthyList.size());
  }

  @Test
  public void getHealthyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DistroMapper()).getHealthyList().size());
  }

  @Test
  public void distroHashTest() {
    // Arrange, Act and Assert
    assertEquals(92567585, (new DistroMapper()).distroHash("aaaaa"));
  }
}

