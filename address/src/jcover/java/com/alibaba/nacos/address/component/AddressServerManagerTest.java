package com.alibaba.nacos.address.component;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Unit tests for com.alibaba.nacos.address.component.AddressServerManager
 *
 * @author Diffblue Cover
 */

@ContextConfiguration(classes = {AddressServerManager.class})
@ExtendWith(SpringExtension.class)
class AddressServerManagerTest {

    @Autowired
    private AddressServerManager service;

    @Test
    void getRawProductName() {
        assertThat(service.getRawProductName("Acme"), is("Acme"));
        assertThat(service.getRawProductName(""), is("nacos"));
        assertThat(service.getRawProductName("nacos"), is("nacos"));
    }

    @Test
    void getDefaultClusterNameIfEmpty() {
        assertThat(service.getDefaultClusterNameIfEmpty("John Smith"), is("John Smith"));
        assertThat(service.getDefaultClusterNameIfEmpty(""), is("serverlist"));
        assertThat(service.getDefaultClusterNameIfEmpty("serverlist"), is("serverlist"));
    }

    @Test
    void getRawClusterName() {
        assertThat(service.getRawClusterName("John Smith"), is("John Smith"));
    }

    @Test
    void splitIps() {
        assertThat(service.splitIps("280 Broadway"), Matchers.arrayContaining("280 Broadway"));
    }

    @Test
    void splitIpsIpsIsEmptyReturnsEmpty() {
        assertThat(service.splitIps("").length, is(0));
    }
}
