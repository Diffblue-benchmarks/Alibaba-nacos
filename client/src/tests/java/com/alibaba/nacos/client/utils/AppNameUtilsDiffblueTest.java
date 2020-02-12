package com.alibaba.nacos.client.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.utils.AppNameUtils
 *
 * @author Diffblue JCover
 */

public class AppNameUtilsDiffblueTest {

    @Test(timeout=10000)
    public void getAppNameReturnsUnknown() {
        assertThat(AppNameUtils.getAppName(), is("unknown"));
    }
}
