package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.SignUtil
 *
 * @author Diffblue JCover
 */

public class SignUtilTest {

    @Test(timeout=10000)
    public void signDataIsSomethingAndKeyIsFoo() throws Exception {
        assertThat(SignUtil.sign("something", "foo"), is("KnUAgnazIiUClhgLhvg91JfTBAo="));
    }
}
