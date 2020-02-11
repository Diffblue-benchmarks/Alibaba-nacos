package com.alibaba.nacos.config.server.model.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.app.ApplicationInfo
 *
 * @author Diffblue JCover
 */

public class ApplicationInfoTest {

    @Test(timeout=10000)
    public void canCurrentServerOwnTheLockReturnsTrue() {
        assertThat(new ApplicationInfo("bar").canCurrentServerOwnTheLock(), is(true));
    }

    @Test(timeout=10000)
    public void currentServer() {
        assertThat(new ApplicationInfo("/bin/bash").currentServer(), is("10.128.0.37"));
    }

    @Test(timeout=10000)
    public void getAppName() {
        assertThat(new ApplicationInfo("/bin/bash").getAppName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void getLastSubscribeInfoCollectedTimeReturnsZero() {
        assertThat(new ApplicationInfo("bar").getLastSubscribeInfoCollectedTime(), is(0L));
    }

    @Test(timeout=10000)
    public void getSubInfoCollectLockExpireTimeReturnsZero() {
        assertThat(new ApplicationInfo("bar").getSubInfoCollectLockExpireTime(), is(0L));
    }

    @Test(timeout=10000)
    public void getSubInfoCollectLockOwnerReturnsNull() {
        assertThat(new ApplicationInfo("/bin/bash").getSubInfoCollectLockOwner(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isDynamicCollectDisabledReturnsFalse() {
        assertThat(new ApplicationInfo("bar").isDynamicCollectDisabled(), is(false));
    }

    @Test(timeout=10000)
    public void isSubInfoRecentlyCollectedReturnsFalse() {
        assertThat(new ApplicationInfo("bar").isSubInfoRecentlyCollected(), is(false));
    }

    @Test(timeout=10000)
    public void setAppName() {
        new ApplicationInfo("/bin/bash").setAppName("/bin/bash");
    }

    @Test(timeout=10000)
    public void setDynamicCollectDisabledToFalse() {
        new ApplicationInfo("/bin/bash").setDynamicCollectDisabled(false);
    }

    @Test(timeout=10000)
    public void setLastSubscribeInfoCollectedTimeToOne() {
        ApplicationInfo applicationInfo = new ApplicationInfo("/bin/bash");
        applicationInfo.setLastSubscribeInfoCollectedTime(1L);
        assertThat(applicationInfo.getLastSubscribeInfoCollectedTime(), is(1L));
    }

    @Test(timeout=10000)
    public void setSubInfoCollectLockExpireTimeToOne() {
        ApplicationInfo applicationInfo = new ApplicationInfo("/bin/bash");
        applicationInfo.setSubInfoCollectLockExpireTime(1L);
        assertThat(applicationInfo.getSubInfoCollectLockExpireTime(), is(1L));
    }

    @Test(timeout=10000)
    public void setSubInfoCollectLockOwner() {
        ApplicationInfo applicationInfo = new ApplicationInfo("/bin/bash");
        applicationInfo.setSubInfoCollectLockOwner("octet-stream");
        assertThat(applicationInfo.getSubInfoCollectLockOwner(), is("octet-stream"));
    }
}
