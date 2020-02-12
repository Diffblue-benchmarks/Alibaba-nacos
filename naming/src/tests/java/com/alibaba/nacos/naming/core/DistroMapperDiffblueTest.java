package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class DistroMapperDiffblueTest {
  @Test(timeout=10000)
  public void mapSrvTest() {
    // Arrange, Act and Assert
    assertEquals("10.128.0.37:0", (new DistroMapper()).mapSrv("name"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    List<String> healthyList = (new DistroMapper()).getHealthyList();
    assertTrue(healthyList instanceof java.util.ArrayList);
    assertEquals(0, healthyList.size());
  }

  @Test(timeout=10000)
  public void getHealthyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DistroMapper()).getHealthyList().size());
  }

  @Test(timeout=10000)
  public void distroHashTest() {
    // Arrange, Act and Assert
    assertEquals(3373707, (new DistroMapper()).distroHash("name"));
  }
}

