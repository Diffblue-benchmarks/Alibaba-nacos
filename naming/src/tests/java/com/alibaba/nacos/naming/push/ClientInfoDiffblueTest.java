package com.alibaba.nacos.naming.push;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClientInfoDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(ClientInfo.ClientType.UNKNOWN, (new ClientInfo("foo")).type);
  }
}

