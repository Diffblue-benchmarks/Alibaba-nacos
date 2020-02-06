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

public class RequestResourcesDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    String actualResponseNonce = ((RequestResources) RequestResources.getDefaultInstance().newInstance(null))
        .getResponseNonce();
    boolean actualIsInitializedResult = ((RequestResources) RequestResources.getDefaultInstance().newInstance(null))
        .isInitialized();
    assertEquals("", ((RequestResources) RequestResources.getDefaultInstance().newInstance(null)).getCollection());
    assertEquals("", actualResponseNonce);
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    RequestResources actualParseDelimitedFromResult = RequestResources
        .parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualResponseNonce = actualParseDelimitedFromResult.getResponseNonce();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualParseDelimitedFromResult.getCollection());
    assertEquals("", actualResponseNonce);
    assertTrue(actualIsInitializedResult);
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
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    RequestResources.parseFrom(new byte[24]);
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(RequestResources.getDefaultInstance().equals(""));
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    RequestResources.Builder actualNewBuilderResult = RequestResources.newBuilder();

    // Assert
    String actualResponseNonce = actualNewBuilderResult.getResponseNonce();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualNewBuilderResult.getCollection());
  }

  @Test
  public void getIncrementalTest() {
    // Arrange, Act and Assert
    assertFalse(RequestResources.getDefaultInstance().getIncremental());
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
  public void getSinkNodeOrBuilderTest() {
    // Arrange, Act and Assert
    assertTrue(RequestResources.getDefaultInstance().getSinkNodeOrBuilder() instanceof SinkNode);
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    RequestResources.Builder actualToBuilderResult = RequestResources.getDefaultInstance().toBuilder();

    // Assert
    String actualResponseNonce = actualToBuilderResult.getResponseNonce();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualToBuilderResult.getCollection());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    RequestResources.Builder actualNewBuilderForTypeResult = RequestResources.getDefaultInstance().newBuilderForType();

    // Assert
    String actualResponseNonce = actualNewBuilderForTypeResult.getResponseNonce();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualNewBuilderForTypeResult.getCollection());
  }

  @Test
  public void internalGetMapFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    RequestResources.getDefaultInstance().internalGetMapField(1);
  }

  @Test
  public void getResponseNonceTest() {
    // Arrange, Act and Assert
    assertEquals("", RequestResources.getDefaultInstance().getResponseNonce());
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    RequestResources.Builder actualNewBuilderResult = RequestResources
        .newBuilder(RequestResources.getDefaultInstance());

    // Assert
    String actualResponseNonce = actualNewBuilderResult.getResponseNonce();
    assertEquals("", actualResponseNonce);
    assertEquals("", actualNewBuilderResult.getCollection());
  }
}

