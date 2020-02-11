package com.alibaba.nacos.common.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.common.util.Md5Utils
 *
 * @author Diffblue JCover
 */

public class Md5UtilsTest {

    @Test(timeout=10000)
    public void getMD5BytesIsOne() {
        byte[] bytes = new byte[] { 1 };
        assertThat(Md5Utils.getMD5(bytes), is("55a54008ad1ba589aa210d2629c1df41"));
    }

    @Test(timeout=10000)
    public void getMD5ValueIsFooReturnsEmpty() {
        assertThat(Md5Utils.getMD5("foo", "OX13QD"), is(""));
    }
}
