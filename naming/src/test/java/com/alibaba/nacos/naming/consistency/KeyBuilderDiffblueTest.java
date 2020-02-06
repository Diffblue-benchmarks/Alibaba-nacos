package com.alibaba.nacos.naming.consistency;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class KeyBuilderDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void matchEphemeralKeyTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchEphemeralKey(""));
  }

  @Test
  public void matchServiceMetaKeyTest2() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchServiceMetaKey("", "", ""));
  }

  @Test
  public void detailInstanceListkeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.", KeyBuilder.detailInstanceListkey(""));
  }

  @Test
  public void matchPersistentKeyTest() {
    // Arrange, Act and Assert
    assertTrue(KeyBuilder.matchPersistentKey(""));
  }

  @Test
  public void buildInstanceListKeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.iplist.ephemeral.##", KeyBuilder.buildInstanceListKey("", "", true));
  }

  @Test
  public void matchServiceNameTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchServiceName("", "", ""));
  }

  @Test
  public void matchEphemeralInstanceListKeyTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchEphemeralInstanceListKey(""));
  }

  @Test
  public void matchInstanceListKeyTest2() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchInstanceListKey(""));
  }

  @Test
  public void getSwitchDomainKeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.meta.00-00---000" + "-NACOS_SWITCH_DOMAIN-000---00-00",
        KeyBuilder.getSwitchDomainKey());
  }

  @Test
  public void briefInstanceListkeyTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    KeyBuilder.briefInstanceListkey("");
  }

  @Test
  public void matchServiceMetaKeyTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchServiceMetaKey(""));
  }

  @Test
  public void getNamespaceTest() {
    // Arrange, Act and Assert
    assertEquals("", KeyBuilder.getNamespace(""));
  }

  @Test
  public void briefServiceMetaKeyTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    KeyBuilder.briefServiceMetaKey("");
  }

  @Test
  public void matchInstanceListKeyTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchInstanceListKey("", "", ""));
  }

  @Test
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    KeyBuilder.getServiceName("");
  }

  @Test
  public void detailServiceMetaKeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.", KeyBuilder.detailServiceMetaKey(""));
  }

  @Test
  public void buildServiceMetaKeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.meta.##", KeyBuilder.buildServiceMetaKey("", ""));
  }

  @Test
  public void matchSwitchKeyTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchSwitchKey(""));
  }
}

