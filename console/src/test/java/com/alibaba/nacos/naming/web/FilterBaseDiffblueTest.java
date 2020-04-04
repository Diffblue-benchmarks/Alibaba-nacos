package com.alibaba.nacos.naming.web;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class FilterBaseDiffblueTest {
  @Autowired
  private FilterBase filterBase;
  @Test
  public void testGetMethod() {
    // Arrange, Act and Assert
    assertNull(this.filterBase.getMethod("httpMethod", "path"));
  }
}

