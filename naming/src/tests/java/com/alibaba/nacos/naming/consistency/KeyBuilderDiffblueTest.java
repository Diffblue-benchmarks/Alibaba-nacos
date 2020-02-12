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
    // Arrange
    boolean actualMatchServiceMetaKeyResult = KeyBuilder.matchServiceMetaKey("foo", "123", "name");
    boolean actualMatchServiceMetaKeyResult1 = KeyBuilder.matchServiceMetaKey("com.alibaba.nacos.naming.domains.meta.",
        "123", "name");

    // Act and Assert
    assertFalse(actualMatchServiceMetaKeyResult);
    assertFalse(actualMatchServiceMetaKeyResult1);
    assertFalse(KeyBuilder.matchServiceMetaKey("meta.", "123", "name"));
  }

  @Test(timeout=10000)
  public void detailInstanceListkeyTest() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.foo", KeyBuilder.detailInstanceListkey("foo"));
  }

  @Test(timeout=10000)
  public void matchPersistentKeyTest() {
    // Arrange
    boolean actualMatchPersistentKeyResult = KeyBuilder.matchPersistentKey("foo");

    // Act and Assert
    assertTrue(actualMatchPersistentKeyResult);
    assertFalse(KeyBuilder.matchPersistentKey("com.alibaba.nacos.naming.iplist.ephemeral."));
  }

  @Test(timeout=10000)
  public void buildInstanceListKeyTest() {
    // Arrange
    String actualBuildInstanceListKeyResult = KeyBuilder.buildInstanceListKey("123", "name", true);

    // Act and Assert
    assertEquals("com.alibaba.nacos.naming.iplist.ephemeral" + ".123##name", actualBuildInstanceListKeyResult);
    assertEquals("com.alibaba.nacos.naming.iplist.123##name", KeyBuilder.buildInstanceListKey("123", "name", false));
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
    // Arrange
    boolean actualMatchInstanceListKeyResult = KeyBuilder.matchInstanceListKey("foo");

    // Act and Assert
    assertFalse(actualMatchInstanceListKeyResult);
    assertTrue(KeyBuilder.matchInstanceListKey("com.alibaba.nacos.naming.iplist."));
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
    // Arrange
    String actualNamespace = KeyBuilder.getNamespace("foo");
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

  @Test(timeout=10000)
  public void briefServiceMetaKeyTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    KeyBuilder.briefServiceMetaKey("foo");
  }

  @Test(timeout=10000)
  public void matchInstanceListKeyTest() {
    // Arrange
    boolean actualMatchInstanceListKeyResult = KeyBuilder.matchInstanceListKey("foo", "123", "name");

    // Act and Assert
    assertFalse(actualMatchInstanceListKeyResult);
    assertFalse(KeyBuilder.matchInstanceListKey("com.alibaba.nacos.naming.iplist.", "123", "name"));
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

