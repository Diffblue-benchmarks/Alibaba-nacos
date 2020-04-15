package com.alibaba.nacos.config.server.model.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MonitorInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    MonitorInfo actualMonitorInfo = new MonitorInfo();

    // Assert
    assertEquals(0, actualMonitorInfo.getYgc());
    assertEquals(0.0, actualMonitorInfo.getLoad(), 0.0);
    assertEquals(0L, actualMonitorInfo.getFreeMemory());
    assertEquals(0.0, actualMonitorInfo.getYgct(), 0.0);
    assertEquals(0.0, actualMonitorInfo.getFgct(), 0.0);
    assertEquals(0.0, actualMonitorInfo.getCpuRatio(), 0.0);
    assertEquals(0L, actualMonitorInfo.getTotalMemory());
    assertEquals(0L, actualMonitorInfo.getMaxMemory());
    assertEquals("MonitorInfo{totalMemory=0, freeMemory=0, maxMemory=0,"
        + " cpuRatio=0.0, load=0.0, ygc=0, ygct=0.0, fgc=0," + " fgct=0.0, gct=0.0}", actualMonitorInfo.toString());
    assertEquals(0.0, actualMonitorInfo.getGct(), 0.0);
    assertEquals(0, actualMonitorInfo.getFgc());
  }

  @Test
  public void testSetCpuRatio() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setCpuRatio(1);

    // Assert
    assertEquals(1.0, monitorInfo.getCpuRatio(), 0.0);
  }

  @Test
  public void testSetFgc() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setFgc(1);

    // Assert
    assertEquals(1, monitorInfo.getFgc());
  }

  @Test
  public void testSetFgct() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setFgct(1);

    // Assert
    assertEquals(1.0, monitorInfo.getFgct(), 0.0);
  }

  @Test
  public void testSetFreeMemory() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setFreeMemory(1L);

    // Assert
    assertEquals(1L, monitorInfo.getFreeMemory());
  }

  @Test
  public void testSetGct() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setGct(1);

    // Assert
    assertEquals(0.0, monitorInfo.getCpuRatio(), 0.0);
    assertEquals(1.0, monitorInfo.getGct(), 0.0);
  }

  @Test
  public void testSetLoad() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setLoad(1);

    // Assert
    assertEquals(1.0, monitorInfo.getLoad(), 0.0);
  }

  @Test
  public void testSetMaxMemory() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setMaxMemory(1L);

    // Assert
    assertEquals(1L, monitorInfo.getMaxMemory());
  }

  @Test
  public void testSetTotalMemory() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setTotalMemory(1L);

    // Assert
    assertEquals(1L, monitorInfo.getTotalMemory());
  }

  @Test
  public void testSetYgc() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setYgc(1);

    // Assert
    assertEquals(1, monitorInfo.getYgc());
  }

  @Test
  public void testSetYgct() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setYgct(1);

    // Assert
    assertEquals(1.0, monitorInfo.getYgct(), 0.0);
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("MonitorInfo{totalMemory=0, freeMemory=0, maxMemory=0,"
        + " cpuRatio=0.0, load=0.0, ygc=0, ygct=0.0, fgc=0," + " fgct=0.0, gct=0.0}", (new MonitorInfo()).toString());
  }
}

