package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class RaftStoreDiffblueTest {
  @Autowired
  private RaftStore raftStore;
  @Test
  public void testLoad() throws Exception {
    // Arrange, Act and Assert
    assertNull(this.raftStore.load(""));
  }
  @Test
  public void testLoadMeta() throws Exception {
    // Arrange, Act and Assert
    assertEquals(1, this.raftStore.loadMeta().size());
  }
  @Test
  public void testReadDatum() throws IOException {
    // Arrange
    File toFileResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    assertNull(this.raftStore.readDatum(toFileResult, "123"));
    assertEquals(1004757696512L, toFileResult.getAbsoluteFile().getTotalSpace());
  }
}

