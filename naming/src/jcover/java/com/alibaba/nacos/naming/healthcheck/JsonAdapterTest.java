package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.nacos.api.naming.pojo.AbstractHealthChecker;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.JsonAdapter
 *
 * @author Diffblue JCover
 */

public class JsonAdapterTest {

    @Test(timeout=10000)
    public void getFastMatchToken() {
        assertThat(JsonAdapter.getInstance().getFastMatchToken(), is(0));
        assertThat(JsonAdapter.getInstance().getFastMatchToken(), is(0));
    }

    @Test(timeout=10000)
    public void write() throws java.io.IOException {
        AbstractHealthChecker abstractHealthChecker1 = mock(AbstractHealthChecker.class);
        when(abstractHealthChecker1.getType())
            .thenReturn("foo");
        AbstractHealthChecker abstractHealthChecker2 = mock(AbstractHealthChecker.class);
        JsonAdapter.getInstance().write(new JSONSerializer(), abstractHealthChecker1, abstractHealthChecker2, String.class, 1);
    }

    @Test(timeout=10000)
    public void writeOIsNull() throws java.io.IOException {
        AbstractHealthChecker abstractHealthChecker = mock(AbstractHealthChecker.class);
        JsonAdapter.getInstance().write(new JSONSerializer(), null, abstractHealthChecker, String.class, 1);
    }
}
