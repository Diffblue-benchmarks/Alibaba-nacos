package com.alibaba.nacos.naming.cluster.transport;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.nacos.naming.pojo.Record;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class FastJsonSerializerDiffblueTest {
  @Autowired
  private FastJsonSerializer fastJsonSerializer;
  @Test
  public void testDeserialize() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);

    // Act and Assert
    assertNull(this.fastJsonSerializer.<Object>deserialize(byteArray, (TypeReference<Object>) null));
  }
  @Test
  public void testDeserializeMap() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);

    // Act and Assert
    assertNull(this.fastJsonSerializer.<Record>deserializeMap(byteArray, Record.class));
  }
  @Test
  public void testSerialize() {
    // Arrange, Act and Assert
    assertEquals(5, this.fastJsonSerializer.<Object>serialize("key").length);
  }
}

