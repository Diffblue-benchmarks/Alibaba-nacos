package com.alibaba.nacos.client.naming.core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.core.ProtectMode
 *
 * @author Diffblue JCover
 */

public class ProtectModeDiffblueTest {

    @Test(timeout=10000)
    public void getProtectThreshold() {
        assertEquals(0x1.99999ap-1f /* 0.8 */, new ProtectMode().getProtectThreshold(), 0);
    }

    @Test(timeout=10000)
    public void setProtectThresholdToOne() {
        ProtectMode protectMode = new ProtectMode();
        protectMode.setProtectThreshold(1.0f);
        assertEquals(1.0f, protectMode.getProtectThreshold(), 0);
    }
}
