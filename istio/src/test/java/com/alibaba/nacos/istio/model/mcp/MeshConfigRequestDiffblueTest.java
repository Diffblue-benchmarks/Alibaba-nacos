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

public class MeshConfigRequestDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = MeshConfigRequest.getDefaultInstance().newInstance(null);

    // Assert
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((MeshConfigRequest) actualNewInstanceResult).getSerializedSize();
    String actualResponseNonce = ((MeshConfigRequest) actualNewInstanceResult).getResponseNonce();
    String actualVersionInfo = ((MeshConfigRequest) actualNewInstanceResult).getVersionInfo();
    boolean actualIsInitializedResult = ((MeshConfigRequest) actualNewInstanceResult).isInitialized();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualVersionInfo);
    assertEquals("", actualResponseNonce);
    assertTrue(actualIsInitializedResult);
    assertEquals("", ((MeshConfigRequest) actualNewInstanceResult).getTypeUrl());
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
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MeshConfigRequest.parseFrom(byteArray);
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(MeshConfigRequest.getDefaultInstance().equals("foo"));
  }

  @Test
  public void parseFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MeshConfigRequest.parseFrom(new ByteArrayInputStream(byteArray));
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
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    MeshConfigRequest.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
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
  public void getResponseNonceTest() {
    // Arrange, Act and Assert
    assertEquals("", MeshConfigRequest.getDefaultInstance().getResponseNonce());
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, MeshConfigRequest.getDefaultInstance().getSerializedSize());
  }
}

