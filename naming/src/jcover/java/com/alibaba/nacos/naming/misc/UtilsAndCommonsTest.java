package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.UtilsAndCommons
 *
 * @author Diffblue JCover
 */

public class UtilsAndCommonsTest {

    @Test(timeout=10000)
    public void assembleFullServiceName() {
        assertThat(UtilsAndCommons.assembleFullServiceName("/bin/bash", "/bin/bash"), is("/bin/bash##/bin/bash"));
    }

    @Test(timeout=10000)
    public void getAllExceptionMsg() {
        Throwable e = new Exception();
        e.setStackTrace(new StackTraceElement[] { });
        assertThat(UtilsAndCommons.getAllExceptionMsg(e), is(""));
    }

    @Test(timeout=10000)
    public void getAllExceptionMsgEIsNull() {
        assertThat(UtilsAndCommons.getAllExceptionMsg(null), is(""));
    }

    @Test(timeout=10000)
    public void getSwitchDomainKey() {
        assertThat(UtilsAndCommons.getSwitchDomainKey(), is("com.alibaba.nacos.naming.domains.meta.00-00---000-NACOS_SWITCH_DOMAIN-000---00-00"));
    }

    @Test(timeout=10000)
    public void isEmpty() throws com.alibaba.nacos.naming.exception.NacosException {
        assertThat(UtilsAndCommons.parseMetadata(",").isEmpty(), is(true));
        assertThat(UtilsAndCommons.parseMetadata("").isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void shakeUp() {
        assertThat(UtilsAndCommons.shakeUp("foo", 1), is(0));
        assertThat(UtilsAndCommons.shakeUp(null, 1), is(0));
        assertThat(UtilsAndCommons.shakeUp("foo", 2_147_483_647), is(101_574));
    }
}
