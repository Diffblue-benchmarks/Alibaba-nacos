package com.alibaba.nacos.common.util;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.nio.file.Paths;
import org.junit.Test;

public class ResourceUtilsDiffblueTest {
  @Test
  public void testGetResourceAsFile() throws IOException {
    // Arrange, Act and Assert
    assertEquals(380915150848L,
        ResourceUtils.getResourceAsFile(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL())
            .getCanonicalFile().getTotalSpace());
  }
}

