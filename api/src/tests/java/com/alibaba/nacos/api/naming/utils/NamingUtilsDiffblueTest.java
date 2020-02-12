package com.alibaba.nacos.api.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.naming.utils.NamingUtils
 *
 * @author Diffblue JCover
 */

public class NamingUtilsDiffblueTest {

    @Test(timeout=10000)
    public void getGroupedName() {
        assertThat(NamingUtils.getGroupedName("/bin/bash", "/bin/bash"), is("/bin/bash@@/bin/bash"));
    }

    @Test(timeout=10000)
    public void getGroupNameServiceNameWithGroupIsBar() {
        assertThat(NamingUtils.getGroupName("bar"), is("DEFAULT_GROUP"));
    }

    @Test(timeout=10000)
    public void getServiceNameServiceNameWithGroupIsBarReturnsBar() {
        assertThat(NamingUtils.getServiceName("bar"), is("bar"));
    }
}
