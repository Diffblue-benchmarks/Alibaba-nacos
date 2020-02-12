package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.alibaba.nacos.naming.cluster.servers.Server;
import com.alibaba.nacos.naming.consistency.ApplyAction;
import org.junit.Test;

public class DistroConsistencyServiceImplDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals(0, ((new DistroConsistencyServiceImpl()).new Notifier()).getTaskSize());
  }

  @Test(timeout=10000)
  public void addTaskTest() {
    // Arrange
    DistroConsistencyServiceImpl.Notifier notifier = (new DistroConsistencyServiceImpl()).new Notifier();

    // Act
    notifier.addTask("foo", ApplyAction.CHANGE);

    // Assert
    assertEquals(1, notifier.getTaskSize());
  }

  @Test(timeout=10000)
  public void getTaskSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, ((new DistroConsistencyServiceImpl()).new Notifier()).getTaskSize());
  }

  @Test(timeout=10000)
  public void syncAllDataFromRemoteTest() {
    // Arrange
    DistroConsistencyServiceImpl distroConsistencyServiceImpl = new DistroConsistencyServiceImpl();
    Server server = new Server();

    // Act and Assert
    assertFalse(distroConsistencyServiceImpl.syncAllDataFromRemote(server));
    assertEquals("{\"adWeight\":0,\"alive\":false,\"key\":\"null:0\","
        + "\"lastRefTime\":0,\"servePort\":0,\"site\":\"unknown" + "\",\"weight\":1}", server.toString());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DistroConsistencyServiceImpl()).notifier.getTaskSize());
  }
}

