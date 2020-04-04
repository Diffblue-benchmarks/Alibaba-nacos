package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class BasicDataSourceServiceImplDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    BasicDataSourceServiceImpl actualBasicDataSourceServiceImpl = new BasicDataSourceServiceImpl();

    // Assert
    assertNull(actualBasicDataSourceServiceImpl.getJdbcTemplate());
    assertNull(actualBasicDataSourceServiceImpl.getTransactionTemplate());
  }

  @Test
  public void testDefaultIfNull() {
    // Arrange, Act and Assert
    assertEquals("QUERYTIMEOUT", BasicDataSourceServiceImpl.defaultIfNull("QUERYTIMEOUT", "QUERYTIMEOUT"));
  }
}

