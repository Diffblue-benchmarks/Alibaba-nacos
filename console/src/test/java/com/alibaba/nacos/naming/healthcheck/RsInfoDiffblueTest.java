package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RsInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new RsInfo()).isEphemeral());
  }

  @Test
  public void testSetCluster() {
    // Arrange
    String cluster = System.getProperty("nacos.mode");
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setCluster(cluster);

    // Assert
    String expectedCluster = System.getProperty("nacos.mode");
    assertEquals(expectedCluster, rsInfo.getCluster());
  }

  @Test
  public void testSetCpu() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setCpu(10.0);

    // Assert
    assertEquals(10.0, rsInfo.getCpu(), 0.0);
  }

  @Test
  public void testSetEphemeral() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setEphemeral(true);

    // Assert
    assertTrue(rsInfo.isEphemeral());
  }

  @Test
  public void testSetIp() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setIp("127.0.0.1");

    // Assert
    assertEquals("127.0.0.1", rsInfo.getIp());
  }

  @Test
  public void testSetLoad() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setLoad(10.0);

    // Assert
    assertEquals(10.0, rsInfo.getLoad(), 0.0);
  }

  @Test
  public void testSetMem() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setMem(10.0);

    // Assert
    assertEquals(10.0, rsInfo.getMem(), 0.0);
    assertEquals(0.0, rsInfo.getRt(), 0.0);
  }

  @Test
  public void testSetPort() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setPort(8080);

    // Assert
    assertEquals(8080, rsInfo.getPort());
  }

  @Test
  public void testSetQps() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setQps(10.0);

    // Assert
    assertEquals(10.0, rsInfo.getQps(), 0.0);
  }

  @Test
  public void testSetRt() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setRt(10.0);

    // Assert
    assertEquals(10.0, rsInfo.getRt(), 0.0);
  }

  @Test
  public void testSetServiceName() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setServiceName("serviceName");

    // Assert
    assertEquals("serviceName", rsInfo.getServiceName());
  }
}

