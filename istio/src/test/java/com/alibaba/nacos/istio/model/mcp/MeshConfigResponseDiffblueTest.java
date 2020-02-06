package com.alibaba.nacos.istio.model.mcp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MeshConfigResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = MeshConfigResponse.getDefaultInstance().newInstance(null);

    // Assert
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((MeshConfigResponse) actualNewInstanceResult).getSerializedSize();
    String actualVersionInfo = ((MeshConfigResponse) actualNewInstanceResult).getVersionInfo();
    boolean actualIsInitializedResult = ((MeshConfigResponse) actualNewInstanceResult).isInitialized();
    String actualTypeUrl = ((MeshConfigResponse) actualNewInstanceResult).getTypeUrl();
    String actualNonce = ((MeshConfigResponse) actualNewInstanceResult).getNonce();
    assertEquals("", actualToStringResult);
    assertEquals(0, ((MeshConfigResponse) actualNewInstanceResult).getResourcesCount());
    assertEquals("", actualNonce);
    assertEquals("", actualTypeUrl);
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualVersionInfo);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MeshConfigResponse.getDefaultInstance().equals("foo"));
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    MeshConfigResponse.Builder actualNewBuilderForTypeResult = MeshConfigResponse.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    String actualVersionInfo = actualNewBuilderForTypeResult.getVersionInfo();
    String actualTypeUrl = actualNewBuilderForTypeResult.getTypeUrl();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getNonce());
    assertEquals("", actualTypeUrl);
    assertEquals("", actualVersionInfo);
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MeshConfigResponse.parseFrom(byteArray);
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MeshConfigResponse.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    MeshConfigResponse.Builder actualNewBuilderResult = MeshConfigResponse
        .newBuilder(MeshConfigResponse.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualVersionInfo = actualNewBuilderResult.getVersionInfo();
    String actualTypeUrl = actualNewBuilderResult.getTypeUrl();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getNonce());
    assertEquals("", actualTypeUrl);
    assertEquals("", actualVersionInfo);
  }

  @Test
  public void getResourcesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MeshConfigResponse.getDefaultInstance().getResources(1);
  }

  @Test
  public void getResourcesCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, MeshConfigResponse.getDefaultInstance().getResourcesCount());
  }

  @Test
  public void getTypeUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", MeshConfigResponse.getDefaultInstance().getTypeUrl());
  }

  @Test
  public void parseFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MeshConfigResponse.parseFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    MeshConfigResponse.Builder actualToBuilderResult = MeshConfigResponse.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    String actualVersionInfo = actualToBuilderResult.getVersionInfo();
    String actualTypeUrl = actualToBuilderResult.getTypeUrl();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getNonce());
    assertEquals("", actualTypeUrl);
    assertEquals("", actualVersionInfo);
  }

  @Test
  public void getResourcesOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    MeshConfigResponse.getDefaultInstance().getResourcesOrBuilder(1);
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MeshConfigResponse.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    MeshConfigResponse.Builder actualNewBuilderResult = MeshConfigResponse.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    String actualVersionInfo = actualNewBuilderResult.getVersionInfo();
    String actualTypeUrl = actualNewBuilderResult.getTypeUrl();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getNonce());
    assertEquals("", actualTypeUrl);
    assertEquals("", actualVersionInfo);
  }
}

