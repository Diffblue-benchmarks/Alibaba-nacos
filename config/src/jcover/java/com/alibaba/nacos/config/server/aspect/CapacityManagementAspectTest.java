package com.alibaba.nacos.config.server.aspect;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * Unit tests for com.alibaba.nacos.config.server.aspect.CapacityManagementAspect
 *
 * @author Diffblue Cover
 */

class CapacityManagementAspectTest {

    @Test
    void aroundSyncUpdateConfigAllAppNameIsAcmeAndContentIsHelloAndTagIsTagReturnsFoo() throws Throwable, java.io.UnsupportedEncodingException {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        when(pjp.proceed())
            .thenReturn("foo");
        assertThat(new CapacityManagementAspect().aroundSyncUpdateConfigAll(pjp, new MockHttpServletRequest(), new MockHttpServletResponse(), "1234", "/some/path.html", "hello", "Acme", "John Smith", "/some/path.html", "tag"), instanceOf(String.class));
        assertThat((String) new CapacityManagementAspect().aroundSyncUpdateConfigAll(pjp, new MockHttpServletRequest(), new MockHttpServletResponse(), "1234", "/some/path.html", "hello", "Acme", "John Smith", "/some/path.html", "tag"), is("foo"));
    }
}
