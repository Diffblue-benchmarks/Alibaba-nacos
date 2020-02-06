package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.net.MalformedURLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NotifyServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange and Act
    NotifyService.HttpResult actualHttpResult = new NotifyService.HttpResult(1, "aaaaa");

    // Assert
    assertEquals(1, actualHttpResult.code);
    assertEquals("aaaaa", actualHttpResult.content);
  }
  @Test
  public void invokeURLTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(MalformedURLException.class);
    NotifyService.invokeURL("Content-Type", null, "Content-Type");
  }
}

