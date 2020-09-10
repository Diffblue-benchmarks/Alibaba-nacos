package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.SignUtil
 *
 * @author Diffblue Cover
 */

class SignUtilTest {

    @Test
    void signDataIsSomethingAndKeyIsKey() throws Exception {
        assertThat(SignUtil.sign("something", "key"), is("rphgSxJQ+iBa/WTVHp8HjJfaB+w="));
    }
}
