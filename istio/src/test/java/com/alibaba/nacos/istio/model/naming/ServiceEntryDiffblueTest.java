package com.alibaba.nacos.istio.model.naming;

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

public class ServiceEntryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void valueOfTest2() {
    // Arrange, Act and Assert
    assertNull(ServiceEntry.Resolution.valueOf(42));
  }
  @Test
  public void getNumberTest2() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Resolution.NONE.getNumber());
  }
  @Test
  public void forNumberTest2() {
    // Arrange
    ServiceEntry.Resolution actualForNumberResult = ServiceEntry.Resolution.forNumber(42);
    ServiceEntry.Resolution actualForNumberResult1 = ServiceEntry.Resolution.forNumber(1);

    // Act and Assert
    assertNull(actualForNumberResult);
    assertEquals(ServiceEntry.Resolution.STATIC, actualForNumberResult1);
    assertEquals(ServiceEntry.Resolution.NONE, ServiceEntry.Resolution.forNumber(0));
  }
  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Location.MESH_EXTERNAL.getNumber());
  }
  @Test
  public void valueOfTest() {
    // Arrange, Act and Assert
    assertNull(ServiceEntry.Location.valueOf(42));
  }
  @Test
  public void forNumberTest() {
    // Arrange
    ServiceEntry.Location actualForNumberResult = ServiceEntry.Location.forNumber(42);
    ServiceEntry.Location actualForNumberResult1 = ServiceEntry.Location.forNumber(1);

    // Act and Assert
    assertNull(actualForNumberResult);
    assertEquals(ServiceEntry.Location.MESH_INTERNAL, actualForNumberResult1);
    assertEquals(ServiceEntry.Location.MESH_EXTERNAL, ServiceEntry.Location.forNumber(0));
  }
  @Test
  public void getPortsOrThrowTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ServiceEntry.Endpoint.getDefaultInstance().getPortsOrThrow("foo");
  }
  @Test
  public void getLabelsOrDefaultTest() {
    // Arrange, Act and Assert
    assertEquals("foo", ServiceEntry.Endpoint.getDefaultInstance().getLabelsOrDefault("foo", "foo"));
  }
  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(ServiceEntry.Endpoint.getDefaultInstance().isInitialized());
  }
  @Test
  public void newBuilderTest4() {
    // Arrange and Act
    ServiceEntry.Endpoint.Builder actualNewBuilderResult = ServiceEntry.Endpoint.newBuilder();

    // Assert
    String actualLocality = actualNewBuilderResult.getLocality();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualNetwork = actualNewBuilderResult.getNetwork();
    assertEquals("", actualLocality);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNetwork);
    assertEquals("", actualNewBuilderResult.getAddress());
  }
  @Test
  public void getLabelsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Endpoint.getDefaultInstance().getLabelsCount());
  }
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(ServiceEntry.Endpoint.getDefaultInstance().equals("foo"));
  }
  @Test
  public void containsLabelsTest() {
    // Arrange, Act and Assert
    assertFalse(ServiceEntry.Endpoint.getDefaultInstance().containsLabels("foo"));
  }
  @Test
  public void getNetworkTest() {
    // Arrange, Act and Assert
    assertEquals("", ServiceEntry.Endpoint.getDefaultInstance().getNetwork());
  }
  @Test
  public void parseFromTest4() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ServiceEntry.Endpoint.parseFrom(new ByteArrayInputStream(byteArray));
  }
  @Test
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Endpoint.getDefaultInstance().getWeight());
  }
  @Test
  public void parseFromTest3() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ServiceEntry.Endpoint.parseFrom(byteArray);
  }
  @Test
  public void getPortsOrDefaultTest() {
    // Arrange, Act and Assert
    assertEquals(42, ServiceEntry.Endpoint.getDefaultInstance().getPortsOrDefault("foo", 42));
  }
  @Test
  public void toBuilderTest2() {
    // Arrange and Act
    ServiceEntry.Endpoint.Builder actualToBuilderResult = ServiceEntry.Endpoint.getDefaultInstance().toBuilder();

    // Assert
    String actualLocality = actualToBuilderResult.getLocality();
    String actualToStringResult = actualToBuilderResult.toString();
    String actualNetwork = actualToBuilderResult.getNetwork();
    assertEquals("", actualLocality);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNetwork);
    assertEquals("", actualToBuilderResult.getAddress());
  }
  @Test
  public void newBuilderTest3() {
    // Arrange and Act
    ServiceEntry.Endpoint.Builder actualNewBuilderResult = ServiceEntry.Endpoint
        .newBuilder(ServiceEntry.Endpoint.getDefaultInstance());

    // Assert
    String actualLocality = actualNewBuilderResult.getLocality();
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualNetwork = actualNewBuilderResult.getNetwork();
    assertEquals("", actualLocality);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNetwork);
    assertEquals("", actualNewBuilderResult.getAddress());
  }
  @Test
  public void newInstanceTest2() {
    // Arrange and Act
    Object actualNewInstanceResult = ServiceEntry.Endpoint.getDefaultInstance().newInstance(null);

    // Assert
    String actualLocality = ((ServiceEntry.Endpoint) actualNewInstanceResult).getLocality();
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((ServiceEntry.Endpoint) actualNewInstanceResult).getSerializedSize();
    String actualNetwork = ((ServiceEntry.Endpoint) actualNewInstanceResult).getNetwork();
    String actualAddress = ((ServiceEntry.Endpoint) actualNewInstanceResult).getAddress();
    assertEquals("", actualLocality);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNetwork);
    assertTrue(((ServiceEntry.Endpoint) actualNewInstanceResult).isInitialized());
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualAddress);
  }
  @Test
  public void parseDelimitedFromTest2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ServiceEntry.Endpoint.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }
  @Test
  public void newBuilderForTypeTest2() {
    // Arrange and Act
    ServiceEntry.Endpoint.Builder actualNewBuilderForTypeResult = ServiceEntry.Endpoint.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualLocality = actualNewBuilderForTypeResult.getLocality();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualNetwork = actualNewBuilderForTypeResult.getNetwork();
    assertEquals("", actualLocality);
    assertEquals("", actualToStringResult);
    assertEquals("", actualNetwork);
    assertEquals("", actualNewBuilderForTypeResult.getAddress());
  }
  @Test
  public void containsPortsTest() {
    // Arrange, Act and Assert
    assertFalse(ServiceEntry.Endpoint.getDefaultInstance().containsPorts("foo"));
  }
  @Test
  public void getPortsCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Endpoint.getDefaultInstance().getPortsCount());
  }
  @Test
  public void getLocalityTest() {
    // Arrange, Act and Assert
    assertEquals("", ServiceEntry.Endpoint.getDefaultInstance().getLocality());
  }
  @Test
  public void getLabelsMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Endpoint.getDefaultInstance().getLabelsMap().size());
  }
  @Test
  public void getPortsTest2() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Endpoint.getDefaultInstance().getPorts().size());
  }
  @Test
  public void getLabelsOrThrowTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ServiceEntry.Endpoint.getDefaultInstance().getLabelsOrThrow("foo");
  }
  @Test
  public void internalGetMapFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    ServiceEntry.Endpoint.getDefaultInstance().internalGetMapField(10);
  }
  @Test
  public void getAddressTest() {
    // Arrange, Act and Assert
    assertEquals("", ServiceEntry.Endpoint.getDefaultInstance().getAddress());
  }
  @Test
  public void getPortsMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Endpoint.getDefaultInstance().getPortsMap().size());
  }
  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Endpoint.getDefaultInstance().getSerializedSize());
  }
  @Test
  public void getLabelsTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceEntry.Endpoint.getDefaultInstance().getLabels().size());
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
  public void newBuilderForTypeTest() {
    // Arrange and Act
    ServiceEntry.Builder actualNewBuilderForTypeResult = ServiceEntry.getDefaultInstance().newBuilderForType();

    // Assert
    int actualAddressesCount = actualNewBuilderForTypeResult.getAddressesCount();
    int actualHostsCount = actualNewBuilderForTypeResult.getHostsCount();
    int actualResolutionValue = actualNewBuilderForTypeResult.getResolutionValue();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualLocationValue = actualNewBuilderForTypeResult.getLocationValue();
    int actualExportToCount = actualNewBuilderForTypeResult.getExportToCount();
    assertEquals(0, actualNewBuilderForTypeResult.getSubjectAltNamesCount());
    assertEquals(0, actualResolutionValue);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualAddressesCount);
    assertEquals(0, actualLocationValue);
    assertEquals(0, actualHostsCount);
    assertEquals(0, actualExportToCount);
  }
  @Test
  public void getAddressesBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getAddressesBytes(1);
  }
  @Test
  public void getAddressesListTest() {
    // Arrange and Act
    ProtocolStringList actualAddressesList = ServiceEntry.getDefaultInstance().getAddressesList();

    // Assert
    assertSame(((LazyStringArrayList) actualAddressesList).EMPTY, actualAddressesList);
    assertEquals(0, actualAddressesList.size());
  }
  @Test
  public void getEndpointsTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getEndpoints(1);
  }
  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ServiceEntry.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }
  @Test
  public void toBuilderTest() {
    // Arrange and Act
    ServiceEntry.Builder actualToBuilderResult = ServiceEntry.getDefaultInstance().toBuilder();

    // Assert
    int actualAddressesCount = actualToBuilderResult.getAddressesCount();
    int actualHostsCount = actualToBuilderResult.getHostsCount();
    int actualResolutionValue = actualToBuilderResult.getResolutionValue();
    String actualToStringResult = actualToBuilderResult.toString();
    int actualLocationValue = actualToBuilderResult.getLocationValue();
    int actualExportToCount = actualToBuilderResult.getExportToCount();
    assertEquals(0, actualToBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualResolutionValue);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualAddressesCount);
    assertEquals(0, actualLocationValue);
    assertEquals(0, actualHostsCount);
    assertEquals(0, actualExportToCount);
  }
  @Test
  public void getExportToTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getExportTo(1);
  }
  @Test
  public void getResolutionTest() {
    // Arrange, Act and Assert
    assertEquals(ServiceEntry.Resolution.NONE, ServiceEntry.getDefaultInstance().getResolution());
  }
  @Test
  public void parseFromTest2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ServiceEntry.parseFrom(new ByteArrayInputStream(byteArray));
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
  public void getSubjectAltNamesBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServiceEntry.getDefaultInstance().getSubjectAltNamesBytes(1);
  }
  @Test
  public void getLocationTest() {
    // Arrange, Act and Assert
    assertEquals(ServiceEntry.Location.MESH_EXTERNAL, ServiceEntry.getDefaultInstance().getLocation());
  }
  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    ServiceEntry.parseFrom(byteArray);
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
    // Arrange and Act
    Object actualNewInstanceResult = ServiceEntry.getDefaultInstance().newInstance(null);

    // Assert
    int actualSerializedSize = ((ServiceEntry) actualNewInstanceResult).getSerializedSize();
    int actualAddressesCount = ((ServiceEntry) actualNewInstanceResult).getAddressesCount();
    int actualEndpointsCount = ((ServiceEntry) actualNewInstanceResult).getEndpointsCount();
    int actualHostsCount = ((ServiceEntry) actualNewInstanceResult).getHostsCount();
    int actualResolutionValue = ((ServiceEntry) actualNewInstanceResult).getResolutionValue();
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualLocationValue = ((ServiceEntry) actualNewInstanceResult).getLocationValue();
    int actualPortsCount = ((ServiceEntry) actualNewInstanceResult).getPortsCount();
    int actualExportToCount = ((ServiceEntry) actualNewInstanceResult).getExportToCount();
    int actualSubjectAltNamesCount = ((ServiceEntry) actualNewInstanceResult).getSubjectAltNamesCount();
    assertEquals(0, actualSerializedSize);
    assertTrue(((ServiceEntry) actualNewInstanceResult).isInitialized());
    assertEquals(0, actualSubjectAltNamesCount);
    assertEquals(0, actualAddressesCount);
    assertEquals(0, actualHostsCount);
    assertEquals(0, actualEndpointsCount);
    assertEquals(0, actualResolutionValue);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualLocationValue);
    assertEquals(0, actualExportToCount);
    assertEquals(0, actualPortsCount);
  }
  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    ServiceEntry.Builder actualNewBuilderResult = ServiceEntry.newBuilder();

    // Assert
    int actualAddressesCount = actualNewBuilderResult.getAddressesCount();
    int actualHostsCount = actualNewBuilderResult.getHostsCount();
    int actualResolutionValue = actualNewBuilderResult.getResolutionValue();
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualLocationValue = actualNewBuilderResult.getLocationValue();
    int actualExportToCount = actualNewBuilderResult.getExportToCount();
    assertEquals(0, actualNewBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualResolutionValue);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualAddressesCount);
    assertEquals(0, actualLocationValue);
    assertEquals(0, actualHostsCount);
    assertEquals(0, actualExportToCount);
  }
  @Test
  public void newBuilderTest() {
    // Arrange and Act
    ServiceEntry.Builder actualNewBuilderResult = ServiceEntry.newBuilder(ServiceEntry.getDefaultInstance());

    // Assert
    int actualAddressesCount = actualNewBuilderResult.getAddressesCount();
    int actualHostsCount = actualNewBuilderResult.getHostsCount();
    int actualResolutionValue = actualNewBuilderResult.getResolutionValue();
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualLocationValue = actualNewBuilderResult.getLocationValue();
    int actualExportToCount = actualNewBuilderResult.getExportToCount();
    assertEquals(0, actualNewBuilderResult.getSubjectAltNamesCount());
    assertEquals(0, actualResolutionValue);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualAddressesCount);
    assertEquals(0, actualLocationValue);
    assertEquals(0, actualHostsCount);
    assertEquals(0, actualExportToCount);
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

