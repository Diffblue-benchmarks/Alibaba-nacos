package com.alibaba.nacos.core.auth;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResourceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void parseNameTest() {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    (new Resource("aaaaa")).parseName();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Resource("aaaaa")).getKey());
  }

  @Test
  public void toStringTest() {
    // Arrange
    Resource resource = new Resource("aaaaa");

    // Act and Assert
    assertEquals("{\"key\":\"aaaaa\"}", resource.toString());
    assertEquals("{\"key\":\"aaaaa\"}", resource.toString());
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Resource("aaaaa")).getKey());
  }
}

