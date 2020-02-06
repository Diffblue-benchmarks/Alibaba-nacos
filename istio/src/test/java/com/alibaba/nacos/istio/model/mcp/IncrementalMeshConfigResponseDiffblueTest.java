package com.alibaba.nacos.istio.model.mcp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IncrementalMeshConfigResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getResourcesOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, IncrementalMeshConfigResponse.getDefaultInstance().getResourcesOrBuilderList().size());
  }
  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    boolean actualIsInitializedResult = ((IncrementalMeshConfigResponse) IncrementalMeshConfigResponse
        .getDefaultInstance().newInstance(null)).isInitialized();
    int actualRemovedResourcesCount = ((IncrementalMeshConfigResponse) IncrementalMeshConfigResponse
        .getDefaultInstance().newInstance(null)).getRemovedResourcesCount();
    String actualNonce = ((IncrementalMeshConfigResponse) IncrementalMeshConfigResponse.getDefaultInstance()
        .newInstance(null)).getNonce();
    String actualSystemVersionInfo = ((IncrementalMeshConfigResponse) IncrementalMeshConfigResponse.getDefaultInstance()
        .newInstance(null)).getSystemVersionInfo();
    assertEquals(0,
        ((IncrementalMeshConfigResponse) IncrementalMeshConfigResponse.getDefaultInstance().newInstance(null))
            .getResourcesCount());
    assertEquals("", actualSystemVersionInfo);
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
    assertTrue(actualIsInitializedResult);
  }
  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    IncrementalMeshConfigResponse.parseFrom(new byte[24]);
  }
  @Test
  public void getResourcesListTest() {
    // Arrange, Act and Assert
    assertEquals(0, IncrementalMeshConfigResponse.getDefaultInstance().getResourcesList().size());
  }
  @Test
  public void getRemovedResourcesCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, IncrementalMeshConfigResponse.getDefaultInstance().getRemovedResourcesCount());
  }
  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(IncrementalMeshConfigResponse.getDefaultInstance().isInitialized());
  }
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(IncrementalMeshConfigResponse.getDefaultInstance().equals(""));
  }
  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    IncrementalMeshConfigResponse actualParseDelimitedFromResult = IncrementalMeshConfigResponse
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    int actualRemovedResourcesCount = actualParseDelimitedFromResult.getRemovedResourcesCount();
    String actualNonce = actualParseDelimitedFromResult.getNonce();
    String actualSystemVersionInfo = actualParseDelimitedFromResult.getSystemVersionInfo();
    assertEquals(0, actualParseDelimitedFromResult.getResourcesCount());
    assertEquals("", actualSystemVersionInfo);
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
    assertTrue(actualIsInitializedResult);
  }
  @Test
  public void toBuilderTest() {
    // Arrange and Act
    IncrementalMeshConfigResponse.Builder actualToBuilderResult = IncrementalMeshConfigResponse.getDefaultInstance()
        .toBuilder();

    // Assert
    int actualRemovedResourcesCount = actualToBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualToBuilderResult.getNonce();
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
    int actualRemovedResourcesCount = actualNewBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderResult.getNonce();
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
    int actualRemovedResourcesCount = actualNewBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderResult.getNonce();
    assertEquals("", actualNewBuilderResult.getSystemVersionInfo());
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
  }
  @Test
  public void getNonceTest() {
    // Arrange, Act and Assert
    assertEquals("", IncrementalMeshConfigResponse.getDefaultInstance().getNonce());
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
    int actualRemovedResourcesCount = actualNewBuilderForTypeResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderForTypeResult.getNonce();
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

