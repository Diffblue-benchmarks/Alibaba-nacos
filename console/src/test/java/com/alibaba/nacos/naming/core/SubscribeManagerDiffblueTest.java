package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class SubscribeManagerDiffblueTest {
  @Autowired
  private SubscribeManager subscribeManager;
  @Test
  public void testGetSubscribers() throws InterruptedException {
    // Arrange, Act and Assert
    assertNull(this.subscribeManager.getSubscribers("/service/subscribers", "/service/subscribers", true));
  }
}

