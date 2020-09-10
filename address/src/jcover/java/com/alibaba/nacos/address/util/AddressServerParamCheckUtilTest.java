package com.alibaba.nacos.address.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.address.util.AddressServerParamCheckUtil
 *
 * @author Diffblue Cover
 */

class AddressServerParamCheckUtilTest {

    @Test
    void checkIps() {
        assertThat(AddressServerParamCheckUtil.checkIps("250.250.250.250"), is("ok"));
        assertThat(AddressServerParamCheckUtil.checkIps(), is("ok"));
        assertThat(AddressServerParamCheckUtil.checkIps("foo"), is("illegal ip: foo"));
        assertThat(AddressServerParamCheckUtil.checkIps(null), is("ok"));
    }
}
