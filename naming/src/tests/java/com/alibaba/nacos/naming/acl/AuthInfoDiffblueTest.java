package com.alibaba.nacos.naming.acl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.acl.AuthInfo
 *
 * @author Diffblue JCover
 */

public class AuthInfoDiffblueTest {

    @Test(timeout=10000)
    public void fromString() {
        assertThat(AuthInfo.fromString(",", "foo"), is(nullValue()));
        assertThat(AuthInfo.fromString("bar", "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getAppKeyReturnsNull() {
        assertThat(new AuthInfo().getAppKey(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getOperatorReturnsNull() {
        assertThat(new AuthInfo().getOperator(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAppKeyToFoo() {
        AuthInfo authInfo = new AuthInfo();
        authInfo.setAppKey("foo");
        assertThat(authInfo.getAppKey(), is("foo"));
    }

    @Test(timeout=10000)
    public void setOperator() {
        AuthInfo authInfo = new AuthInfo();
        authInfo.setOperator("+");
        assertThat(authInfo.getOperator(), is("+"));
    }
}
