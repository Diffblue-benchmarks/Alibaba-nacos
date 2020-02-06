package com.alibaba.nacos.client.config.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ContentUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void verifyIncrementPubContentTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ContentUtils.verifyIncrementPubContent("");
  }
  @Test
  public void truncateContentTest() {
    // Arrange, Act and Assert
    assertEquals("foo", ContentUtils.truncateContent("foo"));
  }
  @Test
  public void getContentIdentityTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ContentUtils.getContentIdentity("foo");
  }
  @Test
  public void getContentTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ContentUtils.getContent("foo");
  }
}

