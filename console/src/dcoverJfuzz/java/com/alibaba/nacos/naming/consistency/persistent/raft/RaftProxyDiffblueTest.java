package com.alibaba.nacos.naming.consistency.persistent.raft;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.http.HttpMethod;

public class RaftProxyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void proxyGETTest2() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new RaftProxy()).proxyGET(":", "foo", null);
  }
  @Test(timeout=10000)
  public void proxyGETTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new RaftProxy()).proxyGET("foo", "foo", null);
  }
  @Test(timeout=10000)
  public void proxyPostLargeTest2() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new RaftProxy()).proxyPostLarge(":", "foo", "foo", null);
  }
  @Test(timeout=10000)
  public void proxyPostLargeTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new RaftProxy()).proxyPostLarge("foo", "foo", "foo", null);
  }
  @Test(timeout=10000)
  public void proxyTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new RaftProxy()).proxy("foo", "foo", null, HttpMethod.GET);
  }
}

