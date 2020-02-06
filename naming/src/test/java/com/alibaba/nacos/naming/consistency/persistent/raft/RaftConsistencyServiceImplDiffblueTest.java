package com.alibaba.nacos.naming.consistency.persistent.raft;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.naming.consistency.Datum;
import com.alibaba.nacos.naming.core.Instances;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RaftConsistencyServiceImplDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void removeTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new RaftConsistencyServiceImpl()).remove("foo");
  }
  @Test
  public void onRemoveTest() throws NacosException {
    // Arrange
    RaftConsistencyServiceImpl raftConsistencyServiceImpl = new RaftConsistencyServiceImpl();
    Datum datum = new Datum();

    // Act and Assert
    thrown.expect(NacosException.class);
    raftConsistencyServiceImpl.onRemove(datum, new RaftPeer());
  }
  @Test
  public void onPutTest() throws NacosException {
    // Arrange
    RaftConsistencyServiceImpl raftConsistencyServiceImpl = new RaftConsistencyServiceImpl();
    Datum datum = new Datum();

    // Act and Assert
    thrown.expect(NacosException.class);
    raftConsistencyServiceImpl.onPut(datum, new RaftPeer());
  }
  @Test
  public void putTest() throws NacosException {
    // Arrange
    RaftConsistencyServiceImpl raftConsistencyServiceImpl = new RaftConsistencyServiceImpl();

    // Act and Assert
    thrown.expect(NacosException.class);
    raftConsistencyServiceImpl.put("foo", new Instances());
  }
}

