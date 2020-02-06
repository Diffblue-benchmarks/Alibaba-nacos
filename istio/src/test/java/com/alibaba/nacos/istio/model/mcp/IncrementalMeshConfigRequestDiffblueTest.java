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

public class IncrementalMeshConfigRequestDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    IncrementalMeshConfigRequest.Builder actualNewBuilderResult = IncrementalMeshConfigRequest
        .newBuilder(IncrementalMeshConfigRequest.getDefaultInstance());

    // Assert
    String actualResponseNonce = actualNewBuilderResult.getResponseNonce();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualNewBuilderResult.getTypeUrl());
  }

  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    String actualResponseNonce = ((IncrementalMeshConfigRequest) IncrementalMeshConfigRequest.getDefaultInstance()
        .newInstance(null)).getResponseNonce();
    boolean actualIsInitializedResult = ((IncrementalMeshConfigRequest) IncrementalMeshConfigRequest
        .getDefaultInstance().newInstance(null)).isInitialized();
    assertEquals("", actualResponseNonce);
    assertTrue(actualIsInitializedResult);
    assertEquals("",
        ((IncrementalMeshConfigRequest) IncrementalMeshConfigRequest.getDefaultInstance().newInstance(null))
            .getTypeUrl());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    IncrementalMeshConfigRequest.parseFrom(new byte[24]);
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(IncrementalMeshConfigRequest.getDefaultInstance().isInitialized());
  }

  @Test
  public void hasSinkNodeTest() {
    // Arrange, Act and Assert
    assertFalse(IncrementalMeshConfigRequest.getDefaultInstance().hasSinkNode());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(IncrementalMeshConfigRequest.getDefaultInstance().equals(""));
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    IncrementalMeshConfigRequest.Builder actualNewBuilderResult = IncrementalMeshConfigRequest.newBuilder();

    // Assert
    String actualResponseNonce = actualNewBuilderResult.getResponseNonce();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualNewBuilderResult.getTypeUrl());
  }

  @Test
  public void hasErrorDetailTest() {
    // Arrange, Act and Assert
    assertFalse(IncrementalMeshConfigRequest.getDefaultInstance().hasErrorDetail());
  }

  @Test
  public void getErrorDetailOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(
        IncrementalMeshConfigRequest.getDefaultInstance().getErrorDetailOrBuilder() instanceof com.google.rpc.Status);
  }

  @Test
  public void getTypeUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", IncrementalMeshConfigRequest.getDefaultInstance().getTypeUrl());
  }

  @Test
  public void getSinkNodeOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(IncrementalMeshConfigRequest.getDefaultInstance().getSinkNodeOrBuilder() instanceof SinkNode);
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    IncrementalMeshConfigRequest.Builder actualToBuilderResult = IncrementalMeshConfigRequest.getDefaultInstance()
        .toBuilder();

    // Assert
    String actualResponseNonce = actualToBuilderResult.getResponseNonce();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualToBuilderResult.getTypeUrl());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    IncrementalMeshConfigRequest.Builder actualNewBuilderForTypeResult = IncrementalMeshConfigRequest
        .getDefaultInstance().newBuilderForType();

    // Assert
    String actualResponseNonce = actualNewBuilderForTypeResult.getResponseNonce();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualNewBuilderForTypeResult.getTypeUrl());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    IncrementalMeshConfigRequest actualParseDelimitedFromResult = IncrementalMeshConfigRequest
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualResponseNonce = actualParseDelimitedFromResult.getResponseNonce();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualResponseNonce);
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualParseDelimitedFromResult.getTypeUrl());
  }

  @Test
  public void internalGetMapFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    IncrementalMeshConfigRequest.getDefaultInstance().internalGetMapField(1);
  }

  @Test
  public void getResponseNonceTest() {
    // Arrange, Act and Assert
    assertEquals("", IncrementalMeshConfigRequest.getDefaultInstance().getResponseNonce());
  }
}

