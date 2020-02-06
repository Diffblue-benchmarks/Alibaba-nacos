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
    (new Resource("foo")).parseName();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Resource("foo")).getKey());
  }

  @Test
  public void toStringTest() {
    // Arrange
    Resource resource = new Resource("foo");

    // Act and Assert
    assertEquals("{\"key\":\"foo\"}", resource.toString());
    assertEquals("{\"key\":\"foo\"}", resource.toString());
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Resource("foo")).getKey());
  }
}

