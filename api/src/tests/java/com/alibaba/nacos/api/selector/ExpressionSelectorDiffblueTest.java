package com.alibaba.nacos.api.selector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ExpressionSelectorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("label", (new ExpressionSelector()).getType());
  }

  @Test(timeout=10000)
  public void getExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new ExpressionSelector()).getExpression());
  }

  @Test(timeout=10000)
  public void setExpressionTest() {
    // Arrange
    ExpressionSelector expressionSelector = new ExpressionSelector();

    // Act
    expressionSelector.setExpression("foo");

    // Assert
    assertEquals("foo", expressionSelector.getExpression());
  }
}

