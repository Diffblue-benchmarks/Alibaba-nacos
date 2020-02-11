package com.alibaba.nacos.core.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.core.utils.PropertyUtil
 *
 * @author Diffblue JCover
 */

public class PropertyUtilTest {

    @Test(timeout=10000)
    public void getProperty() {
        assertThat(PropertyUtil.getProperty("OX13QD", "OX13QD"), is("OX13QD"));
        assertThat(PropertyUtil.getProperty("OX13QD"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPropertyListReturnsEmpty() {
        assertTrue(PropertyUtil.getPropertyList("OX13QD").isEmpty());
    }
}
