package com.alibaba.nacos.config.server.model.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MonitorInfoDiffblueTest {
  @Test
  public void setYgcTest() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setYgc(1);

    // Assert
    assertEquals(1, monitorInfo.getYgc());
  }

  @Test
  public void getYgctTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new MonitorInfo()).getYgct(), 0.0);
  }

  @Test
  public void setFgctTest() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setFgct(1);

    // Assert
    assertEquals(1.0, monitorInfo.getFgct(), 0.0);
  }

  @Test
  public void getFgctTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new MonitorInfo()).getFgct(), 0.0);
  }

  @Test
  public void getCpuRatioTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new MonitorInfo()).getCpuRatio(), 0.0);
  }

  @Test
  public void setYgctTest() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setYgct(1);

    // Assert
    assertEquals(1.0, monitorInfo.getYgct(), 0.0);
  }

  @Test
  public void setTotalMemoryTest() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setTotalMemory(1L);

    // Assert
    assertEquals(1L, monitorInfo.getTotalMemory());
  }

  @Test
  public void getMaxMemoryTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new MonitorInfo()).getMaxMemory());
  }

  @Test
  public void setFgcTest() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setFgc(1);

    // Assert
    assertEquals(1, monitorInfo.getFgc());
  }

  @Test
  public void getLoadTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new MonitorInfo()).getLoad(), 0.0);
  }

  @Test
  public void setMaxMemoryTest() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setMaxMemory(1L);

    // Assert
    assertEquals(1L, monitorInfo.getMaxMemory());
  }

  @Test
  public void getFreeMemoryTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new MonitorInfo()).getFreeMemory());
  }

  @Test
  public void setCpuRatioTest() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setCpuRatio(1);

    // Assert
    assertEquals(1.0, monitorInfo.getCpuRatio(), 0.0);
  }

  @Test
  public void setFreeMemoryTest() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setFreeMemory(1L);

    // Assert
    assertEquals(1L, monitorInfo.getFreeMemory());
  }

  @Test
  public void getTotalMemoryTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new MonitorInfo()).getTotalMemory());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    MonitorInfo actualMonitorInfo = new MonitorInfo();

    // Assert
    int actualYgc = actualMonitorInfo.getYgc();
    int actualFgc = actualMonitorInfo.getFgc();
    double actualGct = actualMonitorInfo.getGct();
    String actualToStringResult = actualMonitorInfo.toString();
    long actualMaxMemory = actualMonitorInfo.getMaxMemory();
    long actualTotalMemory = actualMonitorInfo.getTotalMemory();
    double actualCpuRatio = actualMonitorInfo.getCpuRatio();
    double actualFgct = actualMonitorInfo.getFgct();
    double actualYgct = actualMonitorInfo.getYgct();
    long actualFreeMemory = actualMonitorInfo.getFreeMemory();
    assertEquals(0, actualYgc);
    assertEquals(0.0, actualMonitorInfo.getLoad(), 0.0);
    assertEquals(0L, actualFreeMemory);
    assertEquals(0.0, actualYgct, 0.0);
    assertEquals(0.0, actualFgct, 0.0);
    assertEquals(0.0, actualCpuRatio, 0.0);
    assertEquals(0L, actualTotalMemory);
    assertEquals(0L, actualMaxMemory);
    assertEquals("MonitorInfo{totalMemory=0, freeMemory=0, maxMemory=0,"
        + " cpuRatio=0.0, load=0.0, ygc=0, ygct=0.0, fgc=0," + " fgct=0.0, gct=0.0}", actualToStringResult);
    assertEquals(0.0, actualGct, 0.0);
    assertEquals(0, actualFgc);
  }

  @Test
  public void setGctTest() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setGct(1);

    // Assert
    assertEquals(1.0, monitorInfo.getGct(), 0.0);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("MonitorInfo{totalMemory=0, freeMemory=0, maxMemory=0,"
        + " cpuRatio=0.0, load=0.0, ygc=0, ygct=0.0, fgc=0," + " fgct=0.0, gct=0.0}", (new MonitorInfo()).toString());
  }

  @Test
  public void setLoadTest() {
    // Arrange
    MonitorInfo monitorInfo = new MonitorInfo();

    // Act
    monitorInfo.setLoad(1);

    // Assert
    assertEquals(1.0, monitorInfo.getLoad(), 0.0);
  }

  @Test
  public void getGctTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new MonitorInfo()).getGct(), 0.0);
  }

  @Test
  public void getFgcTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new MonitorInfo()).getFgc());
  }

  @Test
  public void getYgcTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new MonitorInfo()).getYgc());
  }
}

