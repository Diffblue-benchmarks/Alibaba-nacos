package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.SampleResult
 *
 * @author Diffblue Cover
 */

class SampleResultTest {

    @Test
    void factory() {
        SampleResult sampleResult = new SampleResult();
        sampleResult.setLisentersGroupkeyStatus(new HashMap<String, String>());
        assertThat(sampleResult.getLisentersGroupkeyStatus(), is(notNullValue()));
    }
}
