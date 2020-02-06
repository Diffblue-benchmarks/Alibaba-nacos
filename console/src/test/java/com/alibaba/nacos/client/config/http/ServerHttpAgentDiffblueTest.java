package com.alibaba.nacos.client.config.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.client.config.impl.ServerListManager;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServerHttpAgentDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getEncodeTest() {
    // Arrange, Act and Assert
    assertNull((new ServerHttpAgent(new ServerListManager())).getEncode());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ServerHttpAgent(new ServerListManager())).getNamespace());
  }

  @Test
  public void startTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new ServerHttpAgent(new ServerListManager())).start();
  }

  @Test
  public void getAppnameTest() {
    // Arrange, Act and Assert
    assertEquals("unknown", ServerHttpAgent.getAppname());
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ServerHttpAgent(new ServerListManager())).getTenant());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("default", (new ServerHttpAgent(new ServerListManager())).getName());
  }

  @Test
  public void getNamespaceTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ServerHttpAgent(new ServerListManager())).getNamespace());
  }
}

