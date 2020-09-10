package com.alibaba.nacos.console.security;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.nacos.config.server.model.User;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.Authentication;
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
    void authenticate() throws org.springframework.security.core.userdetails.UsernameNotFoundException, IllegalArgumentException, org.springframework.security.core.AuthenticationException {

        // arrange
        when(userDetailsService.loadUserByUsername(Mockito.<String>any()))
            .thenReturn(new CustomUserDetails(new User()));
        Object object2 = "foo";
        Authentication authentication = mock(Authentication.class);
        when(authentication.getCredentials())
            .thenReturn("bar");
        when(authentication.getPrincipal())
            .thenReturn(object2);

        // act
        Authentication result = service.authenticate(authentication);

        // assert
        assertThat(result.getAuthorities(), empty());
        assertThat(result.getCredentials(), is(nullValue()));
        assertThat(result.getDetails(), is(nullValue()));
        assertThat(result.getPrincipal(), sameInstance(object2));
        assertThat(result.isAuthenticated(), is(true));
    }

    @Test
    void authenticateReturnsNull() throws org.springframework.security.core.userdetails.UsernameNotFoundException, IllegalArgumentException, org.springframework.security.core.AuthenticationException {
        User user = new User();
        user.setPassword("foo");
        when(userDetailsService.loadUserByUsername(Mockito.<String>any()))
            .thenReturn(new CustomUserDetails(user));
        Authentication authentication = mock(Authentication.class);
        when(authentication.getCredentials())
            .thenReturn("foo");
        when(authentication.getPrincipal())
            .thenReturn("foo");
        assertThat(service.authenticate(authentication), is(nullValue()));
    }

    @Test
    void supportsAClassIsStringReturnsFalse() throws org.springframework.security.core.userdetails.UsernameNotFoundException {
        assertThat(service.supports(String.class), is(false));
    }

    @Test
    void supportsAClassIsUsernamePasswordAuthenticationTokenReturnsTrue() throws org.springframework.security.core.userdetails.UsernameNotFoundException {
        assertThat(service.supports(org.springframework.security.authentication.UsernamePasswordAuthenticationToken.class), is(true));
    }
}
