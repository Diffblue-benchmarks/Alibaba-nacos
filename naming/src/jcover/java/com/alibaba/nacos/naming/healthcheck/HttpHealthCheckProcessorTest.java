package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.HttpHealthCheckProcessor
 *
 * @author Diffblue JCover
 */

public class HttpHealthCheckProcessorTest {

    @Test(timeout=10000)
    public void getTypeReturnsHTTP() {
        assertThat(new HttpHealthCheckProcessor().getType(), is("HTTP"));
    }
}
