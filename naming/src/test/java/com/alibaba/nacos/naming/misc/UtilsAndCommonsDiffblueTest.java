package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.api.exception.NacosException;
import org.junit.Test;

public class UtilsAndCommonsDiffblueTest {
  @Test
  public void parseMetadataTest() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, UtilsAndCommons.parseMetadata(",").size());
  }

  @Test
  public void shakeUpTest() {
    // Arrange, Act and Assert
    assertEquals(0, UtilsAndCommons.shakeUp(",", 1));
  }

  @Test
  public void assembleFullServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals(",##,", UtilsAndCommons.assembleFullServiceName(",", ","));
  }

  @Test
  public void getSwitchDomainKeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.meta.00-00---000" + "-NACOS_SWITCH_DOMAIN-000---00-00",
        UtilsAndCommons.getSwitchDomainKey());
  }
}

