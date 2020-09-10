package com.alibaba.nacos.api.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.naming.utils.NamingUtils
 *
 * @author Diffblue Cover
 */

class NamingUtilsTest {

    @Test
    void getGroupedNameGroupNameIsAcmeAndServiceNameIsAcme() {
        assertThat(NamingUtils.getGroupedName("Acme", "Acme"), is("Acme@@Acme"));
    }

    @Test
    void getServiceNameServiceNameWithGroupIsAcmeReturnsAcme() {
        assertThat(NamingUtils.getServiceName("Acme"), is("Acme"));
    }

    @Test
    void getGroupNameServiceNameWithGroupIsAcme() {
        assertThat(NamingUtils.getGroupName("Acme"), is("DEFAULT_GROUP"));
    }
}
