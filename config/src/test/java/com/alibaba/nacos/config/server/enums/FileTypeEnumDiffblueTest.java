package com.alibaba.nacos.config.server.enums;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FileTypeEnumDiffblueTest {
  @Test
  public void getFileTypeTest() {
    // Arrange, Act and Assert
    assertEquals("yaml", FileTypeEnum.YML.getFileType());
  }
}

