package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.GroupkeyListenserStatus
 *
 * @author Diffblue JCover
 */

public class GroupkeyListenserStatusTest {

    @Test(timeout=10000)
    public void getCollectStatusReturnsZero() {
        assertThat(new GroupkeyListenserStatus().getCollectStatus(), is(0));
    }

    @Test(timeout=10000)
    public void getLisentersGroupkeyStatusReturnsNull() {
        assertThat(new GroupkeyListenserStatus().getLisentersGroupkeyStatus(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setCollectStatusToOne() {
        GroupkeyListenserStatus groupkeyListenserStatus = new GroupkeyListenserStatus();
        groupkeyListenserStatus.setCollectStatus(1);
        assertThat(groupkeyListenserStatus.getCollectStatus(), is(1));
    }

    @Test(timeout=10000)
    public void setLisentersGroupkeyStatusToEmpty() {
        GroupkeyListenserStatus groupkeyListenserStatus = new GroupkeyListenserStatus();
        Map<String, String> lisentersGroupkeyStatus = new HashMap<String, String>();
        groupkeyListenserStatus.setLisentersGroupkeyStatus(lisentersGroupkeyStatus);
        assertThat(groupkeyListenserStatus.getLisentersGroupkeyStatus(), sameInstance(lisentersGroupkeyStatus));
    }
}
