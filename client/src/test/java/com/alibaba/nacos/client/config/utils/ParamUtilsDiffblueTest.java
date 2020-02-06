package com.alibaba.nacos.client.config.utils;

import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.exception.NacosException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ParamUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void checkKeyParamTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkKeyParam((List<String>) null, "aaaaa");
  }

  @Test
  public void checkBetaIpsTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    ParamUtils.checkBetaIps("aaaaa");
  }

  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue(ParamUtils.isValid("aaaaa"));
  }
}

