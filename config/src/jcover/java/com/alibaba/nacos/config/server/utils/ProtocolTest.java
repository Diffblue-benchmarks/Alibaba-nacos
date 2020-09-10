package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.Protocol
 *
 * @author Diffblue Cover
 */

class ProtocolTest {

    @Test
    void getVersionNumber() {
        assertThat(Protocol.getVersionNumber("1.0"), is(10));
        assertThat(Protocol.getVersionNumber("bar"), is(0));
        assertThat(Protocol.getVersionNumber(null), is(-1));
    }
}
