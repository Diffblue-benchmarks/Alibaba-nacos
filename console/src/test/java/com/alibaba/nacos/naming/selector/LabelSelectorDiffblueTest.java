package com.alibaba.nacos.naming.selector;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.naming.exception.NacosException;
import java.util.List;
import org.junit.Test;

public class LabelSelectorDiffblueTest {
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
}

