package com.alibaba.nacos.naming.consistency;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class KeyBuilderDiffblueTest {
  @Test
  public void testBriefInstanceListkey() {
    // Arrange, Act and Assert
    assertEquals("iplist.ephemeral.", KeyBuilder.briefInstanceListkey("com.alibaba.nacos.naming.iplist.ephemeral."));
  }

  @Test
  public void testBuildInstanceListKey() {
    // Arrange
    String actualBuildInstanceListKeyResult = KeyBuilder.buildInstanceListKey("", "", true);

    // Act and Assert
    assertEquals("com.alibaba.nacos.naming.iplist.ephemeral.##", actualBuildInstanceListKeyResult);
    assertEquals("com.alibaba.nacos.naming.iplist.##", KeyBuilder.buildInstanceListKey("", "", false));
  }

  @Test
  public void testBuildServiceMetaKey() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.meta.##", KeyBuilder.buildServiceMetaKey("", ""));
  }

  @Test
  public void testDetailInstanceListkey() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.", KeyBuilder.detailInstanceListkey(""));
  }

  @Test
  public void testDetailServiceMetaKey() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.", KeyBuilder.detailServiceMetaKey(""));
  }

  @Test
  public void testGetNamespace() {
    // Arrange
    String actualNamespace = KeyBuilder.getNamespace("");
    String actualNamespace1 = KeyBuilder.getNamespace("00-00---000-NACOS_SWITCH_DOMAIN-000---00-00");
    String actualNamespace2 = KeyBuilder.getNamespace("com.alibaba.nacos.naming.domains.meta.");
    String actualNamespace3 = KeyBuilder.getNamespace("com.alibaba.nacos.naming.iplist.ephemeral.");

    // Act and Assert
    assertEquals("", actualNamespace);
    assertEquals("", actualNamespace1);
    assertEquals("", actualNamespace2);
    assertEquals("", actualNamespace3);
    assertEquals("", KeyBuilder.getNamespace("com.alibaba.nacos.naming.iplist."));
  }

  @Test
  public void testGetSwitchDomainKey() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.meta.00-00---000" + "-NACOS_SWITCH_DOMAIN-000---00-00",
        KeyBuilder.getSwitchDomainKey());
  }

  @Test
  public void testMatchEphemeralInstanceListKey() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchEphemeralInstanceListKey(""));
  }

  @Test
  public void testMatchEphemeralKey() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchEphemeralKey(""));
  }

  @Test
  public void testMatchInstanceListKey() {
    // Arrange
    boolean actualMatchInstanceListKeyResult = KeyBuilder.matchInstanceListKey("", "", "");
    boolean actualMatchInstanceListKeyResult1 = KeyBuilder.matchInstanceListKey("com.alibaba.nacos.naming.iplist.", "",
        "");

    // Act and Assert
    assertFalse(actualMatchInstanceListKeyResult);
    assertFalse(actualMatchInstanceListKeyResult1);
    assertFalse(KeyBuilder.matchInstanceListKey("iplist.", "", ""));
  }

  @Test
  public void testMatchInstanceListKey2() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchInstanceListKey(""));
  }

  @Test
  public void testMatchPersistentKey() {
    // Arrange
    boolean actualMatchPersistentKeyResult = KeyBuilder.matchPersistentKey("");

    // Act and Assert
    assertTrue(actualMatchPersistentKeyResult);
    assertFalse(KeyBuilder.matchPersistentKey("com.alibaba.nacos.naming.iplist.ephemeral."));
  }

  @Test
  public void testMatchServiceMetaKey() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchServiceMetaKey(""));
  }

  @Test
  public void testMatchServiceMetaKey2() {
    // Arrange
    boolean actualMatchServiceMetaKeyResult = KeyBuilder.matchServiceMetaKey("", "", "");

    // Act and Assert
    assertFalse(actualMatchServiceMetaKeyResult);
    assertFalse(KeyBuilder.matchServiceMetaKey("com.alibaba.nacos.naming.domains.meta.", "", ""));
  }

  @Test
  public void testMatchServiceName() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchServiceName("", "", ""));
  }

  @Test
  public void testMatchSwitchKey() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchSwitchKey(""));
  }
}

