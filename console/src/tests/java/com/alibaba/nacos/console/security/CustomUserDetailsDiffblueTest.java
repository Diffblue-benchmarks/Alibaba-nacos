package com.alibaba.nacos.console.security;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertTrue;

import com.alibaba.nacos.config.server.model.User;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.console.security.CustomUserDetails
 *
 * @author Diffblue JCover
 */

public class CustomUserDetailsDiffblueTest {

    @Test(timeout=10000)
    public void getAuthoritiesReturnsEmpty() {
        assertTrue(new CustomUserDetails(new User()).getAuthorities().isEmpty());
    }

    @Test(timeout=10000)
    public void getPasswordReturnsNull() {
        assertThat(new CustomUserDetails(new User()).getPassword(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getUsernameReturnsNull() {
        assertThat(new CustomUserDetails(new User()).getUsername(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isAccountNonExpiredReturnsTrue() {
        assertThat(new CustomUserDetails(new User()).isAccountNonExpired(), is(true));
    }

    @Test(timeout=10000)
    public void isAccountNonLockedReturnsTrue() {
        assertThat(new CustomUserDetails(new User()).isAccountNonLocked(), is(true));
    }

    @Test(timeout=10000)
    public void isCredentialsNonExpiredReturnsTrue() {
        assertThat(new CustomUserDetails(new User()).isCredentialsNonExpired(), is(true));
    }

    @Test(timeout=10000)
    public void isEnabledReturnsTrue() {
        assertThat(new CustomUserDetails(new User()).isEnabled(), is(true));
    }
}
