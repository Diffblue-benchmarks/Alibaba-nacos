package com.alibaba.nacos.console.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.console.utils.JwtTokenUtils
 *
 * @author Diffblue JCover
 */

public class JwtTokenUtilsDiffblueTest {

    @Test(timeout=10000)
    public void init() {
        new JwtTokenUtils().init();
    }

    @Test(timeout=10000)
    public void validateTokenTokenIsFooReturnsFalse() {
        assertThat(new JwtTokenUtils().validateToken("foo"), is(false));
    }
}
