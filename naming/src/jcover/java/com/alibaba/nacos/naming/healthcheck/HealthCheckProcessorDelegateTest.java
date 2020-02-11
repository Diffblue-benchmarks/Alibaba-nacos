package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.naming.healthcheck.extend.HealthCheckExtendProvider;

import java.util.LinkedList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.HealthCheckProcessorDelegate
 *
 * @author Diffblue JCover
 */

public class HealthCheckProcessorDelegateTest {

    @Test(timeout=10000)
    public void addProcessorProcessorsIsEmpty() {
        new HealthCheckProcessorDelegate(new com.alibaba.nacos.naming.healthcheck.extend.HealthCheckExtendProvider()).addProcessor(new LinkedList<HealthCheckProcessor>());
    }

    @Test(timeout=10000)
    public void getType() {
        assertThat(new HealthCheckProcessorDelegate(new HealthCheckExtendProvider()).getType(), is(nullValue()));
        assertThat(new HealthCheckProcessorDelegate(new HealthCheckExtendProvider()).getType(), is(nullValue()));
    }
}
