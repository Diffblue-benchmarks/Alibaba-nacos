package com.alibaba.nacos.client.config.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConcurrentDiskUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void getFileContentTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(FileNotFoundException.class);
    ConcurrentDiskUtil.getFileContent("foo", "UTF-8");
  }
}

