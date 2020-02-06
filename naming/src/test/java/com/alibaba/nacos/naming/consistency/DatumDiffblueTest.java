package com.alibaba.nacos.naming.consistency;

import static org.junit.Assert.assertNull;
import com.alibaba.nacos.naming.pojo.Record;
import org.junit.Test;

public class DatumDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Datum<Record> actualDatum = new Datum<Record>();

    // Assert
    assertNull(actualDatum.key);
    assertNull(actualDatum.value);
  }
}

