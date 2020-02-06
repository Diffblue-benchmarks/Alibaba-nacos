package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.api.naming.pojo.Service;
import org.junit.Test;

public class ServiceDetailViewDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    ServiceDetailView actualServiceDetailView = new ServiceDetailView();

    // Assert
    String actualToStringResult = actualServiceDetailView.toString();
    Service actualService = actualServiceDetailView.getService();
    assertEquals("{}", actualToStringResult);
    assertNull(actualServiceDetailView.getClusters());
    assertNull(actualService);
  }

  @Test
  public void toStringTest() {
    // Arrange
    ServiceDetailView serviceDetailView = new ServiceDetailView();

    // Act and Assert
    assertEquals("{}", serviceDetailView.toString());
    assertEquals("{}", serviceDetailView.toString());
  }
}

