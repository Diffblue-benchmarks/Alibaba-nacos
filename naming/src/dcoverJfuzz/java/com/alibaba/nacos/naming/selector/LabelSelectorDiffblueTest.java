package com.alibaba.nacos.naming.selector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.naming.exception.NacosException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LabelSelectorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getTermsTest() {
    // Arrange and Act
    List<String> actualTerms = LabelSelector.ExpressionInterpreter.getTerms("foo");

    // Assert
    assertEquals(1, actualTerms.size());
    assertEquals("foo", actualTerms.get(0));
  }

  @Test(timeout=10000)
  public void parseExpressionTest4() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, LabelSelector.ExpressionInterpreter.parseExpression("").size());
  }

  @Test(timeout=10000)
  public void parseExpressionTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    LabelSelector.ExpressionInterpreter.parseExpression("foo");
  }

  @Test(timeout=10000)
  public void parseExpressionTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    LabelSelector.ExpressionInterpreter.parseExpression("CONSUMER.label.");
  }

  @Test(timeout=10000)
  public void parseExpressionTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    LabelSelector.parseExpression("foo");
  }

  @Test(timeout=10000)
  public void getLabelsTest() {
    // Arrange, Act and Assert
    assertNull((new LabelSelector()).getLabels());
  }

  @Test(timeout=10000)
  public void setLabelsTest() {
    // Arrange
    LabelSelector labelSelector = new LabelSelector();

    // Act
    labelSelector.setLabels(null);

    // Assert
    assertNull(labelSelector.getLabels());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("label", (new LabelSelector()).getType());
  }
}

