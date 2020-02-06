package com.alibaba.nacos.naming.cluster.transport;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.nacos.naming.pojo.Record;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FastJsonSerializerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void deserializeMapTest() {
    // Arrange, Act and Assert
    assertNull((new FastJsonSerializer()).<Record>deserializeMap(new byte[24], null));
  }

  @Test
  public void deserializeTest2() {
    // Arrange, Act and Assert
    thrown.expect(JSONException.class);
    (new FastJsonSerializer()).<Object>deserialize(new byte[24], (Class<Object>) null);
  }

  @Test
  public void serializeTest() {
    // Arrange, Act and Assert
    assertEquals(5, (new FastJsonSerializer()).<Object>serialize("key").length);
  }

  @Test
  public void deserializeTest() {
    // Arrange, Act and Assert
    assertNull((new FastJsonSerializer()).<Object>deserialize(new byte[24], (TypeReference<Object>) null));
  }
}

