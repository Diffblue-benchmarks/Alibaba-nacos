package com.alibaba.nacos.config.server.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.model.RestResult;
import org.junit.Test;

public class ResultBuilderDiffblueTest {
  @Test
  public void testBuildSuccessResult() {
    // Arrange and Act
    RestResult<Object> actualBuildSuccessResultResult = ResultBuilder.<Object>buildSuccessResult("successMsg",
        "resultData");

    // Assert
    assertEquals(200, actualBuildSuccessResultResult.getCode());
    assertTrue(actualBuildSuccessResultResult.getData() instanceof String);
    assertEquals("successMsg", actualBuildSuccessResultResult.getMessage());
  }

  @Test
  public void testBuildSuccessResult2() {
    // Arrange and Act
    RestResult<Object> actualBuildSuccessResultResult = ResultBuilder.<Object>buildSuccessResult("successMsg");

    // Assert
    assertEquals(200, actualBuildSuccessResultResult.getCode());
    assertNull(actualBuildSuccessResultResult.getData());
    assertEquals("successMsg", actualBuildSuccessResultResult.getMessage());
  }
}

