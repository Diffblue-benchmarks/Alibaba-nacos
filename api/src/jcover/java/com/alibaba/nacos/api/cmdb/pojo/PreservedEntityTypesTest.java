package com.alibaba.nacos.api.cmdb.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.cmdb.pojo.PreservedEntityTypes
 *
 * @author Diffblue Cover
 */

class PreservedEntityTypesTest {

    @Test
    void valuesReturnsIpService() {
        PreservedEntityTypes[] result = PreservedEntityTypes.values();
        assertThat(result[0], is(PreservedEntityTypes.ip));
        assertThat(result[1], is(PreservedEntityTypes.service));
    }
}
