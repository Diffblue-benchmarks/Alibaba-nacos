package com.alibaba.nacos.naming.selector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.naming.exception.NacosException;
import java.util.HashSet;
import java.util.List;
import org.junit.Test;

public class LabelSelectorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("label", (new LabelSelector()).getType());
  }

  @Test
  public void testExpressionInterpreterGetTerms() {
    // Arrange and Act
    List<String> actualTerms = LabelSelector.ExpressionInterpreter.getTerms("CONSUMER.label.");

    // Assert
    assertEquals(1, actualTerms.size());
    assertEquals("CONSUMER.label.", actualTerms.get(0));
  }

  @Test
  public void testExpressionInterpreterParseExpression() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, LabelSelector.ExpressionInterpreter.parseExpression("").size());
  }

  @Test
  public void testParseExpression() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, LabelSelector.parseExpression("").size());
  }

  @Test
  public void testSetLabels() {
    // Arrange
    LabelSelector labelSelector = new LabelSelector();
    HashSet<String> stringSet = new HashSet<String>();
    stringSet.add("foo");

    // Act
    labelSelector.setLabels(stringSet);

    // Assert
    assertSame(stringSet, labelSelector.getLabels());
  }
}

