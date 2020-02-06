package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class ConfigChangeHandlerDiffblueTest {
  @Test
  public void parseChangeDataTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals(0, ConfigChangeHandler.getInstance().parseChangeData("foo", "foo", "foo").size());
  }
}

