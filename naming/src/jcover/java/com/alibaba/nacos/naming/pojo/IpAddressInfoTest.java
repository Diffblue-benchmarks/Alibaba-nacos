package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.IpAddressInfo
 *
 * @author Diffblue Cover
 */

public class IpAddressInfoTest {

    @Test
    public void factory() {
        IpAddressInfo ipAddressInfo = new IpAddressInfo();
        ipAddressInfo.setEnabled(true);
        ipAddressInfo.setIp("280 Broadway");
        HashMap<String, String> metadata = new HashMap<String, String>();
        metadata.put("bar", "foo");
        ipAddressInfo.setMetadata(metadata);
        ipAddressInfo.setPort(1);
        ipAddressInfo.setValid(false);
        ipAddressInfo.setWeight(1.0);
        assertThat(ipAddressInfo.getIp(), is("280 Broadway"));
        assertThat(ipAddressInfo.getMetadata().get("bar"), is("foo"));
        assertThat(ipAddressInfo.getPort(), is(1));
        assertThat(ipAddressInfo.getWeight(), closeTo(1.0, 0.0));
        assertThat(ipAddressInfo.isEnabled(), is(true));
        assertThat(ipAddressInfo.isValid(), is(false));
    }
}
