package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class MysqlHealthCheckProcessorDiffblueTest {
  @Autowired
  private MysqlHealthCheckProcessor mysqlHealthCheckProcessor;
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("MYSQL", (new MysqlHealthCheckProcessor()).getType());
  }
  @Test
  public void testGetType() {
    // Arrange, Act and Assert
    assertEquals("MYSQL", this.mysqlHealthCheckProcessor.getType());
  }
}

