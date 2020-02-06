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

public class GatewayDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void newInstanceTest() {
    // Arrange, Act and Assert
    int actualServersCount = ((Gateway) Gateway.getDefaultInstance().newInstance(null)).getServersCount();
    assertEquals(0, actualServersCount);
    assertTrue(((Gateway) Gateway.getDefaultInstance().newInstance(null)).isInitialized());
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
    // Arrange and Act
    Gateway actualParseDelimitedFromResult = Gateway.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    int actualServersCount = actualParseDelimitedFromResult.getServersCount();
    assertEquals(0, actualServersCount);
    assertTrue(actualParseDelimitedFromResult.isInitialized());
  }
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Gateway.getDefaultInstance().equals("aaaaa"));
  }
  @Test
  public void getServersCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Gateway.getDefaultInstance().getServersCount());
  }
  @Test
  public void getServersListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Gateway.getDefaultInstance().getServersList().size());
  }
  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Gateway.parseFrom(new byte[24]);
  }
  @Test
  public void getServersOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Gateway.getDefaultInstance().getServersOrBuilder(1);
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
    Gateway.getDefaultInstance().internalGetMapField(1);
  }
}

