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

public class RequestResourcesDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = RequestResources.getDefaultInstance().newInstance(null);

    // Assert
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((RequestResources) actualNewInstanceResult).getSerializedSize();
    String actualResponseNonce = ((RequestResources) actualNewInstanceResult).getResponseNonce();
    boolean actualIsInitializedResult = ((RequestResources) actualNewInstanceResult).isInitialized();
    assertEquals("", ((RequestResources) actualNewInstanceResult).getCollection());
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertEquals("", actualResponseNonce);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    RequestResources.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void getInitialResourceVersionsOrThrowTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    RequestResources.getDefaultInstance().getInitialResourceVersionsOrThrow("foo");
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(RequestResources.getDefaultInstance().isInitialized());
  }

  @Test
  public void hasSinkNodeTest() {
    // Arrange, Act and Assert
    assertFalse(RequestResources.getDefaultInstance().hasSinkNode());
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    RequestResources.parseFrom(byteArray);
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(RequestResources.getDefaultInstance().equals("foo"));
  }

  @Test
  public void parseFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    RequestResources.parseFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void getIncrementalTest() {
    // Arrange, Act and Assert
    assertFalse(RequestResources.getDefaultInstance().getIncremental());
  }

  @Test
  public void getInitialResourceVersionsOrDefaultTest() {
    // Arrange, Act and Assert
    assertEquals("foo", RequestResources.getDefaultInstance().getInitialResourceVersionsOrDefault("foo", "foo"));
  }

  @Test
  public void hasErrorDetailTest() {
    // Arrange, Act and Assert
    assertFalse(RequestResources.getDefaultInstance().hasErrorDetail());
  }

  @Test
  public void getErrorDetailOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(RequestResources.getDefaultInstance().getErrorDetailOrBuilder() instanceof com.google.rpc.Status);
  }

  @Test
  public void getCollectionTest() {
    // Arrange, Act and Assert
    assertEquals("", RequestResources.getDefaultInstance().getCollection());
  }

  @Test
  public void containsInitialResourceVersionsTest() {
    // Arrange, Act and Assert
    assertFalse(RequestResources.getDefaultInstance().containsInitialResourceVersions("foo"));
  }

  @Test
  public void getSinkNodeOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(RequestResources.getDefaultInstance().getSinkNodeOrBuilder() instanceof SinkNode);
  }

  @Test
  public void getInitialResourceVersionsCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, RequestResources.getDefaultInstance().getInitialResourceVersionsCount());
  }

  @Test
  public void internalGetMapFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    RequestResources.getDefaultInstance().internalGetMapField(10);
  }

  @Test
  public void getInitialResourceVersionsTest() {
    // Arrange, Act and Assert
    assertEquals(0, RequestResources.getDefaultInstance().getInitialResourceVersions().size());
  }

  @Test
  public void getResponseNonceTest() {
    // Arrange, Act and Assert
    assertEquals("", RequestResources.getDefaultInstance().getResponseNonce());
  }

  @Test
  public void getInitialResourceVersionsMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, RequestResources.getDefaultInstance().getInitialResourceVersionsMap().size());
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, RequestResources.getDefaultInstance().getSerializedSize());
  }
}

