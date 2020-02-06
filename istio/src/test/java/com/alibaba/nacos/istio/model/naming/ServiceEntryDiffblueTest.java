package com.alibaba.nacos.istio.model.naming;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServiceEntryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    assertEquals(ServiceEntry.Resolution.STATIC, ServiceEntry.Resolution.valueOf(1));
  }
  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Resolution.NONE.getNumber());
  }
  @Test
  public void forNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(ServiceEntry.Resolution.STATIC, ServiceEntry.Resolution.forNumber(1));
  }
  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Location.MESH_EXTERNAL.getNumber());
  }
  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertEquals(ServiceEntry.Location.MESH_INTERNAL, ServiceEntry.Location.valueOf(1));
  }
  @Test
  public void forNumberTest() {
    // Arrange, Act and Assert
    assertEquals(ServiceEntry.Location.MESH_INTERNAL, ServiceEntry.Location.forNumber(1));
  }
  @Test
  public void isInitializedTest2() {
    // Arrange, Act and Assert
    assertTrue(ServiceEntry.Endpoint.getDefaultInstance().isInitialized());
  }
  @Test
  public void newBuilderTest4() {
    // Arrange and Act
    ServiceEntry.Endpoint.Builder actualNewBuilderResult = ServiceEntry.Endpoint.newBuilder();

    // Assert
    String actualLocality = actualNewBuilderResult.getLocality();
    String actualNetwork = actualNewBuilderResult.getNetwork();
    assertEquals("", actualLocality);
    assertEquals("", actualNewBuilderResult.getAddress());
    assertEquals("", actualNetwork);
  }
  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse(ServiceEntry.Endpoint.getDefaultInstance().equals(""));
  }
  @Test
  public void getNetworkTest() {
    // Arrange, Act and Assert
    assertEquals("", ServiceEntry.Endpoint.getDefaultInstance().getNetwork());
  }
  @Test
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Endpoint.getDefaultInstance().getWeight());
  }
  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ServiceEntry.Endpoint.parseFrom(new byte[24]);
  }
  @Test
  public void toBuilderTest2() {
    // Arrange and Act
    ServiceEntry.Endpoint.Builder actualToBuilderResult = ServiceEntry.Endpoint.getDefaultInstance().toBuilder();

    // Assert
    String actualLocality = actualToBuilderResult.getLocality();
    String actualNetwork = actualToBuilderResult.getNetwork();
    assertEquals("", actualLocality);
    assertEquals("", actualToBuilderResult.getAddress());
    assertEquals("", actualNetwork);
  }
  @Test
  public void newBuilderTest3() {
    // Arrange and Act
    ServiceEntry.Endpoint.Builder actualNewBuilderResult = ServiceEntry.Endpoint
        .newBuilder(ServiceEntry.Endpoint.getDefaultInstance());

    // Assert
    String actualLocality = actualNewBuilderResult.getLocality();
    String actualNetwork = actualNewBuilderResult.getNetwork();
    assertEquals("", actualLocality);
    assertEquals("", actualNewBuilderResult.getAddress());
    assertEquals("", actualNetwork);
  }
  @Test
  public void newInstanceTest2() {
    // Arrange, Act and Assert
    String actualLocality = ((ServiceEntry.Endpoint) ServiceEntry.Endpoint.getDefaultInstance().newInstance(null))
        .getLocality();
    String actualNetwork = ((ServiceEntry.Endpoint) ServiceEntry.Endpoint.getDefaultInstance().newInstance(null))
        .getNetwork();
    String actualAddress = ((ServiceEntry.Endpoint) ServiceEntry.Endpoint.getDefaultInstance().newInstance(null))
        .getAddress();
    assertEquals("", actualLocality);
    assertTrue(((ServiceEntry.Endpoint) ServiceEntry.Endpoint.getDefaultInstance().newInstance(null)).isInitialized());
    assertEquals("", actualNetwork);
    assertEquals("", actualAddress);
  }
  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange and Act
    ServiceEntry.Endpoint actualParseDelimitedFromResult = ServiceEntry.Endpoint
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualLocality = actualParseDelimitedFromResult.getLocality();
    String actualNetwork = actualParseDelimitedFromResult.getNetwork();
    String actualAddress = actualParseDelimitedFromResult.getAddress();
    assertEquals("", actualLocality);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals("", actualNetwork);
    assertEquals("", actualAddress);
  }
  @Test
  public void newBuilderForTypeTest2() {
    // Arrange and Act
    ServiceEntry.Endpoint.Builder actualNewBuilderForTypeResult = ServiceEntry.Endpoint.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualLocality = actualNewBuilderForTypeResult.getLocality();
    String actualNetwork = actualNewBuilderForTypeResult.getNetwork();
    assertEquals("", actualLocality);
    assertEquals("", actualNewBuilderForTypeResult.getAddress());
    assertEquals("", actualNetwork);
  }
  @Test
  public void getLocalityTest() {
    // Arrange, Act and Assert
    assertEquals("", ServiceEntry.Endpoint.getDefaultInstance().getLocality());
  }
  @Test
  public void internalGetMapFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    ServiceEntry.Endpoint.getDefaultInstance().internalGetMapField(1);
  }
  @Test
  public void getAddressTest() {
    // Arrange, Act and Assert
    assertEquals("", ServiceEntry.Endpoint.getDefaultInstance().getAddress());
  }
  @Test
  public void getPortsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getPorts(1);
  }
  @Test
  public void getHostsBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getHostsBytes(1);
  }
  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(ServiceEntry.getDefaultInstance().isInitialized());
  }
  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    ServiceEntry.Builder actualNewBuilderForTypeResult = ServiceEntry.getDefaultInstance().newBuilderForType();

    // Assert
    int actualAddressesCount = actualNewBuilderForTypeResult.getAddressesCount();
    int actualHostsCount = actualNewBuilderForTypeResult.getHostsCount();
    int actualResolutionValue = actualNewBuilderForTypeResult.getResolutionValue();
    int actualLocationValue = actualNewBuilderForTypeResult.getLocationValue();
    int actualExportToCount = actualNewBuilderForTypeResult.getExportToCount();
    assertEquals(0, actualNewBuilderForTypeResult.getSubjectAltNamesCount());
    assertEquals(0, actualExportToCount);
    assertEquals(0, actualLocationValue);
    assertEquals(0, actualResolutionValue);
    assertEquals(0, actualHostsCount);
    assertEquals(0, actualAddressesCount);
  }
  @Test
  public void getSubjectAltNamesCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getSubjectAltNamesCount());
  }
  @Test
  public void getAddressesBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getAddressesBytes(1);
  }
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(ServiceEntry.getDefaultInstance().equals("aaaaa"));
  }
  @Test
  public void getEndpointsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getEndpoints(1);
  }
  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    ServiceEntry actualParseDelimitedFromResult = ServiceEntry
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    int actualAddressesCount = actualParseDelimitedFromResult.getAddressesCount();
    int actualEndpointsCount = actualParseDelimitedFromResult.getEndpointsCount();
    int actualHostsCount = actualParseDelimitedFromResult.getHostsCount();
    int actualResolutionValue = actualParseDelimitedFromResult.getResolutionValue();
    int actualLocationValue = actualParseDelimitedFromResult.getLocationValue();
    int actualPortsCount = actualParseDelimitedFromResult.getPortsCount();
    int actualExportToCount = actualParseDelimitedFromResult.getExportToCount();
    int actualSubjectAltNamesCount = actualParseDelimitedFromResult.getSubjectAltNamesCount();
    assertTrue(actualParseDelimitedFromResult.isInitialized());
    assertEquals(0, actualSubjectAltNamesCount);
    assertEquals(0, actualExportToCount);
    assertEquals(0, actualPortsCount);
    assertEquals(0, actualLocationValue);
    assertEquals(0, actualResolutionValue);
    assertEquals(0, actualHostsCount);
    assertEquals(0, actualEndpointsCount);
    assertEquals(0, actualAddressesCount);
  }
  @Test
  public void getExportToCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getExportToCount());
  }
  @Test
  public void toBuilderTest() {
    // Arrange and Act
    ServiceEntry.Builder actualToBuilderResult = ServiceEntry.getDefaultInstance().toBuilder();

    // Assert
    int actualAddressesCount = actualToBuilderResult.getAddressesCount();
    int actualHostsCount = actualToBuilderResult.getHostsCount();
    int actualResolutionValue = actualToBuilderResult.getResolutionValue();
    int actualLocationValue = actualToBuilderResult.getLocationValue();
    int actualExportToCount = actualToBuilderResult.getExportToCount();
    assertEquals(0, actualToBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualExportToCount);
    assertEquals(0, actualLocationValue);
    assertEquals(0, actualResolutionValue);
    assertEquals(0, actualHostsCount);
    assertEquals(0, actualAddressesCount);
  }
  @Test
  public void getLocationValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getLocationValue());
  }
  @Test
  public void getExportToTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getExportTo(1);
  }
  @Test
  public void getEndpointsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getEndpointsOrBuilderList().size());
  }
  @Test
  public void getResolutionTest() {
    // Arrange, Act and Assert
    assertEquals(ServiceEntry.Resolution.NONE, ServiceEntry.getDefaultInstance().getResolution());
  }
  @Test
  public void getResolutionValueTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getResolutionValue());
  }
  @Test
  public void getSubjectAltNamesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getSubjectAltNames(1);
  }
  @Test
  public void getPortsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getPortsOrBuilder(1);
  }
  @Test
  public void getAddressesCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getAddressesCount());
  }
  @Test
  public void getEndpointsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getEndpointsList().size());
  }
  @Test
  public void getSubjectAltNamesBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getSubjectAltNamesBytes(1);
  }
  @Test
  public void getPortsListTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getPortsList().size());
  }
  @Test
  public void getLocationTest() {
    // Arrange, Act and Assert
    assertEquals(ServiceEntry.Location.MESH_EXTERNAL, ServiceEntry.getDefaultInstance().getLocation());
  }
  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ServiceEntry.parseFrom(new byte[24]);
  }
  @Test
  public void getAddressesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getAddresses(1);
  }
  @Test
  public void getExportToBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getExportToBytes(1);
  }
  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    int actualAddressesCount = ((ServiceEntry) ServiceEntry.getDefaultInstance().newInstance(null)).getAddressesCount();
    int actualEndpointsCount = ((ServiceEntry) ServiceEntry.getDefaultInstance().newInstance(null)).getEndpointsCount();
    int actualHostsCount = ((ServiceEntry) ServiceEntry.getDefaultInstance().newInstance(null)).getHostsCount();
    int actualResolutionValue = ((ServiceEntry) ServiceEntry.getDefaultInstance().newInstance(null))
        .getResolutionValue();
    int actualLocationValue = ((ServiceEntry) ServiceEntry.getDefaultInstance().newInstance(null)).getLocationValue();
    int actualPortsCount = ((ServiceEntry) ServiceEntry.getDefaultInstance().newInstance(null)).getPortsCount();
    int actualExportToCount = ((ServiceEntry) ServiceEntry.getDefaultInstance().newInstance(null)).getExportToCount();
    int actualSubjectAltNamesCount = ((ServiceEntry) ServiceEntry.getDefaultInstance().newInstance(null))
        .getSubjectAltNamesCount();
    assertTrue(((ServiceEntry) ServiceEntry.getDefaultInstance().newInstance(null)).isInitialized());
    assertEquals(0, actualSubjectAltNamesCount);
    assertEquals(0, actualExportToCount);
    assertEquals(0, actualPortsCount);
    assertEquals(0, actualLocationValue);
    assertEquals(0, actualResolutionValue);
    assertEquals(0, actualHostsCount);
    assertEquals(0, actualEndpointsCount);
    assertEquals(0, actualAddressesCount);
  }
  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    ServiceEntry.Builder actualNewBuilderResult = ServiceEntry.newBuilder();

    // Assert
    int actualAddressesCount = actualNewBuilderResult.getAddressesCount();
    int actualHostsCount = actualNewBuilderResult.getHostsCount();
    int actualResolutionValue = actualNewBuilderResult.getResolutionValue();
    int actualLocationValue = actualNewBuilderResult.getLocationValue();
    int actualExportToCount = actualNewBuilderResult.getExportToCount();
    assertEquals(0, actualNewBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualExportToCount);
    assertEquals(0, actualLocationValue);
    assertEquals(0, actualResolutionValue);
    assertEquals(0, actualHostsCount);
    assertEquals(0, actualAddressesCount);
  }
  @Test
  public void newBuilderTest() {
    // Arrange and Act
    ServiceEntry.Builder actualNewBuilderResult = ServiceEntry.newBuilder(ServiceEntry.getDefaultInstance());

    // Assert
    int actualAddressesCount = actualNewBuilderResult.getAddressesCount();
    int actualHostsCount = actualNewBuilderResult.getHostsCount();
    int actualResolutionValue = actualNewBuilderResult.getResolutionValue();
    int actualLocationValue = actualNewBuilderResult.getLocationValue();
    int actualExportToCount = actualNewBuilderResult.getExportToCount();
    assertEquals(0, actualNewBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualExportToCount);
    assertEquals(0, actualLocationValue);
    assertEquals(0, actualResolutionValue);
    assertEquals(0, actualHostsCount);
    assertEquals(0, actualAddressesCount);
  }
  @Test
  public void getPortsOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getPortsOrBuilderList().size());
  }
  @Test
  public void getPortsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getPortsCount());
  }
  @Test
  public void getHostsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getHostsCount());
  }
  @Test
  public void getEndpointsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.getDefaultInstance().getEndpointsCount());
  }
  @Test
  public void getHostsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getHosts(1);
  }
  @Test
  public void getEndpointsOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getEndpointsOrBuilder(1);
  }
}

