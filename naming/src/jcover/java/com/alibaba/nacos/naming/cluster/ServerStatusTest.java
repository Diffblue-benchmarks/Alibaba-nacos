package com.alibaba.nacos.naming.cluster;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.cluster.ServerStatus
 *
 * @author Diffblue JCover
 */

public class ServerStatusTest {

    @Test(timeout=10000)
    public void valuesReturnsUPDOWNSTARTINGPAUSEDWRITE_ONLYREAD_ONLY() {
        ServerStatus[] result = ServerStatus.values();
        assertThat(result[0], is(ServerStatus.UP));
        assertThat(result[1], is(ServerStatus.DOWN));
        assertThat(result[2], is(ServerStatus.STARTING));
        assertThat(result[3], is(ServerStatus.PAUSED));
        assertThat(result[4], is(ServerStatus.WRITE_ONLY));
        assertThat(result[5], is(ServerStatus.READ_ONLY));
    }
}
