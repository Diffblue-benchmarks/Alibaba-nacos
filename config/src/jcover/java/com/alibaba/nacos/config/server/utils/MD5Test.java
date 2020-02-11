package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.MD5
 *
 * @author Diffblue JCover
 */

public class MD5Test {

    @Test(timeout=10000)
    public void bytes2stringBtIsOne() {
        byte[] bt = new byte[] { 1 };
        assertThat(MD5.getInstance().bytes2string(bt), is("01"));
    }

    @Test(timeout=10000)
    public void getMD5BytesContentIsEmpty() {
        assertArrayEquals(new byte[] { -44, 29, -116, -39, -113, 0, -78, 4, -23, -128, 9, -104, -20, -8, 66, 126 }, MD5.getInstance().getMD5Bytes(new byte[] { }));
    }

    @Test(timeout=10000)
    public void getMD5StringContentIsFoo() {
        assertThat(MD5.getInstance().getMD5String("foo"), is("acbd18db4cc2f85cedef654fccc4a4d8"));
    }

    @Test(timeout=10000)
    public void getMD5StringContentIsOne() {
        byte[] content = new byte[] { 1 };
        assertThat(MD5.getInstance().getMD5String(content), is("55a54008ad1ba589aa210d2629c1df41"));
    }
}
