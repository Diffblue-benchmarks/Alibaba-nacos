package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class DistroMapperDiffblueTest {
  @Autowired
  private DistroMapper distroMapper;
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    List<String> healthyList = (new DistroMapper()).getHealthyList();
    assertTrue(healthyList instanceof java.util.ArrayList);
    assertEquals(0, healthyList.size());
  }
  @Test
  public void testDistroHash() {
    // Arrange, Act and Assert
    assertEquals(1928572192, this.distroMapper.distroHash("serviceName"));
  }
  @Test
  public void testMapSrv() {
    // Arrange and Act
    String actualMapSrvResult = this.distroMapper.mapSrv("serviceName");

    // Assert
    assertEquals(String.join("", System.getProperty("nacos.local.ip"), ":0"), actualMapSrvResult);
  }
  @Test
  public void testResponsible() {
    // Arrange, Act and Assert
    assertFalse(this.distroMapper.responsible("serviceName"));
  }
}

