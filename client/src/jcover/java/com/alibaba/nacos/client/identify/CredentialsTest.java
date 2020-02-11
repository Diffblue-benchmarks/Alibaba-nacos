package com.alibaba.nacos.client.identify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.identify.Credentials
 *
 * @author Diffblue JCover
 */

public class CredentialsTest {

    @Test(timeout=10000)
    public void getAccessKeyReturnsNull() {
        assertThat(new Credentials().getAccessKey(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getSecretKeyReturnsNull() {
        assertThat(new Credentials().getSecretKey(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTenantIdReturnsNull() {
        assertThat(new Credentials().getTenantId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void identical() {
        assertThat(new Credentials("bar", "545321456", "foo").identical(new Credentials()), is(false));
        assertThat(new Credentials().identical(new Credentials(null, "545321456", "foo")), is(false));
        assertThat(new Credentials().identical(new Credentials("bar", "545321456", "foo")), is(false));
        assertThat(new Credentials("foo", "bar", "foo").identical(new Credentials("foo", "545321456", "foo")), is(false));
        assertThat(new Credentials().identical(null), is(false));
        assertThat(new Credentials().identical(new Credentials()), is(true));
        assertThat(new Credentials("foo", "545321456", "bar").identical(new Credentials("foo", "545321456", "foo")), is(true));
    }

    @Test(timeout=10000)
    public void setAccessKeyToFoo() {
        Credentials credentials = new Credentials();
        credentials.setAccessKey("foo");
        assertThat(credentials.getAccessKey(), is("foo"));
    }

    @Test(timeout=10000)
    public void setSecretKey() {
        Credentials credentials = new Credentials();
        credentials.setSecretKey("545321456");
        assertThat(credentials.getSecretKey(), is("545321456"));
    }

    @Test(timeout=10000)
    public void setTenantIdToFoo() {
        Credentials credentials = new Credentials();
        credentials.setTenantId("foo");
        assertThat(credentials.getTenantId(), is("foo"));
    }

    @Test(timeout=10000)
    public void valid() {
        assertThat(new Credentials().valid(), is(false));
        assertThat(new Credentials("", "545321456", "foo").valid(), is(false));
        assertThat(new Credentials("foo", null, "foo").valid(), is(false));
        assertThat(new Credentials("foo", "", "foo").valid(), is(false));
        assertThat(new Credentials("bar", "545321456", "foo").valid(), is(true));
    }
}
