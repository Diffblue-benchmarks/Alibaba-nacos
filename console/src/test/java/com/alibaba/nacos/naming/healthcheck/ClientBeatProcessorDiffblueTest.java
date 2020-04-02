package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.naming.core.Service;
import org.junit.Test;

public class ClientBeatProcessorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ClientBeatProcessor actualClientBeatProcessor = new ClientBeatProcessor();

    // Assert
    assertNull(actualClientBeatProcessor.getService());
    assertNull(actualClientBeatProcessor.getRsInfo());
  }

  @Test
  public void testSetRsInfo() {
    // Arrange
    ClientBeatProcessor clientBeatProcessor = new ClientBeatProcessor();
    RsInfo rsInfo = new RsInfo();

    // Act
    clientBeatProcessor.setRsInfo(rsInfo);

    // Assert
    assertSame(rsInfo, clientBeatProcessor.getRsInfo());
  }

  @Test
  public void testSetService() {
    // Arrange
    ClientBeatProcessor clientBeatProcessor = new ClientBeatProcessor();
    Service service = new Service();

    // Act
    clientBeatProcessor.setService(service);

    // Assert
    assertSame(service, clientBeatProcessor.getService());
  }
}

