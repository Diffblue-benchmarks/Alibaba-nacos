package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.naming.core.Cluster;
import com.alibaba.nacos.naming.core.Service;
import com.alibaba.nacos.naming.selector.Selector;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class ClientBeatCheckTaskDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Service service = new Service();

    // Act
    new ClientBeatCheckTask(service);

    // Assert
    String actualServiceString = service.getServiceString();
    String actualNamespaceId = service.getNamespaceId();
    String actualName = service.getName();
    String actualToStringResult = service.toString();
    Map<String, Cluster> clusterMap = service.getClusterMap();
    Boolean actualResetWeight = service.getResetWeight();
    List<String> owners = service.getOwners();
    Boolean actualEnabled = service.getEnabled();
    Selector selector = service.getSelector();
    String actualToJSONResult = service.toJSON();
    String actualToken = service.getToken();
    String actualGroupName = service.getGroupName();
    long actualLastModifiedMillis = service.getLastModifiedMillis();
    Map<String, String> metadata = service.getMetadata();
    String actualAppName = service.getAppName();
    float actualProtectThreshold = service.getProtectThreshold();
    long actualIpDeleteTimeout = service.getIpDeleteTimeout();
    String actualChecksum = service.getChecksum();
    assertEquals(String.join("", "{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[]," + "\"protectThreshold\":0.0,\"",
        System.getProperty("nacos.mode"), "s\":[]}"), actualServiceString);
    assertEquals("28db44891d718c6872a04bc11ec58ab0", actualChecksum);
    assertEquals(30000L, actualIpDeleteTimeout);
    assertEquals(0.0f, actualProtectThreshold, 0.0f);
    assertNull(actualAppName);
    assertTrue(metadata instanceof java.util.HashMap);
    assertEquals(0L, actualLastModifiedMillis);
    assertEquals(0, metadata.size());
    assertNull(actualGroupName);
    assertNull(actualToken);
    assertEquals(
        String.join("", "{\"checksum\":\"28db44891d718c6872a04bc11ec58ab0\",\"", System.getProperty("nacos.mode"),
            "Map\":{},\"enabled\":true,\"ipDeleteTimeout\":30000,"
                + "\"lastModifiedMillis\":0,\"metadata\":{},\"owners\":[],"
                + "\"protectThreshold\":0.0,\"resetWeight\":false,\"selector" + "\":{\"type\":\"none\"}}"),
        actualToJSONResult);
    assertTrue(selector instanceof com.alibaba.nacos.naming.selector.NoneSelector);
    assertTrue(actualEnabled);
    assertTrue(owners instanceof java.util.ArrayList);
    assertNull(actualNamespaceId);
    assertEquals(0, owners.size());
    assertFalse(actualResetWeight);
    assertTrue(clusterMap instanceof java.util.HashMap);
    assertEquals("Service{name='null', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        actualToStringResult);
    assertEquals(0, clusterMap.size());
    assertNull(actualName);
  }

  @Test
  public void testTaskKey() {
    // Arrange, Act and Assert
    assertNull((new ClientBeatCheckTask(new Service())).taskKey());
  }
}

