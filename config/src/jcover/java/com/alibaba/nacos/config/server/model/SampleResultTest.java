package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
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
        HashMap<String, String> lisentersGroupkeyStatus = new HashMap<String, String>();
        lisentersGroupkeyStatus.put("foo", "foo");
        sampleResult.setLisentersGroupkeyStatus(lisentersGroupkeyStatus);
        assertThat(sampleResult.getLisentersGroupkeyStatus().get("foo"), is("foo"));
    }
}
