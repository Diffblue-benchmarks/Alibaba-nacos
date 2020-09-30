package com.alibaba.nacos.naming.consistency;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.KeyBuilder
 *
 * @author Diffblue Cover
 */

public class KeyBuilderTest {

    @Test
    public void buildInstanceListKey() {
        assertThat(KeyBuilder.buildInstanceListKey("1234", "Smith", false), is("com.alibaba.nacos.naming.iplist.1234##Smith"));
        assertThat(KeyBuilder.buildInstanceListKey("1234", "Smith", true), is("com.alibaba.nacos.naming.iplist.ephemeral.1234##Smith"));
    }

    @Test
    public void buildServiceMetaKeyServiceNameIsAcme() {
        assertThat(KeyBuilder.buildServiceMetaKey("1234", "Acme"), is("com.alibaba.nacos.naming.domains.meta.1234##Acme"));
    }

    @Test
    public void getSwitchDomainKey() {
        assertThat(KeyBuilder.getSwitchDomainKey(), is("com.alibaba.nacos.naming.domains.meta.00-00---000-NACOS_SWITCH_DOMAIN-000---00-00"));
    }

    @Test
    public void matchEphemeralInstanceListKey() {
        assertThat(KeyBuilder.matchEphemeralInstanceListKey("key"), is(false));
        assertThat(KeyBuilder.matchEphemeralInstanceListKey("com.alibaba.nacos.naming.iplist.ephemeral."), is(true));
    }

    @Test
    public void matchInstanceListKey() {
        assertThat(KeyBuilder.matchInstanceListKey("key"), is(false));
        assertThat(KeyBuilder.matchInstanceListKey("key", "1234", "Smith"), is(false));
        assertThat(KeyBuilder.matchInstanceListKey("com.alibaba.nacos.naming.iplist."), is(true));
        assertThat(KeyBuilder.matchInstanceListKey("iplist."), is(true));
        assertThat(KeyBuilder.matchInstanceListKey("iplist.", "1234", "Smith"), is(false));
    }

    @Test
    public void matchServiceMetaKey() {
        assertThat(KeyBuilder.matchServiceMetaKey("key"), is(false));
        assertThat(KeyBuilder.matchServiceMetaKey("key", "1234", "Acme"), is(false));
        assertThat(KeyBuilder.matchServiceMetaKey("com.alibaba.nacos.naming.domains.meta."), is(true));
        assertThat(KeyBuilder.matchServiceMetaKey("meta."), is(true));
        assertThat(KeyBuilder.matchServiceMetaKey("meta.", "1234", "Acme"), is(false));
    }

    @Test
    public void matchSwitchKey() {
        assertThat(KeyBuilder.matchSwitchKey("key"), is(false));
        assertThat(KeyBuilder.matchSwitchKey("00-00---000-NACOS_SWITCH_DOMAIN-000---00-00"), is(true));
    }

    @Test
    public void matchServiceName() {
        assertThat(KeyBuilder.matchServiceName("key", "root", "Acme"), is(false));
        assertThat(KeyBuilder.matchServiceName("##", "", ""), is(true));
    }

    @Test
    public void matchEphemeralKey() {
        assertThat(KeyBuilder.matchEphemeralKey("key"), is(false));
        assertThat(KeyBuilder.matchEphemeralKey("com.alibaba.nacos.naming.iplist.ephemeral."), is(true));
    }

    @Test
    public void matchPersistentKey() {
        assertThat(KeyBuilder.matchPersistentKey("key"), is(true));
        assertThat(KeyBuilder.matchPersistentKey("com.alibaba.nacos.naming.iplist.ephemeral."), is(false));
    }

    @Test
    public void detailInstanceListkeyKeyIsKey() {
        assertThat(KeyBuilder.detailInstanceListkey("key"), is("com.alibaba.nacos.naming.key"));
    }

    @Test
    public void detailServiceMetaKeyKeyIsKey() {
        assertThat(KeyBuilder.detailServiceMetaKey("key"), is("com.alibaba.nacos.naming.domains.key"));
    }

    @Test
    public void getNamespace() {
        assertThat(KeyBuilder.getNamespace("00-00---000-NACOS_SWITCH_DOMAIN-000---00-00"), is(""));
        assertThat(KeyBuilder.getNamespace("com.alibaba.nacos.naming.domains.meta."), is(""));
        assertThat(KeyBuilder.getNamespace("com.alibaba.nacos.naming.iplist."), is(""));
        assertThat(KeyBuilder.getNamespace("com.alibaba.nacos.naming.iplist.ephemeral."), is(""));
        assertThat(KeyBuilder.getNamespace("key"), is(""));
    }
}
