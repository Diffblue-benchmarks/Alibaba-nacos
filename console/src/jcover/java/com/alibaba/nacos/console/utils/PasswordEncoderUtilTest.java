package com.alibaba.nacos.console.utils;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.console.utils.PasswordEncoderUtil
 *
 * @author Diffblue Cover
 */

class PasswordEncoderUtilTest {

    @Test
    void mainArgsIsSecret() {
        String[] args = new String[] { "secret" };
        PasswordEncoderUtil.main(args);
    }
}
