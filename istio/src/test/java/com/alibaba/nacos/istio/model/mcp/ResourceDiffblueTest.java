package com.alibaba.nacos.istio.model.mcp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResourceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    assertTrue(((Resource) Resource.getDefaultInstance().newInstance(null)).isInitialized());
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
    assertFalse(Resource.getDefaultInstance().equals("aaaaa"));
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Resource.parseFrom(new byte[24]);
  }

  @Test
  public void hasBodyTest() {
    // Arrange, Act and Assert
    assertFalse(Resource.getDefaultInstance().hasBody());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange, Act and Assert
    assertTrue(Resource.parseDelimitedFrom(new ByteArrayInputStream(new byte[24])).isInitialized());
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

