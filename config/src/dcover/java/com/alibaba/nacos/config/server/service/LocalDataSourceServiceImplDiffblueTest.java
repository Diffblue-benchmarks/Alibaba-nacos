package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class LocalDataSourceServiceImplDiffblueTest {
  @Test(timeout=10000)
  public void getTransactionTemplateTest() {
    // Arrange, Act and Assert
    assertNull((new LocalDataSourceServiceImpl()).getTransactionTemplate());
  }

  @Test(timeout=10000)
  public void getHealthTest() {
    // Arrange, Act and Assert
    assertEquals("UP", (new LocalDataSourceServiceImpl()).getHealth());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    LocalDataSourceServiceImpl actualLocalDataSourceServiceImpl = new LocalDataSourceServiceImpl();

    // Assert
    String actualCurrentDBUrl = actualLocalDataSourceServiceImpl.getCurrentDBUrl();
    JdbcTemplate actualJdbcTemplate = actualLocalDataSourceServiceImpl.getJdbcTemplate();
    String actualHealth = actualLocalDataSourceServiceImpl.getHealth();
    assertEquals("jdbc:derby:/home/thomas_perkins/nacos/data/derby" + "-data;create=true", actualCurrentDBUrl);
    assertNull(actualLocalDataSourceServiceImpl.getTransactionTemplate());
    assertEquals("UP", actualHealth);
    assertNull(actualJdbcTemplate);
  }

  @Test(timeout=10000)
  public void getJdbcTemplateTest() {
    // Arrange, Act and Assert
    assertNull((new LocalDataSourceServiceImpl()).getJdbcTemplate());
  }

  @Test(timeout=10000)
  public void checkMasterWritableTest() {
    // Arrange, Act and Assert
    assertTrue((new LocalDataSourceServiceImpl()).checkMasterWritable());
  }

  @Test(timeout=10000)
  public void getCurrentDBUrlTest() {
    // Arrange, Act and Assert
    assertEquals("jdbc:derby:/home/thomas_perkins/nacos/data/derby" + "-data;create=true",
        (new LocalDataSourceServiceImpl()).getCurrentDBUrl());
  }
}

