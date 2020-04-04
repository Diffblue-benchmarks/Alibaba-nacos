package com.alibaba.nacos.naming.selector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.naming.core.Instance;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class NoneSelectorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("none", (new NoneSelector()).getType());
  }

  @Test
  public void testSelect() {
    // Arrange
    NoneSelector noneSelector = new NoneSelector();
    ArrayList<Instance> instanceList = new ArrayList<Instance>();
    instanceList.add(new Instance());

    // Act
    List<Instance> actualSelectResult = noneSelector.select("consumer", instanceList);

    // Assert
    assertSame(instanceList, actualSelectResult);
    assertEquals(1, actualSelectResult.size());
  }
}

