package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertNull;
import java.util.HashMap;
import org.junit.Test;

public class ConfigSubServiceDiffblueTest {
  @Test
  public void testJobCall() throws Exception {
    // Arrange
    ConfigSubService configSubService = new ConfigSubService();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "127.0.0.1");

    // Act and Assert
    assertNull((configSubService.new Job("127.0.0.1", "https://www.diffblue.com", stringStringMap)).call());
  }
}

