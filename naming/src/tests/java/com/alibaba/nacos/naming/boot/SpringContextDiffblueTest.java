package com.alibaba.nacos.naming.boot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Unit tests for com.alibaba.nacos.naming.boot.SpringContext
 *
 * @author Diffblue JCover
 */

public class SpringContextDiffblueTest {

    @Test(timeout=10000)
    public void getAppContextReturnsNull() {
        assertThat(SpringContext.getAppContext(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setApplicationContext() throws org.springframework.beans.BeansException {
        ApplicationContext applicationContext = mock(ApplicationContext.class);
        new SpringContext().setApplicationContext(applicationContext);
    }
}
