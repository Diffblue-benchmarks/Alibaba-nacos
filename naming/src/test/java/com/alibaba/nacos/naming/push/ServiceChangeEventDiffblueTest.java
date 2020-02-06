package com.alibaba.nacos.naming.push;

import static org.junit.Assert.assertSame;
import com.alibaba.nacos.naming.core.Service;
import org.junit.Test;

public class ServiceChangeEventDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    Service service = new Service();

    // Act and Assert
    assertSame(service, (new ServiceChangeEvent("foo", service)).getService());
  }
}

