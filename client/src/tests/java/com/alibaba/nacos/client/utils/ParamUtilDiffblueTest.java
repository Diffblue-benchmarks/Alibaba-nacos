package com.alibaba.nacos.client.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ParamUtilDiffblueTest {
  @Test(timeout=10000)
  public void getDefaultNodesPathTest() {
    // Arrange, Act and Assert
    assertEquals("serverlist", ParamUtil.getDefaultNodesPath());
  }

  @Test(timeout=10000)
  public void getConnectTimeoutTest() {
    // Arrange, Act and Assert
    assertEquals(1000, ParamUtil.getConnectTimeout());
  }

  @Test(timeout=10000)
  public void getAppKeyTest() {
    // Arrange, Act and Assert
    assertEquals("", ParamUtil.getAppKey());
  }

  @Test(timeout=10000)
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertEquals("unknown", ParamUtil.getAppName());
  }

  @Test(timeout=10000)
  public void getClientVersionTest() {
    // Arrange, Act and Assert
    assertEquals("${project.version}", ParamUtil.getClientVersion());
  }

  @Test(timeout=10000)
  public void getDefaultServerPortTest() {
    // Arrange, Act and Assert
    assertEquals("8848", ParamUtil.getDefaultServerPort());
  }

  @Test(timeout=10000)
  public void getDefaultContextPathTest() {
    // Arrange, Act and Assert
    assertEquals("nacos", ParamUtil.getDefaultContextPath());
  }

  @Test(timeout=10000)
  public void parsingEndpointRuleTest() {
    // Arrange, Act and Assert
    assertEquals("foo", ParamUtil.parsingEndpointRule("foo"));
  }

  @Test(timeout=10000)
  public void getPerTaskConfigSizeTest() {
    // Arrange, Act and Assert
    assertEquals(3000.0, ParamUtil.getPerTaskConfigSize(), 0.0);
  }
}

