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

public class MeshConfigRequestDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    MeshConfigRequest.Builder actualToBuilderResult = MeshConfigRequest.getDefaultInstance().toBuilder();

    // Assert
    String actualResponseNonce = actualToBuilderResult.getResponseNonce();
    String actualVersionInfo = actualToBuilderResult.getVersionInfo();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualToBuilderResult.getTypeUrl());
    assertEquals("", actualVersionInfo);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    MeshConfigRequest.Builder actualNewBuilderForTypeResult = MeshConfigRequest.getDefaultInstance()
        .newBuilderForType();

    // Assert
    String actualResponseNonce = actualNewBuilderForTypeResult.getResponseNonce();
    String actualVersionInfo = actualNewBuilderForTypeResult.getVersionInfo();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualNewBuilderForTypeResult.getTypeUrl());
    assertEquals("", actualVersionInfo);
  }

  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    String actualResponseNonce = ((MeshConfigRequest) MeshConfigRequest.getDefaultInstance().newInstance(null))
        .getResponseNonce();
    String actualVersionInfo = ((MeshConfigRequest) MeshConfigRequest.getDefaultInstance().newInstance(null))
        .getVersionInfo();
    boolean actualIsInitializedResult = ((MeshConfigRequest) MeshConfigRequest.getDefaultInstance().newInstance(null))
        .isInitialized();
    assertEquals("", actualResponseNonce);
    assertTrue(actualIsInitializedResult);
    assertEquals("", ((MeshConfigRequest) MeshConfigRequest.getDefaultInstance().newInstance(null)).getTypeUrl());
    assertEquals("", actualVersionInfo);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    MeshConfigRequest.Builder actualNewBuilderResult = MeshConfigRequest.newBuilder();

    // Assert
    String actualResponseNonce = actualNewBuilderResult.getResponseNonce();
    String actualVersionInfo = actualNewBuilderResult.getVersionInfo();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualNewBuilderResult.getTypeUrl());
    assertEquals("", actualVersionInfo);
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(MeshConfigRequest.getDefaultInstance().isInitialized());
  }

  @Test
  public void hasSinkNodeTest() {
    // Arrange, Act and Assert
    assertFalse(MeshConfigRequest.getDefaultInstance().hasSinkNode());
  }

  @Test
  public void getVersionInfoTest() {
    // Arrange, Act and Assert
    assertEquals("", MeshConfigRequest.getDefaultInstance().getVersionInfo());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MeshConfigRequest.parseFrom(new byte[24]);
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MeshConfigRequest.getDefaultInstance().equals(""));
  }

  @Test
  public void hasErrorDetailTest() {
    // Arrange, Act and Assert
    assertFalse(MeshConfigRequest.getDefaultInstance().hasErrorDetail());
  }

  @Test
  public void getErrorDetailOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MeshConfigRequest.getDefaultInstance().getErrorDetailOrBuilder() instanceof com.google.rpc.Status);
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    MeshConfigRequest actualParseDelimitedFromResult = MeshConfigRequest
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualResponseNonce = actualParseDelimitedFromResult.getResponseNonce();
    String actualVersionInfo = actualParseDelimitedFromResult.getVersionInfo();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualResponseNonce);
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualParseDelimitedFromResult.getTypeUrl());
    assertEquals("", actualVersionInfo);
  }

  @Test
  public void getTypeUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", MeshConfigRequest.getDefaultInstance().getTypeUrl());
  }

  @Test
  public void getSinkNodeOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(MeshConfigRequest.getDefaultInstance().getSinkNodeOrBuilder() instanceof SinkNode);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    MeshConfigRequest.Builder actualNewBuilderResult = MeshConfigRequest
        .newBuilder(MeshConfigRequest.getDefaultInstance());

    // Assert
    String actualResponseNonce = actualNewBuilderResult.getResponseNonce();
    String actualVersionInfo = actualNewBuilderResult.getVersionInfo();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualNewBuilderResult.getTypeUrl());
    assertEquals("", actualVersionInfo);
  }

  @Test
  public void getResponseNonceTest() {
    // Arrange, Act and Assert
    assertEquals("", MeshConfigRequest.getDefaultInstance().getResponseNonce());
  }
}

