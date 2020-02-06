package com.alibaba.nacos.istio.model.mcp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

public class IncrementalMeshConfigResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = IncrementalMeshConfigResponse.getDefaultInstance().newInstance(null);

    // Assert
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((IncrementalMeshConfigResponse) actualNewInstanceResult).getSerializedSize();
    boolean actualIsInitializedResult = ((IncrementalMeshConfigResponse) actualNewInstanceResult).isInitialized();
    int actualRemovedResourcesCount = ((IncrementalMeshConfigResponse) actualNewInstanceResult)
        .getRemovedResourcesCount();
    String actualNonce = ((IncrementalMeshConfigResponse) actualNewInstanceResult).getNonce();
    String actualSystemVersionInfo = ((IncrementalMeshConfigResponse) actualNewInstanceResult).getSystemVersionInfo();
    assertEquals("", actualToStringResult);
    assertEquals(0, ((IncrementalMeshConfigResponse) actualNewInstanceResult).getResourcesCount());
    assertEquals("", actualSystemVersionInfo);
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualIsInitializedResult);
  }
  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    IncrementalMeshConfigResponse.parseFrom(byteArray);
  }
  @Test
  public void getResourcesListTest() {
    // Arrange, Act and Assert
    assertEquals(0, IncrementalMeshConfigResponse.getDefaultInstance().getResourcesList().size());
  }
  @Test
  public void parseFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    IncrementalMeshConfigResponse.parseFrom(new ByteArrayInputStream(byteArray));
  }
  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(IncrementalMeshConfigResponse.getDefaultInstance().isInitialized());
  }
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(IncrementalMeshConfigResponse.getDefaultInstance().equals("foo"));
  }
  @Test
  public void getRemovedResourcesListTest() {
    // Arrange and Act
    ProtocolStringList actualRemovedResourcesList = IncrementalMeshConfigResponse.getDefaultInstance()
        .getRemovedResourcesList();

    // Assert
    assertSame(((LazyStringArrayList) actualRemovedResourcesList).EMPTY, actualRemovedResourcesList);
    assertEquals(0, actualRemovedResourcesList.size());
  }
  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    IncrementalMeshConfigResponse.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }
  @Test
  public void toBuilderTest() {
    // Arrange and Act
    IncrementalMeshConfigResponse.Builder actualToBuilderResult = IncrementalMeshConfigResponse.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    int actualRemovedResourcesCount = actualToBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualToBuilderResult.getNonce();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getSystemVersionInfo());
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
  }
  @Test
  public void getResourcesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    IncrementalMeshConfigResponse.getDefaultInstance().getResources(1);
  }
  @Test
  public void getResourcesCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, IncrementalMeshConfigResponse.getDefaultInstance().getResourcesCount());
  }
  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    IncrementalMeshConfigResponse.Builder actualNewBuilderResult = IncrementalMeshConfigResponse
        .newBuilder(IncrementalMeshConfigResponse.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualRemovedResourcesCount = actualNewBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderResult.getNonce();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getSystemVersionInfo());
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
  }
  @Test
  public void getSystemVersionInfoTest() {
    // Arrange, Act and Assert
    assertEquals("", IncrementalMeshConfigResponse.getDefaultInstance().getSystemVersionInfo());
  }
  @Test
  public void newBuilderTest() {
    // Arrange and Act
    IncrementalMeshConfigResponse.Builder actualNewBuilderResult = IncrementalMeshConfigResponse.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualRemovedResourcesCount = actualNewBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderResult.getNonce();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getSystemVersionInfo());
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
  }
  @Test
  public void getRemovedResourcesBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    IncrementalMeshConfigResponse.getDefaultInstance().getRemovedResourcesBytes(1);
  }
  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    IncrementalMeshConfigResponse.Builder actualNewBuilderForTypeResult = IncrementalMeshConfigResponse
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualRemovedResourcesCount = actualNewBuilderForTypeResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderForTypeResult.getNonce();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getSystemVersionInfo());
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
  }
  @Test
  public void getResourcesOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    IncrementalMeshConfigResponse.getDefaultInstance().getResourcesOrBuilder(1);
  }
  @Test
  public void getRemovedResourcesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    IncrementalMeshConfigResponse.getDefaultInstance().getRemovedResources(1);
  }
}

