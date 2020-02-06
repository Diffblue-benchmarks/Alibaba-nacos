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

public class MeshConfigResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getResourcesOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MeshConfigResponse.getDefaultInstance().getResourcesOrBuilderList().size());
  }

  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    String actualVersionInfo = ((MeshConfigResponse) MeshConfigResponse.getDefaultInstance().newInstance(null))
        .getVersionInfo();
    boolean actualIsInitializedResult = ((MeshConfigResponse) MeshConfigResponse.getDefaultInstance().newInstance(null))
        .isInitialized();
    String actualTypeUrl = ((MeshConfigResponse) MeshConfigResponse.getDefaultInstance().newInstance(null))
        .getTypeUrl();
    String actualNonce = ((MeshConfigResponse) MeshConfigResponse.getDefaultInstance().newInstance(null)).getNonce();
    assertEquals(0,
        ((MeshConfigResponse) MeshConfigResponse.getDefaultInstance().newInstance(null)).getResourcesCount());
    assertEquals("", actualVersionInfo);
    assertEquals("", actualTypeUrl);
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualNonce);
  }

  @Test
  public void getResourcesListTest() {
    // Arrange, Act and Assert
    assertEquals(0, MeshConfigResponse.getDefaultInstance().getResourcesList().size());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(MeshConfigResponse.getDefaultInstance().isInitialized());
  }

  @Test
  public void getVersionInfoTest() {
    // Arrange, Act and Assert
    assertEquals("", MeshConfigResponse.getDefaultInstance().getVersionInfo());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MeshConfigResponse.getDefaultInstance().equals(""));
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    MeshConfigResponse.Builder actualNewBuilderForTypeResult = MeshConfigResponse.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualVersionInfo = actualNewBuilderForTypeResult.getVersionInfo();
    String actualTypeUrl = actualNewBuilderForTypeResult.getTypeUrl();
    assertEquals("", actualNewBuilderForTypeResult.getNonce());
    assertEquals("", actualTypeUrl);
    assertEquals("", actualVersionInfo);
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MeshConfigResponse.parseFrom(new byte[24]);
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    MeshConfigResponse actualParseDelimitedFromResult = MeshConfigResponse
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualVersionInfo = actualParseDelimitedFromResult.getVersionInfo();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    String actualTypeUrl = actualParseDelimitedFromResult.getTypeUrl();
    String actualNonce = actualParseDelimitedFromResult.getNonce();
    assertEquals(0, actualParseDelimitedFromResult.getResourcesCount());
    assertEquals("", actualVersionInfo);
    assertEquals("", actualTypeUrl);
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualNonce);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    MeshConfigResponse.Builder actualNewBuilderResult = MeshConfigResponse
        .newBuilder(MeshConfigResponse.getDefaultInstance());

    // Assert
    String actualVersionInfo = actualNewBuilderResult.getVersionInfo();
    String actualTypeUrl = actualNewBuilderResult.getTypeUrl();
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
  public void getNonceTest() {
    // Arrange, Act and Assert
    assertEquals("", MeshConfigResponse.getDefaultInstance().getNonce());
  }

  @Test
  public void getTypeUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", MeshConfigResponse.getDefaultInstance().getTypeUrl());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    MeshConfigResponse.Builder actualToBuilderResult = MeshConfigResponse.getDefaultInstance().toBuilder();

    // Assert
    String actualVersionInfo = actualToBuilderResult.getVersionInfo();
    String actualTypeUrl = actualToBuilderResult.getTypeUrl();
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
  public void newBuilderTest() {
    // Arrange and Act
    MeshConfigResponse.Builder actualNewBuilderResult = MeshConfigResponse.newBuilder();

    // Assert
    String actualVersionInfo = actualNewBuilderResult.getVersionInfo();
    String actualTypeUrl = actualNewBuilderResult.getTypeUrl();
    assertEquals("", actualNewBuilderResult.getNonce());
    assertEquals("", actualTypeUrl);
    assertEquals("", actualVersionInfo);
  }
}

