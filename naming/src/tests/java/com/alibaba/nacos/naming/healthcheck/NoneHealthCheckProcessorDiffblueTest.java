package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.NoneHealthCheckProcessor
 *
 * @author Diffblue JCover
 */

public class NoneHealthCheckProcessorDiffblueTest {

    @Test(timeout=10000)
    public void getTypeReturnsNONE() {
        assertThat(new NoneHealthCheckProcessor().getType(), is("NONE"));
    }
}
