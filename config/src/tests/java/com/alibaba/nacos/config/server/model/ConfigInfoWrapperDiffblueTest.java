package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoWrapper
 *
 * @author Diffblue JCover
 */

public class ConfigInfoWrapperDiffblueTest {

    @Test(timeout=10000)
    public void equalsObjIsFooReturnsFalse() {
        assertThat(new ConfigInfoWrapper().equals("foo"), is(false));
    }

    @Test(timeout=10000)
    public void getLastModifiedReturnsZero() {
        assertThat(new ConfigInfoWrapper().getLastModified(), is(0L));
    }

    @Test(timeout=10000)
    public void setLastModifiedToOne() {
        ConfigInfoWrapper configInfoWrapper = new ConfigInfoWrapper();
        configInfoWrapper.setLastModified(1L);
        assertThat(configInfoWrapper.getLastModified(), is(1L));
    }
}
