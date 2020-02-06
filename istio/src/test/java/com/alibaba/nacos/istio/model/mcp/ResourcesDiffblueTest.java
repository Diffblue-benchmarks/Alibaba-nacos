package com.alibaba.nacos.istio.model.mcp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.ProtocolStringList;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResourcesDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getResourcesOrBuilderListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Resources.getDefaultInstance().getResourcesOrBuilderList().size());
  }
  @Test
  public void newInstanceTest() {
    // Arrange and Act
    Object actualNewInstanceResult = Resources.getDefaultInstance().newInstance(null);

    // Assert
    String actualToStringResult = actualNewInstanceResult.toString();
    int actualSerializedSize = ((Resources) actualNewInstanceResult).getSerializedSize();
    boolean actualIsInitializedResult = ((Resources) actualNewInstanceResult).isInitialized();
    int actualRemovedResourcesCount = ((Resources) actualNewInstanceResult).getRemovedResourcesCount();
    String actualNonce = ((Resources) actualNewInstanceResult).getNonce();
    String actualSystemVersionInfo = ((Resources) actualNewInstanceResult).getSystemVersionInfo();
    String actualCollection = ((Resources) actualNewInstanceResult).getCollection();
    assertEquals("", actualToStringResult);
    assertEquals(0, ((Resources) actualNewInstanceResult).getResourcesCount());
    assertEquals("", actualCollection);
    assertEquals("", actualSystemVersionInfo);
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
    assertEquals(0, actualSerializedSize);
    assertTrue(actualIsInitializedResult);
  }
  @Test
  public void getResourcesListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Resources.getDefaultInstance().getResourcesList().size());
  }
  @Test
  public void parseFromTest2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Resources.parseFrom(new ByteArrayInputStream(byteArray));
  }
  @Test
  public void getRemovedResourcesCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Resources.getDefaultInstance().getRemovedResourcesCount());
  }
  @Test
  public void isInitializedTest() {
    // Arrange, Act and Assert
    assertTrue(Resources.getDefaultInstance().isInitialized());
  }
  @Test
  public void parseFromTest() throws InvalidProtocolBufferException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Resources.parseFrom(byteArray);
  }
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Resources.getDefaultInstance().equals("foo"));
  }
  @Test
  public void getRemovedResourcesListTest() {
    // Arrange and Act
    ProtocolStringList actualRemovedResourcesList = Resources.getDefaultInstance().getRemovedResourcesList();

    // Assert
    assertSame(((LazyStringArrayList) actualRemovedResourcesList).EMPTY, actualRemovedResourcesList);
    assertEquals(0, actualRemovedResourcesList.size());
  }
  @Test
  public void getIncrementalTest() {
    // Arrange, Act and Assert
    assertFalse(Resources.getDefaultInstance().getIncremental());
  }
  @Test
  public void newBuilderTest2() {
    // Arrange and Act
    Resources.Builder actualNewBuilderResult = Resources.newBuilder();

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualRemovedResourcesCount = actualNewBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderResult.getNonce();
    String actualSystemVersionInfo = actualNewBuilderResult.getSystemVersionInfo();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getCollection());
    assertEquals("", actualSystemVersionInfo);
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
  }
  @Test
  public void getResourcesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Resources.getDefaultInstance().getResources(1);
  }
  @Test
  public void getResourcesCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, Resources.getDefaultInstance().getResourcesCount());
  }
  @Test
  public void toBuilderTest() {
    // Arrange and Act
    Resources.Builder actualToBuilderResult = Resources.getDefaultInstance().toBuilder();

    // Assert
    String actualToStringResult = actualToBuilderResult.toString();
    int actualRemovedResourcesCount = actualToBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualToBuilderResult.getNonce();
    String actualSystemVersionInfo = actualToBuilderResult.getSystemVersionInfo();
    assertEquals("", actualToStringResult);
    assertEquals("", actualToBuilderResult.getCollection());
    assertEquals("", actualSystemVersionInfo);
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
  }
  @Test
  public void newBuilderForTypeTest() {
    // Arrange and Act
    Resources.Builder actualNewBuilderForTypeResult = Resources.getDefaultInstance().newBuilderForType();

    // Assert
    String actualToStringResult = actualNewBuilderForTypeResult.toString();
    int actualRemovedResourcesCount = actualNewBuilderForTypeResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderForTypeResult.getNonce();
    String actualSystemVersionInfo = actualNewBuilderForTypeResult.getSystemVersionInfo();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderForTypeResult.getCollection());
    assertEquals("", actualSystemVersionInfo);
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
  }
  @Test
  public void getCollectionTest() {
    // Arrange, Act and Assert
    assertEquals("", Resources.getDefaultInstance().getCollection());
  }
  @Test
  public void newBuilderTest() {
    // Arrange and Act
    Resources.Builder actualNewBuilderResult = Resources.newBuilder(Resources.getDefaultInstance());

    // Assert
    String actualToStringResult = actualNewBuilderResult.toString();
    int actualRemovedResourcesCount = actualNewBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderResult.getNonce();
    String actualSystemVersionInfo = actualNewBuilderResult.getSystemVersionInfo();
    assertEquals("", actualToStringResult);
    assertEquals("", actualNewBuilderResult.getCollection());
    assertEquals("", actualSystemVersionInfo);
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
  }
  @Test
  public void getSystemVersionInfoTest() {
    // Arrange, Act and Assert
    assertEquals("", Resources.getDefaultInstance().getSystemVersionInfo());
  }
  @Test
  public void getRemovedResourcesBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Resources.getDefaultInstance().getRemovedResourcesBytes(1);
  }
  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Resources.parseDelimitedFrom(new ByteArrayInputStream(byteArray));
  }
  @Test
  public void getResourcesOrBuilderTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Resources.getDefaultInstance().getResourcesOrBuilder(1);
  }
  @Test
  public void getRemovedResourcesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Resources.getDefaultInstance().getRemovedResources(1);
  }
}

