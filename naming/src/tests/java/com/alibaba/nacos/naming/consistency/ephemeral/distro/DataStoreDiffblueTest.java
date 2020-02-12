package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.naming.consistency.Datum;
import org.junit.Test;

public class DataStoreDiffblueTest {
  @Test(timeout=10000)
  public void removeTest() {
    // Arrange
    DataStore dataStore = new DataStore();

    // Act and Assert
    assertNull(dataStore.remove("foo"));
    assertEquals(0, dataStore.getInstanceCount());
  }

  @Test(timeout=10000)
  public void getInstanceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataStore()).getInstanceCount());
  }

  @Test(timeout=10000)
  public void getDataMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataStore()).getDataMap().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataStore()).getInstanceCount());
  }

  @Test(timeout=10000)
  public void keysTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataStore()).keys().size());
  }

  @Test(timeout=10000)
  public void putTest() {
    // Arrange
    DataStore dataStore = new DataStore();

    // Act
    dataStore.put("foo", new Datum());

    // Assert
    assertEquals(0, dataStore.getInstanceCount());
  }

  @Test(timeout=10000)
  public void getTest() {
    // Arrange, Act and Assert
    assertNull((new DataStore()).get("foo"));
  }

  @Test(timeout=10000)
  public void containsTest() {
    // Arrange, Act and Assert
    assertFalse((new DataStore()).contains("foo"));
  }
}

