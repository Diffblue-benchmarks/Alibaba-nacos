package com.alibaba.nacos.client.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.concurrent.Callable;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.utils.TemplateUtils
 *
 * @author Diffblue JCover
 */

public class TemplateUtilsTest {

//    @Test(timeout=10000)
//    public void stringBlankAndThenExecuteSourceIsEmpty() {
//        @SuppressWarnings("unchecked")
//        Callable<String> callable = mock(Callable.class);
//        when(callable.call())  <-- unreported exception java.lang.Exception; must be caught or declared to be thrown
//            .thenReturn("foo");
//        assertThat(TemplateUtils.stringBlankAndThenExecute("", callable), is("foo"));
//    }
//
    @Test(timeout=10000)
    public void stringBlankAndThenExecuteSourceIsFoo() {
        @SuppressWarnings("unchecked")
        Callable<String> callable = mock(Callable.class);
        assertThat(TemplateUtils.stringBlankAndThenExecute("foo", callable), is("foo"));
    }

//    @Test(timeout=10000)
//    public void stringEmptyAndThenExecuteSourceIsEmpty() {
//        @SuppressWarnings("unchecked")
//        Callable<String> callable = mock(Callable.class);
//        when(callable.call())  <-- unreported exception java.lang.Exception; must be caught or declared to be thrown
//            .thenReturn("foo");
//        assertThat(TemplateUtils.stringEmptyAndThenExecute("", callable), is("foo"));
//    }
//
    @Test(timeout=10000)
    public void stringEmptyAndThenExecuteSourceIsFoo() {
        @SuppressWarnings("unchecked")
        Callable<String> callable = mock(Callable.class);
        assertThat(TemplateUtils.stringEmptyAndThenExecute("foo", callable), is("foo"));
    }

    @Test(timeout=10000)
    public void stringNotEmptyAndThenExecuteSourceIsEmpty() {
        TemplateUtils.stringNotEmptyAndThenExecute("", Thread.currentThread());
    }

    @Test(timeout=10000)
    public void stringNotEmptyAndThenExecuteSourceIsFoo() {
        TemplateUtils.stringNotEmptyAndThenExecute("foo", Thread.currentThread());
    }
}
