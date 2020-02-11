package com.alibaba.nacos.naming.web;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class FilterBaseDiffblueTest {
  @Test(timeout=10000)
  public void getMethodTest() {
    // Arrange, Act and Assert
    assertNull((new FilterBase()).getMethod("foo", "foo"));
  }
}

