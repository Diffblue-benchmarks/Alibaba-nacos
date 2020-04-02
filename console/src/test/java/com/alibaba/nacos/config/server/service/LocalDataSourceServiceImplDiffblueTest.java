package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.nio.file.Paths;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.support.TransactionTemplate;

public class LocalDataSourceServiceImplDiffblueTest {
  @Test
  public void testCheckMasterWritable() {
    // Arrange, Act and Assert
    assertTrue((new LocalDataSourceServiceImpl()).checkMasterWritable());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    LocalDataSourceServiceImpl actualLocalDataSourceServiceImpl = new LocalDataSourceServiceImpl();

    // Assert
    String actualCurrentDBUrl = actualLocalDataSourceServiceImpl.getCurrentDBUrl();
    JdbcTemplate actualJdbcTemplate = actualLocalDataSourceServiceImpl.getJdbcTemplate();
    String actualHealth = actualLocalDataSourceServiceImpl.getHealth();
    TransactionTemplate actualTransactionTemplate = actualLocalDataSourceServiceImpl.getTransactionTemplate();
    assertEquals(
        String.join("", "jdbc:derby:",
            Paths.get(System.getProperty("user.home"), "nacos", "data", "derby-data").toString(), ";create=true"),
        actualCurrentDBUrl);
    assertNull(actualTransactionTemplate);
    assertEquals("UP", actualHealth);
    assertNull(actualJdbcTemplate);
  }

  @Test
  public void testGetCurrentDBUrl() {
    // Arrange and Act
    String actualCurrentDBUrl = (new LocalDataSourceServiceImpl()).getCurrentDBUrl();

    // Assert
    assertEquals(
        String.join("", "jdbc:derby:",
            Paths.get(System.getProperty("user.home"), "nacos", "data", "derby-data").toString(), ";create=true"),
        actualCurrentDBUrl);
  }

  @Test
  public void testGetHealth() {
    // Arrange, Act and Assert
    assertEquals("UP", (new LocalDataSourceServiceImpl()).getHealth());
  }
}

