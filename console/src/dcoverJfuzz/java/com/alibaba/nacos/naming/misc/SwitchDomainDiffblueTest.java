package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SwitchDomainDiffblueTest {
  @Test(timeout=10000)
  public void getMinTest3() {
    // Arrange, Act and Assert
    assertEquals(1000, (new SwitchDomain.TcpHealthParams()).getMin());
  }

  @Test(timeout=10000)
  public void getFactorTest3() {
    // Arrange, Act and Assert
    assertEquals(0.75f, (new SwitchDomain.TcpHealthParams()).getFactor(), 0.0f);
  }

  @Test(timeout=10000)
  public void getMaxTest3() {
    // Arrange, Act and Assert
    assertEquals(5000, (new SwitchDomain.TcpHealthParams()).getMax());
  }

  @Test(timeout=10000)
  public void setFactorTest3() {
    // Arrange
    SwitchDomain.TcpHealthParams tcpHealthParams = new SwitchDomain.TcpHealthParams();

    // Act
    tcpHealthParams.setFactor(10.0f);

    // Assert
    assertEquals(10.0f, tcpHealthParams.getFactor(), 0.0f);
  }

  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange and Act
    SwitchDomain.TcpHealthParams actualTcpHealthParams = new SwitchDomain.TcpHealthParams();

    // Assert
    float actualFactor = actualTcpHealthParams.getFactor();
    assertEquals(1000, actualTcpHealthParams.getMin());
    assertEquals(0.75f, actualFactor, 0.0f);
  }

  @Test(timeout=10000)
  public void setMinTest2() {
    // Arrange
    SwitchDomain.MysqlHealthParams mysqlHealthParams = new SwitchDomain.MysqlHealthParams();

    // Act
    mysqlHealthParams.setMin(1);

    // Assert
    assertEquals(1, mysqlHealthParams.getMin());
  }

  @Test(timeout=10000)
  public void getMinTest2() {
    // Arrange, Act and Assert
    assertEquals(2000, (new SwitchDomain.MysqlHealthParams()).getMin());
  }

  @Test(timeout=10000)
  public void setMaxTest2() {
    // Arrange
    SwitchDomain.MysqlHealthParams mysqlHealthParams = new SwitchDomain.MysqlHealthParams();

    // Act
    mysqlHealthParams.setMax(3);

    // Assert
    assertEquals(3, mysqlHealthParams.getMax());
  }

  @Test(timeout=10000)
  public void getFactorTest2() {
    // Arrange, Act and Assert
    assertEquals(0.65f, (new SwitchDomain.MysqlHealthParams()).getFactor(), 0.0f);
  }

  @Test(timeout=10000)
  public void getMaxTest2() {
    // Arrange, Act and Assert
    assertEquals(3000, (new SwitchDomain.MysqlHealthParams()).getMax());
  }

  @Test(timeout=10000)
  public void setFactorTest2() {
    // Arrange
    SwitchDomain.MysqlHealthParams mysqlHealthParams = new SwitchDomain.MysqlHealthParams();

    // Act
    mysqlHealthParams.setFactor(10.0f);

    // Assert
    assertEquals(10.0f, mysqlHealthParams.getFactor(), 0.0f);
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void setMinTest() {
    // Arrange
    SwitchDomain.HttpHealthParams httpHealthParams = new SwitchDomain.HttpHealthParams();

    // Act
    httpHealthParams.setMin(1);

    // Assert
    assertEquals(1, httpHealthParams.getMin());
  }

  @Test(timeout=10000)
  public void getMinTest() {
    // Arrange, Act and Assert
    assertEquals(500, (new SwitchDomain.HttpHealthParams()).getMin());
  }

  @Test(timeout=10000)
  public void setMaxTest() {
    // Arrange
    SwitchDomain.HttpHealthParams httpHealthParams = new SwitchDomain.HttpHealthParams();

    // Act
    httpHealthParams.setMax(3);

    // Assert
    assertEquals(3, httpHealthParams.getMax());
  }

  @Test(timeout=10000)
  public void getFactorTest() {
    // Arrange, Act and Assert
    assertEquals(0.85f, (new SwitchDomain.HttpHealthParams()).getFactor(), 0.0f);
  }

  @Test(timeout=10000)
  public void getMaxTest() {
    // Arrange, Act and Assert
    assertEquals(5000, (new SwitchDomain.HttpHealthParams()).getMax());
  }

  @Test(timeout=10000)
  public void setFactorTest() {
    // Arrange
    SwitchDomain.HttpHealthParams httpHealthParams = new SwitchDomain.HttpHealthParams();

    // Act
    httpHealthParams.setFactor(10.0f);

    // Assert
    assertEquals(10.0f, httpHealthParams.getFactor(), 0.0f);
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void getChecksumTest() {
    // Arrange, Act and Assert
    assertNull((new SwitchDomain()).getChecksum());
  }

  @Test(timeout=10000)
  public void isHealthCheckEnabledTest2() {
    // Arrange, Act and Assert
    assertTrue((new SwitchDomain()).isHealthCheckEnabled());
  }

  @Test(timeout=10000)
  public void setCheckTimesTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setCheckTimes(1);

    // Assert
    assertEquals(1, switchDomain.getCheckTimes());
  }

  @Test(timeout=10000)
  public void isPushEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new SwitchDomain()).isPushEnabled());
  }

  @Test(timeout=10000)
  public void getOverriddenServerStatusTest() {
    // Arrange, Act and Assert
    assertNull((new SwitchDomain()).getOverriddenServerStatus());
  }

  @Test(timeout=10000)
  public void setDisableAddIPTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setDisableAddIP(true);

    // Assert
    assertTrue(switchDomain.isDisableAddIP());
  }

  @Test(timeout=10000)
  public void getPushGoVersionTest() {
    // Arrange, Act and Assert
    assertEquals("0.1.0", (new SwitchDomain()).getPushGoVersion());
  }

  @Test(timeout=10000)
  public void setDefaultCacheMillisTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setDefaultCacheMillis(1L);

    // Assert
    assertEquals(1L, switchDomain.getDefaultCacheMillis());
  }

  @Test(timeout=10000)
  public void getClientBeatIntervalTest() {
    // Arrange, Act and Assert
    assertEquals(5000L, (new SwitchDomain()).getClientBeatInterval());
  }

  @Test(timeout=10000)
  public void setServiceStatusSynchronizationPeriodMillisTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setServiceStatusSynchronizationPeriodMillis(1L);

    // Assert
    assertEquals(1L, switchDomain.getServiceStatusSynchronizationPeriodMillis());
  }

  @Test(timeout=10000)
  public void getMastersTest() {
    // Arrange, Act and Assert
    assertNull((new SwitchDomain()).getMasters());
  }

  @Test(timeout=10000)
  public void setSendBeatOnlyTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setSendBeatOnly(true);

    // Assert
    assertTrue(switchDomain.isSendBeatOnly());
  }

  @Test(timeout=10000)
  public void isDistroEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new SwitchDomain()).isDistroEnabled());
  }

  @Test(timeout=10000)
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
    long actualDefaultPushCacheMillis = actualSwitchDomain.getDefaultPushCacheMillis();
    String actualToStringResult = actualSwitchDomain.toString();
    SwitchDomain.MysqlHealthParams mysqlHealthParams = actualSwitchDomain.getMysqlHealthParams();
    int actualCheckTimes = actualSwitchDomain.getCheckTimes();
    SwitchDomain.TcpHealthParams tcpHealthParams = actualSwitchDomain.getTcpHealthParams();
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
    assertEquals(15000L, actualServerStatusSynchronizationPeriodMillis);
    assertEquals("1.0.12", actualPushCVersion);
    assertTrue(actualIsDistroEnabledResult);
    int actualMax1 = tcpHealthParams.getMax();
    float actualFactor1 = tcpHealthParams.getFactor();
    int actualMin1 = tcpHealthParams.getMin();
    int actualMax2 = mysqlHealthParams.getMax();
    float actualFactor2 = mysqlHealthParams.getFactor();
    assertFalse(actualIsDisableAddIPResult);
    assertEquals(3, actualCheckTimes);
    assertEquals("0.1.0", actualPushJavaVersion);
    assertEquals(0.7f, actualDistroThreshold, 0.0f);
    assertEquals(3000L, actualDefaultCacheMillis);
    assertEquals(5000L, actualServiceStatusSynchronizationPeriodMillis);
    assertTrue(actualIsDefaultInstanceEphemeralResult);
    assertEquals(
        "{\"adWeightMap\":{},\"checkTimes\":3,\"clientBeatInterval"
            + "\":5000,\"defaultCacheMillis\":3000,\"defaultInstanceEphemeral"
            + "\":true,\"defaultPushCacheMillis\":10000,\"disableAddIP"
            + "\":false,\"distroEnabled\":true,\"distroServerExpiredMillis"
            + "\":30000,\"distroThreshold\":0.7,\"enableAuthentication"
            + "\":false,\"enableStandalone\":true,\"healthCheckEnabled"
            + "\":true,\"healthCheckWhiteList\":[],\"httpHealthParams"
            + "\":{\"factor\":0.85,\"max\":5000,\"min\":500},\"incrementalList"
            + "\":[],\"limitedUrlMap\":{},\"mysqlHealthParams\":{\"factor"
            + "\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00---000"
            + "-NACOS_SWITCH_DOMAIN-000---00-00\",\"pushCVersion\":"
            + "\"1.0.12\",\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0"
            + "\",\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0"
            + ".4.3\",\"sendBeatOnly\":false,\"serverStatusSynchroni"
            + "zationPeriodMillis\":15000,\"serviceStatusSynchroni"
            + "zationPeriodMillis\":5000,\"tcpHealthParams\":{\"factor" + "\":0.75,\"max\":5000,\"min\":1000}}",
        actualToStringResult);
    assertEquals(10000L, actualDefaultPushCacheMillis);
    assertEquals("0.4.3", actualPushPythonVersion);
    assertFalse(actualIsSendBeatOnlyResult);
    assertEquals(30000L, actualDistroServerExpiredMillis);
    assertEquals(3000, actualMax2);
    assertEquals(2000, mysqlHealthParams.getMin());
    assertEquals(5000, actualMax);
    assertEquals(0.85f, actualFactor, 0.0f);
    assertEquals(500, actualMin);
    assertEquals(0.75f, actualFactor1, 0.0f);
    assertEquals(0.65f, actualFactor2, 0.0f);
    assertEquals(5000, actualMax1);
    assertEquals(1000, actualMin1);
  }

  @Test(timeout=10000)
  public void getDefaultPushCacheMillisTest() {
    // Arrange, Act and Assert
    assertEquals(10000L, (new SwitchDomain()).getDefaultPushCacheMillis());
  }

  @Test(timeout=10000)
  public void getPushPythonVersionTest() {
    // Arrange, Act and Assert
    assertEquals("0.4.3", (new SwitchDomain()).getPushPythonVersion());
  }

  @Test(timeout=10000)
  public void setAdWeightMapTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setAdWeightMap(null);

    // Assert
    assertNull(switchDomain.getAdWeightMap());
  }

  @Test(timeout=10000)
  public void getDefaultCacheMillisTest() {
    // Arrange, Act and Assert
    assertEquals(3000L, (new SwitchDomain()).getDefaultCacheMillis());
  }

  @Test(timeout=10000)
  public void isHealthCheckEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new SwitchDomain()).isHealthCheckEnabled("name"));
  }

  @Test(timeout=10000)
  public void setPushEnabledTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setPushEnabled(true);

    // Assert
    assertTrue(switchDomain.isPushEnabled());
  }

  @Test(timeout=10000)
  public void isDisableAddIPTest() {
    // Arrange, Act and Assert
    assertFalse((new SwitchDomain()).isDisableAddIP());
  }

  @Test(timeout=10000)
  public void getServerStatusSynchronizationPeriodMillisTest() {
    // Arrange, Act and Assert
    assertEquals(15000L, (new SwitchDomain()).getServerStatusSynchronizationPeriodMillis());
  }

  @Test(timeout=10000)
  public void getDistroServerExpiredMillisTest() {
    // Arrange, Act and Assert
    assertEquals(30000L, (new SwitchDomain()).getDistroServerExpiredMillis());
  }

  @Test(timeout=10000)
  public void setHealthCheckWhiteListTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setHealthCheckWhiteList(null);

    // Assert
    assertNull(switchDomain.getHealthCheckWhiteList());
  }

  @Test(timeout=10000)
  public void setPushPythonVersionTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setPushPythonVersion("foo");

    // Assert
    assertEquals("foo", switchDomain.getPushPythonVersion());
  }

  @Test(timeout=10000)
  public void getPushJavaVersionTest() {
    // Arrange, Act and Assert
    assertEquals("0.1.0", (new SwitchDomain()).getPushJavaVersion());
  }

  @Test(timeout=10000)
  public void setDefaultInstanceEphemeralTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setDefaultInstanceEphemeral(true);

    // Assert
    assertTrue(switchDomain.isDefaultInstanceEphemeral());
  }

  @Test(timeout=10000)
  public void getServiceStatusSynchronizationPeriodMillisTest() {
    // Arrange, Act and Assert
    assertEquals(5000L, (new SwitchDomain()).getServiceStatusSynchronizationPeriodMillis());
  }

  @Test(timeout=10000)
  public void setServerStatusSynchronizationPeriodMillisTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setServerStatusSynchronizationPeriodMillis(1L);

    // Assert
    assertEquals(1L, switchDomain.getServerStatusSynchronizationPeriodMillis());
  }

  @Test(timeout=10000)
  public void setIncrementalListTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setIncrementalList(null);

    // Assert
    assertNull(switchDomain.getIncrementalList());
  }

  @Test(timeout=10000)
  public void setEnableAuthenticationTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setEnableAuthentication(true);

    // Assert
    assertTrue(switchDomain.isEnableAuthentication());
  }

  @Test(timeout=10000)
  public void setPushGoVersionTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setPushGoVersion("foo");

    // Assert
    assertEquals("foo", switchDomain.getPushGoVersion());
  }

  @Test(timeout=10000)
  public void getAdWeightMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SwitchDomain()).getAdWeightMap().size());
  }

  @Test(timeout=10000)
  public void setDistroThresholdTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setDistroThreshold(10.0f);

    // Assert
    assertEquals(10.0f, switchDomain.getDistroThreshold(), 0.0f);
  }

  @Test(timeout=10000)
  public void getPushCVersionTest() {
    // Arrange, Act and Assert
    assertEquals("1.0.12", (new SwitchDomain()).getPushCVersion());
  }

  @Test(timeout=10000)
  public void getIncrementalListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SwitchDomain()).getIncrementalList().size());
  }

  @Test(timeout=10000)
  public void setHttpHealthParamsTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();
    SwitchDomain.HttpHealthParams httpHealthParams = new SwitchDomain.HttpHealthParams();

    // Act
    switchDomain.setHttpHealthParams(httpHealthParams);

    // Assert
    assertSame(httpHealthParams, switchDomain.getHttpHealthParams());
  }

  @Test(timeout=10000)
  public void getCheckTimesTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new SwitchDomain()).getCheckTimes());
  }

  @Test(timeout=10000)
  public void getLimitedUrlMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SwitchDomain()).getLimitedUrlMap().size());
  }

  @Test(timeout=10000)
  public void setDistroEnabledTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setDistroEnabled(true);

    // Assert
    assertTrue(switchDomain.isDistroEnabled());
  }

  @Test(timeout=10000)
  public void getHealthCheckWhiteListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SwitchDomain()).getHealthCheckWhiteList().size());
  }

  @Test(timeout=10000)
  public void setDefaultPushCacheMillisTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setDefaultPushCacheMillis(1L);

    // Assert
    assertEquals(1L, switchDomain.getDefaultPushCacheMillis());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act and Assert
    assertEquals(
        "{\"adWeightMap\":{},\"checkTimes\":3,\"clientBeatInterval"
            + "\":5000,\"defaultCacheMillis\":3000,\"defaultInstanceEphemeral"
            + "\":true,\"defaultPushCacheMillis\":10000,\"disableAddIP"
            + "\":false,\"distroEnabled\":true,\"distroServerExpiredMillis"
            + "\":30000,\"distroThreshold\":0.7,\"enableAuthentication"
            + "\":false,\"enableStandalone\":true,\"healthCheckEnabled"
            + "\":true,\"healthCheckWhiteList\":[],\"httpHealthParams"
            + "\":{\"factor\":0.85,\"max\":5000,\"min\":500},\"incrementalList"
            + "\":[],\"limitedUrlMap\":{},\"mysqlHealthParams\":{\"factor"
            + "\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00---000"
            + "-NACOS_SWITCH_DOMAIN-000---00-00\",\"pushCVersion\":"
            + "\"1.0.12\",\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0"
            + "\",\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0"
            + ".4.3\",\"sendBeatOnly\":false,\"serverStatusSynchroni"
            + "zationPeriodMillis\":15000,\"serviceStatusSynchroni"
            + "zationPeriodMillis\":5000,\"tcpHealthParams\":{\"factor" + "\":0.75,\"max\":5000,\"min\":1000}}",
        switchDomain.toString());
    assertEquals(
        "{\"adWeightMap\":{},\"checkTimes\":3,\"clientBeatInterval"
            + "\":5000,\"defaultCacheMillis\":3000,\"defaultInstanceEphemeral"
            + "\":true,\"defaultPushCacheMillis\":10000,\"disableAddIP"
            + "\":false,\"distroEnabled\":true,\"distroServerExpiredMillis"
            + "\":30000,\"distroThreshold\":0.7,\"enableAuthentication"
            + "\":false,\"enableStandalone\":true,\"healthCheckEnabled"
            + "\":true,\"healthCheckWhiteList\":[],\"httpHealthParams"
            + "\":{\"factor\":0.85,\"max\":5000,\"min\":500},\"incrementalList"
            + "\":[],\"limitedUrlMap\":{},\"mysqlHealthParams\":{\"factor"
            + "\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00---000"
            + "-NACOS_SWITCH_DOMAIN-000---00-00\",\"pushCVersion\":"
            + "\"1.0.12\",\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0"
            + "\",\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0"
            + ".4.3\",\"sendBeatOnly\":false,\"serverStatusSynchroni"
            + "zationPeriodMillis\":15000,\"serviceStatusSynchroni"
            + "zationPeriodMillis\":5000,\"tcpHealthParams\":{\"factor" + "\":0.75,\"max\":5000,\"min\":1000}}",
        switchDomain.toString());
  }

  @Test(timeout=10000)
  public void setHealthCheckEnabledTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setHealthCheckEnabled(true);

    // Assert
    assertTrue(switchDomain.isHealthCheckEnabled());
  }

  @Test(timeout=10000)
  public void getPushCacheMillisTest() {
    // Arrange, Act and Assert
    assertEquals(10000L, (new SwitchDomain()).getPushCacheMillis("name"));
  }

  @Test(timeout=10000)
  public void setOverriddenServerStatusTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setOverriddenServerStatus("foo");

    // Assert
    assertEquals("foo", switchDomain.getOverriddenServerStatus());
  }

  @Test(timeout=10000)
  public void isSendBeatOnlyTest() {
    // Arrange, Act and Assert
    assertFalse((new SwitchDomain()).isSendBeatOnly());
  }

  @Test(timeout=10000)
  public void setPushJavaVersionTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setPushJavaVersion("foo");

    // Assert
    assertEquals("foo", switchDomain.getPushJavaVersion());
  }

  @Test(timeout=10000)
  public void getAdWeightTest() {
    // Arrange, Act and Assert
    assertNull((new SwitchDomain()).getAdWeight("foo"));
  }

  @Test(timeout=10000)
  public void getDistroThresholdTest() {
    // Arrange, Act and Assert
    assertEquals(0.7f, (new SwitchDomain()).getDistroThreshold(), 0.0f);
  }

  @Test(timeout=10000)
  public void isDefaultInstanceEphemeralTest() {
    // Arrange, Act and Assert
    assertTrue((new SwitchDomain()).isDefaultInstanceEphemeral());
  }

  @Test(timeout=10000)
  public void isEnableStandaloneTest() {
    // Arrange, Act and Assert
    assertTrue((new SwitchDomain()).isEnableStandalone());
  }

  @Test(timeout=10000)
  public void setDistroServerExpiredMillisTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setDistroServerExpiredMillis(1L);

    // Assert
    assertEquals(1L, switchDomain.getDistroServerExpiredMillis());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("00-00---000-NACOS_SWITCH_DOMAIN-000---00-00", (new SwitchDomain()).getName());
  }

  @Test(timeout=10000)
  public void setMastersTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setMasters(null);

    // Assert
    assertNull(switchDomain.getMasters());
  }

  @Test(timeout=10000)
  public void setLimitedUrlMapTest() {
    // Arrange
    SwitchDomain switchDomain = new SwitchDomain();

    // Act
    switchDomain.setLimitedUrlMap(null);

    // Assert
    assertNull(switchDomain.getLimitedUrlMap());
  }

  @Test(timeout=10000)
  public void isEnableAuthenticationTest() {
    // Arrange, Act and Assert
    assertFalse((new SwitchDomain()).isEnableAuthentication());
  }
}

