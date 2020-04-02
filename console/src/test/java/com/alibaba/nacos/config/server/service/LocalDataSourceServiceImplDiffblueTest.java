package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.nio.file.Paths;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
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

  @Test
  public void testInit() {
    // Arrange
    LocalDataSourceServiceImpl localDataSourceServiceImpl = new LocalDataSourceServiceImpl();

    // Act
    localDataSourceServiceImpl.init();

    // Assert
    TransactionTemplate transactionTemplate = localDataSourceServiceImpl.getTransactionTemplate();
    JdbcTemplate jdbcTemplate = localDataSourceServiceImpl.getJdbcTemplate();
    boolean actualIsSkipResultsProcessingResult = jdbcTemplate.isSkipResultsProcessing();
    assertEquals(5000, transactionTemplate.getTimeout());
    assertFalse(actualIsSkipResultsProcessingResult);
    assertFalse(jdbcTemplate.isSkipUndeclaredResults());
    assertFalse(jdbcTemplate.isResultsMapCaseInsensitive());
    assertEquals(5000, jdbcTemplate.getQueryTimeout());
    assertTrue(jdbcTemplate.isIgnoreWarnings());
    assertEquals(50000, jdbcTemplate.getMaxRows());
    assertTrue(jdbcTemplate.isLazyInit());
    DataSource dataSource = jdbcTemplate.getDataSource();
    assertTrue(dataSource instanceof BasicDataSource);
    assertEquals(-1, jdbcTemplate.getFetchSize());
    long actualMinEvictableIdleTimeMillis = ((BasicDataSource) dataSource).getMinEvictableIdleTimeMillis();
    int actualNumTestsPerEvictionRun = ((BasicDataSource) dataSource).getNumTestsPerEvictionRun();
    String actualUsername = ((BasicDataSource) dataSource).getUsername();
    boolean actualDefaultReadOnly = ((BasicDataSource) dataSource).getDefaultReadOnly();
    int actualInitialSize = ((BasicDataSource) dataSource).getInitialSize();
    boolean actualDefaultAutoCommit = ((BasicDataSource) dataSource).getDefaultAutoCommit();
    boolean actualIsPoolPreparedStatementsResult = ((BasicDataSource) dataSource).isPoolPreparedStatements();
    ClassLoader actualDriverClassLoader = ((BasicDataSource) dataSource).getDriverClassLoader();
    int actualValidationQueryTimeout = ((BasicDataSource) dataSource).getValidationQueryTimeout();
    int actualMaxOpenPreparedStatements = ((BasicDataSource) dataSource).getMaxOpenPreparedStatements();
    String actualUrl = ((BasicDataSource) dataSource).getUrl();
    long actualTimeBetweenEvictionRunsMillis = ((BasicDataSource) dataSource).getTimeBetweenEvictionRunsMillis();
    String actualDefaultCatalog = ((BasicDataSource) dataSource).getDefaultCatalog();
    boolean actualIsAccessToUnderlyingConnectionAllowedResult = ((BasicDataSource) dataSource)
        .isAccessToUnderlyingConnectionAllowed();
    int actualNumIdle = ((BasicDataSource) dataSource).getNumIdle();
    assertEquals(-1, transactionTemplate.getIsolationLevel());
    assertEquals(0, transactionTemplate.getPropagationBehavior());
    assertFalse(transactionTemplate.isReadOnly());
    assertTrue(transactionTemplate
        .getTransactionManager() instanceof org.springframework.jdbc.datasource.DataSourceTransactionManager);
    assertEquals(0, ((BasicDataSource) dataSource).getMinIdle());
    assertFalse(((BasicDataSource) dataSource).getTestOnReturn());
    assertEquals("org.apache.derby.jdbc.EmbeddedDriver", ((BasicDataSource) dataSource).getDriverClassName());
    assertEquals(
        String.join("", "jdbc:derby:",
            Paths.get(System.getProperty("user.home"), "nacos", "data", "derby-data").toString(), ";create=true"),
        actualUrl);
    assertEquals(-1, actualMaxOpenPreparedStatements);
    assertEquals(-1, actualValidationQueryTimeout);
    assertNull(actualDriverClassLoader);
    assertTrue(actualIsPoolPreparedStatementsResult);
    assertTrue(actualDefaultAutoCommit);
    assertNull(actualDefaultCatalog);
    assertEquals(20, actualInitialSize);
    assertFalse(actualDefaultReadOnly);
    assertEquals("nacos", actualUsername);
    assertEquals(3, actualNumTestsPerEvictionRun);
    assertEquals(1800000L, actualMinEvictableIdleTimeMillis);
    assertEquals(600000L, actualTimeBetweenEvictionRunsMillis);
    assertEquals(0, actualNumIdle);
    assertFalse(actualIsAccessToUnderlyingConnectionAllowedResult);
  }
}

