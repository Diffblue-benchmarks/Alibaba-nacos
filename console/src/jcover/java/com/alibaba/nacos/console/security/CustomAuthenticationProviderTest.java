package com.alibaba.nacos.console.security;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Unit tests for com.alibaba.nacos.console.security.CustomAuthenticationProvider
 *
 * @author Diffblue Cover
 */

@ContextConfiguration(classes = {CustomAuthenticationProvider.class})
@ExtendWith(SpringExtension.class)
class CustomAuthenticationProviderTest {

    @MockBean(name = "userDetailsService")
    private CustomUserDetailsServiceImpl userDetailsService;

    @Autowired
    private CustomAuthenticationProvider service;

    @Test
    void authenticate() throws org.springframework.security.core.userdetails.UsernameNotFoundException, org.springframework.security.core.AuthenticationException {
        UserDetails userDetails = mock(UserDetails.class);
        when(userDetails.getPassword())
            .thenReturn("545321456");
        when(userDetailsService.loadUserByUsername(Mockito.<String>any()))
            .thenReturn(userDetails);
        Authentication result =
             service.authenticate(new TestingAuthenticationToken("bar", "password"));
        assertThat(result.getAuthorities(), empty());
        assertThat(result.getCredentials(), is(nullValue()));
        assertThat(result.getDetails(), is(nullValue()));
        assertThat((String) result.getPrincipal(), is("bar"));
        assertThat(result.isAuthenticated(), is(true));
    }

    @Test
    void authenticateReturnsNull() throws org.springframework.security.core.userdetails.UsernameNotFoundException, org.springframework.security.core.AuthenticationException {
        UserDetails userDetails = mock(UserDetails.class);
        when(userDetails.getPassword())
            .thenReturn("bar");
        when(userDetailsService.loadUserByUsername(Mockito.<String>any()))
            .thenReturn(userDetails);
        assertThat(service.authenticate(new TestingAuthenticationToken("password", "bar")), is(nullValue()));
    }

    @Test
    void supportsAClassIsStringReturnsFalse() {
        assertThat(service.supports(String.class), is(false));
    }

    @Test
    void supportsAClassIsUsernamePasswordAuthenticationTokenReturnsTrue() {
        assertThat(service.supports(org.springframework.security.authentication.UsernamePasswordAuthenticationToken.class), is(true));
    }
}
