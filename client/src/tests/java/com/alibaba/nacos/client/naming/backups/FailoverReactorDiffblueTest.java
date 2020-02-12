package com.alibaba.nacos.client.naming.backups;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.naming.pojo.ServiceInfo;
import com.alibaba.nacos.client.naming.core.EventDispatcher;
import com.alibaba.nacos.client.naming.core.HostReactor;
import com.alibaba.nacos.client.naming.net.NamingProxy;
import org.junit.Test;

public class FailoverReactorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    EventDispatcher eventDispatcher = new EventDispatcher();

    // Act and Assert
    assertEquals(0L,
        ((new FailoverReactor(new HostReactor(eventDispatcher, new NamingProxy("123", "foo", "foo"), "foo"),
            "foo")).new SwitchRefresher()).lastModifiedMillis);
  }

  @Test(timeout=10000)
  public void getServiceTest() {
    // Arrange
    EventDispatcher eventDispatcher = new EventDispatcher();

    // Act
    ServiceInfo actualService = (new FailoverReactor(
        new HostReactor(eventDispatcher, new NamingProxy("123", "foo", "foo"), "foo"), "foo")).getService("123");

    // Assert
    String actualName = actualService.getName();
    boolean actualIsAllIPsResult = actualService.isAllIPs();
    long actualCacheMillis = actualService.getCacheMillis();
    String actualJsonFromServer = actualService.getJsonFromServer();
    long actualLastRefTime = actualService.getLastRefTime();
    boolean actualIsValidResult = actualService.isValid();
    assertEquals("", actualService.getChecksum());
    assertTrue(actualIsValidResult);
    assertEquals(0L, actualLastRefTime);
    assertEquals("", actualJsonFromServer);
    assertEquals(1000L, actualCacheMillis);
    assertFalse(actualIsAllIPsResult);
    assertEquals("123", actualName);
  }

  @Test(timeout=10000)
  public void isFailoverSwitchTest() {
    // Arrange
    EventDispatcher eventDispatcher = new EventDispatcher();

    // Act and Assert
    assertFalse(
        (new FailoverReactor(new HostReactor(eventDispatcher, new NamingProxy("123", "foo", "foo"), "foo"), "foo"))
            .isFailoverSwitch());
  }
}

