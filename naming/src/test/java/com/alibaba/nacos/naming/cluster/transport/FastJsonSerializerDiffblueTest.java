package com.alibaba.nacos.naming.cluster.transport;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.nacos.naming.pojo.Record;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FastJsonSerializerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void deserializeMapTest() {
    // Arrange
    FastJsonSerializer fastJsonSerializer = new FastJsonSerializer();
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertNull(fastJsonSerializer.<Record>deserializeMap(byteArray, null));
  }

  @Test
  public void deserializeTest2() {
    // Arrange
    FastJsonSerializer fastJsonSerializer = new FastJsonSerializer();
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(JSONException.class);
    fastJsonSerializer.<Object>deserialize(byteArray, (Class<Object>) null);
  }

  @Test
  public void serializeTest() {
    // Arrange, Act and Assert
    assertEquals(5, (new FastJsonSerializer()).<Object>serialize("foo").length);
  }

  @Test
  public void deserializeTest() {
    // Arrange
    FastJsonSerializer fastJsonSerializer = new FastJsonSerializer();
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertNull(fastJsonSerializer.<Object>deserialize(byteArray, (TypeReference<Object>) null));
  }
}

