package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.SameConfigPolicy
 *
 * @author Diffblue JCover
 */

public class SameConfigPolicyTest {

    @Test(timeout=10000)
    public void valuesReturnsABORTSKIPOVERWRITE() {
        SameConfigPolicy[] result = SameConfigPolicy.values();
        assertThat(result[0], is(SameConfigPolicy.ABORT));
        assertThat(result[1], is(SameConfigPolicy.SKIP));
        assertThat(result[2], is(SameConfigPolicy.OVERWRITE));
    }
}
