package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RsInfoDiffblueTest {
  @Test
  public void setServiceNameTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setServiceName("aaaaa");

    // Assert
    assertEquals("aaaaa", rsInfo.getServiceName());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new RsInfo()).isEphemeral());
  }

  @Test
  public void getRtTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new RsInfo()).getRt(), 0.0);
  }

  @Test
  public void toStringTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act and Assert
    assertEquals("{\"cpu\":0.0,\"ephemeral\":true,\"load\":0.0,\"mem\":0.0,"
        + "\"port\":0,\"qps\":0.0,\"rt\":0.0,\"weight\":0.0}", rsInfo.toString());
    assertEquals("{\"cpu\":0.0,\"ephemeral\":true,\"load\":0.0,\"mem\":0.0,"
        + "\"port\":0,\"qps\":0.0,\"rt\":0.0,\"weight\":0.0}", rsInfo.toString());
  }

  @Test
  public void getIpTest() {
    // Arrange, Act and Assert
    assertNull((new RsInfo()).getIp());
  }
}

