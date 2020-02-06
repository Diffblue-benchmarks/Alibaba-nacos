package com.alibaba.nacos.istio.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.ProtocolStringList;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
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
    assertNull(Server.TLSOptions.TLSmode.valueOf(42));
  }
  @Test
  public void forNumberTest2() {
    // Arrange
    Server.TLSOptions.TLSmode actualForNumberResult = Server.TLSOptions.TLSmode.forNumber(42);
    Server.TLSOptions.TLSmode actualForNumberResult1 = Server.TLSOptions.TLSmode.forNumber(1);

    // Act and Assert
    assertNull(actualForNumberResult);
    assertEquals(Server.TLSOptions.TLSmode.SIMPLE, actualForNumberResult1);
    assertEquals(Server.TLSOptions.TLSmode.PASSTHROUGH, Server.TLSOptions.TLSmode.forNumber(0));
  }
  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, Server.TLSOptions.TLSProtocol.TLS_AUTO.getNumber());
  }
  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertNull(Server.TLSOptions.TLSProtocol.forNumber(42));
  }
  @Test
  public void valueOfTest() {
    // Arrange
    Server.TLSOptions.TLSProtocol actualValueOfResult = Server.TLSOptions.TLSProtocol.valueOf(42);
    Server.TLSOptions.TLSProtocol actualValueOfResult1 = Server.TLSOptions.TLSProtocol.valueOf(1);

    // Act and Assert
    assertNull(actualValueOfResult);
    assertEquals(Server.TLSOptions.TLSProtocol.TLSV1_0, actualValueOfResult1);
    assertEquals(Server.TLSOptions.TLSProtocol.TLS_AUTO, Server.TLSOptions.TLSProtocol.valueOf(0));
  }
  @Test
  public void newBuilderTest2() {
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
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualVerifyCertificateHashCount = actualNewBuilderResult.getVerifyCertificateHashCount();
    assertEquals("", actualServerCertificate);
    assertEquals(0, actualNewBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualVerifyCertificateHashCount);
    assertEquals("", actualCaCertificates);
    assertEquals(0, actualModeValue);
    assertEquals("", actualCredentialName);
    assertEquals(0, actualCipherSuitesCount);
    assertEquals("", actualPrivateKey);
    assertEquals(0, actualVerifyCertificateSpkiCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualMinProtocolVersionValue);
    assertEquals(0, actualMaxProtocolVersionValue);
  }
  @Test
  public void parseFromTest4() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Server.TLSOptions.parseFrom(byteArray);
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
  public void parseFromTest3() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Server.TLSOptions.parseFrom(new ByteArrayInputStream(byteArray));
  }
  @Test
  public void getCipherSuitesListTest() {
    // Arrange and Act
    ProtocolStringList actualCipherSuitesList = Server.TLSOptions.getDefaultInstance().getCipherSuitesList();

    // Assert
    assertSame(((LazyStringArrayList) actualCipherSuitesList).EMPTY, actualCipherSuitesList);
    assertEquals(0, actualCipherSuitesList.size());
  }
  @Test
  public void getModeTest() {
    // Arrange, Act and Assert
    assertEquals(Server.TLSOptions.TLSmode.PASSTHROUGH, Server.TLSOptions.getDefaultInstance().getMode());
  }
  @Test
  public void getVerifyCertificateSpkiListTest() {
    // Arrange and Act
    ProtocolStringList actualVerifyCertificateSpkiList = Server.TLSOptions.getDefaultInstance()
        .getVerifyCertificateSpkiList();

    // Assert
    assertSame(((LazyStringArrayList) actualVerifyCertificateSpkiList).EMPTY, actualVerifyCertificateSpkiList);
    assertEquals(0, actualVerifyCertificateSpkiList.size());
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
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Server.TLSOptions.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
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
  public void getSubjectAltNamesListTest() {
    // Arrange and Act
    ProtocolStringList actualSubjectAltNamesList = Server.TLSOptions.getDefaultInstance().getSubjectAltNamesList();

    // Assert
    assertSame(((LazyStringArrayList) actualSubjectAltNamesList).EMPTY, actualSubjectAltNamesList);
    assertEquals(0, actualSubjectAltNamesList.size());
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
  public void toBuilderTest() {
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
    String actualToStringResult = actualToBuilderResult.toString();
    int actualVerifyCertificateHashCount = actualToBuilderResult.getVerifyCertificateHashCount();
    assertEquals("", actualServerCertificate);
    assertEquals(0, actualToBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualVerifyCertificateHashCount);
    assertEquals("", actualCaCertificates);
    assertEquals(0, actualModeValue);
    assertEquals("", actualCredentialName);
    assertEquals(0, actualCipherSuitesCount);
    assertEquals("", actualPrivateKey);
    assertEquals(0, actualVerifyCertificateSpkiCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualMinProtocolVersionValue);
    assertEquals(0, actualMaxProtocolVersionValue);
  }
  @Test
  public void newBuilderForTypeTest() {
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
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualVerifyCertificateHashCount = actualNewBuilderForTypeResult.getVerifyCertificateHashCount();
    assertEquals("", actualServerCertificate);
    assertEquals(0, actualNewBuilderForTypeResult.getSubjectAltNamesCount());
    assertEquals(0, actualVerifyCertificateHashCount);
    assertEquals("", actualCaCertificates);
    assertEquals(0, actualModeValue);
    assertEquals("", actualCredentialName);
    assertEquals(0, actualCipherSuitesCount);
    assertEquals("", actualPrivateKey);
    assertEquals(0, actualVerifyCertificateSpkiCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualMinProtocolVersionValue);
    assertEquals(0, actualMaxProtocolVersionValue);
  }
  @Test
  public void newInstanceTest2() {
    // Arrange and Act
    Object actualNewInstanceResult = Server.TLSOptions.getDefaultInstance().newInstance(null);

    // Assert
    int actualSerializedSize = ((Server.TLSOptions) actualNewInstanceResult).getSerializedSize();
    String actualServerCertificate = ((Server.TLSOptions) actualNewInstanceResult).getServerCertificate();
    String actualCaCertificates = ((Server.TLSOptions) actualNewInstanceResult).getCaCertificates();
    int actualVerifyCertificateSpkiCount = ((Server.TLSOptions) actualNewInstanceResult)
        .getVerifyCertificateSpkiCount();
    String actualCredentialName = ((Server.TLSOptions) actualNewInstanceResult).getCredentialName();
    int actualModeValue = ((Server.TLSOptions) actualNewInstanceResult).getModeValue();
    int actualCipherSuitesCount = ((Server.TLSOptions) actualNewInstanceResult).getCipherSuitesCount();
    String actualPrivateKey = ((Server.TLSOptions) actualNewInstanceResult).getPrivateKey();
    int actualMaxProtocolVersionValue = ((Server.TLSOptions) actualNewInstanceResult).getMaxProtocolVersionValue();
    int actualMinProtocolVersionValue = ((Server.TLSOptions) actualNewInstanceResult).getMinProtocolVersionValue();
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualVerifyCertificateHashCount = ((Server.TLSOptions) actualNewInstanceResult)
        .getVerifyCertificateHashCount();
    int actualSubjectAltNamesCount = ((Server.TLSOptions) actualNewInstanceResult).getSubjectAltNamesCount();
    assertEquals(0, actualSerializedSize);
    assertTrue(((Server.TLSOptions) actualNewInstanceResult).isInitialized());
    assertEquals(0, actualSubjectAltNamesCount);
    assertEquals(0, actualVerifyCertificateHashCount);
    assertEquals("", actualServerCertificate);
    assertEquals(0, actualVerifyCertificateSpkiCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualModeValue);
    assertEquals(0, actualCipherSuitesCount);
    assertEquals("", actualCaCertificates);
    assertEquals(0, actualMinProtocolVersionValue);
    assertEquals(0, actualMaxProtocolVersionValue);
    assertEquals("", actualPrivateKey);
    assertEquals("", actualCredentialName);
  }
  @Test
  public void newBuilderTest() {
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
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualVerifyCertificateHashCount = actualNewBuilderResult.getVerifyCertificateHashCount();
    assertEquals("", actualServerCertificate);
    assertEquals(0, actualNewBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualVerifyCertificateHashCount);
    assertEquals("", actualCaCertificates);
    assertEquals(0, actualModeValue);
    assertEquals("", actualCredentialName);
    assertEquals(0, actualCipherSuitesCount);
    assertEquals("", actualPrivateKey);
    assertEquals(0, actualVerifyCertificateSpkiCount);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualMinProtocolVersionValue);
    assertEquals(0, actualMaxProtocolVersionValue);
  }
  @Test
  public void getVerifyCertificateSpkiBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.TLSOptions.getDefaultInstance().getVerifyCertificateSpkiBytes(1);
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
  public void parseFromTest2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Server.parseFrom(new ByteArrayInputStream(byteArray));
  }
  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = Server.getDefaultInstance().newInstance(null);

    // Assert
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((Server) actualNewInstanceResult).getSerializedSize();
    String actualDefaultEndpoint = ((Server) actualNewInstanceResult).getDefaultEndpoint();
    boolean actualIsInitializedResult = ((Server) actualNewInstanceResult).isInitialized();
    String actualBind = ((Server) actualNewInstanceResult).getBind();
    assertEquals("", actualToStringResult);
    assertEquals(0, ((Server) actualNewInstanceResult).getHostsCount());
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualDefaultEndpoint);
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualBind);
  }
  @Test
  public void getHostsBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Server.getDefaultInstance().getHostsBytes(1);
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
    assertFalse(Server.getDefaultInstance().equals("foo"));
  }
  @Test
  public void getTlsOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Server.getDefaultInstance().getTlsOrBuilder() instanceof Server.TLSOptions);
  }
  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Server.parseFrom(byteArray);
  }
  @Test
  public void getHostsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Server.getDefaultInstance().getHostsCount());
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
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Server.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }
}

