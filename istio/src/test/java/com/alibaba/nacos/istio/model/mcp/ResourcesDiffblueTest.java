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
    // Arrange, Act and Assert
    boolean actualIsInitializedResult = ((Resources) Resources.getDefaultInstance().newInstance(null)).isInitialized();
    int actualRemovedResourcesCount = ((Resources) Resources.getDefaultInstance().newInstance(null))
        .getRemovedResourcesCount();
    String actualNonce = ((Resources) Resources.getDefaultInstance().newInstance(null)).getNonce();
    String actualSystemVersionInfo = ((Resources) Resources.getDefaultInstance().newInstance(null))
        .getSystemVersionInfo();
    String actualCollection = ((Resources) Resources.getDefaultInstance().newInstance(null)).getCollection();
    assertEquals(0, ((Resources) Resources.getDefaultInstance().newInstance(null)).getResourcesCount());
    assertEquals("", actualCollection);
    assertEquals("", actualSystemVersionInfo);
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
    assertTrue(actualIsInitializedResult);
  }
  @Test
  public void getResourcesListTest() {
    // Arrange, Act and Assert
    assertEquals(0, Resources.getDefaultInstance().getResourcesList().size());
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
    // Arrange, Act and Assert
    thrown.expect(InvalidProtocolBufferException.class);
    Resources.parseFrom(new byte[24]);
  }
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(Resources.getDefaultInstance().equals(""));
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
    int actualRemovedResourcesCount = actualNewBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderResult.getNonce();
    String actualSystemVersionInfo = actualNewBuilderResult.getSystemVersionInfo();
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
    int actualRemovedResourcesCount = actualToBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualToBuilderResult.getNonce();
    String actualSystemVersionInfo = actualToBuilderResult.getSystemVersionInfo();
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
    int actualRemovedResourcesCount = actualNewBuilderForTypeResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderForTypeResult.getNonce();
    String actualSystemVersionInfo = actualNewBuilderForTypeResult.getSystemVersionInfo();
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
    int actualRemovedResourcesCount = actualNewBuilderResult.getRemovedResourcesCount();
    String actualNonce = actualNewBuilderResult.getNonce();
    String actualSystemVersionInfo = actualNewBuilderResult.getSystemVersionInfo();
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
  public void getNonceTest() {
    // Arrange, Act and Assert
    assertEquals("", Resources.getDefaultInstance().getNonce());
  }
  @Test
  public void getRemovedResourcesBytesTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    Resources.getDefaultInstance().getRemovedResourcesBytes(1);
  }
  @Test
  public void parseDelimitedFromTest() throws IOException {
    // Arrange and Act
    Resources actualParseDelimitedFromResult = Resources.parseDelimitedFrom(new ByteArrayInputStream(new byte[24]));

    // Assert
    boolean actualIsInitializedResult = actualParseDelimitedFromResult.isInitialized();
    int actualRemovedResourcesCount = actualParseDelimitedFromResult.getRemovedResourcesCount();
    String actualNonce = actualParseDelimitedFromResult.getNonce();
    String actualSystemVersionInfo = actualParseDelimitedFromResult.getSystemVersionInfo();
    String actualCollection = actualParseDelimitedFromResult.getCollection();
    assertEquals(0, actualParseDelimitedFromResult.getResourcesCount());
    assertEquals("", actualCollection);
    assertEquals("", actualSystemVersionInfo);
    assertEquals("", actualNonce);
    assertEquals(0, actualRemovedResourcesCount);
    assertTrue(actualIsInitializedResult);
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

