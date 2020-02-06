package com.alibaba.nacos.client.naming;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.api.exception.NacosException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NacosNamingServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void selectInstancesTest4() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", true, true).size());
  }

  @Test
  public void selectInstancesTest3() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", (List<String>) null, true).size());
  }

  @Test
  public void selectOneHealthyInstanceTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("foo")).selectOneHealthyInstance("name", "name", null, true);
  }

  @Test
  public void getAllInstancesTest6() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", "name", true).size());
  }

  @Test
  public void selectOneHealthyInstanceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("foo")).selectOneHealthyInstance("name", (List<String>) null, true);
  }

  @Test
  public void getAllInstancesTest5() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name").size());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("DOWN", (new NacosNamingService("foo")).getServerStatus());
  }

  @Test
  public void selectInstancesTest2() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", "name", true, true).size());
  }

  @Test
  public void getAllInstancesTest4() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", (List<String>) null).size());
  }

  @Test
  public void getAllInstancesTest3() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", (List<String>) null, true).size());
  }

  @Test
  public void selectOneHealthyInstanceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("foo")).selectOneHealthyInstance("name", "name", (List<String>) null);
  }

  @Test
  public void getAllInstancesTest2() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", "name", (List<String>) null).size());
  }

  @Test
  public void getAllInstancesTest() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", "name", null, true).size());
  }

  @Test
  public void selectInstancesTest() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", (List<String>) null, true, true).size());
  }
}

