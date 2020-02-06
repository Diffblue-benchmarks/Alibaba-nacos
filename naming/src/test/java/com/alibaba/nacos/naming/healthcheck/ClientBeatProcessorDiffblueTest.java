package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.naming.core.Service;
import org.junit.Test;

public class ClientBeatProcessorDiffblueTest {
  @Test
  public void setRsInfoTest() {
    // Arrange
    ClientBeatProcessor clientBeatProcessor = new ClientBeatProcessor();
    RsInfo rsInfo = new RsInfo();

    // Act
    clientBeatProcessor.setRsInfo(rsInfo);

    // Assert
    assertSame(rsInfo, clientBeatProcessor.getRsInfo());
  }

  @Test
  public void getRsInfoTest() {
    // Arrange, Act and Assert
    assertNull((new ClientBeatProcessor()).getRsInfo());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ClientBeatProcessor actualClientBeatProcessor = new ClientBeatProcessor();

    // Assert
    Service actualService = actualClientBeatProcessor.getService();
    assertNull(actualService);
    assertNull(actualClientBeatProcessor.getRsInfo());
  }

  @Test
  public void getServiceTest() {
    // Arrange, Act and Assert
    assertNull((new ClientBeatProcessor()).getService());
  }
}

