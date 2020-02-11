package com.alibaba.nacos.cmdb.memory;

import static org.junit.Assert.assertNull;
import com.alibaba.nacos.api.exception.NacosException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CmdbProviderDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void queryEntityTest() throws NacosException {
    // Arrange, Act and Assert
    assertNull((new CmdbProvider()).queryEntity("name", "foo"));
  }

  @Test(timeout=10000)
  public void queryEntitiesByLabelTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new CmdbProvider()).queryEntitiesByLabel("name", "foo");
  }

  @Test(timeout=10000)
  public void queryLabelTest() throws NacosException {
    // Arrange, Act and Assert
    assertNull((new CmdbProvider()).queryLabel("name", "foo", "name"));
  }
}

