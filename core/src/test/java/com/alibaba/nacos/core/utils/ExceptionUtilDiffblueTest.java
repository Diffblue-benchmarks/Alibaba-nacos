package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExceptionUtilDiffblueTest {
  @Test
  public void getAllExceptionMsgTest() {
    // Arrange, Act and Assert
    assertEquals("", ExceptionUtil.getAllExceptionMsg(null));
  }
}

