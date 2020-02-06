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

public class MetadataDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getVersionTest() {
    // Arrange, Act and Assert
    assertEquals("", Metadata.getDefaultInstance().getVersion());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Metadata.getDefaultInstance().isInitialized());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Metadata.getDefaultInstance().equals(""));
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Metadata.Builder actualNewBuilderResult = Metadata.newBuilder(Metadata.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.getVersion());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Metadata.Builder actualNewBuilderResult = Metadata.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.getVersion());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Metadata.Builder actualToBuilderResult = Metadata.getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualToBuilderResult.getVersion());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    Metadata actualParseDelimitedFromResult = Metadata.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualName = actualParseDelimitedFromResult.getName();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualName);
    assertEquals("", actualParseDelimitedFromResult.getVersion());
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void getCreateTimeOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(Metadata.getDefaultInstance().getCreateTimeOrBuilder() instanceof com.google.protobuf.Timestamp);
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Metadata.parseFrom(new byte[24]);
  }

  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    String actualName = ((Metadata) Metadata.getDefaultInstance().newInstance(null)).getName();
    boolean actualIsInitializedResult = ((Metadata) Metadata.getDefaultInstance().newInstance(null)).isInitialized();
    assertEquals("", actualName);
    assertEquals("", ((Metadata) Metadata.getDefaultInstance().newInstance(null)).getVersion());
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void hasCreateTimeTest() {
    // Arrange, Act and Assert
    assertFalse(Metadata.getDefaultInstance().hasCreateTime());
  }

  @Test
  public void internalGetMapFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Metadata.getDefaultInstance().internalGetMapField(1);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Metadata.Builder actualNewBuilderForTypeResult = Metadata.getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderForTypeResult.getVersion());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Metadata.getDefaultInstance().getName());
  }
}

