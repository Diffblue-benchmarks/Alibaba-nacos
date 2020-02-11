package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.SampleResult
 *
 * @author Diffblue JCover
 */

public class SampleResultTest {

    @Test(timeout=10000)
    public void getLisentersGroupkeyStatusReturnsNull() {
        assertThat(new SampleResult().getLisentersGroupkeyStatus(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setLisentersGroupkeyStatusToEmpty() {
        SampleResult sampleResult = new SampleResult();
        Map<String, String> lisentersGroupkeyStatus = new HashMap<String, String>();
        sampleResult.setLisentersGroupkeyStatus(lisentersGroupkeyStatus);
        assertThat(sampleResult.getLisentersGroupkeyStatus(), sameInstance(lisentersGroupkeyStatus));
    }
}
