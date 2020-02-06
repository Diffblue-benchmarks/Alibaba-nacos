package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SwitchDomainDiffblueTest {
  @Test
  public void setMinTest3() {
    // Arrange
    SwitchDomain.TcpHealthParams tcpHealthParams = new SwitchDomain.TcpHealthParams();

    // Act
    tcpHealthParams.setMin(1);

    // Assert
    assertEquals(1, tcpHealthParams.getMin());
  }

  @Test
  public void getMinTest3() {
    // Arrange, Act and Assert
    assertEquals(1000, (new SwitchDomain.TcpHealthParams()).getMin());
  }

  @Test
  public void setMaxTest3() {
    // Arrange
    SwitchDomain.TcpHealthParams tcpHealthParams = new SwitchDomain.TcpHealthParams();

    // Act
    tcpHealthParams.setMax(1);

    // Assert
    assertEquals(1, tcpHealthParams.getMax());
  }

  @Test
  public void getFactorTest3() {
    // Arrange, Act and Assert
    assertEquals(0.75f, (new SwitchDomain.TcpHealthParams()).getFactor(), 0.0f);
  }

  @Test
  public void getMaxTest3() {
    // Arrange, Act and Assert
    assertEquals(5000, (new SwitchDomain.TcpHealthParams()).getMax());
  }

  @Test
  public void setFactorTest3() {
    // Arrange
    SwitchDomain.TcpHealthParams tcpHealthParams = new SwitchDomain.TcpHealthParams();

    // Act
    tcpHealthParams.setFactor(1.0f);

    // Assert
    assertEquals(1.0f, tcpHealthParams.getFactor(), 0.0f);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    SwitchDomain.TcpHealthParams actualTcpHealthParams = new SwitchDomain.TcpHealthParams();

    // Assert
    int actualMax = actualTcpHealthParams.getMax();
    float actualFactor = actualTcpHealthParams.getFactor();
    assertEquals(5000, actualMax);
    assertEquals(1000, actualTcpHealthParams.getMin());
    assertEquals(0.75f, actualFactor, 0.0f);
  }

  @Test
  public void setMinTest2() {
    // Arrange
    SwitchDomain.MysqlHealthParams mysqlHealthParams = new SwitchDomain.MysqlHealthParams();

    // Act
    mysqlHealthParams.setMin(1);

    // Assert
    assertEquals(1, mysqlHealthParams.getMin());
  }

  @Test
  public void getMinTest2() {
    // Arrange, Act and Assert
    assertEquals(2000, (new SwitchDomain.MysqlHealthParams()).getMin());
  }

  @Test
  public void setMaxTest2() {
    // Arrange
    SwitchDomain.MysqlHealthParams mysqlHealthParams = new SwitchDomain.MysqlHealthParams();

    // Act
    mysqlHealthParams.setMax(1);

    // Assert
    assertEquals(1, mysqlHealthParams.getMax());
  }

  @Test
  public void getFactorTest2() {
    // Arrange, Act and Assert
    assertEquals(0.65f, (new SwitchDomain.MysqlHealthParams()).getFactor(), 0.0f);
  }

  @Test
  public void getMaxTest2() {
    // Arrange, Act and Assert
    assertEquals(3000, (new SwitchDomain.MysqlHealthParams()).getMax());
  }

  @Test
  public void setFactorTest2() {
    // Arrange
    SwitchDomain.MysqlHealthParams mysqlHealthParams = new SwitchDomain.MysqlHealthParams();

    // Act
    mysqlHealthParams.setFactor(1.0f);

    // Assert
    assertEquals(1.0f, mysqlHealthParams.getFactor(), 0.0f);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    SwitchDomain.MysqlHealthParams actualMysqlHealthParams = new SwitchDomain.MysqlHealthParams();

    // Assert
    int actualMax = actualMysqlHealthParams.getMax();
    float actualFactor = actualMysqlHealthParams.getFactor();
    assertEquals(3000, actualMax);
    assertEquals(2000, actualMysqlHealthParams.getMin());
    assertEquals(0.65f, actualFactor, 0.0f);
  }

  @Test
  public void setMinTest() {
    // Arrange
    SwitchDomain.HttpHealthParams httpHealthParams = new SwitchDomain.HttpHealthParams();

    // Act
    httpHealthParams.setMin(1);

    // Assert
    assertEquals(1, httpHealthParams.getMin());
  }

  @Test
  public void getMinTest() {
    // Arrange, Act and Assert
    assertEquals(500, (new SwitchDomain.HttpHealthParams()).getMin());
  }

  @Test
  public void setMaxTest() {
    // Arrange
    SwitchDomain.HttpHealthParams httpHealthParams = new SwitchDomain.HttpHealthParams();

    // Act
    httpHealthParams.setMax(1);

    // Assert
    assertEquals(1, httpHealthParams.getMax());
  }

  @Test
  public void getFactorTest() {
    // Arrange, Act and Assert
    assertEquals(0.85f, (new SwitchDomain.HttpHealthParams()).getFactor(), 0.0f);
  }

  @Test
  public void getMaxTest() {
    // Arrange, Act and Assert
    assertEquals(5000, (new SwitchDomain.HttpHealthParams()).getMax());
  }

  @Test
  public void setFactorTest() {
    // Arrange
    SwitchDomain.HttpHealthParams httpHealthParams = new SwitchDomain.HttpHealthParams();

    // Act
    httpHealthParams.setFactor(1.0f);

    // Assert
    assertEquals(1.0f, httpHealthParams.getFactor(), 0.0f);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    SwitchDomain.HttpHealthParams actualHttpHealthParams = new SwitchDomain.HttpHealthParams();

    // Assert
    int actualMax = actualHttpHealthParams.getMax();
    float actualFactor = actualHttpHealthParams.getFactor();
    assertEquals(5000, actualMax);
    assertEquals(500, actualHttpHealthParams.getMin());
    assertEquals(0.85f, actualFactor, 0.0f);
  }

  @Test
  public void getOverriddenServerStatusTest() {
    // Arrange, Act and Assert
    assertNull((new SwitchDomain()).getOverriddenServerStatus());
  }

  @Test
  public void setDisableAddIPTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setDisableAddIP(true);

    // Assert
    assertTrue(switchDomain.isDisableAddIP());
  }

  @Test
  public void isAutoChangeHealthCheckEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new SwitchDomain()).isAutoChangeHealthCheckEnabled());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    SwitchDomain actualSwitchDomain = new SwitchDomain();

    // Assert
    boolean actualIsEnableAuthenticationResult = actualSwitchDomain.isEnableAuthentication();
    long actualServiceStatusSynchronizationPeriodMillis = actualSwitchDomain
        .getServiceStatusSynchronizationPeriodMillis();
    boolean actualIsEnableStandaloneResult = actualSwitchDomain.isEnableStandalone();
    String actualPushJavaVersion = actualSwitchDomain.getPushJavaVersion();
    boolean actualIsDefaultInstanceEphemeralResult = actualSwitchDomain.isDefaultInstanceEphemeral();
    long actualDistroServerExpiredMillis = actualSwitchDomain.getDistroServerExpiredMillis();
    long actualServerStatusSynchronizationPeriodMillis = actualSwitchDomain
        .getServerStatusSynchronizationPeriodMillis();
    boolean actualIsDisableAddIPResult = actualSwitchDomain.isDisableAddIP();
    float actualDistroThreshold = actualSwitchDomain.getDistroThreshold();
    long actualDefaultCacheMillis = actualSwitchDomain.getDefaultCacheMillis();
    String actualPushPythonVersion = actualSwitchDomain.getPushPythonVersion();
    boolean actualIsSendBeatOnlyResult = actualSwitchDomain.isSendBeatOnly();
    boolean actualIsLightBeatEnabledResult = actualSwitchDomain.isLightBeatEnabled();
    long actualDefaultPushCacheMillis = actualSwitchDomain.getDefaultPushCacheMillis();
    String actualToStringResult = actualSwitchDomain.toString();
    SwitchDomain.MysqlHealthParams mysqlHealthParams = actualSwitchDomain.getMysqlHealthParams();
    int actualCheckTimes = actualSwitchDomain.getCheckTimes();
    SwitchDomain.TcpHealthParams tcpHealthParams = actualSwitchDomain.getTcpHealthParams();
    boolean actualIsAutoChangeHealthCheckEnabledResult = actualSwitchDomain.isAutoChangeHealthCheckEnabled();
    boolean actualIsDistroEnabledResult = actualSwitchDomain.isDistroEnabled();
    String actualPushCVersion = actualSwitchDomain.getPushCVersion();
    long actualClientBeatInterval = actualSwitchDomain.getClientBeatInterval();
    SwitchDomain.HttpHealthParams httpHealthParams = actualSwitchDomain.getHttpHealthParams();
    String actualPushGoVersion = actualSwitchDomain.getPushGoVersion();
    String actualOverriddenServerStatus = actualSwitchDomain.getOverriddenServerStatus();
    boolean actualIsPushEnabledResult = actualSwitchDomain.isPushEnabled();
    assertFalse(actualIsEnableAuthenticationResult);
    assertTrue(actualSwitchDomain.isHealthCheckEnabled());
    assertTrue(actualIsPushEnabledResult);
    assertNull(actualOverriddenServerStatus);
    assertEquals("0.1.0", actualPushGoVersion);
    int actualMax = httpHealthParams.getMax();
    float actualFactor = httpHealthParams.getFactor();
    int actualMin = httpHealthParams.getMin();
    assertEquals(5000L, actualClientBeatInterval);
    assertTrue(actualIsEnableStandaloneResult);
    assertEquals(2000L, actualServerStatusSynchronizationPeriodMillis);
    assertEquals("1.0.12", actualPushCVersion);
    assertTrue(actualIsDistroEnabledResult);
    assertTrue(actualIsAutoChangeHealthCheckEnabledResult);
    int actualMax1 = tcpHealthParams.getMax();
    float actualFactor1 = tcpHealthParams.getFactor();
    int actualMin1 = tcpHealthParams.getMin();
    assertEquals(3, actualCheckTimes);
    assertEquals(
        "{\"adWeightMap\":{},\"autoChangeHealthCheckEnabled\"" + ":true,\"checkTimes\":3,\"clientBeatInterval\":5000,"
            + "\"defaultCacheMillis\":3000,\"defaultInstanceEphemeral"
            + "\":true,\"defaultPushCacheMillis\":10000,\"disableAddIP"
            + "\":false,\"distroEnabled\":true,\"distroServerExpiredMillis"
            + "\":10000,\"distroThreshold\":0.7,\"enableAuthentication"
            + "\":false,\"enableStandalone\":true,\"healthCheckEnabled"
            + "\":true,\"healthCheckWhiteList\":[],\"httpHealthParams"
            + "\":{\"factor\":0.85,\"max\":5000,\"min\":500},\"incrementalList"
            + "\":[],\"lightBeatEnabled\":true,\"limitedUrlMap\":{},"
            + "\"mysqlHealthParams\":{\"factor\":0.65,\"max\":3000,\"min"
            + "\":2000},\"name\":\"00-00---000-NACOS_SWITCH_DOMAIN-000"
            + "---00-00\",\"pushCVersion\":\"1.0.12\",\"pushEnabled\":true"
            + ",\"pushGoVersion\":\"0.1.0\",\"pushJavaVersion\":\"0.1.0\""
            + ",\"pushPythonVersion\":\"0.4.3\",\"sendBeatOnly\":false,"
            + "\"serverStatusSynchronizationPeriodMillis\":2000," + "\"serviceStatusSynchronizationPeriodMillis\":5000,"
            + "\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000,\"min\"" + ":1000}}",
        actualToStringResult);
    int actualMax2 = mysqlHealthParams.getMax();
    float actualFactor2 = mysqlHealthParams.getFactor();
    assertFalse(actualIsDisableAddIPResult);
    assertEquals("0.1.0", actualPushJavaVersion);
    assertEquals(0.7f, actualDistroThreshold, 0.0f);
    assertEquals(3000L, actualDefaultCacheMillis);
    assertEquals(5000L, actualServiceStatusSynchronizationPeriodMillis);
    assertTrue(actualIsDefaultInstanceEphemeralResult);
    assertEquals(10000L, actualDefaultPushCacheMillis);
    assertTrue(actualIsLightBeatEnabledResult);
    assertEquals("0.4.3", actualPushPythonVersion);
    assertFalse(actualIsSendBeatOnlyResult);
    assertEquals(10000L, actualDistroServerExpiredMillis);
    assertEquals(0.65f, actualFactor2, 0.0f);
    assertEquals(5000, actualMax1);
    assertEquals(5000, actualMax);
    assertEquals(0.85f, actualFactor, 0.0f);
    assertEquals(500, actualMin);
    assertEquals(0.75f, actualFactor1, 0.0f);
    assertEquals(2000, mysqlHealthParams.getMin());
    assertEquals(3000, actualMax2);
    assertEquals(1000, actualMin1);
  }

  @Test
  public void setHttpHealthParamsTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();
    SwitchDomain.HttpHealthParams httpHealthParams = new SwitchDomain.HttpHealthParams();

    // Act
    switchDomain.setHttpHealthParams(httpHealthParams);

    // Assert
    assertSame(httpHealthParams, switchDomain.getHttpHealthParams());
  }

  @Test
  public void setDefaultPushCacheMillisTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setDefaultPushCacheMillis(1L);

    // Assert
    assertEquals(1L, switchDomain.getDefaultPushCacheMillis());
  }

  @Test
  public void toStringTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act and Assert
    assertEquals(
        "{\"adWeightMap\":{},\"autoChangeHealthCheckEnabled\"" + ":true,\"checkTimes\":3,\"clientBeatInterval\":5000,"
            + "\"defaultCacheMillis\":3000,\"defaultInstanceEphemeral"
            + "\":true,\"defaultPushCacheMillis\":10000,\"disableAddIP"
            + "\":false,\"distroEnabled\":true,\"distroServerExpiredMillis"
            + "\":10000,\"distroThreshold\":0.7,\"enableAuthentication"
            + "\":false,\"enableStandalone\":true,\"healthCheckEnabled"
            + "\":true,\"healthCheckWhiteList\":[],\"httpHealthParams"
            + "\":{\"factor\":0.85,\"max\":5000,\"min\":500},\"incrementalList"
            + "\":[],\"lightBeatEnabled\":true,\"limitedUrlMap\":{},"
            + "\"mysqlHealthParams\":{\"factor\":0.65,\"max\":3000,\"min"
            + "\":2000},\"name\":\"00-00---000-NACOS_SWITCH_DOMAIN-000"
            + "---00-00\",\"pushCVersion\":\"1.0.12\",\"pushEnabled\":true"
            + ",\"pushGoVersion\":\"0.1.0\",\"pushJavaVersion\":\"0.1.0\""
            + ",\"pushPythonVersion\":\"0.4.3\",\"sendBeatOnly\":false,"
            + "\"serverStatusSynchronizationPeriodMillis\":2000," + "\"serviceStatusSynchronizationPeriodMillis\":5000,"
            + "\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000,\"min\"" + ":1000}}",
        switchDomain.toString());
    assertEquals(
        "{\"adWeightMap\":{},\"autoChangeHealthCheckEnabled\"" + ":true,\"checkTimes\":3,\"clientBeatInterval\":5000,"
            + "\"defaultCacheMillis\":3000,\"defaultInstanceEphemeral"
            + "\":true,\"defaultPushCacheMillis\":10000,\"disableAddIP"
            + "\":false,\"distroEnabled\":true,\"distroServerExpiredMillis"
            + "\":10000,\"distroThreshold\":0.7,\"enableAuthentication"
            + "\":false,\"enableStandalone\":true,\"healthCheckEnabled"
            + "\":true,\"healthCheckWhiteList\":[],\"httpHealthParams"
            + "\":{\"factor\":0.85,\"max\":5000,\"min\":500},\"incrementalList"
            + "\":[],\"lightBeatEnabled\":true,\"limitedUrlMap\":{},"
            + "\"mysqlHealthParams\":{\"factor\":0.65,\"max\":3000,\"min"
            + "\":2000},\"name\":\"00-00---000-NACOS_SWITCH_DOMAIN-000"
            + "---00-00\",\"pushCVersion\":\"1.0.12\",\"pushEnabled\":true"
            + ",\"pushGoVersion\":\"0.1.0\",\"pushJavaVersion\":\"0.1.0\""
            + ",\"pushPythonVersion\":\"0.4.3\",\"sendBeatOnly\":false,"
            + "\"serverStatusSynchronizationPeriodMillis\":2000," + "\"serviceStatusSynchronizationPeriodMillis\":5000,"
            + "\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000,\"min\"" + ":1000}}",
        switchDomain.toString());
  }

  @Test
  public void setHealthCheckEnabledTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setHealthCheckEnabled(true);

    // Assert
    assertTrue(switchDomain.isHealthCheckEnabled());
  }

  @Test
  public void setClientBeatIntervalTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setClientBeatInterval(1L);

    // Assert
    assertEquals(1L, switchDomain.getClientBeatInterval());
  }

  @Test
  public void setPushJavaVersionTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setPushJavaVersion("0.1.0");

    // Assert
    assertEquals("0.1.0", switchDomain.getPushJavaVersion());
  }

  @Test
  public void getAdWeightTest() {
    // Arrange, Act and Assert
    assertNull((new SwitchDomain()).getAdWeight("0.1.0"));
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("00-00---000-NACOS_SWITCH_DOMAIN-000---00-00", (new SwitchDomain()).getName());
  }

  @Test
  public void setLimitedUrlMapTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setLimitedUrlMap(null);

    // Assert
    assertNull(switchDomain.getLimitedUrlMap());
  }

  @Test
  public void isEnableAuthenticationTest() {
    // Arrange, Act and Assert
    assertFalse((new SwitchDomain()).isEnableAuthentication());
  }
}

