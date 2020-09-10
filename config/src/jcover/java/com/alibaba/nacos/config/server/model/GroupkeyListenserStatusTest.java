package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.GroupkeyListenserStatus
 *
 * @author Diffblue Cover
 */

class GroupkeyListenserStatusTest {

    @Test
    void factory() {
        GroupkeyListenserStatus groupkeyListenserStatus = new GroupkeyListenserStatus();
        groupkeyListenserStatus.setCollectStatus(1);
        HashMap<String, String> lisentersGroupkeyStatus = new HashMap<String, String>();
        lisentersGroupkeyStatus.put("bar", "foo");
        groupkeyListenserStatus.setLisentersGroupkeyStatus(lisentersGroupkeyStatus);
        assertThat(groupkeyListenserStatus.getCollectStatus(), is(1));
        assertThat(groupkeyListenserStatus.getLisentersGroupkeyStatus().get("bar"), is("foo"));
    }
}
