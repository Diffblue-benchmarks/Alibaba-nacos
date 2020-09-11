package com.alibaba.nacos.naming.web;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;

import com.sun.security.auth.UserPrincipal;

import java.util.HashMap;

import javax.servlet.DispatcherType;
import javax.servlet.http.Cookie;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;

/**
 * Unit tests for com.alibaba.nacos.naming.web.OverrideParameterRequestWrapper
 *
 * @author Diffblue Cover
 */

public class OverrideParameterRequestWrapperTest {

    @Test
    public void buildRequest() throws java.io.IOException {

        // arrange
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setMethod("GET");
        request.addUserRole("/some/path.html");
        request.setRequestURI("/some/path.html");
        request.setRequestedSessionId("1234");
        MockHttpSession session = new MockHttpSession();
        session.setAttribute("name", new Object());
        session.setNew(false);
        request.setSession(session);
        request.setQueryString("foo=bar");
        request.setUserPrincipal(new UserPrincipal("root"));
        request.setAuthType("BASIC");
        request.setSecure(false);
        request.setProtocol("HTTP/1.1");
        request.setCookies(new Cookie("name", "value"));

        // act
        OverrideParameterRequestWrapper result =
             OverrideParameterRequestWrapper.buildRequest(request);

        // assert
        assertThat(result.getParameterMap().isEmpty(), is(true));
        assertThat(result.getRequest().getAsyncContext(), is(nullValue()));
        assertThat(result.getRequest().getAttributeNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getContentLength(), is(-1));
        assertThat(result.getRequest().getContentLengthLong(), is(-1L));
        assertThat(result.getRequest().getContentType(), is(nullValue()));
        assertThat(result.getRequest().getDispatcherType(), is(DispatcherType.REQUEST));
        assertThat(result.getRequest().getInputStream().isFinished(), is(false));
        assertThat(result.getRequest().getInputStream().isReady(), is(true));
        assertThat(result.getRequest().getLocalAddr(), is("127.0.0.1"));
        assertThat(result.getRequest().getLocalName(), is("localhost"));
        assertThat(result.getRequest().getLocalPort(), is(80));
        assertThat(result.getRequest().getLocale().getDisplayName(), is("English"));
        assertThat(result.getRequest().getLocales().hasMoreElements(), is(true));
        assertThat(result.getRequest().getParameterMap().isEmpty(), is(true));
        assertThat(result.getRequest().getParameterNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getProtocol(), is("HTTP/1.1"));
        assertThat(result.getRequest().getRemoteAddr(), is("127.0.0.1"));
        assertThat(result.getRequest().getRemoteHost(), is("localhost"));
        assertThat(result.getRequest().getRemotePort(), is(80));
        assertThat(result.getRequest().getScheme(), is("http"));
        assertThat(result.getRequest().getServerName(), is("localhost"));
        assertThat(result.getRequest().getServerPort(), is(80));
        assertThat(result.getRequest().getServletContext().getAttributeNames().hasMoreElements(), is(true));
        assertThat(result.getRequest().getServletContext().getContextPath(), is(""));
        assertThat(result.getRequest().getServletContext().getDefaultSessionTrackingModes(), hasSize(3));
        assertThat(result.getRequest().getServletContext().getEffectiveMajorVersion(), is(3));
        assertThat(result.getRequest().getServletContext().getEffectiveMinorVersion(), is(1));
        assertThat(result.getRequest().getServletContext().getEffectiveSessionTrackingModes(), hasSize(3));
        assertThat(result.getRequest().getServletContext().getFilterRegistrations().isEmpty(), is(true));
        assertThat(result.getRequest().getServletContext().getInitParameterNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getMajorVersion(), is(3));
        assertThat(result.getRequest().getServletContext().getMinorVersion(), is(1));
        assertThat(result.getRequest().getServletContext().getRequestCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getResponseCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getServerInfo(), is("MockServletContext"));
        assertThat(result.getRequest().getServletContext().getServletContextName(), is("MockServletContext"));
        assertThat(result.getRequest().getServletContext().getServletNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getServletRegistrations().isEmpty(), is(true));
        assertThat(result.getRequest().getServletContext().getServlets().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getComment(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getDomain(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getMaxAge(), is(-1));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getName(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getPath(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().isHttpOnly(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().isSecure(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionTimeout(), is(0));
        assertThat(result.getRequest().isAsyncStarted(), is(false));
        assertThat(result.getRequest().isAsyncSupported(), is(false));
        assertThat(result.getRequest().isSecure(), is(false));
    }

    @Test
    public void buildRequestNameIsName() throws java.io.IOException {

        // arrange
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setMethod("GET");
        request.addUserRole("bar");
        request.setRequestURI("/some/path.html");
        request.setRequestedSessionId("1234");
        MockHttpSession session = new MockHttpSession();
        session.setAttribute("name", new Object());
        session.setNew(false);
        request.setSession(session);
        request.setQueryString("foo=bar");
        request.setUserPrincipal(new UserPrincipal("root"));
        request.setAuthType("BASIC");
        request.setSecure(false);
        request.setProtocol("HTTP/1.1");
        request.setCookies(new Cookie("name", "value"));

        // act
        OverrideParameterRequestWrapper result =
             OverrideParameterRequestWrapper.buildRequest(request, "name", "/some/path.html");

        // assert
        assertThat(result.getParameterMap().get("name"), Matchers.arrayContaining("/some/path.html"));
        assertThat(result.getRequest().getAsyncContext(), is(nullValue()));
        assertThat(result.getRequest().getAttributeNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getContentLength(), is(-1));
        assertThat(result.getRequest().getContentLengthLong(), is(-1L));
        assertThat(result.getRequest().getContentType(), is(nullValue()));
        assertThat(result.getRequest().getDispatcherType(), is(DispatcherType.REQUEST));
        assertThat(result.getRequest().getInputStream().isFinished(), is(false));
        assertThat(result.getRequest().getInputStream().isReady(), is(true));
        assertThat(result.getRequest().getLocalAddr(), is("127.0.0.1"));
        assertThat(result.getRequest().getLocalName(), is("localhost"));
        assertThat(result.getRequest().getLocalPort(), is(80));
        assertThat(result.getRequest().getLocale().getDisplayName(), is("English"));
        assertThat(result.getRequest().getLocales().hasMoreElements(), is(true));
        assertThat(result.getRequest().getParameterMap().isEmpty(), is(true));
        assertThat(result.getRequest().getParameterNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getProtocol(), is("HTTP/1.1"));
        assertThat(result.getRequest().getRemoteAddr(), is("127.0.0.1"));
        assertThat(result.getRequest().getRemoteHost(), is("localhost"));
        assertThat(result.getRequest().getRemotePort(), is(80));
        assertThat(result.getRequest().getScheme(), is("http"));
        assertThat(result.getRequest().getServerName(), is("localhost"));
        assertThat(result.getRequest().getServerPort(), is(80));
        assertThat(result.getRequest().getServletContext().getAttributeNames().hasMoreElements(), is(true));
        assertThat(result.getRequest().getServletContext().getContextPath(), is(""));
        assertThat(result.getRequest().getServletContext().getDefaultSessionTrackingModes(), hasSize(3));
        assertThat(result.getRequest().getServletContext().getEffectiveMajorVersion(), is(3));
        assertThat(result.getRequest().getServletContext().getEffectiveMinorVersion(), is(1));
        assertThat(result.getRequest().getServletContext().getEffectiveSessionTrackingModes(), hasSize(3));
        assertThat(result.getRequest().getServletContext().getFilterRegistrations().isEmpty(), is(true));
        assertThat(result.getRequest().getServletContext().getInitParameterNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getMajorVersion(), is(3));
        assertThat(result.getRequest().getServletContext().getMinorVersion(), is(1));
        assertThat(result.getRequest().getServletContext().getRequestCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getResponseCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getServerInfo(), is("MockServletContext"));
        assertThat(result.getRequest().getServletContext().getServletContextName(), is("MockServletContext"));
        assertThat(result.getRequest().getServletContext().getServletNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getServletRegistrations().isEmpty(), is(true));
        assertThat(result.getRequest().getServletContext().getServlets().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getComment(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getDomain(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getMaxAge(), is(-1));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getName(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getPath(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().isHttpOnly(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().isSecure(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionTimeout(), is(0));
        assertThat(result.getRequest().isAsyncStarted(), is(false));
        assertThat(result.getRequest().isAsyncSupported(), is(false));
        assertThat(result.getRequest().isSecure(), is(false));
    }

    @Test
    public void buildRequestNameIsNameAndValueIsNull() throws java.io.IOException {

        // arrange
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setMethod("GET");
        request.addUserRole("/some/path.html");
        request.setRequestURI("/some/path.html");
        request.setRequestedSessionId("1234");
        MockHttpSession session = new MockHttpSession();
        session.setAttribute("name", new Object());
        session.setNew(false);
        request.setSession(session);
        request.setQueryString("foo=bar");
        request.setUserPrincipal(new UserPrincipal("root"));
        request.setAuthType("BASIC");
        request.setSecure(false);
        request.setProtocol("HTTP/1.1");
        request.setCookies(new Cookie("name", "value"));

        // act
        OverrideParameterRequestWrapper result =
             OverrideParameterRequestWrapper.buildRequest(request, "name", null);

        // assert
        assertThat(result.getParameterMap().isEmpty(), is(true));
        assertThat(result.getRequest().getAsyncContext(), is(nullValue()));
        assertThat(result.getRequest().getAttributeNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getContentLength(), is(-1));
        assertThat(result.getRequest().getContentLengthLong(), is(-1L));
        assertThat(result.getRequest().getContentType(), is(nullValue()));
        assertThat(result.getRequest().getDispatcherType(), is(DispatcherType.REQUEST));
        assertThat(result.getRequest().getInputStream().isFinished(), is(false));
        assertThat(result.getRequest().getInputStream().isReady(), is(true));
        assertThat(result.getRequest().getLocalAddr(), is("127.0.0.1"));
        assertThat(result.getRequest().getLocalName(), is("localhost"));
        assertThat(result.getRequest().getLocalPort(), is(80));
        assertThat(result.getRequest().getLocale().getDisplayName(), is("English"));
        assertThat(result.getRequest().getLocales().hasMoreElements(), is(true));
        assertThat(result.getRequest().getParameterMap().isEmpty(), is(true));
        assertThat(result.getRequest().getParameterNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getProtocol(), is("HTTP/1.1"));
        assertThat(result.getRequest().getRemoteAddr(), is("127.0.0.1"));
        assertThat(result.getRequest().getRemoteHost(), is("localhost"));
        assertThat(result.getRequest().getRemotePort(), is(80));
        assertThat(result.getRequest().getScheme(), is("http"));
        assertThat(result.getRequest().getServerName(), is("localhost"));
        assertThat(result.getRequest().getServerPort(), is(80));
        assertThat(result.getRequest().getServletContext().getAttributeNames().hasMoreElements(), is(true));
        assertThat(result.getRequest().getServletContext().getContextPath(), is(""));
        assertThat(result.getRequest().getServletContext().getDefaultSessionTrackingModes(), hasSize(3));
        assertThat(result.getRequest().getServletContext().getEffectiveMajorVersion(), is(3));
        assertThat(result.getRequest().getServletContext().getEffectiveMinorVersion(), is(1));
        assertThat(result.getRequest().getServletContext().getEffectiveSessionTrackingModes(), hasSize(3));
        assertThat(result.getRequest().getServletContext().getFilterRegistrations().isEmpty(), is(true));
        assertThat(result.getRequest().getServletContext().getInitParameterNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getMajorVersion(), is(3));
        assertThat(result.getRequest().getServletContext().getMinorVersion(), is(1));
        assertThat(result.getRequest().getServletContext().getRequestCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getResponseCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getServerInfo(), is("MockServletContext"));
        assertThat(result.getRequest().getServletContext().getServletContextName(), is("MockServletContext"));
        assertThat(result.getRequest().getServletContext().getServletNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getServletRegistrations().isEmpty(), is(true));
        assertThat(result.getRequest().getServletContext().getServlets().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getComment(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getDomain(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getMaxAge(), is(-1));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getName(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getPath(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().isHttpOnly(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().isSecure(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionTimeout(), is(0));
        assertThat(result.getRequest().isAsyncStarted(), is(false));
        assertThat(result.getRequest().isAsyncSupported(), is(false));
        assertThat(result.getRequest().isSecure(), is(false));
    }

    @Test
    public void buildRequestAppendParametersIsFoo() throws java.io.IOException {

        // arrange
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setMethod("GET");
        request.addUserRole("/some/path.html");
        request.setRequestURI("/some/path.html");
        request.setRequestedSessionId("1234");
        MockHttpSession session = new MockHttpSession();
        session.setAttribute("name", new Object());
        session.setNew(false);
        request.setSession(session);
        request.setQueryString("foo=bar");
        request.setUserPrincipal(new UserPrincipal("root"));
        request.setAuthType("BASIC");
        request.setSecure(false);
        request.setProtocol("HTTP/1.1");
        request.setCookies(new Cookie("name", "value"));
        HashMap<String, String[]> appendParameters =
             new HashMap<String, String[]>();
        String[] x282 = new String[] { "foo" };
        appendParameters.put("foo", x282);

        // act
        OverrideParameterRequestWrapper result =
             OverrideParameterRequestWrapper.buildRequest(request, appendParameters);

        // assert
        assertThat(result.getParameterMap().get("foo"), Matchers.arrayContaining("foo"));
        assertThat(result.getRequest().getAsyncContext(), is(nullValue()));
        assertThat(result.getRequest().getAttributeNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getContentLength(), is(-1));
        assertThat(result.getRequest().getContentLengthLong(), is(-1L));
        assertThat(result.getRequest().getContentType(), is(nullValue()));
        assertThat(result.getRequest().getDispatcherType(), is(DispatcherType.REQUEST));
        assertThat(result.getRequest().getInputStream().isFinished(), is(false));
        assertThat(result.getRequest().getInputStream().isReady(), is(true));
        assertThat(result.getRequest().getLocalAddr(), is("127.0.0.1"));
        assertThat(result.getRequest().getLocalName(), is("localhost"));
        assertThat(result.getRequest().getLocalPort(), is(80));
        assertThat(result.getRequest().getLocale().getDisplayName(), is("English"));
        assertThat(result.getRequest().getLocales().hasMoreElements(), is(true));
        assertThat(result.getRequest().getParameterMap().isEmpty(), is(true));
        assertThat(result.getRequest().getParameterNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getProtocol(), is("HTTP/1.1"));
        assertThat(result.getRequest().getRemoteAddr(), is("127.0.0.1"));
        assertThat(result.getRequest().getRemoteHost(), is("localhost"));
        assertThat(result.getRequest().getRemotePort(), is(80));
        assertThat(result.getRequest().getScheme(), is("http"));
        assertThat(result.getRequest().getServerName(), is("localhost"));
        assertThat(result.getRequest().getServerPort(), is(80));
        assertThat(result.getRequest().getServletContext().getAttributeNames().hasMoreElements(), is(true));
        assertThat(result.getRequest().getServletContext().getContextPath(), is(""));
        assertThat(result.getRequest().getServletContext().getDefaultSessionTrackingModes(), hasSize(3));
        assertThat(result.getRequest().getServletContext().getEffectiveMajorVersion(), is(3));
        assertThat(result.getRequest().getServletContext().getEffectiveMinorVersion(), is(1));
        assertThat(result.getRequest().getServletContext().getEffectiveSessionTrackingModes(), hasSize(3));
        assertThat(result.getRequest().getServletContext().getFilterRegistrations().isEmpty(), is(true));
        assertThat(result.getRequest().getServletContext().getInitParameterNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getMajorVersion(), is(3));
        assertThat(result.getRequest().getServletContext().getMinorVersion(), is(1));
        assertThat(result.getRequest().getServletContext().getRequestCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getResponseCharacterEncoding(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getServerInfo(), is("MockServletContext"));
        assertThat(result.getRequest().getServletContext().getServletContextName(), is("MockServletContext"));
        assertThat(result.getRequest().getServletContext().getServletNames().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getServletRegistrations().isEmpty(), is(true));
        assertThat(result.getRequest().getServletContext().getServlets().hasMoreElements(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getComment(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getDomain(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getMaxAge(), is(-1));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getName(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().getPath(), is(nullValue()));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().isHttpOnly(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionCookieConfig().isSecure(), is(false));
        assertThat(result.getRequest().getServletContext().getSessionTimeout(), is(0));
        assertThat(result.getRequest().isAsyncStarted(), is(false));
        assertThat(result.getRequest().isAsyncSupported(), is(false));
        assertThat(result.getRequest().isSecure(), is(false));
    }

    @Test
    public void getParameterNameIsNameReturnsNull() throws java.io.IOException {
        assertThat(new OverrideParameterRequestWrapper(new MockHttpServletRequest()).getParameter("name"), is(nullValue()));
    }

    @Test
    public void getParameterValuesNameIsNameReturnsNull() throws java.io.IOException {
        assertThat(new OverrideParameterRequestWrapper(new MockHttpServletRequest()).getParameterValues("name"), is(nullValue()));
    }
}
