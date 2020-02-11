package com.alibaba.nacos.console.security;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.console.security.CustomAuthenticationProvider
 *
 * @author Diffblue JCover
 */

public class CustomAuthenticationProviderTest {

    @Test(timeout=10000)
    public void supports() {
        assertThat(new CustomAuthenticationProvider().supports(Object.class), is(false));
        assertThat(new CustomAuthenticationProvider().supports(org.springframework.security.authentication.UsernamePasswordAuthenticationToken.class), is(true));
    }
}
