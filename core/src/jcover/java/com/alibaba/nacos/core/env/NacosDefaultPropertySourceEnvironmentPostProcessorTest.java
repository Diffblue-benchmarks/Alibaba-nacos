package com.alibaba.nacos.core.env;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.core.env.NacosDefaultPropertySourceEnvironmentPostProcessor
 *
 * @author Diffblue Cover
 */

class NacosDefaultPropertySourceEnvironmentPostProcessorTest {

    @Test
    void factory() {
        assertThat(new NacosDefaultPropertySourceEnvironmentPostProcessor().getOrder(), is(2_147_483_647));
    }
}
