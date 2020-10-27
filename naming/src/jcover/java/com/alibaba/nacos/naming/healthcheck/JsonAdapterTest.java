package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.fastjson.serializer.JSONSerializer;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.JsonAdapter
 *
 * @author Diffblue Cover
 */

public class JsonAdapterTest {

    @Test
    public void getInstance() {
        assertThat(JsonAdapter.getInstance().getFastMatchToken(), is(0));
    }

    @Test
    public void writeIIsOneAndOIsNullAndTypeIsString() throws java.io.IOException {
        JsonAdapter.getInstance().write(new JSONSerializer(), null, new Object(), String.class, 1);
    }
}
