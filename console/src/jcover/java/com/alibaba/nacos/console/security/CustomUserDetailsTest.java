package com.alibaba.nacos.console.security;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.config.server.model.User;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.console.security.CustomUserDetails
 *
 * @author Diffblue Cover
 */

class CustomUserDetailsTest {

    @Test
    void factory() {
        User user = new User();
        user.setPassword("secret");
        user.setUsername("John Smith");
        CustomUserDetails customUserDetails = new CustomUserDetails(user);
        assertThat(customUserDetails.getAuthorities(), empty());
        assertThat(customUserDetails.isAccountNonExpired(), is(true));
        assertThat(customUserDetails.isAccountNonLocked(), is(true));
        assertThat(customUserDetails.isCredentialsNonExpired(), is(true));
        assertThat(customUserDetails.isEnabled(), is(true));
    }

    @Test
    void getPasswordReturnsSecret() {
        User user = new User();
        user.setPassword("secret");
        assertThat(new CustomUserDetails(user).getPassword(), is("secret"));
    }

    @Test
    void getUsername() {
        User user = new User();
        user.setUsername("John Smith");
        assertThat(new CustomUserDetails(user).getUsername(), is("John Smith"));
    }
}
