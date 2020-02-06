package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.api.exception.NacosException;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UtilsAndCommonsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void parseMetadataTest2() throws NacosException {
    // Arrange
    Map<String, String> parseMetadataResult = UtilsAndCommons.parseMetadata(",");

    // Act
    Map<String, String> actualParseMetadataResult = UtilsAndCommons.parseMetadata("");

    // Assert
    assertEquals(0, parseMetadataResult.size());
    assertEquals(0, actualParseMetadataResult.size());
  }

  @Test
  public void parseMetadataTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    UtilsAndCommons.parseMetadata("foo");
  }

  @Test
  public void shakeUpTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    UtilsAndCommons.shakeUp("foo", -1);
  }

  @Test
  public void shakeUpTest() {
    // Arrange, Act and Assert
    assertEquals(0, UtilsAndCommons.shakeUp("foo", 1));
  }

  @Test
  public void assembleFullServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("123##name", UtilsAndCommons.assembleFullServiceName("123", "name"));
  }

  @Test
  public void getSwitchDomainKeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.meta.00-00---000" + "-NACOS_SWITCH_DOMAIN-000---00-00",
        UtilsAndCommons.getSwitchDomainKey());
  }
}

