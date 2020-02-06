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

public class SinkNodeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getAnnotationsTest() {
    // Arrange, Act and Assert
    assertEquals(0, SinkNode.getDefaultInstance().getAnnotations().size());
  }

  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = SinkNode.getDefaultInstance().newInstance(null);

    // Assert
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((SinkNode) actualNewInstanceResult).getSerializedSize();
    String actualId = ((SinkNode) actualNewInstanceResult).getId();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualId);
    assertTrue(((SinkNode) actualNewInstanceResult).isInitialized());
  }

  @Test
  public void parseFromTest2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    SinkNode.parseFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void containsAnnotationsTest() {
    // Arrange, Act and Assert
    assertFalse(SinkNode.getDefaultInstance().containsAnnotations("foo"));
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    SinkNode.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void getAnnotationsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, SinkNode.getDefaultInstance().getAnnotationsCount());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    SinkNode.Builder actualNewBuilderForTypeResult = SinkNode.getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getId());
  }

  @Test
  public void getAnnotationsOrThrowTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    SinkNode.getDefaultInstance().getAnnotationsOrThrow("foo");
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    SinkNode.parseFrom(byteArray);
  }

  @Test
  public void getAnnotationsOrDefaultTest() {
    // Arrange, Act and Assert
    assertEquals("foo", SinkNode.getDefaultInstance().getAnnotationsOrDefault("foo", "foo"));
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    SinkNode.Builder actualToBuilderResult = SinkNode.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getId());
  }

  @Test
  public void getAnnotationsMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, SinkNode.getDefaultInstance().getAnnotationsMap().size());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    SinkNode.Builder actualNewBuilderResult = SinkNode.newBuilder(SinkNode.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getId());
  }

  @Test
  public void internalGetMapFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    SinkNode.getDefaultInstance().internalGetMapField(10);
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, SinkNode.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    SinkNode.Builder actualNewBuilderResult = SinkNode.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getId());
  }
}

