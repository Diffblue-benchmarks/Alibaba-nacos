package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertNull;
import com.alibaba.nacos.naming.healthcheck.extend.HealthCheckExtendProvider;
import org.junit.Test;

public class HealthCheckProcessorDelegateDiffblueTest {
  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new HealthCheckProcessorDelegate(new HealthCheckExtendProvider())).getType());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new HealthCheckProcessorDelegate(new HealthCheckExtendProvider())).getType());
  }
}

