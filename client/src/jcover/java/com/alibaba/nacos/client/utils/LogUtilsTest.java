package com.alibaba.nacos.client.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.slf4j.Logger;

/**
 * Unit tests for com.alibaba.nacos.client.utils.LogUtils
 *
 * @author Diffblue JCover
 */

public class LogUtilsTest {

    @Test(timeout=10000)
    public void loggerClazzIsObject() {
        Logger result = LogUtils.logger(Object.class);
        assertThat(result.getName(), is("java.lang.Object"));
        assertThat(result.isDebugEnabled(), is(false));
        assertThat(result.isErrorEnabled(), is(true));
        assertThat(result.isInfoEnabled(), is(false));
        assertThat(result.isTraceEnabled(), is(false));
        assertThat(result.isWarnEnabled(), is(false));
    }
}
