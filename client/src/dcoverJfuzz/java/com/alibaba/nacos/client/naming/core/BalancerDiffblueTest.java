package com.alibaba.nacos.client.naming.core;

import static org.junit.Assert.assertNull;
import com.alibaba.nacos.api.naming.pojo.ServiceInfo;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BalancerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void selectAllTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    Balancer.RandomByWeight.selectAll(ServiceInfo.fromKey("foo"));
  }

  @Test(timeout=10000)
  public void selectHostTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    Balancer.RandomByWeight.selectHost(ServiceInfo.fromKey("foo"));
  }

  @Test(timeout=10000)
  public void getHostByRandomWeightTest() {
    // Arrange, Act and Assert
    assertNull(Balancer.getHostByRandomWeight(null));
  }
}

