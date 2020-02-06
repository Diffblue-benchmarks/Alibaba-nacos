package com.alibaba.nacos.istio.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(0, Server.TLSOptions.TLSmode.PASSTHROUGH.getNumber());
  }

  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    assertEquals(Server.TLSOptions.TLSmode.SIMPLE, Server.TLSOptions.TLSmode.valueOf(1));
  }

  @Test
  public void forNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(Server.TLSOptions.TLSmode.SIMPLE, Server.TLSOptions.TLSmode.forNumber(1));
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, Server.TLSOptions.TLSProtocol.TLS_AUTO.getNumber());
  }

  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(Server.TLSOptions.TLSProtocol.TLSV1_0, Server.TLSOptions.TLSProtocol.forNumber(1));
  }

  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(Server.TLSOptions.TLSProtocol.TLSV1_0, Server.TLSOptions.TLSProtocol.valueOf(1));
  }

  @Test
  public void newBuilderTest4() {
    // Arrange and Act
    Server.TLSOptions.Builder actualNewBuilderResult = Server.TLSOptions.newBuilder();

    // Assert
    String actualServerCertificate = actualNewBuilderResult.getServerCertificate();
    String actualCaCertificates = actualNewBuilderResult.getCaCertificates();
    int actualVerifyCertificateSpkiCount = actualNewBuilderResult.getVerifyCertificateSpkiCount();
    String actualCredentialName = actualNewBuilderResult.getCredentialName();
    int actualModeValue = actualNewBuilderResult.getModeValue();
    int actualCipherSuitesCount = actualNewBuilderResult.getCipherSuitesCount();
    String actualPrivateKey = actualNewBuilderResult.getPrivateKey();
    int actualMaxProtocolVersionValue = actualNewBuilderResult.getMaxProtocolVersionValue();
    int actualMinProtocolVersionValue = actualNewBuilderResult.getMinProtocolVersionValue();
    int actualVerifyCertificateHashCount = actualNewBuilderResult.getVerifyCertificateHashCount();
    assertEquals("", actualServerCertificate);
    assertEquals(0, actualNewBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualVerifyCertificateHashCount);
    assertEquals("", actualCaCertificates);
    assertEquals(0, actualModeValue);
    assertEquals(0, actualCipherSuitesCount);
    assertEquals("", actualCredentialName);
    assertEquals("", actualPrivateKey);
    assertEquals(0, actualMaxProtocolVersionValue);
    assertEquals(0, actualVerifyCertificateSpkiCount);
    assertEquals(0, actualMinProtocolVersionValue);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Server.TLSOptions.parseFrom(new byte[24]);
  }

  @Test
  public void getMaxProtocolVersionTest() {
    // Arrange, Act and Assert
    assertEquals(Server.TLSOptions.TLSProtocol.TLS_AUTO,
        Server.TLSOptions.getDefaultInstance().getMaxProtocolVersion());
  }

  @Test
  public void getCipherSuitesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.TLSOptions.getDefaultInstance().getCipherSuites(1);
  }

  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(Server.TLSOptions.getDefaultInstance().isInitialized());
  }

  @Test
  public void getSubjectAltNamesCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Server.TLSOptions.getDefaultInstance().getSubjectAltNamesCount());
  }

  @Test
  public void getVerifyCertificateHashCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Server.TLSOptions.getDefaultInstance().getVerifyCertificateHashCount());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(Server.TLSOptions.getDefaultInstance().equals(""));
  }

  @Test
  public void getModeTest() {
    // Arrange, Act and Assert
    assertEquals(Server.TLSOptions.TLSmode.PASSTHROUGH, Server.TLSOptions.getDefaultInstance().getMode());
  }

  @Test
  public void getCipherSuitesBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.TLSOptions.getDefaultInstance().getCipherSuitesBytes(1);
  }

  @Test
  public void getVerifyCertificateSpkiTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.TLSOptions.getDefaultInstance().getVerifyCertificateSpki(1);
  }

  @Test
  public void getPrivateKeyTest() {
    // Arrange, Act and Assert
    assertEquals("", Server.TLSOptions.getDefaultInstance().getPrivateKey());
  }

  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange and Act
    Server.TLSOptions actualParseDelimitedFromResult = Server.TLSOptions
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualServerCertificate = actualParseDelimitedFromResult.getServerCertificate();
    String actualCaCertificates = actualParseDelimitedFromResult.getCaCertificates();
    int actualVerifyCertificateSpkiCount = actualParseDelimitedFromResult.getVerifyCertificateSpkiCount();
    String actualCredentialName = actualParseDelimitedFromResult.getCredentialName();
    int actualModeValue = actualParseDelimitedFromResult.getModeValue();
    int actualCipherSuitesCount = actualParseDelimitedFromResult.getCipherSuitesCount();
    String actualPrivateKey = actualParseDelimitedFromResult.getPrivateKey();
    int actualMaxProtocolVersionValue = actualParseDelimitedFromResult.getMaxProtocolVersionValue();
    int actualMinProtocolVersionValue = actualParseDelimitedFromResult.getMinProtocolVersionValue();
    int actualVerifyCertificateHashCount = actualParseDelimitedFromResult.getVerifyCertificateHashCount();
    int actualSubjectAltNamesCount = actualParseDelimitedFromResult.getSubjectAltNamesCount();
    assertEquals("", actualServerCertificate);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSubjectAltNamesCount);
    assertEquals(0, actualVerifyCertificateHashCount);
    assertEquals("", actualCaCertificates);
    assertEquals(0, actualModeValue);
    assertEquals(0, actualCipherSuitesCount);
    assertEquals("", actualPrivateKey);
    assertEquals(0, actualVerifyCertificateSpkiCount);
    assertEquals("", actualCredentialName);
    assertEquals(0, actualMinProtocolVersionValue);
    assertEquals(0, actualMaxProtocolVersionValue);
  }

  @Test
  public void getSubjectAltNamesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.TLSOptions.getDefaultInstance().getSubjectAltNames(1);
  }

  @Test
  public void getHttpsRedirectTest() {
    // Arrange, Act and Assert
    assertFalse(Server.TLSOptions.getDefaultInstance().getHttpsRedirect());
  }

  @Test
  public void getMinProtocolVersionTest() {
    // Arrange, Act and Assert
    assertEquals(Server.TLSOptions.TLSProtocol.TLS_AUTO,
        Server.TLSOptions.getDefaultInstance().getMinProtocolVersion());
  }

  @Test
  public void getSubjectAltNamesBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.TLSOptions.getDefaultInstance().getSubjectAltNamesBytes(1);
  }

  @Test
  public void getServerCertificateTest() {
    // Arrange, Act and Assert
    assertEquals("", Server.TLSOptions.getDefaultInstance().getServerCertificate());
  }

  @Test
  public void toBuilderTest2() {
    // Arrange and Act
    Server.TLSOptions.Builder actualToBuilderResult = Server.TLSOptions.getDefaultInstance().toBuilder();

    // Assert
    String actualServerCertificate = actualToBuilderResult.getServerCertificate();
    String actualCaCertificates = actualToBuilderResult.getCaCertificates();
    int actualVerifyCertificateSpkiCount = actualToBuilderResult.getVerifyCertificateSpkiCount();
    String actualCredentialName = actualToBuilderResult.getCredentialName();
    int actualModeValue = actualToBuilderResult.getModeValue();
    int actualCipherSuitesCount = actualToBuilderResult.getCipherSuitesCount();
    String actualPrivateKey = actualToBuilderResult.getPrivateKey();
    int actualMaxProtocolVersionValue = actualToBuilderResult.getMaxProtocolVersionValue();
    int actualMinProtocolVersionValue = actualToBuilderResult.getMinProtocolVersionValue();
    int actualVerifyCertificateHashCount = actualToBuilderResult.getVerifyCertificateHashCount();
    assertEquals("", actualServerCertificate);
    assertEquals(0, actualToBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualVerifyCertificateHashCount);
    assertEquals("", actualCaCertificates);
    assertEquals(0, actualModeValue);
    assertEquals(0, actualCipherSuitesCount);
    assertEquals("", actualCredentialName);
    assertEquals("", actualPrivateKey);
    assertEquals(0, actualMaxProtocolVersionValue);
    assertEquals(0, actualVerifyCertificateSpkiCount);
    assertEquals(0, actualMinProtocolVersionValue);
  }

  @Test
  public void newBuilderForTypeTest2() {
    // Arrange and Act
    Server.TLSOptions.Builder actualNewBuilderForTypeResult = Server.TLSOptions.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualServerCertificate = actualNewBuilderForTypeResult.getServerCertificate();
    String actualCaCertificates = actualNewBuilderForTypeResult.getCaCertificates();
    int actualVerifyCertificateSpkiCount = actualNewBuilderForTypeResult.getVerifyCertificateSpkiCount();
    String actualCredentialName = actualNewBuilderForTypeResult.getCredentialName();
    int actualModeValue = actualNewBuilderForTypeResult.getModeValue();
    int actualCipherSuitesCount = actualNewBuilderForTypeResult.getCipherSuitesCount();
    String actualPrivateKey = actualNewBuilderForTypeResult.getPrivateKey();
    int actualMaxProtocolVersionValue = actualNewBuilderForTypeResult.getMaxProtocolVersionValue();
    int actualMinProtocolVersionValue = actualNewBuilderForTypeResult.getMinProtocolVersionValue();
    int actualVerifyCertificateHashCount = actualNewBuilderForTypeResult.getVerifyCertificateHashCount();
    assertEquals("", actualServerCertificate);
    assertEquals(0, actualNewBuilderForTypeResult.getSubjectAltNamesCount());
    assertEquals(0, actualVerifyCertificateHashCount);
    assertEquals("", actualCaCertificates);
    assertEquals(0, actualModeValue);
    assertEquals(0, actualCipherSuitesCount);
    assertEquals("", actualCredentialName);
    assertEquals("", actualPrivateKey);
    assertEquals(0, actualMaxProtocolVersionValue);
    assertEquals(0, actualVerifyCertificateSpkiCount);
    assertEquals(0, actualMinProtocolVersionValue);
  }

  @Test
  public void newInstanceTest2() {
    // Arrange, Act and Assert
    String actualServerCertificate = ((Server.TLSOptions) Server.TLSOptions.getDefaultInstance().newInstance(null))
        .getServerCertificate();
    String actualCaCertificates = ((Server.TLSOptions) Server.TLSOptions.getDefaultInstance().newInstance(null))
        .getCaCertificates();
    int actualVerifyCertificateSpkiCount = ((Server.TLSOptions) Server.TLSOptions.getDefaultInstance()
        .newInstance(null)).getVerifyCertificateSpkiCount();
    String actualCredentialName = ((Server.TLSOptions) Server.TLSOptions.getDefaultInstance().newInstance(null))
        .getCredentialName();
    int actualModeValue = ((Server.TLSOptions) Server.TLSOptions.getDefaultInstance().newInstance(null)).getModeValue();
    int actualCipherSuitesCount = ((Server.TLSOptions) Server.TLSOptions.getDefaultInstance().newInstance(null))
        .getCipherSuitesCount();
    String actualPrivateKey = ((Server.TLSOptions) Server.TLSOptions.getDefaultInstance().newInstance(null))
        .getPrivateKey();
    int actualMaxProtocolVersionValue = ((Server.TLSOptions) Server.TLSOptions.getDefaultInstance().newInstance(null))
        .getMaxProtocolVersionValue();
    int actualMinProtocolVersionValue = ((Server.TLSOptions) Server.TLSOptions.getDefaultInstance().newInstance(null))
        .getMinProtocolVersionValue();
    int actualVerifyCertificateHashCount = ((Server.TLSOptions) Server.TLSOptions.getDefaultInstance()
        .newInstance(null)).getVerifyCertificateHashCount();
    int actualSubjectAltNamesCount = ((Server.TLSOptions) Server.TLSOptions.getDefaultInstance().newInstance(null))
        .getSubjectAltNamesCount();
    assertEquals("", actualServerCertificate);
    assertTrue(((Server.TLSOptions) Server.TLSOptions.getDefaultInstance().newInstance(null)).isInitialized());
    assertEquals(0, actualSubjectAltNamesCount);
    assertEquals(0, actualVerifyCertificateHashCount);
    assertEquals("", actualCaCertificates);
    assertEquals(0, actualModeValue);
    assertEquals(0, actualCipherSuitesCount);
    assertEquals("", actualPrivateKey);
    assertEquals(0, actualVerifyCertificateSpkiCount);
    assertEquals("", actualCredentialName);
    assertEquals(0, actualMinProtocolVersionValue);
    assertEquals(0, actualMaxProtocolVersionValue);
  }

  @Test
  public void newBuilderTest3() {
    // Arrange and Act
    Server.TLSOptions.Builder actualNewBuilderResult = Server.TLSOptions
        .newBuilder(Server.TLSOptions.getDefaultInstance());

    // Assert
    String actualServerCertificate = actualNewBuilderResult.getServerCertificate();
    String actualCaCertificates = actualNewBuilderResult.getCaCertificates();
    int actualVerifyCertificateSpkiCount = actualNewBuilderResult.getVerifyCertificateSpkiCount();
    String actualCredentialName = actualNewBuilderResult.getCredentialName();
    int actualModeValue = actualNewBuilderResult.getModeValue();
    int actualCipherSuitesCount = actualNewBuilderResult.getCipherSuitesCount();
    String actualPrivateKey = actualNewBuilderResult.getPrivateKey();
    int actualMaxProtocolVersionValue = actualNewBuilderResult.getMaxProtocolVersionValue();
    int actualMinProtocolVersionValue = actualNewBuilderResult.getMinProtocolVersionValue();
    int actualVerifyCertificateHashCount = actualNewBuilderResult.getVerifyCertificateHashCount();
    assertEquals("", actualServerCertificate);
    assertEquals(0, actualNewBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualVerifyCertificateHashCount);
    assertEquals("", actualCaCertificates);
    assertEquals(0, actualModeValue);
    assertEquals(0, actualCipherSuitesCount);
    assertEquals("", actualCredentialName);
    assertEquals("", actualPrivateKey);
    assertEquals(0, actualMaxProtocolVersionValue);
    assertEquals(0, actualVerifyCertificateSpkiCount);
    assertEquals(0, actualMinProtocolVersionValue);
  }

  @Test
  public void getVerifyCertificateSpkiBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.TLSOptions.getDefaultInstance().getVerifyCertificateSpkiBytes(1);
  }

  @Test
  public void getMinProtocolVersionValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, Server.TLSOptions.getDefaultInstance().getMinProtocolVersionValue());
  }

  @Test
  public void getMaxProtocolVersionValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, Server.TLSOptions.getDefaultInstance().getMaxProtocolVersionValue());
  }

  @Test
  public void getCipherSuitesCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Server.TLSOptions.getDefaultInstance().getCipherSuitesCount());
  }

  @Test
  public void getModeValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, Server.TLSOptions.getDefaultInstance().getModeValue());
  }

  @Test
  public void getCredentialNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Server.TLSOptions.getDefaultInstance().getCredentialName());
  }

  @Test
  public void getVerifyCertificateSpkiCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Server.TLSOptions.getDefaultInstance().getVerifyCertificateSpkiCount());
  }

  @Test
  public void getCaCertificatesTest() {
    // Arrange, Act and Assert
    assertEquals("", Server.TLSOptions.getDefaultInstance().getCaCertificates());
  }

  @Test
  public void getVerifyCertificateHashTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.TLSOptions.getDefaultInstance().getVerifyCertificateHash(1);
  }

  @Test
  public void getVerifyCertificateHashBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.TLSOptions.getDefaultInstance().getVerifyCertificateHashBytes(1);
  }

  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    String actualDefaultEndpoint = ((Server) Server.getDefaultInstance().newInstance(null)).getDefaultEndpoint();
    boolean actualIsInitializedResult = ((Server) Server.getDefaultInstance().newInstance(null)).isInitialized();
    String actualBind = ((Server) Server.getDefaultInstance().newInstance(null)).getBind();
    assertEquals(0, ((Server) Server.getDefaultInstance().newInstance(null)).getHostsCount());
    assertEquals("", actualBind);
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualDefaultEndpoint);
  }

  @Test
  public void getHostsBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.getDefaultInstance().getHostsBytes(1);
  }

  @Test
  public void getBindTest() {
    // Arrange, Act and Assert
    assertEquals("", Server.getDefaultInstance().getBind());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Server.getDefaultInstance().isInitialized());
  }

  @Test
  public void getDefaultEndpointTest() {
    // Arrange, Act and Assert
    assertEquals("", Server.getDefaultInstance().getDefaultEndpoint());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Server.getDefaultInstance().equals(""));
  }

  @Test
  public void getTlsOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Server.getDefaultInstance().getTlsOrBuilder() instanceof Server.TLSOptions);
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Server.parseFrom(new byte[24]);
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Server.Builder actualToBuilderResult = Server.getDefaultInstance().toBuilder();

    // Assert
    String actualDefaultEndpoint = actualToBuilderResult.getDefaultEndpoint();
    String actualBind = actualToBuilderResult.getBind();
    assertEquals(0, actualToBuilderResult.getHostsCount());
    assertEquals("", actualBind);
    assertEquals("", actualDefaultEndpoint);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Server.Builder actualNewBuilderForTypeResult = Server.getDefaultInstance().newBuilderForType();

    // Assert
    String actualDefaultEndpoint = actualNewBuilderForTypeResult.getDefaultEndpoint();
    String actualBind = actualNewBuilderForTypeResult.getBind();
    assertEquals(0, actualNewBuilderForTypeResult.getHostsCount());
    assertEquals("", actualBind);
    assertEquals("", actualDefaultEndpoint);
  }

  @Test
  public void getHostsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Server.getDefaultInstance().getHostsCount());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Server.Builder actualNewBuilderResult = Server.newBuilder(Server.getDefaultInstance());

    // Assert
    String actualDefaultEndpoint = actualNewBuilderResult.getDefaultEndpoint();
    String actualBind = actualNewBuilderResult.getBind();
    assertEquals(0, actualNewBuilderResult.getHostsCount());
    assertEquals("", actualBind);
    assertEquals("", actualDefaultEndpoint);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Server.Builder actualNewBuilderResult = Server.newBuilder();

    // Assert
    String actualDefaultEndpoint = actualNewBuilderResult.getDefaultEndpoint();
    String actualBind = actualNewBuilderResult.getBind();
    assertEquals(0, actualNewBuilderResult.getHostsCount());
    assertEquals("", actualBind);
    assertEquals("", actualDefaultEndpoint);
  }

  @Test
  public void hasTlsTest() {
    // Arrange, Act and Assert
    assertFalse(Server.getDefaultInstance().hasTls());
  }

  @Test
  public void hasPortTest() {
    // Arrange, Act and Assert
    assertFalse(Server.getDefaultInstance().hasPort());
  }

  @Test
  public void getHostsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.getDefaultInstance().getHosts(1);
  }

  @Test
  public void getPortOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Server.getDefaultInstance().getPortOrBuilder() instanceof Port);
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    Server actualParseDelimitedFromResult = Server.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualDefaultEndpoint = actualParseDelimitedFromResult.getDefaultEndpoint();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualBind = actualParseDelimitedFromResult.getBind();
    assertEquals(0, actualParseDelimitedFromResult.getHostsCount());
    assertEquals("", actualBind);
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualDefaultEndpoint);
  }
}

