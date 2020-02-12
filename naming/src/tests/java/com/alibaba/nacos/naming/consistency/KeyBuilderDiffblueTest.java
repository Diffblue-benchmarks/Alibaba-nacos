package com.alibaba.nacos.naming.consistency;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.KeyBuilder
 *
 * @author Diffblue JCover
 */

public class KeyBuilderDiffblueTest {

    @Test(timeout=10000)
    public void buildInstanceListKey() {
        assertThat(KeyBuilder.buildInstanceListKey("bar", "Smith", false), is("com.alibaba.nacos.naming.iplist.bar##Smith"));
        assertThat(KeyBuilder.buildInstanceListKey("Smith", "Smith", true), is("com.alibaba.nacos.naming.iplist.ephemeral.Smith##Smith"));
    }

    @Test(timeout=10000)
    public void buildServiceMetaKeyNamespaceIdIsFoo() {
        assertThat(KeyBuilder.buildServiceMetaKey("foo", "/bin/bash"), is("com.alibaba.nacos.naming.domains.meta.foo##/bin/bash"));
    }

    @Test(timeout=10000)
    public void detailInstanceListkey() {
        assertThat(KeyBuilder.detailInstanceListkey("info@diffblue.com"), is("com.alibaba.nacos.naming.info@diffblue.com"));
    }

    @Test(timeout=10000)
    public void detailServiceMetaKey() {
        assertThat(KeyBuilder.detailServiceMetaKey("info@diffblue.com"), is("com.alibaba.nacos.naming.domains.info@diffblue.com"));
    }

    @Test(timeout=10000)
    public void getNamespace() {
        assertThat(KeyBuilder.getNamespace("00-00---000-NACOS_SWITCH_DOMAIN-000---00-00"), is(""));
        assertThat(KeyBuilder.getNamespace("com.alibaba.nacos.naming.domains.meta."), is(""));
        assertThat(KeyBuilder.getNamespace("com.alibaba.nacos.naming.iplist."), is(""));
        assertThat(KeyBuilder.getNamespace("com.alibaba.nacos.naming.iplist.ephemeral."), is(""));
        assertThat(KeyBuilder.getNamespace("foo"), is(""));
    }

    @Test(timeout=10000)
    public void getSwitchDomainKey() {
        assertThat(KeyBuilder.getSwitchDomainKey(), is("com.alibaba.nacos.naming.domains.meta.00-00---000-NACOS_SWITCH_DOMAIN-000---00-00"));
    }

    @Test(timeout=10000)
    public void matchEphemeralInstanceListKey() {
        assertThat(KeyBuilder.matchEphemeralInstanceListKey("Smith"), is(false));
        assertThat(KeyBuilder.matchEphemeralInstanceListKey("com.alibaba.nacos.naming.iplist.ephemeral."), is(true));
    }

    @Test(timeout=10000)
    public void matchEphemeralKey() {
        assertThat(KeyBuilder.matchEphemeralKey("foo"), is(false));
        assertThat(KeyBuilder.matchEphemeralKey("com.alibaba.nacos.naming.iplist.ephemeral."), is(true));
    }

    @Test(timeout=10000)
    public void matchInstanceListKey() {
        assertThat(KeyBuilder.matchInstanceListKey("bar", "foo", "Smith"), is(false));
        assertThat(KeyBuilder.matchInstanceListKey("Smith"), is(false));
        assertThat(KeyBuilder.matchInstanceListKey("iplist.", "bar", "Smith"), is(false));
        assertThat(KeyBuilder.matchInstanceListKey("com.alibaba.nacos.naming.iplist."), is(true));
        assertThat(KeyBuilder.matchInstanceListKey("iplist."), is(true));
    }

    @Test(timeout=10000)
    public void matchPersistentKey() {
        assertThat(KeyBuilder.matchPersistentKey("foo"), is(true));
        assertThat(KeyBuilder.matchPersistentKey("com.alibaba.nacos.naming.iplist.ephemeral."), is(false));
    }

    @Test(timeout=10000)
    public void matchServiceMetaKey() {
        assertThat(KeyBuilder.matchServiceMetaKey("bar", "foo", "meta."), is(false));
        assertThat(KeyBuilder.matchServiceMetaKey("foo"), is(false));
        assertThat(KeyBuilder.matchServiceMetaKey("meta.", "foo", "bar"), is(false));
        assertThat(KeyBuilder.matchServiceMetaKey("com.alibaba.nacos.naming.domains.meta."), is(true));
        assertThat(KeyBuilder.matchServiceMetaKey("meta."), is(true));
    }

    @Test(timeout=10000)
    public void matchServiceName() {
        assertThat(KeyBuilder.matchServiceName("bar", "bar", "foo"), is(false));
        assertThat(KeyBuilder.matchServiceName("##", "", ""), is(true));
    }

    @Test(timeout=10000)
    public void matchSwitchKey() {
        assertThat(KeyBuilder.matchSwitchKey("foo"), is(false));
        assertThat(KeyBuilder.matchSwitchKey("00-00---000-NACOS_SWITCH_DOMAIN-000---00-00"), is(true));
    }
}
