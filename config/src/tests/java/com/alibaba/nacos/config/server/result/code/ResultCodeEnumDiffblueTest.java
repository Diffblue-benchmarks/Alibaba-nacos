package com.alibaba.nacos.config.server.result.code;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ResultCodeEnumDiffblueTest {
  @Test(timeout=10000)
  public void getCodeMsgTest() {
    // Arrange, Act and Assert
    assertEquals("处理成功", ResultCodeEnum.SUCCESS.getCodeMsg());
  }

  @Test(timeout=10000)
  public void getCodeTest() {
    // Arrange, Act and Assert
    assertEquals(200, ResultCodeEnum.SUCCESS.getCode());
  }
}

