package com.alibaba.nacos.core.env;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.io.IOException;
import org.junit.Test;

public class ReloadableConfigsDiffblueTest {
  @Test
  public void reloadTest() throws IOException {
    // Arrange
    ReloadableConfigs reloadableConfigs = new ReloadableConfigs();

    // Act
    reloadableConfigs.reload();

    // Assert
    assertEquals(1, reloadableConfigs.getProperties().size());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ReloadableConfigs()).getProperties());
  }

  @Test
  public void getPropertiesTest() {
    // Arrange, Act and Assert
    assertNull((new ReloadableConfigs()).getProperties());
  }
}

