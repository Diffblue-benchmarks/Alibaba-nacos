package com.alibaba.nacos.client.naming;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.pojo.Instance;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NacosNamingServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void selectInstancesTest5() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("")).selectInstances("", "", true).size());
  }

  @Test
  public void getServerStatusTest() {
    // Arrange, Act and Assert
    assertEquals("DOWN", (new NacosNamingService("")).getServerStatus());
  }

  @Test
  public void selectOneHealthyInstanceTest7() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("")).selectOneHealthyInstance("");
  }

  @Test
  public void selectOneHealthyInstanceTest6() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("")).selectOneHealthyInstance("", "", true);
  }

  @Test
  public void selectOneHealthyInstanceTest5() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("")).selectOneHealthyInstance("", (List<String>) null);
  }

  @Test
  public void selectOneHealthyInstanceTest4() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("")).selectOneHealthyInstance("", "");
  }

  @Test
  public void selectInstancesTest4() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("")).selectInstances("", true, true).size());
  }

  @Test
  public void selectInstancesTest3() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("")).selectInstances("", (List<String>) null, true).size());
  }

  @Test
  public void getServicesOfServerTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingService("")).getServicesOfServer(1, 1, "");
  }

  @Test
  public void selectOneHealthyInstanceTest3() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("")).selectOneHealthyInstance("", "", null, true);
  }

  @Test
  public void getAllInstancesTest6() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("")).getAllInstances("", "", true).size());
  }

  @Test
  public void selectOneHealthyInstanceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("")).selectOneHealthyInstance("", (List<String>) null, true);
  }

  @Test
  public void deregisterInstanceTest5() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingService("")).deregisterInstance("", "", 1);
  }

  @Test
  public void getAllInstancesTest5() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("")).getAllInstances("").size());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("DOWN", (new NacosNamingService("")).getServerStatus());
  }

  @Test
  public void deregisterInstanceTest4() throws NacosException {
    // Arrange
    NacosNamingService nacosNamingService = new NacosNamingService("");

    // Act and Assert
    thrown.expect(NacosException.class);
    nacosNamingService.deregisterInstance("", "", new Instance());
  }

  @Test
  public void selectInstancesTest2() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("")).selectInstances("", "", true, true).size());
  }

  @Test
  public void getAllInstancesTest4() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("")).getAllInstances("", (List<String>) null).size());
  }

  @Test
  public void getAllInstancesTest3() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("")).getAllInstances("", (List<String>) null, true).size());
  }

  @Test
  public void deregisterInstanceTest3() throws NacosException {
    // Arrange
    NacosNamingService nacosNamingService = new NacosNamingService("");

    // Act and Assert
    thrown.expect(NacosException.class);
    nacosNamingService.deregisterInstance("", new Instance());
  }

  @Test
  public void deregisterInstanceTest2() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingService("")).deregisterInstance("", "", 1, "");
  }

  @Test
  public void selectOneHealthyInstanceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new NacosNamingService("")).selectOneHealthyInstance("", "", (List<String>) null);
  }

  @Test
  public void getServicesOfServerTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingService("")).getServicesOfServer(1, 1);
  }

  @Test
  public void getAllInstancesTest2() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("")).getAllInstances("", "", (List<String>) null).size());
  }

  @Test
  public void deregisterInstanceTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new NacosNamingService("")).deregisterInstance("", "", "", 1, "");
  }

  @Test
  public void getAllInstancesTest() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("")).getAllInstances("", "", null, true).size());
  }

  @Test
  public void selectInstancesTest() throws NacosException {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosNamingService("")).selectInstances("", (List<String>) null, true, true).size());
  }
}

