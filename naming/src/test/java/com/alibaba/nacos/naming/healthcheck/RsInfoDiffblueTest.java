package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RsInfoDiffblueTest {
  @Test
  public void getAkTest() {
    // Arrange, Act and Assert
    assertNull((new RsInfo()).getAk());
  }

  @Test
  public void setMetadataTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setMetadata(null);

    // Assert
    assertNull(rsInfo.getMetadata());
  }

  @Test
  public void setRtTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setRt(10.0);

    // Assert
    assertEquals(10.0, rsInfo.getRt(), 0.0);
  }

  @Test
  public void setEphemeralTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setEphemeral(true);

    // Assert
    assertTrue(rsInfo.isEphemeral());
  }

  @Test
  public void setServiceNameTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setServiceName("name");

    // Assert
    assertEquals("name", rsInfo.getServiceName());
  }

  @Test
  public void getPortTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RsInfo()).getPort());
  }

  @Test
  public void isEphemeralTest() {
    // Arrange, Act and Assert
    assertTrue((new RsInfo()).isEphemeral());
  }

  @Test
  public void getMemTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new RsInfo()).getMem(), 0.0);
  }

  @Test
  public void setLoadTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setLoad(10.0);

    // Assert
    assertEquals(10.0, rsInfo.getLoad(), 0.0);
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
  public void setIpTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setIp("127.0.0.1");

    // Assert
    assertEquals("127.0.0.1", rsInfo.getIp());
  }

  @Test
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertNull((new RsInfo()).getServiceName());
  }

  @Test
  public void setQpsTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setQps(10.0);

    // Assert
    assertEquals(10.0, rsInfo.getQps(), 0.0);
  }

  @Test
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertNull((new RsInfo()).getMetadata());
  }

  @Test
  public void setWeightTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setWeight(10.0);

    // Assert
    assertEquals(10.0, rsInfo.getWeight(), 0.0);
  }

  @Test
  public void setCpuTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setCpu(10.0);

    // Assert
    assertEquals(10.0, rsInfo.getCpu(), 0.0);
  }

  @Test
  public void getIpTest() {
    // Arrange, Act and Assert
    assertNull((new RsInfo()).getIp());
  }

  @Test
  public void getClusterTest() {
    // Arrange, Act and Assert
    assertNull((new RsInfo()).getCluster());
  }

  @Test
  public void setMemTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setMem(10.0);

    // Assert
    assertEquals(10.0, rsInfo.getMem(), 0.0);
  }

  @Test
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new RsInfo()).getWeight(), 0.0);
  }

  @Test
  public void setPortTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setPort(8080);

    // Assert
    assertEquals(8080, rsInfo.getPort());
  }

  @Test
  public void getLoadTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new RsInfo()).getLoad(), 0.0);
  }

  @Test
  public void setClusterTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setCluster("foo");

    // Assert
    assertEquals("foo", rsInfo.getCluster());
  }

  @Test
  public void setAkTest() {
    // Arrange
    RsInfo rsInfo = new RsInfo();

    // Act
    rsInfo.setAk("foo");

    // Assert
    assertEquals("foo", rsInfo.getAk());
  }
}

