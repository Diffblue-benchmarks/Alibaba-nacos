package com.alibaba.nacos.address.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddressServerParamCheckUtilDiffblueTest {
  @Test
  public void checkIpsTest() {
    // Arrange, Act and Assert
    assertEquals("illegal ip: foo,foo,foo", AddressServerParamCheckUtil.checkIps("foo", "foo", "foo"));
  }
}

