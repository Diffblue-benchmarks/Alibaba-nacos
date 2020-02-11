package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.naming.core.Service;
import org.junit.Test;

public class ClientBeatProcessorDiffblueTest {
  @Test(timeout=10000)
  public void setRsInfoTest() {
    // Arrange
    ClientBeatProcessor clientBeatProcessor = new ClientBeatProcessor();
    RsInfo rsInfo = new RsInfo();

    // Act
    clientBeatProcessor.setRsInfo(rsInfo);

    // Assert
    assertSame(rsInfo, clientBeatProcessor.getRsInfo());
  }

  @Test(timeout=10000)
  public void getRsInfoTest() {
    // Arrange, Act and Assert
    assertNull((new ClientBeatProcessor()).getRsInfo());
  }

  @Test(timeout=10000)
  public void setServiceTest() {
    // Arrange
    ClientBeatProcessor clientBeatProcessor = new ClientBeatProcessor();
    Service service = new Service();

    // Act
    clientBeatProcessor.setService(service);

    // Assert
    assertSame(service, clientBeatProcessor.getService());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ClientBeatProcessor actualClientBeatProcessor = new ClientBeatProcessor();

    // Assert
    Service actualService = actualClientBeatProcessor.getService();
    assertNull(actualService);
    assertNull(actualClientBeatProcessor.getRsInfo());
  }

  @Test(timeout=10000)
  public void getServiceTest() {
    // Arrange, Act and Assert
    assertNull((new ClientBeatProcessor()).getService());
  }
}

