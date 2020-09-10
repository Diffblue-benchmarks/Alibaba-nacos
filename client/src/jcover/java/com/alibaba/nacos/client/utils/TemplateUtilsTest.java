package com.alibaba.nacos.client.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.concurrent.Callable;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.utils.TemplateUtils
 *
 * @author Diffblue Cover
 */

class TemplateUtilsTest {

    @Test
    void stringNotEmptyAndThenExecuteSourceIsEmpty() {
        TemplateUtils.stringNotEmptyAndThenExecute("", Thread.currentThread());
    }

    @Test
    void stringNotEmptyAndThenExecuteSourceIsFoo() {
        TemplateUtils.stringNotEmptyAndThenExecute("foo", Thread.currentThread());
    }

    @Test
    void stringEmptyAndThenExecuteSourceIsEmpty() throws Exception {
        @SuppressWarnings("unchecked")
        Callable<String> callable = mock(Callable.class);
        when(callable.call())
            .thenReturn("foo");
        assertThat(TemplateUtils.stringEmptyAndThenExecute("", callable), is("foo"));
    }

    @Test
    void stringEmptyAndThenExecuteSourceIsFoo() throws Exception {
        @SuppressWarnings("unchecked")
        Callable<String> callable = mock(Callable.class);
        assertThat(TemplateUtils.stringEmptyAndThenExecute("foo", callable), is("foo"));
    }

    @Test
    void stringBlankAndThenExecuteSourceIsEmpty() throws Exception {
        @SuppressWarnings("unchecked")
        Callable<String> callable = mock(Callable.class);
        when(callable.call())
            .thenReturn("foo");
        assertThat(TemplateUtils.stringBlankAndThenExecute("", callable), is("foo"));
    }

    @Test
    void stringBlankAndThenExecuteSourceIsFoo() throws Exception {
        @SuppressWarnings("unchecked")
        Callable<String> callable = mock(Callable.class);
        assertThat(TemplateUtils.stringBlankAndThenExecute("foo", callable), is("foo"));
    }
}
