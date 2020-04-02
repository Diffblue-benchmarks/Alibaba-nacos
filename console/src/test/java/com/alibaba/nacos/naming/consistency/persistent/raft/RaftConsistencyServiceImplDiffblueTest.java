package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.exception.NacosException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class RaftConsistencyServiceImplDiffblueTest {
  @Autowired
  private RaftConsistencyServiceImpl raftConsistencyServiceImpl;
  @Test
  public void testGet() throws NacosException {
    // Arrange, Act and Assert
    assertNull(this.raftConsistencyServiceImpl.get("key"));
  }
  @Test
  public void testIsAvailable() {
    // Arrange, Act and Assert
    assertTrue(this.raftConsistencyServiceImpl.isAvailable());
  }
}

