package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.naming.consistency.Datum;
import org.junit.Test;

public class DataStoreDiffblueTest {
  @Test
  public void removeTest() {
    // Arrange
    DataStore dataStore = new DataStore();

    // Act and Assert
    assertNull(dataStore.remove("foo"));
    assertEquals(0, dataStore.getInstanceCount());
  }

  @Test
  public void getInstanceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataStore()).getInstanceCount());
  }

  @Test
  public void getDataMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataStore()).getDataMap().size());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataStore()).getInstanceCount());
  }

  @Test
  public void keysTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DataStore()).keys().size());
  }

  @Test
  public void putTest() {
    // Arrange
    DataStore dataStore = new DataStore();

    // Act
    dataStore.put("foo", new Datum());

    // Assert
    assertEquals(0, dataStore.getInstanceCount());
  }

  @Test
  public void getTest() {
    // Arrange, Act and Assert
    assertNull((new DataStore()).get("foo"));
  }

  @Test
  public void containsTest() {
    // Arrange, Act and Assert
    assertFalse((new DataStore()).contains("foo"));
  }
}

