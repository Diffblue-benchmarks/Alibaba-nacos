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

public class IncrementalMeshConfigRequestDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = IncrementalMeshConfigRequest.getDefaultInstance().newInstance(null);

    // Assert
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((IncrementalMeshConfigRequest) actualNewInstanceResult).getSerializedSize();
    String actualResponseNonce = ((IncrementalMeshConfigRequest) actualNewInstanceResult).getResponseNonce();
    boolean actualIsInitializedResult = ((IncrementalMeshConfigRequest) actualNewInstanceResult).isInitialized();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualResponseNonce);
    assertTrue(actualIsInitializedResult);
    assertEquals("", ((IncrementalMeshConfigRequest) actualNewInstanceResult).getTypeUrl());
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    IncrementalMeshConfigRequest.parseFrom(byteArray);
  }

  @Test
  public void getInitialResourceVersionsOrThrowTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    IncrementalMeshConfigRequest.getDefaultInstance().getInitialResourceVersionsOrThrow("foo");
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
    assertFalse(IncrementalMeshConfigRequest.getDefaultInstance().equals("foo"));
  }

  @Test
  public void getInitialResourceVersionsOrDefaultTest() {
    // Arrange, Act and Assert
    assertEquals("foo",
        IncrementalMeshConfigRequest.getDefaultInstance().getInitialResourceVersionsOrDefault("foo", "foo"));
  }

  @Test
  public void parseFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    IncrementalMeshConfigRequest.parseFrom(new ByteArrayInputStream(byteArray));
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
  public void containsInitialResourceVersionsTest() {
    // Arrange, Act and Assert
    assertFalse(IncrementalMeshConfigRequest.getDefaultInstance().containsInitialResourceVersions("foo"));
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
  public void getInitialResourceVersionsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, IncrementalMeshConfigRequest.getDefaultInstance().getInitialResourceVersionsCount());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    IncrementalMeshConfigRequest.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void internalGetMapFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    IncrementalMeshConfigRequest.getDefaultInstance().internalGetMapField(10);
  }

  @Test
  public void getInitialResourceVersionsTest() {
    // Arrange, Act and Assert
    assertEquals(0, IncrementalMeshConfigRequest.getDefaultInstance().getInitialResourceVersions().size());
  }

  @Test
  public void getResponseNonceTest() {
    // Arrange, Act and Assert
    assertEquals("", IncrementalMeshConfigRequest.getDefaultInstance().getResponseNonce());
  }

  @Test
  public void getInitialResourceVersionsMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, IncrementalMeshConfigRequest.getDefaultInstance().getInitialResourceVersionsMap().size());
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, IncrementalMeshConfigRequest.getDefaultInstance().getSerializedSize());
  }
}

