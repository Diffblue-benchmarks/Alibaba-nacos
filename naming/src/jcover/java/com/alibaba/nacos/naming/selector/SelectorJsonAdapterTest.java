package com.alibaba.nacos.naming.selector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.serializer.JSONSerializer;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.alibaba.nacos.naming.selector.SelectorJsonAdapter
 *
 * @author Diffblue Cover
 */

public class SelectorJsonAdapterTest {

    @Test
    public void getInstance() {
        assertThat(SelectorJsonAdapter.getInstance().getFastMatchToken(), is(0));
    }

    @Test
    public void deserialzeTypeIsStringReturnsNull() {
        assertThat(SelectorJsonAdapter.getInstance().<String>deserialze(new DefaultJSONParser(""), String.class, new Object()), is(nullValue()));
    }

    @Test
    public void write() throws java.io.IOException {
        SelectorJsonAdapter.getInstance().write(new JSONSerializer(), new LabelSelector(), new Object(), String.class, 1);
    }

    @Test
    public void writeObjectIsNull() throws java.io.IOException {
        SelectorJsonAdapter.getInstance().write(new JSONSerializer(), null, new Object(), String.class, 1);
    }
}
