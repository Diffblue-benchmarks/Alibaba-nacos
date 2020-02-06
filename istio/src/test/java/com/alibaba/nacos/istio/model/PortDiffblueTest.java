package com.alibaba.nacos.istio.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PortDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    String actualName = ((Port) Port.getDefaultInstance().newInstance(null)).getName();
    boolean actualIsInitializedResult = ((Port) Port.getDefaultInstance().newInstance(null)).isInitialized();
    assertEquals("", actualName);
    assertEquals("", ((Port) Port.getDefaultInstance().newInstance(null)).getProtocol());
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void getProtocolTest() {
    // Arrange, Act and Assert
    assertEquals("", Port.getDefaultInstance().getProtocol());
  }

  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Port.getDefaultInstance().isInitialized());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Port.getDefaultInstance().equals(""));
  }

  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Port.parseFrom(new byte[24]);
  }

  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Port.Builder actualNewBuilderResult = Port.newBuilder();

    // Assert
    String actualName = actualNewBuilderResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.getProtocol());
  }

  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Port.Builder actualToBuilderResult = Port.getDefaultInstance().toBuilder();

    // Assert
    String actualName = actualToBuilderResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualToBuilderResult.getProtocol());
  }

  @Test
  public void getNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, Port.getDefaultInstance().getNumber());
  }

  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Port.Builder actualNewBuilderForTypeResult = Port.getDefaultInstance().newBuilderForType();

    // Assert
    String actualName = actualNewBuilderForTypeResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderForTypeResult.getProtocol());
  }

  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    Port actualParseDelimitedFromResult = Port.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    String actualName = actualParseDelimitedFromResult.getName();
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    assertEquals("", actualName);
    assertEquals("", actualParseDelimitedFromResult.getProtocol());
    assertTrue(actualIsInitializedResult);
  }

  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Port.Builder actualNewBuilderResult = Port.newBuilder(Port.getDefaultInstance());

    // Assert
    String actualName = actualNewBuilderResult.getName();
    assertEquals("", actualName);
    assertEquals("", actualNewBuilderResult.getProtocol());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", Port.getDefaultInstance().getName());
  }
}

