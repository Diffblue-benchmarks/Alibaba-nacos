package com.alibaba.nacos.client.config.filter.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.filter.impl.ConfigContext
 *
 * @author Diffblue JCover
 */

public class ConfigContextDiffblueTest {

    @Test(timeout=10000)
    public void getParameterKeyIsNameReturnsNull() {
        assertThat(new ConfigContext().getParameter("name"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setParameterKeyIsName() {
        new ConfigContext().setParameter("name", new Object());
    }
}
