package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.naming.consistency.ApplyAction;
import com.alibaba.nacos.naming.pojo.Record;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class DistroConsistencyServiceImplDiffblueTest {
  @Autowired
  private Record record;
  @Autowired
  private DistroConsistencyServiceImpl distroConsistencyServiceImpl;
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(0, (new DistroConsistencyServiceImpl()).notifier.getTaskSize());
  }
  @Test
  public void testGet() throws NacosException {
    // Arrange, Act and Assert
    assertNull(this.distroConsistencyServiceImpl.get("1"));
  }
  @Test
  public void testIsAvailable() {
    // Arrange, Act and Assert
    assertTrue(this.distroConsistencyServiceImpl.isAvailable());
  }
  @Test
  public void testIsInitialized() {
    // Arrange, Act and Assert
    assertTrue(this.distroConsistencyServiceImpl.isInitialized());
  }
  @Test
  public void testNotifierAddTask() {
    // Arrange
    DistroConsistencyServiceImpl.Notifier notifier = this.distroConsistencyServiceImpl.new Notifier();

    // Act
    notifier.addTask("datumKey", ApplyAction.CHANGE);

    // Assert
    assertEquals(1, notifier.getTaskSize());
  }
  @Test
  public void testNotifierConstructor() {
    // Arrange, Act and Assert
    assertEquals(0, (this.distroConsistencyServiceImpl.new Notifier()).getTaskSize());
  }
  @Test
  public void testNotifierGetTaskSize() {
    // Arrange, Act and Assert
    assertEquals(0, (this.distroConsistencyServiceImpl.new Notifier()).getTaskSize());
  }
  @Test
  public void testPut() throws NacosException {
    // Arrange and Act
    this.distroConsistencyServiceImpl.put("1", this.record);

    // Assert
    assertEquals(0, this.distroConsistencyServiceImpl.notifier.getTaskSize());
  }
}

