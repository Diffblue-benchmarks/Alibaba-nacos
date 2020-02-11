package com.alibaba.nacos.api.cmdb.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.cmdb.pojo.PreservedEntityTypes
 *
 * @author Diffblue JCover
 */

public class PreservedEntityTypesTest {

    @Test(timeout=10000)
    public void valuesReturnsIpService() {
        PreservedEntityTypes[] result = PreservedEntityTypes.values();
        assertThat(result[0], is(PreservedEntityTypes.ip));
        assertThat(result[1], is(PreservedEntityTypes.service));
    }
}
