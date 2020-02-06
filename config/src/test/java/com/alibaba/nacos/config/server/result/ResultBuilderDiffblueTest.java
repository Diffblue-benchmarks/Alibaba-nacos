package com.alibaba.nacos.config.server.result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.model.RestResult;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResultBuilderDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildSuccessResultTest4() {
    // Arrange and Act
    RestResult<Object> actualBuildSuccessResultResult = ResultBuilder.<Object>buildSuccessResult("foo");

    // Assert
    int actualCode = actualBuildSuccessResultResult.getCode();
    String actualMessage = actualBuildSuccessResultResult.getMessage();
    assertEquals(200, actualCode);
    assertNull(actualBuildSuccessResultResult.getData());
    assertEquals("foo", actualMessage);
  }
  @Test
  public void buildSuccessResultTest3() {
    // Arrange and Act
    RestResult<Object> actualBuildSuccessResultResult = ResultBuilder.<Object>buildSuccessResult((Object) "foo");

    // Assert
    int actualCode = actualBuildSuccessResultResult.getCode();
    String actualMessage = actualBuildSuccessResultResult.getMessage();
    assertEquals(200, actualCode);
    assertTrue(actualBuildSuccessResultResult.getData() instanceof String);
    assertEquals("处理成功", actualMessage);
  }
  @Test
  public void buildSuccessResultTest2() {
    // Arrange and Act
    RestResult<Object> actualBuildSuccessResultResult = ResultBuilder.<Object>buildSuccessResult();

    // Assert
    int actualCode = actualBuildSuccessResultResult.getCode();
    String actualMessage = actualBuildSuccessResultResult.getMessage();
    assertEquals(200, actualCode);
    assertNull(actualBuildSuccessResultResult.getData());
    assertEquals("处理成功", actualMessage);
  }
  @Test
  public void buildSuccessResultTest() {
    // Arrange and Act
    RestResult<Object> actualBuildSuccessResultResult = ResultBuilder.<Object>buildSuccessResult("foo", "foo");

    // Assert
    int actualCode = actualBuildSuccessResultResult.getCode();
    String actualMessage = actualBuildSuccessResultResult.getMessage();
    assertEquals(200, actualCode);
    assertTrue(actualBuildSuccessResultResult.getData() instanceof String);
    assertEquals("foo", actualMessage);
  }
  @Test
  public void buildResultTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ResultBuilder.<Object>buildResult(null, "foo");
  }
}

