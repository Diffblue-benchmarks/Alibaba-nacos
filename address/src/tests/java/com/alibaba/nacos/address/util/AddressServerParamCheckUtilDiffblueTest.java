package com.alibaba.nacos.address.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.address.util.AddressServerParamCheckUtil
 *
 * @author Diffblue JCover
 */

public class AddressServerParamCheckUtilDiffblueTest {

    @Test(timeout=10000)
    public void checkIps() {
        assertThat(AddressServerParamCheckUtil.checkIps("21.21.21.21"), is("ok"));
        assertThat(AddressServerParamCheckUtil.checkIps(), is("ok"));
        assertThat(AddressServerParamCheckUtil.checkIps("foo"), is("illegal ip: foo"));
        assertThat(AddressServerParamCheckUtil.checkIps(null), is("ok"));
    }
}
