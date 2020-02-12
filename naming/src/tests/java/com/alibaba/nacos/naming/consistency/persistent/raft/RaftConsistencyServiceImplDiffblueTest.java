package com.alibaba.nacos.naming.consistency.persistent.raft;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.naming.consistency.Datum;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RaftConsistencyServiceImplDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void removeTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new RaftConsistencyServiceImpl()).remove("foo");
  }
  @Test(timeout=10000)
  public void onRemoveTest() throws NacosException {
    // Arrange
    RaftConsistencyServiceImpl raftConsistencyServiceImpl = new RaftConsistencyServiceImpl();
    Datum datum = new Datum();

    // Act and Assert
    thrown.expect(NacosException.class);
    raftConsistencyServiceImpl.onRemove(datum, new RaftPeer());
  }
  @Test(timeout=10000)
  public void onPutTest() throws NacosException {
    // Arrange
    RaftConsistencyServiceImpl raftConsistencyServiceImpl = new RaftConsistencyServiceImpl();
    Datum datum = new Datum();

    // Act and Assert
    thrown.expect(NacosException.class);
    raftConsistencyServiceImpl.onPut(datum, new RaftPeer());
  }
}

