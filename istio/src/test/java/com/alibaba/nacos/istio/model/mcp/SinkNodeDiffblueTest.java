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

public class SinkNodeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    String actualId = ((SinkNode) SinkNode.getDefaultInstance().newInstance(null)).getId();
    assertEquals("", actualId);
    assertTrue(((SinkNode) SinkNode.getDefaultInstance().newInstance(null)).isInitialized());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(SinkNode.getDefaultInstance().isInitialized());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    SinkNode actualParseDelimitedFromResult = SinkNode.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualId = actualParseDelimitedFromResult.getId();
    assertEquals("", actualId);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(SinkNode.getDefaultInstance().equals(""));
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", SinkNode.getDefaultInstance().newBuilderForType().getId());
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    SinkNode.parseFrom(new byte[24]);
  }

  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", SinkNode.getDefaultInstance().toBuilder().getId());
  }

  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", SinkNode.newBuilder(SinkNode.getDefaultInstance()).getId());
  }

  @Test
  public void getIdTest() {
    // Arrange, Act and Assert
    assertEquals("", SinkNode.getDefaultInstance().getId());
  }

  @Test
  public void internalGetMapFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    SinkNode.getDefaultInstance().internalGetMapField(1);
  }

  @Test
  public void newBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", SinkNode.newBuilder().getId());
  }
}

