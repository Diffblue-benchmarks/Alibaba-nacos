package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.MD5
 *
 * @author Diffblue Cover
 */

class MD5Test {

    @Test
    void getMD5StringContentIsHello() {
        assertThat(MD5.getInstance().getMD5String("hello"), is("5d41402abc4b2a76b9719d911017c592"));
    }

    @Test
    void getMD5StringContentIsOne() {
        byte[] content = new byte[] { 1 };
        assertThat(MD5.getInstance().getMD5String(content), is("55a54008ad1ba589aa210d2629c1df41"));
    }

    @Test
    void getMD5BytesContentIsEmpty() {
        assertArrayEquals(new byte[] { -44, 29, -116, -39, -113, 0, -78, 4, -23, -128, 9, -104, -20, -8, 66, 126 }, MD5.getInstance().getMD5Bytes(new byte[] { }));
    }

    @Test
    void bytes2stringBtIsOne() {
        byte[] bt = new byte[] { 1 };
        assertThat(MD5.getInstance().bytes2string(bt), is("01"));
    }
}
