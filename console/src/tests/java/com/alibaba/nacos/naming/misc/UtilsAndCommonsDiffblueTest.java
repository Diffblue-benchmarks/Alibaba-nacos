package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.naming.exception.NacosException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UtilsAndCommonsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void parseMetadataTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    UtilsAndCommons.parseMetadata("foo");
  }

  @Test(timeout=10000)
  public void shakeUpTest() {
    // Arrange, Act and Assert
    assertEquals(0, UtilsAndCommons.shakeUp("foo", 1));
  }

  @Test(timeout=10000)
  public void getAllExceptionMsgTest() {
    // Arrange, Act and Assert
    assertEquals("", UtilsAndCommons.getAllExceptionMsg(null));
  }

  @Test(timeout=10000)
  public void assembleFullServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("123##name", UtilsAndCommons.assembleFullServiceName("123", "name"));
  }

  @Test(timeout=10000)
  public void getSwitchDomainKeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.meta.00-00---000" + "-NACOS_SWITCH_DOMAIN-000---00-00",
        UtilsAndCommons.getSwitchDomainKey());
  }
}

