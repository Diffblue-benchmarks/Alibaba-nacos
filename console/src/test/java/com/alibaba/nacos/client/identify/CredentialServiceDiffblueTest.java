package com.alibaba.nacos.client.identify;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CredentialServiceDiffblueTest {
  @Test
  public void freeInstanceTest2() {
    // Arrange, Act and Assert
    assertNull(CredentialService.freeInstance());
  }

  @Test
  public void freeInstanceTest() {
    // Arrange, Act and Assert
    assertNull(CredentialService.freeInstance("name"));
  }
}

