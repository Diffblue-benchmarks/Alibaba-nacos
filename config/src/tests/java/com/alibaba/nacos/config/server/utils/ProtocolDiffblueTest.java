package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.Protocol
 *
 * @author Diffblue JCover
 */

public class ProtocolDiffblueTest {

    @Test(timeout=10000)
    public void getVersionNumber() {
        assertThat(Protocol.getVersionNumber("Mr"), is(0));
        assertThat(Protocol.getVersionNumber(null), is(-1));
    }
}
