package com.alibaba.nacos.istio.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PortDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = Port.getDefaultInstance().newInstance(null);

    // Assert
    String actualName = ((Port) actualNewInstanceResult).getName();
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((Port) actualNewInstanceResult).getSerializedSize();
    boolean actualIsInitializedResult = ((Port) actualNewInstanceResult).isInitialized();
    assertEquals("", actualName);
    assertEquals("", ((Port) actualNewInstanceResult).getProtocol());
    assertTrue(actualIsInitializedResult);
    assertEquals("", actualToStringResult);
    assertEquals(0, actualSerializedSize);
  }

  @Test
  public void parseFromTest2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Port.parseFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Port.parseFrom(byteArray);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Port.Builder actualNewBuilderResult = Port.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.getProtocol());
    assertEquals("", actualToStringResult);
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Port.Builder actualToBuilderResult = Port.getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    String actualToStringResult = actualToBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualToBuilderResult.getProtocol());
    assertEquals("", actualToStringResult);
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Port.Builder actualNewBuilderForTypeResult = Port.getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderForTypeResult.getProtocol());
    assertEquals("", actualToStringResult);
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Port.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Port.Builder actualNewBuilderResult = Port.newBuilder(Port.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    String actualToStringResult = actualNewBuilderResult.toString();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.getProtocol());
    assertEquals("", actualToStringResult);
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Port.getDefaultInstance().getName());
  }
}

