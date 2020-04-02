package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class TcpSuperSenseProcessorDiffblueTest {
  @Autowired
  private TcpSuperSenseProcessor tcpSuperSenseProcessor;
  @Test
  public void testGetType() {
    // Arrange, Act and Assert
    assertEquals("TCP", this.tcpSuperSenseProcessor.getType());
  }
  @Test
  public void testPostProcessorConstructor() {
    // Arrange, Act and Assert
    assertNull((this.tcpSuperSenseProcessor.new PostProcessor(null)).key);
  }
}

