package com.alibaba.nacos.naming.acl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.acl.AuthInfo
 *
 * @author Diffblue Cover
 */

public class AuthInfoTest {

    @Test
    public void factory() {
        AuthInfo authInfo = new AuthInfo();
        authInfo.setAppKey("key");
        authInfo.setOperator("+");
        assertThat(authInfo.getAppKey(), is("key"));
        assertThat(authInfo.getOperator(), is("+"));
    }

    @Test
    public void fromString() {
        assertThat(AuthInfo.fromString(",", "BASIC"), is(nullValue()));
        assertThat(AuthInfo.fromString("bar", "BASIC"), is(nullValue()));
    }
}
