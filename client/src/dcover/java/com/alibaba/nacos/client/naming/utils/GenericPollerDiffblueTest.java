package com.alibaba.nacos.client.naming.utils;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GenericPollerDiffblueTest {
  @Test(timeout=10000)
  public void refreshTest() {
    // Arrange, Act and Assert
    assertTrue((new GenericPoller<Object>(null)).refresh(null) instanceof GenericPoller);
  }
}

