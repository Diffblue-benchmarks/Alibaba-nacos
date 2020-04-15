package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.naming.consistency.Datum;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class DataStoreDiffblueTest {
  @Autowired
  private DataStore dataStore;
  @Test
  public void testBatchGet() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertEquals(0, this.dataStore.batchGet(stringList).size());
  }
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataStore()).getInstanceCount());
  }
  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertFalse(this.dataStore.contains("key"));
  }
  @Test
  public void testGet() {
    // Arrange, Act and Assert
    assertNull(this.dataStore.get("key"));
  }
  @Test
  public void testGetInstanceCount() {
    // Arrange, Act and Assert
    assertEquals(0, this.dataStore.getInstanceCount());
  }
  @Test
  public void testKeys() {
    // Arrange, Act and Assert
    assertEquals(1, this.dataStore.keys().size());
  }
  @Test
  public void testPut() {
    // Arrange and Act
    this.dataStore.put("key", new Datum());

    // Assert
    assertEquals(0, this.dataStore.getInstanceCount());
  }
  @Test
  public void testRemove() {
    // Arrange, Act and Assert
    assertNull(this.dataStore.remove("key"));
    assertEquals(0, this.dataStore.getInstanceCount());
  }
}

