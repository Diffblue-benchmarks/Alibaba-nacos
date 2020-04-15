package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class SwitchManagerDiffblueTest {
  @Autowired
  private SwitchDomain switchDomain;
  @Autowired
  private SwitchManager switchManager;
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new SwitchManager()).getSwitchDomain());
  }
  @Test
  public void testInterests() {
    // Arrange, Act and Assert
    assertFalse(this.switchManager.interests(":"));
  }
  @Test
  public void testMatchUnlistenKey() {
    // Arrange, Act and Assert
    assertFalse(this.switchManager.matchUnlistenKey(":"));
  }
  @Test
  public void testOnChange() throws Exception {
    // Arrange and Act
    this.switchManager.onChange(":", this.switchDomain);

    // Assert
    assertFalse(this.switchDomain.isEnableAuthentication());
    assertTrue(this.switchDomain.isHealthCheckEnabled());
    assertTrue(this.switchDomain.isPushEnabled());
    assertEquals("UP", this.switchDomain.getOverriddenServerStatus());
    assertEquals("0.1.0", this.switchDomain.getPushGoVersion());
    assertEquals(5000L, this.switchDomain.getClientBeatInterval());
    assertTrue(this.switchDomain.isEnableStandalone());
    assertEquals(15000L, this.switchDomain.getServerStatusSynchronizationPeriodMillis());
    assertEquals("1.0.12", this.switchDomain.getPushCVersion());
    assertTrue(this.switchDomain.isDistroEnabled());
    assertFalse(this.switchDomain.isDisableAddIP());
    assertEquals(3, this.switchDomain.getCheckTimes());
    assertEquals("0.1.0", this.switchDomain.getPushJavaVersion());
    assertEquals(0.7f, this.switchDomain.getDistroThreshold(), 0.0f);
    assertEquals(3000L, this.switchDomain.getDefaultCacheMillis());
    assertEquals(5000L, this.switchDomain.getServiceStatusSynchronizationPeriodMillis());
    assertTrue(this.switchDomain.isDefaultInstanceEphemeral());
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":5000,\"defaultCacheMillis\":3000"
        + ",\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":10000,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":30000,\"distroThreshold"
        + "\":0.7,\"enableAuthentication\":false,\"enableStandalone"
        + "\":true,\"healthCheckEnabled\":true,\"healthCheckWhiteList"
        + "\":[\"foo\"],\"httpHealthParams\":{\"factor\":0.85,\"max\""
        + ":5000,\"min\":500},\"incrementalList\":[],\"limitedUrlMap"
        + "\":{},\"masters\":[],\"mysqlHealthParams\":{\"factor\":0"
        + ".65,\"max\":3000,\"min\":2000},\"name\":\"00-00---000-NACOS"
        + "_SWITCH_DOMAIN-000---00-00\",\"overriddenServerStatus"
        + "\":\"UP\",\"pushCVersion\":\"1.0.12\",\"pushEnabled\":true,"
        + "\"pushGoVersion\":\"0.1.0\",\"pushJavaVersion\":\"0.1.0\","
        + "\"pushPythonVersion\":\"0.4.3\",\"sendBeatOnly\":false,"
        + "\"serverStatusSynchronizationPeriodMillis\":15000," + "\"serviceStatusSynchronizationPeriodMillis\":5000,"
        + "\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000,\"min\"" + ":1000}}", this.switchDomain.toString());
    assertEquals(10000L, this.switchDomain.getDefaultPushCacheMillis());
    assertEquals("0.4.3", this.switchDomain.getPushPythonVersion());
    assertFalse(this.switchDomain.isSendBeatOnly());
    assertEquals(30000L, this.switchDomain.getDistroServerExpiredMillis());
  }
  @Test
  public void testUpdate() throws Exception {
    // Arrange and Act
    this.switchManager.update(":", "value", true);

    // Assert
    SwitchDomain switchDomain = this.switchManager.getSwitchDomain();
    assertTrue(switchDomain.isHealthCheckEnabled());
    assertTrue(switchDomain.isPushEnabled());
    assertEquals("UP", switchDomain.getOverriddenServerStatus());
    assertEquals("0.1.0", switchDomain.getPushGoVersion());
    assertEquals(5000L, switchDomain.getClientBeatInterval());
    assertFalse(switchDomain.isEnableAuthentication());
    assertEquals(5000L, switchDomain.getServiceStatusSynchronizationPeriodMillis());
    assertEquals(30000L, switchDomain.getDistroServerExpiredMillis());
    assertEquals("1.0.12", switchDomain.getPushCVersion());
    assertTrue(switchDomain.isDistroEnabled());
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":5000,\"defaultCacheMillis\":3000"
        + ",\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":10000,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":30000,\"distroThreshold"
        + "\":0.7,\"enableAuthentication\":false,\"enableStandalone"
        + "\":true,\"healthCheckEnabled\":true,\"healthCheckWhiteList"
        + "\":[\"foo\"],\"httpHealthParams\":{\"factor\":0.85,\"max\""
        + ":5000,\"min\":500},\"incrementalList\":[],\"limitedUrlMap"
        + "\":{},\"masters\":[],\"mysqlHealthParams\":{\"factor\":0"
        + ".65,\"max\":3000,\"min\":2000},\"name\":\"00-00---000-NACOS"
        + "_SWITCH_DOMAIN-000---00-00\",\"overriddenServerStatus"
        + "\":\"UP\",\"pushCVersion\":\"1.0.12\",\"pushEnabled\":true,"
        + "\"pushGoVersion\":\"0.1.0\",\"pushJavaVersion\":\"0.1.0\","
        + "\"pushPythonVersion\":\"0.4.3\",\"sendBeatOnly\":false,"
        + "\"serverStatusSynchronizationPeriodMillis\":15000," + "\"serviceStatusSynchronizationPeriodMillis\":5000,"
        + "\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000,\"min\"" + ":1000}}", switchDomain.toString());
    assertEquals(15000L, switchDomain.getServerStatusSynchronizationPeriodMillis());
    assertEquals(3, switchDomain.getCheckTimes());
    assertTrue(switchDomain.isEnableStandalone());
    assertFalse(switchDomain.isDisableAddIP());
    assertEquals(10000L, switchDomain.getDefaultPushCacheMillis());
    assertFalse(switchDomain.isSendBeatOnly());
    assertEquals("0.4.3", switchDomain.getPushPythonVersion());
    assertEquals(3000L, switchDomain.getDefaultCacheMillis());
    assertEquals(0.7f, switchDomain.getDistroThreshold(), 0.0f);
    assertEquals("0.1.0", switchDomain.getPushJavaVersion());
    assertTrue(switchDomain.isDefaultInstanceEphemeral());
  }
  @Test
  public void testUpdate2() {
    // Arrange and Act
    this.switchManager.update(this.switchDomain);

    // Assert
    assertFalse(this.switchDomain.isEnableAuthentication());
    assertTrue(this.switchDomain.isHealthCheckEnabled());
    assertTrue(this.switchDomain.isPushEnabled());
    assertEquals("UP", this.switchDomain.getOverriddenServerStatus());
    assertEquals("0.1.0", this.switchDomain.getPushGoVersion());
    assertEquals(5000L, this.switchDomain.getClientBeatInterval());
    assertTrue(this.switchDomain.isEnableStandalone());
    assertEquals(15000L, this.switchDomain.getServerStatusSynchronizationPeriodMillis());
    assertEquals("1.0.12", this.switchDomain.getPushCVersion());
    assertTrue(this.switchDomain.isDistroEnabled());
    assertFalse(this.switchDomain.isDisableAddIP());
    assertEquals(3, this.switchDomain.getCheckTimes());
    assertEquals("0.1.0", this.switchDomain.getPushJavaVersion());
    assertEquals(0.7f, this.switchDomain.getDistroThreshold(), 0.0f);
    assertEquals(3000L, this.switchDomain.getDefaultCacheMillis());
    assertEquals(5000L, this.switchDomain.getServiceStatusSynchronizationPeriodMillis());
    assertTrue(this.switchDomain.isDefaultInstanceEphemeral());
    assertEquals("{\"adWeightMap\":{},\"checkTimes\":3,\"checksum\":\"\","
        + "\"clientBeatInterval\":5000,\"defaultCacheMillis\":3000"
        + ",\"defaultInstanceEphemeral\":true,\"defaultPushCacheMillis"
        + "\":10000,\"disableAddIP\":false,\"distroEnabled\":true,"
        + "\"distroServerExpiredMillis\":30000,\"distroThreshold"
        + "\":0.7,\"enableAuthentication\":false,\"enableStandalone"
        + "\":true,\"healthCheckEnabled\":true,\"healthCheckWhiteList"
        + "\":[\"foo\"],\"httpHealthParams\":{\"factor\":0.85,\"max\""
        + ":5000,\"min\":500},\"incrementalList\":[],\"limitedUrlMap"
        + "\":{},\"masters\":[],\"mysqlHealthParams\":{\"factor\":0"
        + ".65,\"max\":3000,\"min\":2000},\"name\":\"00-00---000-NACOS"
        + "_SWITCH_DOMAIN-000---00-00\",\"overriddenServerStatus"
        + "\":\"UP\",\"pushCVersion\":\"1.0.12\",\"pushEnabled\":true,"
        + "\"pushGoVersion\":\"0.1.0\",\"pushJavaVersion\":\"0.1.0\","
        + "\"pushPythonVersion\":\"0.4.3\",\"sendBeatOnly\":false,"
        + "\"serverStatusSynchronizationPeriodMillis\":15000," + "\"serviceStatusSynchronizationPeriodMillis\":5000,"
        + "\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000,\"min\"" + ":1000}}", this.switchDomain.toString());
    assertEquals(10000L, this.switchDomain.getDefaultPushCacheMillis());
    assertEquals("0.4.3", this.switchDomain.getPushPythonVersion());
    assertFalse(this.switchDomain.isSendBeatOnly());
    assertEquals(30000L, this.switchDomain.getDistroServerExpiredMillis());
  }
}

