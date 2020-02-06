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

public class MetadataDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getVersionTest() {
    // Arrange, Act and Assert
    assertEquals("", Metadata.getDefaultInstance().getVersion());
  }

  @Test
  public void getLabelsOrDefaultTest() {
    // Arrange, Act and Assert
    assertEquals("foo", Metadata.getDefaultInstance().getLabelsOrDefault("foo", "foo"));
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Metadata.getDefaultInstance().isInitialized());
  }

  @Test
  public void containsAnnotationsTest() {
    // Arrange, Act and Assert
    assertFalse(Metadata.getDefaultInstance().containsAnnotations("foo"));
  }

  @Test
  public void getLabelsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Metadata.getDefaultInstance().getLabelsCount());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Metadata.getDefaultInstance().equals("foo"));
  }

  @Test
  public void containsLabelsTest() {
    // Arrange, Act and Assert
    assertFalse(Metadata.getDefaultInstance().containsLabels("foo"));
  }

  @Test
  public void parseFromTest2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Metadata.parseFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void getAnnotationsOrThrowTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Metadata.getDefaultInstance().getAnnotationsOrThrow("foo");
  }

  @Test
  public void getAnnotationsOrDefaultTest() {
    // Arrange, Act and Assert
    assertEquals("foo", Metadata.getDefaultInstance().getAnnotationsOrDefault("foo", "foo"));
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Metadata.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void getCreateTimeOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Metadata.getDefaultInstance().getCreateTimeOrBuilder() instanceof com.google.protobuf.Timestamp);
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Metadata.parseFrom(byteArray);
  }

  @Test
  public void getAnnotationsTest() {
    // Arrange, Act and Assert
    assertEquals(0, Metadata.getDefaultInstance().getAnnotations().size());
  }

  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = Metadata.getDefaultInstance().newInstance(null);

    // Assert
    String actualName = ((Metadata) actualNewInstanceResult).getName();
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((Metadata) actualNewInstanceResult).getSerializedSize();
    boolean actualIsInitializedResult = ((Metadata) actualNewInstanceResult).isInitialized();
    assertEquals("", actualName);
    assertEquals("", ((Metadata) actualNewInstanceResult).getVersion());
    assertEquals("", actualToStringResult);
    assertTrue(actualIsInitializedResult);
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void getAnnotationsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Metadata.getDefaultInstance().getAnnotationsCount());
  }

  @Test
  public void getLabelsMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, Metadata.getDefaultInstance().getLabelsMap().size());
  }

  @Test
  public void hasCreateTimeTest() {
    // Arrange, Act and Assert
    assertFalse(Metadata.getDefaultInstance().hasCreateTime());
  }

  @Test
  public void getAnnotationsMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, Metadata.getDefaultInstance().getAnnotationsMap().size());
  }

  @Test
  public void getLabelsOrThrowTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Metadata.getDefaultInstance().getLabelsOrThrow("foo");
  }

  @Test
  public void internalGetMapFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Metadata.getDefaultInstance().internalGetMapField(10);
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Metadata.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Metadata.getDefaultInstance().getName());
  }

  @Test
  public void getLabelsTest() {
    // Arrange, Act and Assert
    assertEquals(0, Metadata.getDefaultInstance().getLabels().size());
  }
}

