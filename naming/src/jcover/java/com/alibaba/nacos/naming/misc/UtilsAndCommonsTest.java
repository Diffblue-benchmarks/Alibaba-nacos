package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.naming.exception.NacosException;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.UtilsAndCommons
 *
 * @author Diffblue Cover
 */

public class UtilsAndCommonsTest {

    @Test
    public void getAllExceptionMsg() {
        assertThat(UtilsAndCommons.getAllExceptionMsg(new NacosException(1, "an error has happened")), is("caused: an error has happened;"));
        assertThat(UtilsAndCommons.getAllExceptionMsg(new NacosException(1, new NacosException())), is("caused: com.alibaba.nacos.naming.exception.NacosException;"));
        assertThat(UtilsAndCommons.getAllExceptionMsg(new NacosException()), is(""));
    }

    @Test
    public void getSwitchDomainKey() {
        assertThat(UtilsAndCommons.getSwitchDomainKey(), is("com.alibaba.nacos.naming.domains.meta.00-00---000-NACOS_SWITCH_DOMAIN-000---00-00"));
    }

    @Test
    public void parseMetadata() throws NacosException {
        assertThat(UtilsAndCommons.parseMetadata(",").isEmpty(), is(true));
        assertThat(UtilsAndCommons.parseMetadata("").isEmpty(), is(true));
    }

    @Test
    public void assembleFullServiceNameNamespaceIdIsRootAndServiceNameIsAcme() {
        assertThat(UtilsAndCommons.assembleFullServiceName("root", "Acme"), is("root##Acme"));
    }

    @Test
    public void shakeUp() {
        assertThat(UtilsAndCommons.shakeUp("foo", 1), is(0));
        assertThat(UtilsAndCommons.shakeUp(null, 1), is(0));
        assertThat(UtilsAndCommons.shakeUp("1", 2), is(1));
    }
}
