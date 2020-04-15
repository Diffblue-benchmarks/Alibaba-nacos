package com.alibaba.nacos.common.util;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.junit.Test;

public class ResourceUtilsDiffblueTest {
  @Test
  public void testGetResourceURL() throws IOException {
    // Arrange, Act and Assert
    assertTrue(ResourceUtils.getResourceURL("classpath:")
        .getContent() instanceof sun.net.www.content.text.PlainTextInputStream);
  }
}

