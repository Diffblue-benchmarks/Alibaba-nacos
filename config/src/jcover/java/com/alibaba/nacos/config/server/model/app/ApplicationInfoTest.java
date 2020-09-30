package com.alibaba.nacos.config.server.model.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.app.ApplicationInfo
 *
 * @author Diffblue Cover
 */

class ApplicationInfoTest {

    @Test
    void factory() {
        ApplicationInfo applicationInfo = new ApplicationInfo("bar");
        applicationInfo.setAppName("Acme");
        applicationInfo.setDynamicCollectDisabled(false);
        applicationInfo.setLastSubscribeInfoCollectedTime(1L);
        applicationInfo.setSubInfoCollectLockExpireTime(1L);
        applicationInfo.setSubInfoCollectLockOwner("foo");
        assertThat(applicationInfo.getAppName(), is("Acme"));
        assertThat(applicationInfo.getLastSubscribeInfoCollectedTime(), is(1L));
        assertThat(applicationInfo.getSubInfoCollectLockExpireTime(), is(1L));
        assertThat(applicationInfo.getSubInfoCollectLockOwner(), is("foo"));
        assertThat(applicationInfo.isDynamicCollectDisabled(), is(false));
        assertThat(applicationInfo.isSubInfoRecentlyCollected(), is(false));
    }

    @Test
    void canCurrentServerOwnTheLock1() {
        assertThat(new ApplicationInfo("Acme").canCurrentServerOwnTheLock(), is(true));
    }

    @Test
    void canCurrentServerOwnTheLock2() {
        ApplicationInfo applicationInfo = new ApplicationInfo("Acme");
        applicationInfo.setSubInfoCollectLockOwner("bar");
        assertThat(applicationInfo.canCurrentServerOwnTheLock(), is(true));
    }

    @Test
    void currentServer() {
        assertThat(new ApplicationInfo("Acme").currentServer(), is("10.128.0.86"));
    }
}
