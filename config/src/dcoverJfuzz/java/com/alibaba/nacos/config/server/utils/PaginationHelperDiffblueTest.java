package com.alibaba.nacos.config.server.utils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.jdbc.core.JdbcTemplate;

public class PaginationHelperDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void updateLimitTest() {
    // Arrange
    PaginationHelper<Object> paginationHelper = new PaginationHelper<Object>();

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    paginationHelper.updateLimit(new JdbcTemplate(), "foo", new Object[]{"foo", "foo", "foo"});
  }
}

