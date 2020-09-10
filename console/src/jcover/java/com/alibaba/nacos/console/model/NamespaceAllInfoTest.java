package com.alibaba.nacos.console.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.console.model.NamespaceAllInfo
 *
 * @author Diffblue Cover
 */

class NamespaceAllInfoTest {

    @Test
    void factory() {
        NamespaceAllInfo namespaceAllInfo = new NamespaceAllInfo();
        namespaceAllInfo.setNamespaceDesc("foo");
        namespaceAllInfo.setConfigCount(1);
        namespaceAllInfo.setNamespace("foo");
        namespaceAllInfo.setNamespaceShowName("Acme");
        namespaceAllInfo.setQuota(1);
        namespaceAllInfo.setType(1);
        assertThat(namespaceAllInfo.getNamespaceDesc(), is("foo"));
        assertThat(namespaceAllInfo.getConfigCount(), is(1));
        assertThat(namespaceAllInfo.getNamespace(), is("foo"));
        assertThat(namespaceAllInfo.getNamespaceShowName(), is("Acme"));
        assertThat(namespaceAllInfo.getQuota(), is(1));
        assertThat(namespaceAllInfo.getType(), is(1));
    }
}
