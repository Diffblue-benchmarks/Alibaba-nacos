package com.alibaba.nacos.client.naming.beat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.junit.Test;

public class BeatInfoDiffblueTest {
  @Test(timeout=10000)
  public void setStoppedTest() {
    // Arrange
    BeatInfo beatInfo = new BeatInfo();

    // Act
    beatInfo.setStopped(true);

    // Assert
    assertTrue(beatInfo.isStopped());
  }

  @Test(timeout=10000)
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertNull((new BeatInfo()).getServiceName());
  }

  @Test(timeout=10000)
  public void setWeightTest() {
    // Arrange
    BeatInfo beatInfo = new BeatInfo();

    // Act
    beatInfo.setWeight(10.0);

    // Assert
    assertEquals(10.0, beatInfo.getWeight(), 0.0);
  }

  @Test(timeout=10000)
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertNull((new BeatInfo()).getMetadata());
  }

  @Test(timeout=10000)
  public void getIpTest() {
    // Arrange, Act and Assert
    assertNull((new BeatInfo()).getIp());
  }

  @Test(timeout=10000)
  public void getClusterTest() {
    // Arrange, Act and Assert
    assertNull((new BeatInfo()).getCluster());
  }

  @Test(timeout=10000)
  public void setMetadataTest() {
    // Arrange
    BeatInfo beatInfo = new BeatInfo();

    // Act
    beatInfo.setMetadata(null);

    // Assert
    assertNull(beatInfo.getMetadata());
  }

  @Test(timeout=10000)
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new BeatInfo()).getWeight(), 0.0);
  }

  @Test(timeout=10000)
  public void setScheduledTest() {
    // Arrange
    BeatInfo beatInfo = new BeatInfo();

    // Act
    beatInfo.setScheduled(true);

    // Assert
    assertTrue(beatInfo.isScheduled());
  }

  @Test(timeout=10000)
  public void setPortTest() {
    // Arrange
    BeatInfo beatInfo = new BeatInfo();

    // Act
    beatInfo.setPort(8080);

    // Assert
    assertEquals(8080, beatInfo.getPort());
  }

  @Test(timeout=10000)
  public void setPeriodTest() {
    // Arrange
    BeatInfo beatInfo = new BeatInfo();

    // Act
    beatInfo.setPeriod(1L);

    // Assert
    assertEquals(1L, beatInfo.getPeriod());
  }

  @Test(timeout=10000)
  public void setServiceNameTest() {
    // Arrange
    BeatInfo beatInfo = new BeatInfo();

    // Act
    beatInfo.setServiceName("name");

    // Assert
    assertEquals("name", beatInfo.getServiceName());
  }

  @Test(timeout=10000)
  public void getPortTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new BeatInfo()).getPort());
  }

  @Test(timeout=10000)
  public void isStoppedTest() {
    // Arrange, Act and Assert
    assertFalse((new BeatInfo()).isStopped());
  }

  @Test(timeout=10000)
  public void getPeriodTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new BeatInfo()).getPeriod());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    BeatInfo actualBeatInfo = new BeatInfo();

    // Assert
    boolean actualIsScheduledResult = actualBeatInfo.isScheduled();
    double actualWeight = actualBeatInfo.getWeight();
    String actualToStringResult = actualBeatInfo.toString();
    String actualCluster = actualBeatInfo.getCluster();
    String actualIp = actualBeatInfo.getIp();
    Map<String, String> actualMetadata = actualBeatInfo.getMetadata();
    long actualPeriod = actualBeatInfo.getPeriod();
    String actualServiceName = actualBeatInfo.getServiceName();
    boolean actualIsStoppedResult = actualBeatInfo.isStopped();
    assertFalse(actualIsScheduledResult);
    assertEquals(0, actualBeatInfo.getPort());
    assertFalse(actualIsStoppedResult);
    assertNull(actualServiceName);
    assertEquals(0L, actualPeriod);
    assertNull(actualMetadata);
    assertNull(actualIp);
    assertNull(actualCluster);
    assertEquals("{\"period\":0,\"port\":0,\"scheduled\":false,\"stopped\"" + ":false,\"weight\":0.0}",
        actualToStringResult);
    assertEquals(0.0, actualWeight, 0.0);
  }

  @Test(timeout=10000)
  public void setClusterTest() {
    // Arrange
    BeatInfo beatInfo = new BeatInfo();

    // Act
    beatInfo.setCluster("foo");

    // Assert
    assertEquals("foo", beatInfo.getCluster());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    BeatInfo beatInfo = new BeatInfo();

    // Act and Assert
    assertEquals("{\"period\":0,\"port\":0,\"scheduled\":false,\"stopped\"" + ":false,\"weight\":0.0}",
        beatInfo.toString());
    assertEquals("{\"period\":0,\"port\":0,\"scheduled\":false,\"stopped\"" + ":false,\"weight\":0.0}",
        beatInfo.toString());
  }

  @Test(timeout=10000)
  public void setIpTest() {
    // Arrange
    BeatInfo beatInfo = new BeatInfo();

    // Act
    beatInfo.setIp("127.0.0.1");

    // Assert
    assertEquals("127.0.0.1", beatInfo.getIp());
  }

  @Test(timeout=10000)
  public void isScheduledTest() {
    // Arrange, Act and Assert
    assertFalse((new BeatInfo()).isScheduled());
  }
}

