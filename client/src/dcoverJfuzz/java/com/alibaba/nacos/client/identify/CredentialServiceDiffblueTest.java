package com.alibaba.nacos.client.identify;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CredentialServiceDiffblueTest {
  @Test(timeout=10000)
  public void freeInstanceTest2() {
    // Arrange, Act and Assert
    assertNull(CredentialService.freeInstance());
  }

  @Test(timeout=10000)
  public void freeInstanceTest() {
    // Arrange, Act and Assert
    assertNull(CredentialService.freeInstance("name"));
  }
}

