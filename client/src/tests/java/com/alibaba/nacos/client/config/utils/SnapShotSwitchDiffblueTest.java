package com.alibaba.nacos.client.config.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.utils.SnapShotSwitch
 *
 * @author Diffblue JCover
 */

public class SnapShotSwitchDiffblueTest {

    @Test(timeout=10000)
    public void getIsSnapShotReturnsTrue() {
        assertThat(SnapShotSwitch.getIsSnapShot(), is(true));
    }

    @Test(timeout=10000)
    public void setIsSnapShotIsSnapShotIsFalse() {
        SnapShotSwitch.setIsSnapShot(false);
    }
}
