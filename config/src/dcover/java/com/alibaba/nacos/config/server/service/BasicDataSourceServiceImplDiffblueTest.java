package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.jdbc.core.JdbcTemplate;

public class BasicDataSourceServiceImplDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getTransactionTemplateTest() {
    // Arrange, Act and Assert
    assertNull((new BasicDataSourceServiceImpl()).getTransactionTemplate());
  }

  @Test(timeout=10000)
  public void initTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new BasicDataSourceServiceImpl()).init();
  }

  @Test(timeout=10000)
  public void reloadTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    (new BasicDataSourceServiceImpl()).reload();
  }

  @Test(timeout=10000)
  public void defaultIfNullTest() {
    // Arrange, Act and Assert
    assertEquals("value", BasicDataSourceServiceImpl.defaultIfNull("value", "foo"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    BasicDataSourceServiceImpl actualBasicDataSourceServiceImpl = new BasicDataSourceServiceImpl();

    // Assert
    JdbcTemplate actualJdbcTemplate = actualBasicDataSourceServiceImpl.getJdbcTemplate();
    assertNull(actualJdbcTemplate);
    assertNull(actualBasicDataSourceServiceImpl.getTransactionTemplate());
  }

  @Test(timeout=10000)
  public void getJdbcTemplateTest() {
    // Arrange, Act and Assert
    assertNull((new BasicDataSourceServiceImpl()).getJdbcTemplate());
  }
}

