package com.alibaba.nacos.client.config.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.client.config.impl.ServerListManager;
import java.io.IOException;
import java.util.NoSuchElementException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServerHttpAgentDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void getEncodeTest() {
    // Arrange, Act and Assert
    assertNull((new ServerHttpAgent(new ServerListManager())).getEncode());
  }
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ServerHttpAgent(new ServerListManager())).getNamespace());
  }
  @Test(timeout=10000)
  public void startTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new ServerHttpAgent(new ServerListManager())).start();
  }
  @Test(timeout=10000)
  public void getAppnameTest() {
    // Arrange, Act and Assert
    assertEquals("unknown", ServerHttpAgent.getAppname());
  }
  @Test(timeout=10000)
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ServerHttpAgent(new ServerListManager())).getTenant());
  }
  @Test(timeout=10000)
  public void httpPostTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NoSuchElementException.class);
    (new ServerHttpAgent(new ServerListManager())).httpPost("foo", null, null, "foo", 1L);
  }
  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("default", (new ServerHttpAgent(new ServerListManager())).getName());
  }
  @Test(timeout=10000)
  public void httpDeleteTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NoSuchElementException.class);
    (new ServerHttpAgent(new ServerListManager())).httpDelete("foo", null, null, "foo", 1L);
  }
  @Test(timeout=10000)
  public void getNamespaceTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ServerHttpAgent(new ServerListManager())).getNamespace());
  }
  @Test(timeout=10000)
  public void httpGetTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(NoSuchElementException.class);
    (new ServerHttpAgent(new ServerListManager())).httpGet("foo", null, null, "foo", 1L);
  }
}

