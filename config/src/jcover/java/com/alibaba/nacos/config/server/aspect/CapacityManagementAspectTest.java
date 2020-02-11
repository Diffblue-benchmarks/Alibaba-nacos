package com.alibaba.nacos.config.server.aspect;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;

import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * Unit tests for com.alibaba.nacos.config.server.aspect.CapacityManagementAspect
 *
 * @author Diffblue JCover
 */

public class CapacityManagementAspectTest {

    @Test(timeout=10000)
    public void aroundSyncUpdateConfigAllDataIdIsBarReturnsNull() throws java.io.IOException, javax.servlet.ServletException, Throwable {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        assertThat(new CapacityManagementAspect().aroundSyncUpdateConfigAll(pjp, new MockHttpServletRequest(), new MockHttpServletResponse(), "bar", "1999-12-31", "1999-12-31", "/bin/bash", "1999-12-31", "1999-12-31", "1999-12-31"), is(nullValue()));
    }
}
