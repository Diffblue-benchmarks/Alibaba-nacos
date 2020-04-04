package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class SwitchDomainDiffblueTest {
  @Autowired
  private SwitchDomain switchDomain;

  @Test
  public void testConstructor() {
    // Arrange and Act
    SwitchDomain actualSwitchDomain = new SwitchDomain();

    // Assert
    assertFalse(actualSwitchDomain.isEnableAuthentication());
    assertTrue(actualSwitchDomain.isHealthCheckEnabled());
    assertTrue(actualSwitchDomain.isPushEnabled());
    assertNull(actualSwitchDomain.getOverriddenServerStatus());
    assertEquals("0.1.0", actualSwitchDomain.getPushGoVersion());
    SwitchDomain.HttpHealthParams httpHealthParams = actualSwitchDomain.getHttpHealthParams();
    assertEquals(5000L, actualSwitchDomain.getClientBeatInterval());
    assertTrue(actualSwitchDomain.isEnableStandalone());
    assertEquals(15000L, actualSwitchDomain.getServerStatusSynchronizationPeriodMillis());
    assertEquals("1.0.12", actualSwitchDomain.getPushCVersion());
    assertTrue(actualSwitchDomain.isDistroEnabled());
    SwitchDomain.TcpHealthParams tcpHealthParams = actualSwitchDomain.getTcpHealthParams();
    SwitchDomain.MysqlHealthParams mysqlHealthParams = actualSwitchDomain.getMysqlHealthParams();
    assertFalse(actualSwitchDomain.isDisableAddIP());
    assertEquals(3, actualSwitchDomain.getCheckTimes());
    assertEquals("0.1.0", actualSwitchDomain.getPushJavaVersion());
    assertEquals(0.7f, actualSwitchDomain.getDistroThreshold(), 0.0f);
    assertEquals(3000L, actualSwitchDomain.getDefaultCacheMillis());
    assertEquals(5000L, actualSwitchDomain.getServiceStatusSynchronizationPeriodMillis());
    assertTrue(actualSwitchDomain.isDefaultInstanceEphemeral());
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":5000,\"defaultCacheMillis\":3000"
        + ",\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":10000,\"disableAddIP\":false,\"distroEnabled\":true"
        + ",\"distroServerExpiredMillis\":30000,\"distroThreshold"
        + "\":0.7,\"enableAuthentication\":false,\"enableStandalone"
        + "\":true,\"healthCheckEnabled\":true,\"healthCheckWhiteList"
        + "\":[],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000"
        + ",\"min\":500},\"incrementalList\":[],\"limitedUrlMap\":"
        + "{},\"masters\":[],\"mysqlHealthParams\":{\"factor\":0.65"
        + ",\"max\":3000,\"min\":2000},\"name\":\"00-00---000-NACOS"
        + "_SWITCH_DOMAIN-000---00-00\",\"overriddenServerStatus"
        + "\":\"\",\"pushCVersion\":\"1.0.12\",\"pushEnabled\":true,"
        + "\"pushGoVersion\":\"0.1.0\",\"pushJavaVersion\":\"0.1.0\""
        + ",\"pushPythonVersion\":\"0.4.3\",\"sendBeatOnly\":false"
        + ",\"serverStatusSynchronizationPeriodMillis\":15000," + "\"serviceStatusSynchronizationPeriodMillis\":5000,"
        + "\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000,\"min\"" + ":1000}}", actualSwitchDomain.toString());
    assertEquals(10000L, actualSwitchDomain.getDefaultPushCacheMillis());
    assertEquals("0.4.3", actualSwitchDomain.getPushPythonVersion());
    assertFalse(actualSwitchDomain.isSendBeatOnly());
    assertEquals(30000L, actualSwitchDomain.getDistroServerExpiredMillis());
    assertEquals(3000, mysqlHealthParams.getMax());
    assertEquals(2000, mysqlHealthParams.getMin());
    assertEquals(5000, httpHealthParams.getMax());
    assertEquals(0.85f, httpHealthParams.getFactor(), 0.0f);
    assertEquals(500, httpHealthParams.getMin());
    assertEquals(0.75f, tcpHealthParams.getFactor(), 0.0f);
    assertEquals(0.65f, mysqlHealthParams.getFactor(), 0.0f);
    assertEquals(5000, tcpHealthParams.getMax());
    assertEquals(1000, tcpHealthParams.getMin());
  }

  @Test
  public void testGetAdWeight() {
    // Arrange, Act and Assert
    assertNull(this.switchDomain.getAdWeight("0.1.0"));
  }

  @Test
  public void testGetChecksum() {
    // Arrange, Act and Assert
    assertNull(this.switchDomain.getChecksum());
  }

  @Test
  public void testGetName() {
    // Arrange, Act and Assert
    assertEquals("00-00---000-NACOS_SWITCH_DOMAIN-000---00-00", this.switchDomain.getName());
  }

  @Test
  public void testHttpHealthParamsConstructor() {
    // Arrange and Act
    SwitchDomain.HttpHealthParams actualHttpHealthParams = new SwitchDomain.HttpHealthParams();

    // Assert
    assertEquals(5000, actualHttpHealthParams.getMax());
    assertEquals(500, actualHttpHealthParams.getMin());
    assertEquals(0.85f, actualHttpHealthParams.getFactor(), 0.0f);
  }

  @Test
  public void testHttpHealthParamsSetFactor() {
    // Arrange
    SwitchDomain.HttpHealthParams httpHealthParams = new SwitchDomain.HttpHealthParams();

    // Act
    httpHealthParams.setFactor(0.85f);

    // Assert
    assertEquals(0.85f, httpHealthParams.getFactor(), 0.0f);
  }

  @Test
  public void testHttpHealthParamsSetMax() {
    // Arrange
    SwitchDomain.HttpHealthParams httpHealthParams = new SwitchDomain.HttpHealthParams();

    // Act
    httpHealthParams.setMax(3);

    // Assert
    assertEquals(3, httpHealthParams.getMax());
  }

  @Test
  public void testHttpHealthParamsSetMin() {
    // Arrange
    SwitchDomain.HttpHealthParams httpHealthParams = new SwitchDomain.HttpHealthParams();

    // Act
    httpHealthParams.setMin(1);

    // Assert
    assertEquals(1, httpHealthParams.getMin());
  }

  @Test
  public void testIsHealthCheckEnabled() {
    // Arrange, Act and Assert
    assertTrue(this.switchDomain.isHealthCheckEnabled("0.1.0"));
  }

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
  public void testSetAdWeightMap() {
    // Arrange
    HashMap<String, Integer> stringIntegerMap = new HashMap<String, Integer>();
    stringIntegerMap.put("foo", 1);

    // Act
    this.switchDomain.setAdWeightMap(stringIntegerMap);

    // Assert
    assertEquals("{\"adWeightMap\":{\"foo\":1},\"checkTimes\":3,\"checksum\""
        + ":\"\",\"clientBeatInterval\":3,\"defaultCacheMillis\":3000"
        + ",\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":3,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":3,\"distroThreshold\":0.7"
        + ",\"enableAuthentication\":true,\"enableStandalone\":true"
        + ",\"healthCheckEnabled\":true,\"healthCheckWhiteList\":"
        + "[\"foo\"],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000"
        + ",\"min\":500},\"incrementalList\":[\"foo\"],\"limitedUrlMap"
        + "\":{\"foo\":1},\"masters\":[\"foo\"],\"mysqlHealthParams\":"
        + "{\"factor\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00"
        + "---000-NACOS_SWITCH_DOMAIN-000---00-00\",\"overridde"
        + "nServerStatus\":\"0.1.0\",\"pushCVersion\":\"0.1.0\"," + "\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0\","
        + "\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0.1"
        + ".0\",\"sendBeatOnly\":false,\"serverStatusSynchronizat"
        + "ionPeriodMillis\":3,\"serviceStatusSynchronizationPe"
        + "riodMillis\":5000,\"tcpHealthParams\":{\"factor\":0.75," + "\"max\":5000,\"min\":1000}}",
        this.switchDomain.toString());
  }

  @Test
  public void testSetCheckTimes() {
    // Arrange and Act
    this.switchDomain.setCheckTimes(0);

    // Assert
    assertEquals(0, this.switchDomain.getCheckTimes());
  }

  @Test
  public void testSetClientBeatInterval() {
    // Arrange and Act
    this.switchDomain.setClientBeatInterval(3L);

    // Assert
    assertEquals(3L, this.switchDomain.getClientBeatInterval());
  }

  @Test
  public void testSetDefaultCacheMillis() {
    // Arrange and Act
    this.switchDomain.setDefaultCacheMillis(3L);

    // Assert
    assertEquals(3L, this.switchDomain.getDefaultCacheMillis());
  }

  @Test
  public void testSetDefaultInstanceEphemeral() {
    // Arrange and Act
    this.switchDomain.setDefaultInstanceEphemeral(true);

    // Assert
    assertTrue(this.switchDomain.isDefaultInstanceEphemeral());
  }

  @Test
  public void testSetDefaultPushCacheMillis() {
    // Arrange and Act
    this.switchDomain.setDefaultPushCacheMillis(3L);

    // Assert
    assertEquals(3L, this.switchDomain.getDefaultPushCacheMillis());
  }

  @Test
  public void testSetDisableAddIP() {
    // Arrange and Act
    this.switchDomain.setDisableAddIP(true);

    // Assert
    assertTrue(this.switchDomain.isDisableAddIP());
    assertEquals("{\"adWeightMap\":{\"foo\":1},\"checkTimes\":3,\"checksum\""
        + ":\"\",\"clientBeatInterval\":3,\"defaultCacheMillis\":3,"
        + "\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":3,\"disableAddIP\":true,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":3,\"distroThreshold\":0.7"
        + ",\"enableAuthentication\":true,\"enableStandalone\":true"
        + ",\"healthCheckEnabled\":true,\"healthCheckWhiteList\":"
        + "[\"foo\"],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000"
        + ",\"min\":500},\"incrementalList\":[\"foo\"],\"limitedUrlMap"
        + "\":{\"foo\":1},\"masters\":[\"foo\"],\"mysqlHealthParams\":"
        + "{\"factor\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00"
        + "---000-NACOS_SWITCH_DOMAIN-000---00-00\",\"overridde"
        + "nServerStatus\":\"0.1.0\",\"pushCVersion\":\"0.1.0\"," + "\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0\","
        + "\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0.1"
        + ".0\",\"sendBeatOnly\":true,\"serverStatusSynchronizati"
        + "onPeriodMillis\":3,\"serviceStatusSynchronizationPeriodMillis"
        + "\":3,\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000,\"min" + "\":1000}}", this.switchDomain.toString());
  }

  @Test
  public void testSetDistroEnabled() {
    // Arrange and Act
    this.switchDomain.setDistroEnabled(true);

    // Assert
    assertTrue(this.switchDomain.isDistroEnabled());
  }

  @Test
  public void testSetDistroServerExpiredMillis() {
    // Arrange and Act
    this.switchDomain.setDistroServerExpiredMillis(3L);

    // Assert
    assertEquals(3L, this.switchDomain.getDistroServerExpiredMillis());
  }

  @Test
  public void testSetDistroThreshold() {
    // Arrange and Act
    this.switchDomain.setDistroThreshold(0.7f);

    // Assert
    assertEquals(0.7f, this.switchDomain.getDistroThreshold(), 0.0f);
  }

  @Test
  public void testSetEnableAuthentication() {
    // Arrange and Act
    this.switchDomain.setEnableAuthentication(true);

    // Assert
    assertTrue(this.switchDomain.isEnableAuthentication());
  }

  @Test
  public void testSetEnableStandalone() {
    // Arrange and Act
    this.switchDomain.setEnableStandalone(true);

    // Assert
    assertTrue(this.switchDomain.isEnableStandalone());
  }

  @Test
  public void testSetHealthCheckEnabled() {
    // Arrange and Act
    this.switchDomain.setHealthCheckEnabled(true);

    // Assert
    assertTrue(this.switchDomain.isHealthCheckEnabled());
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":3,\"defaultCacheMillis\":3000,"
        + "\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":10000,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":3,\"distroThreshold\":0.7"
        + ",\"enableAuthentication\":false,\"enableStandalone\""
        + ":true,\"healthCheckEnabled\":true,\"healthCheckWhiteList"
        + "\":[],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000,"
        + "\"min\":500},\"incrementalList\":[],\"limitedUrlMap\":{"
        + "\"foo\":1},\"masters\":[\"foo\"],\"mysqlHealthParams\":{"
        + "\"factor\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00"
        + "---000-NACOS_SWITCH_DOMAIN-000---00-00\",\"overridde"
        + "nServerStatus\":\"0.1.0\",\"pushCVersion\":\"1.0.12\"," + "\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0\","
        + "\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0.4"
        + ".3\",\"sendBeatOnly\":false,\"serverStatusSynchronizat"
        + "ionPeriodMillis\":15000,\"serviceStatusSynchronizati"
        + "onPeriodMillis\":5000,\"tcpHealthParams\":{\"factor\":0" + ".75,\"max\":5000,\"min\":1000}}",
        this.switchDomain.toString());
  }

  @Test
  public void testSetHealthCheckWhiteList() {
    // Arrange
    HashSet<String> stringSet = new HashSet<String>();
    stringSet.add("foo");

    // Act
    this.switchDomain.setHealthCheckWhiteList(stringSet);

    // Assert
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":3,\"defaultCacheMillis\":3000,"
        + "\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":3,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":3,\"distroThreshold\":0.7"
        + ",\"enableAuthentication\":true,\"enableStandalone\":true"
        + ",\"healthCheckEnabled\":true,\"healthCheckWhiteList\":"
        + "[\"foo\"],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000"
        + ",\"min\":500},\"incrementalList\":[\"foo\"],\"limitedUrlMap"
        + "\":{\"foo\":1},\"masters\":[\"foo\"],\"mysqlHealthParams\":"
        + "{\"factor\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00"
        + "---000-NACOS_SWITCH_DOMAIN-000---00-00\",\"overridde"
        + "nServerStatus\":\"0.1.0\",\"pushCVersion\":\"0.1.0\"," + "\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0\","
        + "\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0.1"
        + ".0\",\"sendBeatOnly\":false,\"serverStatusSynchronizat"
        + "ionPeriodMillis\":3,\"serviceStatusSynchronizationPe"
        + "riodMillis\":5000,\"tcpHealthParams\":{\"factor\":0.75," + "\"max\":5000,\"min\":1000}}",
        this.switchDomain.toString());
  }

  @Test
  public void testSetHttpHealthParams() {
    // Arrange and Act
    this.switchDomain.setHttpHealthParams(new SwitchDomain.HttpHealthParams());

    // Assert
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":3,\"defaultCacheMillis\":3000,"
        + "\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":3,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":3,\"distroThreshold\":0.7"
        + ",\"enableAuthentication\":false,\"enableStandalone\""
        + ":true,\"healthCheckEnabled\":true,\"healthCheckWhiteList"
        + "\":[],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000,"
        + "\"min\":500},\"incrementalList\":[],\"limitedUrlMap\":{"
        + "\"foo\":1},\"masters\":[\"foo\"],\"mysqlHealthParams\":{"
        + "\"factor\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00"
        + "---000-NACOS_SWITCH_DOMAIN-000---00-00\",\"overridde"
        + "nServerStatus\":\"0.1.0\",\"pushCVersion\":\"1.0.12\"," + "\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0\","
        + "\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0.4"
        + ".3\",\"sendBeatOnly\":false,\"serverStatusSynchronizat"
        + "ionPeriodMillis\":15000,\"serviceStatusSynchronizati"
        + "onPeriodMillis\":5000,\"tcpHealthParams\":{\"factor\":0" + ".75,\"max\":5000,\"min\":1000}}",
        this.switchDomain.toString());
  }

  @Test
  public void testSetIncrementalList() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    this.switchDomain.setIncrementalList(stringList);

    // Assert
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":3,\"defaultCacheMillis\":3000,"
        + "\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":3,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":3,\"distroThreshold\":0.7"
        + ",\"enableAuthentication\":true,\"enableStandalone\":true"
        + ",\"healthCheckEnabled\":true,\"healthCheckWhiteList\":"
        + "[],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000,\"min"
        + "\":500},\"incrementalList\":[\"foo\"],\"limitedUrlMap\":{"
        + "\"foo\":1},\"masters\":[\"foo\"],\"mysqlHealthParams\":{"
        + "\"factor\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00"
        + "---000-NACOS_SWITCH_DOMAIN-000---00-00\",\"overridde"
        + "nServerStatus\":\"0.1.0\",\"pushCVersion\":\"0.1.0\"," + "\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0\","
        + "\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0.4"
        + ".3\",\"sendBeatOnly\":false,\"serverStatusSynchronizat"
        + "ionPeriodMillis\":15000,\"serviceStatusSynchronizati"
        + "onPeriodMillis\":5000,\"tcpHealthParams\":{\"factor\":0" + ".75,\"max\":5000,\"min\":1000}}",
        this.switchDomain.toString());
  }

  @Test
  public void testSetLimitedUrlMap() {
    // Arrange
    HashMap<String, Integer> stringIntegerMap = new HashMap<String, Integer>();
    stringIntegerMap.put("foo", 1);

    // Act
    this.switchDomain.setLimitedUrlMap(stringIntegerMap);

    // Assert
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":5000,\"defaultCacheMillis\":3000"
        + ",\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":10000,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":30000,\"distroThreshold"
        + "\":0.7,\"enableAuthentication\":false,\"enableStandalone"
        + "\":true,\"healthCheckEnabled\":true,\"healthCheckWhiteList"
        + "\":[],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000,"
        + "\"min\":500},\"incrementalList\":[],\"limitedUrlMap\":{"
        + "\"foo\":1},\"masters\":[],\"mysqlHealthParams\":{\"factor"
        + "\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00---000"
        + "-NACOS_SWITCH_DOMAIN-000---00-00\",\"overriddenServerStatus"
        + "\":\"UP\",\"pushCVersion\":\"1.0.12\",\"pushEnabled\":true,"
        + "\"pushGoVersion\":\"0.1.0\",\"pushJavaVersion\":\"0.1.0\","
        + "\"pushPythonVersion\":\"0.4.3\",\"sendBeatOnly\":false,"
        + "\"serverStatusSynchronizationPeriodMillis\":15000," + "\"serviceStatusSynchronizationPeriodMillis\":5000,"
        + "\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000,\"min\"" + ":1000}}", this.switchDomain.toString());
  }

  @Test
  public void testSetMasters() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    this.switchDomain.setMasters(stringList);

    // Assert
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":5000,\"defaultCacheMillis\":3000"
        + ",\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":10000,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":30000,\"distroThreshold"
        + "\":0.7,\"enableAuthentication\":false,\"enableStandalone"
        + "\":true,\"healthCheckEnabled\":true,\"healthCheckWhiteList"
        + "\":[],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000,"
        + "\"min\":500},\"incrementalList\":[],\"limitedUrlMap\":{"
        + "\"foo\":1},\"masters\":[\"foo\"],\"mysqlHealthParams\":{"
        + "\"factor\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00"
        + "---000-NACOS_SWITCH_DOMAIN-000---00-00\",\"overridde"
        + "nServerStatus\":\"UP\",\"pushCVersion\":\"1.0.12\",\"pushEnabled"
        + "\":true,\"pushGoVersion\":\"0.1.0\",\"pushJavaVersion\":\"0"
        + ".1.0\",\"pushPythonVersion\":\"0.4.3\",\"sendBeatOnly\""
        + ":false,\"serverStatusSynchronizationPeriodMillis\"" + ":15000,\"serviceStatusSynchronizationPeriodMillis\""
        + ":5000,\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000," + "\"min\":1000}}", this.switchDomain.toString());
  }

  @Test
  public void testSetMysqlHealthParams() {
    // Arrange and Act
    this.switchDomain.setMysqlHealthParams(new SwitchDomain.MysqlHealthParams());

    // Assert
    assertEquals("{\"adWeightMap\":{\"foo\":1},\"checkTimes\":3,\"checksum\""
        + ":\"\",\"clientBeatInterval\":3,\"defaultCacheMillis\":3000"
        + ",\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":3,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":3,\"distroThreshold\":0.7"
        + ",\"enableAuthentication\":true,\"enableStandalone\":true"
        + ",\"healthCheckEnabled\":true,\"healthCheckWhiteList\":"
        + "[\"foo\"],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000"
        + ",\"min\":500},\"incrementalList\":[\"foo\"],\"limitedUrlMap"
        + "\":{\"foo\":1},\"masters\":[\"foo\"],\"mysqlHealthParams\":"
        + "{\"factor\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00"
        + "---000-NACOS_SWITCH_DOMAIN-000---00-00\",\"overridde"
        + "nServerStatus\":\"0.1.0\",\"pushCVersion\":\"0.1.0\"," + "\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0\","
        + "\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0.1"
        + ".0\",\"sendBeatOnly\":false,\"serverStatusSynchronizat"
        + "ionPeriodMillis\":3,\"serviceStatusSynchronizationPe"
        + "riodMillis\":5000,\"tcpHealthParams\":{\"factor\":0.75," + "\"max\":5000,\"min\":1000}}",
        this.switchDomain.toString());
  }

  @Test
  public void testSetOverriddenServerStatus() {
    // Arrange and Act
    this.switchDomain.setOverriddenServerStatus("0.1.0");

    // Assert
    assertEquals("0.1.0", this.switchDomain.getOverriddenServerStatus());
  }

  @Test
  public void testSetPushCVersion() {
    // Arrange and Act
    this.switchDomain.setPushCVersion("0.1.0");

    // Assert
    assertEquals("0.1.0", this.switchDomain.getPushCVersion());
  }

  @Test
  public void testSetPushEnabled() {
    // Arrange and Act
    this.switchDomain.setPushEnabled(true);

    // Assert
    assertTrue(this.switchDomain.isPushEnabled());
  }

  @Test
  public void testSetPushGoVersion() {
    // Arrange and Act
    this.switchDomain.setPushGoVersion("0.1.0");

    // Assert
    assertEquals("0.1.0", this.switchDomain.getPushGoVersion());
  }

  @Test
  public void testSetPushJavaVersion() {
    // Arrange and Act
    this.switchDomain.setPushJavaVersion("0.1.0");

    // Assert
    assertEquals("0.1.0", this.switchDomain.getPushJavaVersion());
  }

  @Test
  public void testSetPushPythonVersion() {
    // Arrange and Act
    this.switchDomain.setPushPythonVersion("0.1.0");

    // Assert
    assertEquals("0.1.0", this.switchDomain.getPushPythonVersion());
  }

  @Test
  public void testSetSendBeatOnly() {
    // Arrange and Act
    this.switchDomain.setSendBeatOnly(true);

    // Assert
    assertTrue(this.switchDomain.isSendBeatOnly());
  }

  @Test
  public void testSetServerStatusSynchronizationPeriodMillis() {
    // Arrange and Act
    this.switchDomain.setServerStatusSynchronizationPeriodMillis(3L);

    // Assert
    assertEquals(3L, this.switchDomain.getServerStatusSynchronizationPeriodMillis());
  }

  @Test
  public void testSetServiceStatusSynchronizationPeriodMillis() {
    // Arrange and Act
    this.switchDomain.setServiceStatusSynchronizationPeriodMillis(3L);

    // Assert
    assertEquals(3L, this.switchDomain.getServiceStatusSynchronizationPeriodMillis());
  }

  @Test
  public void testSetTcpHealthParams() {
    // Arrange and Act
    this.switchDomain.setTcpHealthParams(new SwitchDomain.TcpHealthParams());

    // Assert
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":5000,\"defaultCacheMillis\":3000"
        + ",\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":10000,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":3,\"distroThreshold\":0.7"
        + ",\"enableAuthentication\":false,\"enableStandalone\""
        + ":true,\"healthCheckEnabled\":true,\"healthCheckWhiteList"
        + "\":[],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000,"
        + "\"min\":500},\"incrementalList\":[],\"limitedUrlMap\":{"
        + "\"foo\":1},\"masters\":[\"foo\"],\"mysqlHealthParams\":{"
        + "\"factor\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00"
        + "---000-NACOS_SWITCH_DOMAIN-000---00-00\",\"overridde"
        + "nServerStatus\":\"UP\",\"pushCVersion\":\"1.0.12\",\"pushEnabled"
        + "\":true,\"pushGoVersion\":\"0.1.0\",\"pushJavaVersion\":\"0"
        + ".1.0\",\"pushPythonVersion\":\"0.4.3\",\"sendBeatOnly\""
        + ":false,\"serverStatusSynchronizationPeriodMillis\"" + ":15000,\"serviceStatusSynchronizationPeriodMillis\""
        + ":5000,\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000," + "\"min\":1000}}", this.switchDomain.toString());
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
  public void testTcpHealthParamsSetMin() {
    // Arrange
    SwitchDomain.TcpHealthParams tcpHealthParams = new SwitchDomain.TcpHealthParams();

    // Act
    tcpHealthParams.setMin(1);

    // Assert
    assertEquals(1, tcpHealthParams.getMin());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":3,\"defaultCacheMillis\":3000,"
        + "\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":10000,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":3,\"distroThreshold\":0.7"
        + ",\"enableAuthentication\":false,\"enableStandalone\""
        + ":true,\"healthCheckEnabled\":true,\"healthCheckWhiteList"
        + "\":[],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000,"
        + "\"min\":500},\"incrementalList\":[],\"limitedUrlMap\":{"
        + "\"foo\":1},\"masters\":[\"foo\"],\"mysqlHealthParams\":{"
        + "\"factor\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00"
        + "---000-NACOS_SWITCH_DOMAIN-000---00-00\",\"overridde"
        + "nServerStatus\":\"0.1.0\",\"pushCVersion\":\"1.0.12\"," + "\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0\","
        + "\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0.4"
        + ".3\",\"sendBeatOnly\":false,\"serverStatusSynchronizat"
        + "ionPeriodMillis\":15000,\"serviceStatusSynchronizati"
        + "onPeriodMillis\":5000,\"tcpHealthParams\":{\"factor\":0" + ".75,\"max\":5000,\"min\":1000}}",
        this.switchDomain.toString());
    assertEquals("00-00---000-NACOS_SWITCH_DOMAIN-000---00-00", this.switchDomain.getName());
    float actualFactor = this.switchDomain.getMysqlHealthParams().getFactor();
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":3,\"defaultCacheMillis\":3000,"
        + "\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":10000,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":3,\"distroThreshold\":0.7"
        + ",\"enableAuthentication\":false,\"enableStandalone\""
        + ":true,\"healthCheckEnabled\":true,\"healthCheckWhiteList"
        + "\":[],\"httpHealthParams\":{\"factor\":0.85,\"max\":5000,"
        + "\"min\":500},\"incrementalList\":[],\"limitedUrlMap\":{"
        + "\"foo\":1},\"masters\":[\"foo\"],\"mysqlHealthParams\":{"
        + "\"factor\":0.65,\"max\":3000,\"min\":2000},\"name\":\"00-00"
        + "---000-NACOS_SWITCH_DOMAIN-000---00-00\",\"overridde"
        + "nServerStatus\":\"0.1.0\",\"pushCVersion\":\"1.0.12\"," + "\"pushEnabled\":true,\"pushGoVersion\":\"0.1.0\","
        + "\"pushJavaVersion\":\"0.1.0\",\"pushPythonVersion\":\"0.4"
        + ".3\",\"sendBeatOnly\":false,\"serverStatusSynchronizat"
        + "ionPeriodMillis\":15000,\"serviceStatusSynchronizati"
        + "onPeriodMillis\":5000,\"tcpHealthParams\":{\"factor\":0" + ".75,\"max\":5000,\"min\":1000}}",
        this.switchDomain.toString());
    assertEquals(0.65f, actualFactor, 0.0f);
  }
}

