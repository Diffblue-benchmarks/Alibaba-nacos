package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class LocalDataSourceServiceImplDiffblueTest {
  @Test
  public void getTransactionTemplateTest() {
    // Arrange, Act and Assert
    assertNull((new LocalDataSourceServiceImpl()).getTransactionTemplate());
  }

  @Test
  public void getHealthTest() {
    // Arrange, Act and Assert
    assertEquals("UP", (new LocalDataSourceServiceImpl()).getHealth());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    LocalDataSourceServiceImpl actualLocalDataSourceServiceImpl = new LocalDataSourceServiceImpl();

    // Assert
    String actualCurrentDBUrl = actualLocalDataSourceServiceImpl.getCurrentDBUrl();
    JdbcTemplate actualJdbcTemplate = actualLocalDataSourceServiceImpl.getJdbcTemplate();
    String actualHealth = actualLocalDataSourceServiceImpl.getHealth();
    assertEquals("jdbc:derby:/Users/peterschrammel/nacos/data/derby" + "-data;create=true", actualCurrentDBUrl);
    assertNull(actualLocalDataSourceServiceImpl.getTransactionTemplate());
    assertEquals("UP", actualHealth);
    assertNull(actualJdbcTemplate);
  }

  @Test
  public void getJdbcTemplateTest() {
    // Arrange, Act and Assert
    assertNull((new LocalDataSourceServiceImpl()).getJdbcTemplate());
  }

  @Test
  public void checkMasterWritableTest() {
    // Arrange, Act and Assert
    assertTrue((new LocalDataSourceServiceImpl()).checkMasterWritable());
  }

  @Test
  public void getCurrentDBUrlTest() {
    // Arrange, Act and Assert
    assertEquals("jdbc:derby:/Users/peterschrammel/nacos/data/derby" + "-data;create=true",
        (new LocalDataSourceServiceImpl()).getCurrentDBUrl());
  }
}

