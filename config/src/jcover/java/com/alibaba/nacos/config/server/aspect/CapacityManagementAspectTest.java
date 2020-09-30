package com.alibaba.nacos.config.server.aspect;

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
    void aroundSyncUpdateConfigAllAppNameIsAcmeAndContentIsHelloAndTagIsTag() throws Throwable, java.io.UnsupportedEncodingException {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        when(pjp.proceed())
            .thenReturn(new Object());
        // pojo Object
    }
}
