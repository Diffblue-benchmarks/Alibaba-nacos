package com.alibaba.nacos.istio.model;

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

public class GatewayDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getSelectorCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Gateway.getDefaultInstance().getSelectorCount());
  }

  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = Gateway.getDefaultInstance().newInstance(null);

    // Assert
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((Gateway) actualNewInstanceResult).getSerializedSize();
    int actualServersCount = ((Gateway) actualNewInstanceResult).getServersCount();
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
    assertTrue(((Gateway) actualNewInstanceResult).isInitialized());
    assertEquals(0, actualServersCount);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange, Act and Assert
    assertEquals("", Gateway.newBuilder(Gateway.getDefaultInstance()).toString());
  }

  @Test
  public void getServersTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Gateway.getDefaultInstance().getServers(1);
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Gateway.getDefaultInstance().isInitialized());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Gateway.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void newBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", Gateway.newBuilder().toString());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Gateway.getDefaultInstance().equals("foo"));
  }

  @Test
  public void toBuilderTest() {
    // Arrange, Act and Assert
    assertEquals("", Gateway.getDefaultInstance().toBuilder().toString());
  }

  @Test
  public void getServersCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Gateway.getDefaultInstance().getServersCount());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange, Act and Assert
    assertEquals("", Gateway.getDefaultInstance().newBuilderForType().toString());
  }

  @Test
  public void getSelectorOrDefaultTest() {
    // Arrange, Act and Assert
    assertEquals("foo", Gateway.getDefaultInstance().getSelectorOrDefault("foo", "foo"));
  }

  @Test
  public void containsSelectorTest() {
    // Arrange, Act and Assert
    assertFalse(Gateway.getDefaultInstance().containsSelector("foo"));
  }

  @Test
  public void parseFromTest2() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Gateway.parseFrom(byteArray);
  }

  @Test
  public void getServersOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Gateway.getDefaultInstance().getServersOrBuilder(1);
  }

  @Test
  public void parseFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Gateway.parseFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void getServersOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Gateway.getDefaultInstance().getServersOrBuilderList().size());
  }

  @Test
  public void internalGetMapFieldTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Gateway.getDefaultInstance().internalGetMapField(10);
  }

  @Test
  public void getSerializedSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, Gateway.getDefaultInstance().getSerializedSize());
  }

  @Test
  public void getSelectorOrThrowTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Gateway.getDefaultInstance().getSelectorOrThrow("foo");
  }

  @Test
  public void getSelectorMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, Gateway.getDefaultInstance().getSelectorMap().size());
  }

  @Test
  public void getSelectorTest() {
    // Arrange, Act and Assert
    assertEquals(0, Gateway.getDefaultInstance().getSelector().size());
  }
}

