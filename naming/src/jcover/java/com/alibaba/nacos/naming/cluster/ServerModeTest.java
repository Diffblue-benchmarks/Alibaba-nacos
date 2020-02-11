package com.alibaba.nacos.naming.cluster;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.cluster.ServerMode
 *
 * @author Diffblue JCover
 */

public class ServerModeTest {

    @Test(timeout=10000)
    public void valuesReturnsAPCPMIXED() {
        ServerMode[] result = ServerMode.values();
        assertThat(result[0], is(ServerMode.AP));
        assertThat(result[1], is(ServerMode.CP));
        assertThat(result[2], is(ServerMode.MIXED));
    }
}
