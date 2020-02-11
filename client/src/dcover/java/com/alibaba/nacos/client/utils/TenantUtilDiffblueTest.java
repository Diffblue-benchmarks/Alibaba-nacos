package com.alibaba.nacos.client.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TenantUtilDiffblueTest {
  @Test(timeout=10000)
  public void getUserTenantForAcmTest() {
    // Arrange, Act and Assert
    assertEquals("", TenantUtil.getUserTenantForAcm());
  }

  @Test(timeout=10000)
  public void getUserTenantForAnsTest() {
    // Arrange, Act and Assert
    assertNull(TenantUtil.getUserTenantForAns());
  }
}

