package com.alibaba.nacos.client.identify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.identify.Credentials
 *
 * @author Diffblue Cover
 */

class CredentialsTest {

    @Test
    void factory() {
        Credentials credentials = new Credentials();
        credentials.setAccessKey("key");
        credentials.setSecretKey("key");
        credentials.setTenantId("1234");
        assertThat(credentials.getAccessKey(), is("key"));
        assertThat(credentials.getSecretKey(), is("key"));
        assertThat(credentials.getTenantId(), is("1234"));
    }

    @Test
    void valid1() {
        assertThat(new Credentials().valid(), is(false));
    }

    @Test
    void valid2() {
        Credentials credentials = new Credentials();
        credentials.setAccessKey("");
        assertThat(credentials.valid(), is(false));
    }

    @Test
    void valid3() {
        Credentials credentials = new Credentials();
        credentials.setAccessKey("key");
        assertThat(credentials.valid(), is(false));
    }

    @Test
    void valid4() {
        Credentials credentials = new Credentials();
        credentials.setAccessKey("key");
        credentials.setSecretKey("");
        assertThat(credentials.valid(), is(false));
    }

    @Test
    void validReturnsTrue() {
        Credentials credentials = new Credentials();
        credentials.setAccessKey("bar");
        credentials.setSecretKey("key");
        assertThat(credentials.valid(), is(true));
    }

    @Test
    void identical1() {
        Credentials other = new Credentials();
        other.setAccessKey("key");
        assertThat(new Credentials().identical(other), is(false));
    }

    @Test
    void identical2() {
        Credentials credentials = new Credentials();
        credentials.setSecretKey("key");
        Credentials other = mock(Credentials.class);
        assertThat(credentials.identical(other), is(false));
    }

    @Test
    void identical3() {
        Credentials credentials = new Credentials();
        credentials.setAccessKey("bar");
        assertThat(credentials.identical(new Credentials()), is(false));
    }

    @Test
    void identical4() {
        Credentials credentials = new Credentials();
        credentials.setAccessKey("key");
        Credentials other = new Credentials();
        other.setAccessKey("key");
        other.setSecretKey("key");
        assertThat(credentials.identical(other), is(false));
    }

    @Test
    void identical5() {
        Credentials credentials = new Credentials();
        credentials.setAccessKey("key");
        credentials.setSecretKey("bar");
        Credentials other = new Credentials();
        other.setAccessKey("key");
        assertThat(credentials.identical(other), is(false));
    }

    @Test
    void identicalOtherIsNull() {
        assertThat(new Credentials().identical(null), is(false));
    }

    @Test
    void identicalReturnsTrue1() {
        Credentials credentials = new Credentials();
        credentials.setAccessKey("key");
        credentials.setSecretKey("key");
        Credentials other = new Credentials();
        other.setAccessKey("key");
        other.setSecretKey("key");
        assertThat(credentials.identical(other), is(true));
    }

    @Test
    void identicalReturnsTrue2() {
        Credentials credentials = new Credentials();
        credentials.setAccessKey("key");
        Credentials other = new Credentials();
        other.setAccessKey("key");
        assertThat(credentials.identical(other), is(true));
    }
}
