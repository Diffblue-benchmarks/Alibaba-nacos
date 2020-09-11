package com.alibaba.nacos.console.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Unit tests for com.alibaba.nacos.console.utils.JwtTokenUtils
 *
 * @author Diffblue Cover
 */

@ContextConfiguration(classes = {JwtTokenUtils.class})
@ExtendWith(SpringExtension.class)
class JwtTokenUtilsTest {

    @Autowired
    private JwtTokenUtils service;

    @Test
    void createToken() throws IllegalArgumentException {
        Authentication authentication = mock(Authentication.class);
        when(authentication.getName())
            .thenReturn("foo");
        assertThat(service.createToken(authentication), is("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmb28iLCJhdXRoIjoiIiwiZXhwIjoxNTk5Nzg3ODAyfQ.XZEOjb1SIEEV_HeuabMPP3j0QhdA_ZTbV7GO8I6OSgI"));
    }

    @Test
    void validateToken() {
        assertThat(service.validateToken("Bearer"), is(false));
        assertThat(service.validateToken(""), is(false));
    }
}
