package com.alibaba.nacos.console.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.TestingAuthenticationToken;
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
    void createToken() {
        assertThat(service.createToken(new TestingAuthenticationToken("Bearer", "Bearer")), is("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJCZWFyZXIiLCJhdXRoIjoiIiwiZXhwIjoxNjA0ODA4NTI1fQ.wa3EOV2BsS6TzIO4aoIlzAYnansEBxkynaIQWi11muc"));
    }

    @Test
    void validateToken() {
        assertThat(service.validateToken("Bearer"), is(false));
        assertThat(service.validateToken(""), is(false));
    }
}
