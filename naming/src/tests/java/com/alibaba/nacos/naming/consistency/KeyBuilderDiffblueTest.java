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

  @Test(timeout=10000)
  public void matchEphemeralKeyTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchEphemeralKey("foo"));
  }

  @Test(timeout=10000)
  public void matchServiceMetaKeyTest2() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchServiceMetaKey("foo", "123", "name"));
  }

  @Test(timeout=10000)
  public void detailInstanceListkeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.foo", KeyBuilder.detailInstanceListkey("foo"));
  }

  @Test(timeout=10000)
  public void matchPersistentKeyTest() {
    // Arrange, Act and Assert
    assertTrue(KeyBuilder.matchPersistentKey("foo"));
  }

  @Test(timeout=10000)
  public void buildInstanceListKeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.iplist.ephemeral" + ".123##name",
        KeyBuilder.buildInstanceListKey("123", "name", true));
  }

  @Test(timeout=10000)
  public void matchServiceNameTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchServiceName("foo", "123", "name"));
  }

  @Test(timeout=10000)
  public void matchEphemeralInstanceListKeyTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchEphemeralInstanceListKey("foo"));
  }

  @Test(timeout=10000)
  public void matchInstanceListKeyTest2() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchInstanceListKey("foo"));
  }

  @Test(timeout=10000)
  public void getSwitchDomainKeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.meta.00-00---000" + "-NACOS_SWITCH_DOMAIN-000---00-00",
        KeyBuilder.getSwitchDomainKey());
  }

  @Test(timeout=10000)
  public void briefInstanceListkeyTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    KeyBuilder.briefInstanceListkey("foo");
  }

  @Test(timeout=10000)
  public void matchServiceMetaKeyTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchServiceMetaKey("foo"));
  }

  @Test(timeout=10000)
  public void getNamespaceTest() {
    // Arrange, Act and Assert
    assertEquals("", KeyBuilder.getNamespace("foo"));
  }

  @Test(timeout=10000)
  public void briefServiceMetaKeyTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    KeyBuilder.briefServiceMetaKey("foo");
  }

  @Test(timeout=10000)
  public void matchInstanceListKeyTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchInstanceListKey("foo", "123", "name"));
  }

  @Test(timeout=10000)
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    KeyBuilder.getServiceName("foo");
  }

  @Test(timeout=10000)
  public void detailServiceMetaKeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.foo", KeyBuilder.detailServiceMetaKey("foo"));
  }

  @Test(timeout=10000)
  public void buildServiceMetaKeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.domains.meta.123##name", KeyBuilder.buildServiceMetaKey("123", "name"));
  }

  @Test(timeout=10000)
  public void matchSwitchKeyTest() {
    // Arrange, Act and Assert
    assertFalse(KeyBuilder.matchSwitchKey("foo"));
  }
}

