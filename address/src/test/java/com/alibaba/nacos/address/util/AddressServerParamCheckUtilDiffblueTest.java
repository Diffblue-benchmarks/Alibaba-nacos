package com.alibaba.nacos.address.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddressServerParamCheckUtilDiffblueTest {
  @Test
  public void checkIpsTest() {
    // Arrange, Act and Assert
    assertEquals(
        "illegal ip: (2(5[0-5]{1}|[0-4]\\d{1})|[0-1]?\\d{1,2}" + ")(\\.(2(5[0-5]{1}|[0-4]\\d{1})|[0-1]?\\d{1,2})){3},(2"
            + "(5[0-5]{1}|[0-4]\\d{1})|[0-1]?\\d{1,2})(\\.(2(5[0-5]{1"
            + "}|[0-4]\\d{1})|[0-1]?\\d{1,2})){3},(2(5[0-5]{1}|[0-4"
            + "]\\d{1})|[0-1]?\\d{1,2})(\\.(2(5[0-5]{1}|[0-4]\\d{1})|" + "[0-1]?\\d{1,2})){3}",
        AddressServerParamCheckUtil.checkIps(
            "(2(5[0-5]{1}|[0-4]\\d{1})|[0-1]?\\d{1,2})(\\.(2(5[0-5" + "]{1}|[0-4]\\d{1})|[0-1]?\\d{1,2})){3}",
            "(2(5[0-5]{1}|[0-4]\\d{1})|[0-1]?\\d{1,2})(\\.(2(5[0-5" + "]{1}|[0-4]\\d{1})|[0-1]?\\d{1,2})){3}",
            "(2(5[0-5]{1}|[0-4]\\d{1})|[0-1]?\\d{1,2})(\\.(2(5[0-5" + "]{1}|[0-4]\\d{1})|[0-1]?\\d{1,2})){3}"));
  }
}

