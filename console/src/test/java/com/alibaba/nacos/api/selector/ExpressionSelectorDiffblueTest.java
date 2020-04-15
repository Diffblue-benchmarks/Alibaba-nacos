package com.alibaba.nacos.api.selector;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExpressionSelectorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("label", (new ExpressionSelector()).getType());
  }

  @Test
  public void testSetExpression() {
    // Arrange
    ExpressionSelector expressionSelector = new ExpressionSelector();

    // Act
    expressionSelector.setExpression("expression");

    // Assert
    assertEquals("expression", expressionSelector.getExpression());
  }
}

