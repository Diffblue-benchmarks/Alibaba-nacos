package com.alibaba.nacos.naming.selector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.api.exception.NacosException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LabelSelectorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getTermsTest() {
    // Arrange and Act
    List<String> actualTerms = LabelSelector.ExpressionInterpreter.getTerms("foo");

    // Assert
    assertEquals(1, actualTerms.size());
    assertEquals("foo", actualTerms.get(0));
  }

  @Test
  public void parseExpressionTest4() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    LabelSelector.ExpressionInterpreter.parseExpression("CONSUMER.label.");
  }

  @Test
  public void parseExpressionTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    LabelSelector.ExpressionInterpreter.parseExpression("foo");
  }

  @Test
  public void parseExpressionTest2() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, LabelSelector.ExpressionInterpreter.parseExpression("").size());
  }

  @Test
  public void parseExpressionTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    LabelSelector.parseExpression("foo");
  }

  @Test
  public void getLabelsTest() {
    // Arrange, Act and Assert
    assertNull((new LabelSelector()).getLabels());
  }

  @Test
  public void setLabelsTest() {
    // Arrange
    LabelSelector labelSelector = new LabelSelector();

    // Act
    labelSelector.setLabels(null);

    // Assert
    assertNull(labelSelector.getLabels());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("label", (new LabelSelector()).getType());
  }
}

