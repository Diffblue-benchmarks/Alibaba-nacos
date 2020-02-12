package com.alibaba.nacos.address.component;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.address.component.AddressServerManager
 *
 * @author Diffblue JCover
 */

public class AddressServerManagerDiffblueTest {

    @Test(timeout=10000)
    public void getDefaultClusterNameIfEmpty() {
        assertThat(new AddressServerManager().getDefaultClusterNameIfEmpty("bar"), is("bar"));
        assertThat(new AddressServerManager().getDefaultClusterNameIfEmpty(""), is("serverlist"));
        assertThat(new AddressServerManager().getDefaultClusterNameIfEmpty("serverlist"), is("serverlist"));
    }

    @Test(timeout=10000)
    public void getRawClusterNameNameIsBarReturnsBar() {
        assertThat(new AddressServerManager().getRawClusterName("bar"), is("bar"));
    }

    @Test(timeout=10000)
    public void getRawProductName() {
        assertThat(new AddressServerManager().getRawProductName("bar"), is("bar"));
        assertThat(new AddressServerManager().getRawProductName(""), is("nacos"));
        assertThat(new AddressServerManager().getRawProductName("nacos"), is("nacos"));
    }

    @Test(timeout=10000)
    public void splitIps() {
        assertArrayEquals(new String[] { "280 Broadway" }, new AddressServerManager().splitIps("280 Broadway"));
        assertArrayEquals(new String[] { }, new AddressServerManager().splitIps(""));
    }
}
