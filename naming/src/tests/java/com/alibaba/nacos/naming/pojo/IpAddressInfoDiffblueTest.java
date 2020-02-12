package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.hamcrest.number.IsCloseTo.closeTo;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.IpAddressInfo
 *
 * @author Diffblue JCover
 */

public class IpAddressInfoDiffblueTest {

    @Test(timeout=10000)
    public void getIpReturnsNull() {
        assertThat(new IpAddressInfo().getIp(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMetadataReturnsNull() {
        assertThat(new IpAddressInfo().getMetadata(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPortReturnsNull() {
        assertThat(new IpAddressInfo().getPort(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getWeightReturnsNull() {
        assertThat(new IpAddressInfo().getWeight(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isEnabledReturnsFalse() {
        assertThat(new IpAddressInfo().isEnabled(), is(false));
    }

    @Test(timeout=10000)
    public void isValidReturnsFalse() {
        assertThat(new IpAddressInfo().isValid(), is(false));
    }

    @Test(timeout=10000)
    public void setEnabledToFalse() {
        new IpAddressInfo().setEnabled(false);
    }

    @Test(timeout=10000)
    public void setIp() {
        IpAddressInfo ipAddressInfo = new IpAddressInfo();
        ipAddressInfo.setIp("280 Broadway");
        assertThat(ipAddressInfo.getIp(), is("280 Broadway"));
    }

    @Test(timeout=10000)
    public void setMetadataToEmpty() {
        IpAddressInfo ipAddressInfo = new IpAddressInfo();
        Map<String, String> metadata = new HashMap<String, String>();
        ipAddressInfo.setMetadata(metadata);
        assertThat(ipAddressInfo.getMetadata(), sameInstance(metadata));
    }

    @Test(timeout=10000)
    public void setPortToOne() {
        IpAddressInfo ipAddressInfo = new IpAddressInfo();
        ipAddressInfo.setPort(1);
        assertThat(ipAddressInfo.getPort(), is(1));
    }

    @Test(timeout=10000)
    public void setValidToFalse() {
        new IpAddressInfo().setValid(false);
    }

    @Test(timeout=10000)
    public void setWeightToOne() {
        IpAddressInfo ipAddressInfo = new IpAddressInfo();
        ipAddressInfo.setWeight(1.0);
        assertThat(ipAddressInfo.getWeight(), closeTo(1.0, 0.0));
    }
}
