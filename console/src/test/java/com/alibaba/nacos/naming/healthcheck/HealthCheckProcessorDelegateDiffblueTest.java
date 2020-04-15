package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertNull;
import com.alibaba.nacos.naming.healthcheck.extend.HealthCheckExtendProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class HealthCheckProcessorDelegateDiffblueTest {
  @Autowired
  private HealthCheckProcessorDelegate healthCheckProcessorDelegate;
  @Autowired
  private HealthCheckExtendProvider healthCheckExtendProvider;
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new HealthCheckProcessorDelegate(this.healthCheckExtendProvider)).getType());
  }
  @Test
  public void testGetType() {
    // Arrange, Act and Assert
    assertNull(this.healthCheckProcessorDelegate.getType());
  }
}

