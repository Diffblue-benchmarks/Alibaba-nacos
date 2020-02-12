package com.alibaba.nacos.client.config.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.utils.JVMUtil
 *
 * @author Diffblue JCover
 */

public class JVMUtilDiffblueTest {

    @Test(timeout=10000)
    public void isMultiInstanceReturnsFalse() {
        assertThat(JVMUtil.isMultiInstance(), is(false));
    }
}
