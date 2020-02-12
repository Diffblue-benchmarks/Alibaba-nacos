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

  @Test(timeout=10000)
  public void selectInstancesTest8() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", "name", null, true, true).size());
  }

  @Test(timeout=10000)
  public void selectOneHealthyInstanceTest8() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("foo")).selectOneHealthyInstance("name", true);
  }

  @Test(timeout=10000)
  public void getAllInstancesTest8() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", "name").size());
  }

  @Test(timeout=10000)
  public void getSubscribeServicesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getSubscribeServices().size());
  }

  @Test(timeout=10000)
  public void selectInstancesTest7() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", true).size());
  }

  @Test(timeout=10000)
  public void getAllInstancesTest7() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", true).size());
  }

  @Test(timeout=10000)
  public void selectInstancesTest6() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", "name", (List<String>) null, true).size());
  }

  @Test(timeout=10000)
  public void selectInstancesTest5() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", "name", true).size());
  }

  @Test(timeout=10000)
  public void selectOneHealthyInstanceTest7() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("foo")).selectOneHealthyInstance("name");
  }

  @Test(timeout=10000)
  public void selectOneHealthyInstanceTest6() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("foo")).selectOneHealthyInstance("name", "name", true);
  }

  @Test(timeout=10000)
  public void selectOneHealthyInstanceTest5() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("foo")).selectOneHealthyInstance("name", (List<String>) null);
  }

  @Test(timeout=10000)
  public void selectOneHealthyInstanceTest4() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("foo")).selectOneHealthyInstance("name", "name");
  }

  @Test(timeout=10000)
  public void selectInstancesTest4() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", true, true).size());
  }

  @Test(timeout=10000)
  public void selectInstancesTest3() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", (List<String>) null, true).size());
  }

  @Test(timeout=10000)
  public void selectOneHealthyInstanceTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("foo")).selectOneHealthyInstance("name", "name", null, true);
  }

  @Test(timeout=10000)
  public void getAllInstancesTest6() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", "name", true).size());
  }

  @Test(timeout=10000)
  public void selectOneHealthyInstanceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("foo")).selectOneHealthyInstance("name", (List<String>) null, true);
  }

  @Test(timeout=10000)
  public void getAllInstancesTest5() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name").size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("DOWN", (new NacosNamingService("foo")).getServerStatus());
  }

  @Test(timeout=10000)
  public void selectInstancesTest2() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", "name", true, true).size());
  }

  @Test(timeout=10000)
  public void getAllInstancesTest4() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", (List<String>) null).size());
  }

  @Test(timeout=10000)
  public void getAllInstancesTest3() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", (List<String>) null, true).size());
  }

  @Test(timeout=10000)
  public void selectOneHealthyInstanceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("foo")).selectOneHealthyInstance("name", "name", (List<String>) null);
  }

  @Test(timeout=10000)
  public void getAllInstancesTest2() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", "name", (List<String>) null).size());
  }

  @Test(timeout=10000)
  public void getAllInstancesTest() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).getAllInstances("name", "name", null, true).size());
  }

  @Test(timeout=10000)
  public void selectInstancesTest() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("foo")).selectInstances("name", (List<String>) null, true, true).size());
  }
}

