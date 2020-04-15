package com.alibaba.nacos.config.server.filter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.io.IOException;
import javax.servlet.ServletException;
import org.apache.catalina.manager.HTMLManagerServlet;
import org.junit.Test;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class NacosWebFilterDiffblueTest {
  @Test
  public void testDoFilter() throws IOException, ServletException {
    // Arrange
    NacosWebFilter nacosWebFilter = new NacosWebFilter();
    MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();
    HTMLManagerServlet servlet = new HTMLManagerServlet();

    // Act
    nacosWebFilter.doFilter(mockHttpServletRequest, response,
        new MockFilterChain(servlet, new NacosWebFilter(), new NacosWebFilter(), new NacosWebFilter()));

    // Assert
    assertEquals("UTF-8", mockHttpServletRequest.getCharacterEncoding());
    assertEquals(-1, mockHttpServletRequest.getContentLength());
  }

  @Test
  public void testDoFilter2() throws IOException, ServletException {
    // Arrange
    NacosWebFilter nacosWebFilter = new NacosWebFilter();
    MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();

    // Act
    nacosWebFilter.doFilter(mockHttpServletRequest, response, new MockFilterChain());

    // Assert
    assertEquals("UTF-8", mockHttpServletRequest.getCharacterEncoding());
  }

  @Test
  public void testRootPath() {
    // Arrange, Act and Assert
    assertNull(NacosWebFilter.rootPath());
  }
}

