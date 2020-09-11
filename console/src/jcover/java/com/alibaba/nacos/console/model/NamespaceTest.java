package com.alibaba.nacos.console.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.console.model.Namespace
 *
 * @author Diffblue Cover
 */

class NamespaceTest {

    @Test
    void factory1() {
        Namespace namespace2 = new Namespace("foo", "Acme");
        namespace2.setConfigCount(0);
        namespace2.setNamespace("foo");
        namespace2.setNamespaceShowName("Acme");
        namespace2.setQuota(1);
        namespace2.setType(1);
        assertThat(namespace2.getConfigCount(), is(0));
        assertThat(namespace2.getNamespace(), is("foo"));
        assertThat(namespace2.getNamespaceShowName(), is("Acme"));
        assertThat(namespace2.getQuota(), is(1));
        assertThat(namespace2.getType(), is(1));
    }

    @Test
    void factory2() {
        Namespace namespace2 = new Namespace("foo", "Acme", 0, 1, 1);
        namespace2.setConfigCount(1);
        namespace2.setNamespace("foo");
        namespace2.setNamespaceShowName("Acme");
        namespace2.setQuota(1);
        namespace2.setType(1);
        assertThat(namespace2.getConfigCount(), is(1));
        assertThat(namespace2.getNamespace(), is("foo"));
        assertThat(namespace2.getNamespaceShowName(), is("Acme"));
        assertThat(namespace2.getQuota(), is(1));
        assertThat(namespace2.getType(), is(1));
    }

    @Test
    void factory3() {
        Namespace namespace1 = new Namespace();
        namespace1.setConfigCount(-1);
        namespace1.setNamespace("foo");
        namespace1.setNamespaceShowName("Acme");
        namespace1.setQuota(0);
        namespace1.setType(1);
        assertThat(namespace1.getConfigCount(), is(-1));
        assertThat(namespace1.getNamespace(), is("foo"));
        assertThat(namespace1.getNamespaceShowName(), is("Acme"));
        assertThat(namespace1.getQuota(), is(0));
        assertThat(namespace1.getType(), is(1));
    }
}
