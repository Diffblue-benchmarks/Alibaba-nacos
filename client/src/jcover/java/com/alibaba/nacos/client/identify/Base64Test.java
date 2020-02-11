package com.alibaba.nacos.client.identify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.identify.Base64
 *
 * @author Diffblue JCover
 */

public class Base64Test {

    @Test(timeout=10000)
    public void decodeBase64() {
        assertArrayEquals(new byte[] { }, Base64.decodeBase64(new byte[] { }));
        assertThat(Base64.decodeBase64(null), is(nullValue()));
    }

//    @Test(timeout=10000)
//    public void decodeBase64() {  <-- method decodeBase64() is already defined in class com.alibaba.nacos.client.identify.Base64Test
//        byte[] base64Data = new byte[] { 61 };
//        assertArrayEquals(new byte[] { }, Base64.decodeBase64(base64Data));
//    }
//
    @Test(timeout=10000)
    public void decodeBase64Base64DataIsMinusOne() {
        byte[] base64Data = new byte[] { -1 };
        assertArrayEquals(new byte[] { }, Base64.decodeBase64(base64Data));
    }

    @Test(timeout=10000)
    public void decodeBase64Base64DataIsOne() {
        byte[] base64Data = new byte[] { 1 };
        assertArrayEquals(new byte[] { }, Base64.decodeBase64(base64Data));
    }

    @Test(timeout=10000)
    public void decodeBase64Base64DataIsZeroOne() {
        byte[] base64Data = new byte[] { 0, 1 };
        assertArrayEquals(new byte[] { }, Base64.decodeBase64(base64Data));
    }

    @Test(timeout=10000)
    public void encodeBase64() {
        assertArrayEquals(new byte[] { }, Base64.encodeBase64(new byte[] { }));
        assertThat(Base64.encodeBase64(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void encodeBase64BinaryDataIsMinusOneOne() {
        byte[] binaryData = new byte[] { -1, 1 };
        assertArrayEquals(new byte[] { 47, 119, 69, 61 }, Base64.encodeBase64(binaryData));
    }

    @Test(timeout=10000)
    public void encodeBase64BinaryDataIsMinusOneOneOne() {
        byte[] binaryData = new byte[] { -1, 1, 1 };
        assertArrayEquals(new byte[] { 47, 119, 69, 66 }, Base64.encodeBase64(binaryData));
    }

    @Test(timeout=10000)
    public void encodeBase64BinaryDataIsOne() {
        byte[] binaryData = new byte[] { 1 };
        assertArrayEquals(new byte[] { 65, 81, 61, 61 }, Base64.encodeBase64(binaryData));
    }

    @Test(timeout=10000)
    public void isInAlphabet1() {
        byte[] lineSeparator = new byte[] { 1 };
        assertThat(new Base64(1, lineSeparator, false).isInAlphabet((byte)1), is(false));
    }

    @Test(timeout=10000)
    public void isInAlphabet2() {
        assertThat(new Base64().isInAlphabet((byte)1), is(false));
        assertThat(new Base64().isInAlphabet((byte)-1), is(false));
    }
}
