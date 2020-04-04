package com.alibaba.nacos.naming.consistency;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.exception.NacosException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class DelegateConsistencyServiceImplDiffblueTest {
  @Autowired
  private DelegateConsistencyServiceImpl delegateConsistencyServiceImpl;
  @Test
  public void testGet() throws NacosException {
    // Arrange, Act and Assert
    assertNull(this.delegateConsistencyServiceImpl.get("com.alibaba.nacos.naming.domains.meta."));
  }
  @Test
  public void testIsAvailable() {
    // Arrange, Act and Assert
    assertTrue(this.delegateConsistencyServiceImpl.isAvailable());
  }
}

