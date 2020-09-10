package com.alibaba.nacos.client.identify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.identify.Base64
 *
 * @author Diffblue Cover
 */

class Base64Test {

    @Test
    void encodeBase64() {
        assertArrayEquals(new byte[] { }, Base64.encodeBase64(new byte[] { }));
        assertThat(Base64.encodeBase64(null), is(nullValue()));
    }

    @Test
    void encodeBase64BinaryDataIsAllOne1() {
        byte[] binaryData = new byte[] { 1, 1 };
        assertArrayEquals(new byte[] { 65, 81, 69, 61 }, Base64.encodeBase64(binaryData));
    }

    @Test
    void encodeBase64BinaryDataIsAllOne2() {
        byte[] binaryData = new byte[] { 1, 1, 1 };
        assertArrayEquals(new byte[] { 65, 81, 69, 66 }, Base64.encodeBase64(binaryData));
    }

    @Test
    void encodeBase64BinaryDataIsMinusOne() {
        byte[] binaryData = new byte[] { -1 };
        assertArrayEquals(new byte[] { 47, 119, 61, 61 }, Base64.encodeBase64(binaryData));
    }

    @Test
    void encodeBase64BinaryDataIsOne() {
        byte[] binaryData = new byte[] { 1 };
        assertArrayEquals(new byte[] { 65, 81, 61, 61 }, Base64.encodeBase64(binaryData));
    }

    @Test
    void decodeBase1() {
        byte[] base64Data = new byte[] { 61 };
        assertArrayEquals(new byte[] { }, Base64.decodeBase64(base64Data));
    }

    @Test
    void decodeBase2() {
        assertArrayEquals(new byte[] { }, Base64.decodeBase64(new byte[] { }));
        assertThat(Base64.decodeBase64(null), is(nullValue()));
    }

    @Test
    void decodeBase64Base64DataIsMinusOne() {
        byte[] base64Data = new byte[] { -1 };
        assertArrayEquals(new byte[] { }, Base64.decodeBase64(base64Data));
    }

    @Test
    void decodeBase64Base64DataIsOne() {
        byte[] base64Data = new byte[] { 1 };
        assertArrayEquals(new byte[] { }, Base64.decodeBase64(base64Data));
    }

    @Test
    void decodeBase64Base64DataIsZeroOne() {
        byte[] base64Data = new byte[] { 0, 1 };
        assertArrayEquals(new byte[] { }, Base64.decodeBase64(base64Data));
    }

    @Test
    void isInAlphabet1() {
        byte[] lineSeparator = new byte[] { 1 };
        assertThat(new Base64(1, lineSeparator, false).isInAlphabet((byte) 1), is(false));
    }

    @Test
    void isInAlphabet2() {
        assertThat(new Base64().isInAlphabet((byte) 1), is(false));
        assertThat(new Base64().isInAlphabet((byte) -1), is(false));
    }
}
