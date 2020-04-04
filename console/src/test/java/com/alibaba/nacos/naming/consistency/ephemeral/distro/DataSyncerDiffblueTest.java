package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class DataSyncerDiffblueTest {
  @Autowired
  private DataSyncer dataSyncer;
  @Test
  public void testBuildKey() {
    // Arrange, Act and Assert
    assertEquals("key@@@@targetServer", this.dataSyncer.buildKey("key", "targetServer"));
  }
  @Test
  public void testGetServers() {
    // Arrange, Act and Assert
    assertEquals(0, this.dataSyncer.getServers().size());
  }
}

