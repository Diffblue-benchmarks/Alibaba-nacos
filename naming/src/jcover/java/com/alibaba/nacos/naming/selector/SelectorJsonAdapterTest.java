package com.alibaba.nacos.naming.selector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.fastjson.serializer.JSONSerializer;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.selector.SelectorJsonAdapter
 *
 * @author Diffblue JCover
 */

public class SelectorJsonAdapterTest {

    @Test(timeout=10000)
    public void getFastMatchToken() {
        assertThat(SelectorJsonAdapter.getInstance().getFastMatchToken(), is(0));
        assertThat(SelectorJsonAdapter.getInstance().getFastMatchToken(), is(0));
    }

    @Test(timeout=10000)
    public void write() throws java.io.IOException {
        Selector selector = mock(Selector.class);
        when(selector.getType())
            .thenReturn("bar")
            .thenReturn("foo");
        SelectorJsonAdapter.getInstance().write(new JSONSerializer(), selector, new Object(), String.class, 1);
    }

    @Test(timeout=10000)
    public void writeObjectIsNull() throws java.io.IOException {
        Selector selector = mock(Selector.class);
        SelectorJsonAdapter.getInstance().write(new JSONSerializer(), null, selector, String.class, 1);
    }
}
