package com.alibaba.nacos.naming.cluster.transport;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import com.alibaba.nacos.naming.core.Instances;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for com.alibaba.nacos.naming.cluster.transport.FastJsonSerializer
 *
 * @author Diffblue Cover
 */

@ContextConfiguration(classes = {FastJsonSerializer.class})
@RunWith(SpringRunner.class)
public class FastJsonSerializerTest {

    @Autowired
    private FastJsonSerializer service;

    @Test
    public void deserializeMapClazzIsInstancesAndDataIsOneReturnsNull() {
        byte[] data = new byte[] { 1 };
        assertThat(service.<Instances>deserializeMap(data, Instances.class), is(nullValue()));
    }

    @Test
    public void serializeDataIsSomething() {
        assertArrayEquals(new byte[] { 34, 115, 111, 109, 101, 116, 104, 105, 110, 103, 34 }, service.<String>serialize("something"));
    }
}
