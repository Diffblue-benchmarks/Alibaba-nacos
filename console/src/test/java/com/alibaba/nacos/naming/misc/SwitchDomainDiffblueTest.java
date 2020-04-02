package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SwitchDomainDiffblueTest {
  @Test
  public void testMysqlHealthParamsConstructor() {
    // Arrange and Act
    SwitchDomain.MysqlHealthParams actualMysqlHealthParams = new SwitchDomain.MysqlHealthParams();

    // Assert
    assertEquals(3000, actualMysqlHealthParams.getMax());
    assertEquals(2000, actualMysqlHealthParams.getMin());
    assertEquals(0.65f, actualMysqlHealthParams.getFactor(), 0.0f);
  }

  @Test
  public void testMysqlHealthParamsSetFactor() {
    // Arrange
    SwitchDomain.MysqlHealthParams mysqlHealthParams = new SwitchDomain.MysqlHealthParams();

    // Act
    mysqlHealthParams.setFactor(0.65f);

    // Assert
    assertEquals(0.65f, mysqlHealthParams.getFactor(), 0.0f);
  }

  @Test
  public void testMysqlHealthParamsSetMax() {
    // Arrange
    SwitchDomain.MysqlHealthParams mysqlHealthParams = new SwitchDomain.MysqlHealthParams();

    // Act
    mysqlHealthParams.setMax(3);

    // Assert
    assertEquals(3, mysqlHealthParams.getMax());
  }

  @Test
  public void testMysqlHealthParamsSetMin() {
    // Arrange
    SwitchDomain.MysqlHealthParams mysqlHealthParams = new SwitchDomain.MysqlHealthParams();

    // Act
    mysqlHealthParams.setMin(1);

    // Assert
    assertEquals(1, mysqlHealthParams.getMin());
  }

  @Test
  public void testTcpHealthParamsConstructor() {
    // Arrange and Act
    SwitchDomain.TcpHealthParams actualTcpHealthParams = new SwitchDomain.TcpHealthParams();

    // Assert
    assertEquals(5000, actualTcpHealthParams.getMax());
    assertEquals(1000, actualTcpHealthParams.getMin());
    assertEquals(0.75f, actualTcpHealthParams.getFactor(), 0.0f);
  }

  @Test
  public void testTcpHealthParamsSetFactor() {
    // Arrange
    SwitchDomain.TcpHealthParams tcpHealthParams = new SwitchDomain.TcpHealthParams();

    // Act
    tcpHealthParams.setFactor(0.75f);

    // Assert
    assertEquals(0.75f, tcpHealthParams.getFactor(), 0.0f);
  }

  @Test
  public void testTcpHealthParamsSetMax() {
    // Arrange
    SwitchDomain.TcpHealthParams tcpHealthParams = new SwitchDomain.TcpHealthParams();

    // Act
    tcpHealthParams.setMax(3);

    // Assert
    assertEquals(3, tcpHealthParams.getMax());
  }

  @Test
  public void testTcpHealthParamsSetMin() {
    // Arrange
    SwitchDomain.TcpHealthParams tcpHealthParams = new SwitchDomain.TcpHealthParams();

    // Act
    tcpHealthParams.setMin(1);

    // Assert
    assertEquals(1, tcpHealthParams.getMin());
  }
}

