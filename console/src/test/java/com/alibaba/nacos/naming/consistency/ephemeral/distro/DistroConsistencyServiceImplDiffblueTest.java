package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.naming.consistency.ApplyAction;
import com.alibaba.nacos.naming.core.Service;
import com.alibaba.nacos.naming.misc.SwitchDomain;
import com.alibaba.nacos.naming.pojo.Record;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class DistroConsistencyServiceImplDiffblueTest {
  @Autowired
  private Record record;
  @Autowired
  private DistroConsistencyServiceImpl distroConsistencyServiceImpl;
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(0, (new DistroConsistencyServiceImpl()).notifier.getTaskSize());
  }
  @Test
  public void testGet() throws NacosException {
    // Arrange, Act and Assert
    assertNull(this.distroConsistencyServiceImpl.get("1"));
  }
  @Test
  public void testIsAvailable() {
    // Arrange, Act and Assert
    assertTrue(this.distroConsistencyServiceImpl.isAvailable());
  }
  @Test
  public void testIsInitialized() {
    // Arrange, Act and Assert
    assertTrue(this.distroConsistencyServiceImpl.isInitialized());
  }
  @Test
  public void testNotifierAddTask() {
    // Arrange
    DistroConsistencyServiceImpl.Notifier notifier = this.distroConsistencyServiceImpl.new Notifier();

    // Act
    notifier.addTask("datumKey", ApplyAction.CHANGE);

    // Assert
    assertEquals(1, notifier.getTaskSize());
  }
  @Test
  public void testNotifierConstructor() {
    // Arrange, Act and Assert
    assertEquals(0, (this.distroConsistencyServiceImpl.new Notifier()).getTaskSize());
  }
  @Test
  public void testNotifierGetTaskSize() {
    // Arrange, Act and Assert
    assertEquals(0, (this.distroConsistencyServiceImpl.new Notifier()).getTaskSize());
  }
  @Test
  public void testOnPut() {
    // Arrange and Act
    this.distroConsistencyServiceImpl.onPut("1", this.record);

    // Assert
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
        + "\"tcpHealthParams\":{\"factor\":0.75,\"max\":5000,\"min\"" + ":1000}}",
        ((SwitchDomain) this.record).toString());
  }
  @Test
  public void testPut() throws NacosException {
    // Arrange and Act
    this.distroConsistencyServiceImpl.put("1", this.record);

    // Assert
    assertEquals(0, this.distroConsistencyServiceImpl.notifier.getTaskSize());
  }
  @Test
  public void testUnlisten() throws NacosException {
    // Arrange
    Service service = new Service();

    // Act
    this.distroConsistencyServiceImpl.unlisten("1", service);

    // Assert
    String actualToJSONResult = service.toJSON();
    assertEquals(
        String.join("", "{\"appName\":\"\",\"checksum\":\"67f2702595ef2a1a004315caf64b1935" + "\",\"",
            System.getProperty("nacos.mode"),
            "Map\":{},\"enabled\":true,\"groupName\":\"\",\"ipDeleteTimeout"
                + "\":30000,\"lastModifiedMillis\":0,\"metadata\":{},\"name"
                + "\":\"\",\"namespaceId\":\"\",\"owners\":[],\"protectThreshold"
                + "\":0,\"resetWeight\":false,\"selector\":{\"type\":\"none\"}" + ",\"token\":\"\"}"),
        actualToJSONResult);
  }
}

