package com.alibaba.nacos.naming.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

public class OverrideParameterRequestWrapperDiffblueTest {
  @Test
  public void testBuildRequest() {
    // Arrange
    OverrideParameterRequestWrapper buildRequestResult = OverrideParameterRequestWrapper
        .buildRequest(new MockHttpServletRequest(), "name", "value");

    // Act
    OverrideParameterRequestWrapper actualBuildRequestResult = OverrideParameterRequestWrapper
        .buildRequest(new MockHttpServletRequest(), "name", null);

    // Assert
    assertFalse(buildRequestResult.isTrailerFieldsReady());
    assertFalse(actualBuildRequestResult.isTrailerFieldsReady());
  }

  @Test
  public void testBuildRequest2() {
    // Arrange and Act
    OverrideParameterRequestWrapper actualBuildRequestResult = OverrideParameterRequestWrapper
        .buildRequest(new MockHttpServletRequest());

    // Assert
    assertNull(actualBuildRequestResult.getPathInfo());
    assertTrue(actualBuildRequestResult.getSession() instanceof org.springframework.mock.web.MockHttpSession);
  }

  @Test
  public void testBuildRequest3() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    HashMap<String, String[]> stringStringArrayMap = new HashMap<String, String[]>();
    stringStringArrayMap.put("foo", new String[]{"foo", "foo", "foo"});

    // Act and Assert
    assertFalse(OverrideParameterRequestWrapper.buildRequest(request, stringStringArrayMap).isTrailerFieldsReady());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertFalse((new OverrideParameterRequestWrapper(new MockHttpServletRequest())).isTrailerFieldsReady());
  }

  @Test
  public void testGetParameter() {
    // Arrange, Act and Assert
    assertNull(OverrideParameterRequestWrapper.buildRequest(new MockHttpServletRequest()).getParameter("name"));
  }

  @Test
  public void testGetParameterValues() {
    // Arrange, Act and Assert
    assertNull(OverrideParameterRequestWrapper.buildRequest(new MockHttpServletRequest()).getParameterValues("name"));
  }
}

