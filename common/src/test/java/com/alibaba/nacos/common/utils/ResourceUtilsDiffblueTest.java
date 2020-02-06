package com.alibaba.nacos.common.utils;

import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResourceUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getResourceAsPropertiesTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    ResourceUtils.getResourceAsProperties("classpath:");
  }
  @Test
  public void getResourceAsStreamTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    ResourceUtils.getResourceAsStream("classpath:");
  }
  @Test
  public void getResourceAsReaderTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    ResourceUtils.getResourceAsReader("classpath:", "classpath:");
  }
}

