package com.alibaba.nacos.naming.cluster.transport;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.cluster.transport.FastJsonSerializer
 *
 * @author Diffblue JCover
 */

public class FastJsonSerializerTest {

    @Test(timeout=10000)
    public void deserializeMapClazzIsRecordAndDataIsOneReturnsNull() {
        byte[] data = new byte[] { 1 };
        assertThat(new FastJsonSerializer().<com.alibaba.nacos.naming.pojo.Record>deserializeMap(data, com.alibaba.nacos.naming.pojo.Record.class), is(nullValue()));
    }

    @Test(timeout=10000)
    public void serialize() {
        assertArrayEquals(new byte[] { 123, 125 }, new FastJsonSerializer().<Object>serialize(new Object()));
    }
}
