package com.alibaba.nacos.console.security;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

import com.alibaba.nacos.config.server.model.User;
import com.alibaba.nacos.config.server.service.PersistService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Unit tests for com.alibaba.nacos.console.security.CustomUserDetailsServiceImpl
 *
 * @author Diffblue Cover
 */

@ContextConfiguration(classes = {CustomUserDetailsServiceImpl.class})
@ExtendWith(SpringExtension.class)
class CustomUserDetailsServiceImplTest {

    @MockBean(name = "persistService")
    private PersistService persistService;

    @Autowired
    private CustomUserDetailsServiceImpl service;

    @Test
    void loadUserByUsernameUserNameIsRoot() throws org.springframework.security.core.userdetails.UsernameNotFoundException {

        // arrange
        User user = new User();
        user.setPassword("secret");
        user.setUsername("bar");
        when(persistService.findUserByUsername(Mockito.<String>any()))
            .thenReturn(user);

        // act
        UserDetails result = service.loadUserByUsername("root");

        // assert
        assertThat(result.getAuthorities(), empty());
        assertThat(result.getPassword(), is("secret"));
        assertThat(result.getUsername(), is("bar"));
        assertThat(result.isAccountNonExpired(), is(true));
        assertThat(result.isAccountNonLocked(), is(true));
        assertThat(result.isCredentialsNonExpired(), is(true));
        assertThat(result.isEnabled(), is(true));
    }
}
