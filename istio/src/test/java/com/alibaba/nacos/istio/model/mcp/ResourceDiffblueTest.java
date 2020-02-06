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

public class ResourceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = Resource.getDefaultInstance().newInstance(null);

    // Assert
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((Resource) actualNewInstanceResult).getSerializedSize();
    assertEquals(0, actualSerializedSize);
    assertTrue(((Resource) actualNewInstanceResult).isInitialized());
    assertEquals("", actualToStringResult);
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Resource.getDefaultInstance().isInitialized());
  }

  @Test
  public void hasMetadataTest() {
    // Arrange, Act and Assert
    assertFalse(Resource.getDefaultInstance().hasMetadata());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Resource.getDefaultInstance().equals("foo"));
  }

  @Test
  public void parseFromTest2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Resource.parseFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Resource.parseFrom(byteArray);
  }

  @Test
  public void hasBodyTest() {
    // Arrange, Act and Assert
    assertFalse(Resource.getDefaultInstance().hasBody());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Resource.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Resource.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void getBodyOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Resource.getDefaultInstance().getBodyOrBuilder() instanceof com.google.protobuf.Any);
  }

  @Test
  public void getMetadataOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Resource.getDefaultInstance().getMetadataOrBuilder() instanceof Metadata);
  }
}

