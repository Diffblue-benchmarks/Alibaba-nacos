package com.alibaba.nacos.cmdb.memory;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class CmdbProviderDiffblueTest {
  @Autowired
  private CmdbProvider cmdbProvider;
  @Test
  public void testQueryEntity() {
    // Arrange, Act and Assert
    assertNull(this.cmdbProvider.queryEntity("entityName", "entityType"));
  }
  @Test
  public void testQueryLabel() {
    // Arrange, Act and Assert
    assertNull(this.cmdbProvider.queryLabel("entityName", "entityType", "labelName"));
  }
}

