package com.alibaba.nacos.naming.consistency;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.ApplyAction
 *
 * @author Diffblue JCover
 */

public class ApplyActionTest {

    @Test(timeout=10000)
    public void valuesReturnsCHANGEDELETE() {
        ApplyAction[] result = ApplyAction.values();
        assertThat(result[0], is(ApplyAction.CHANGE));
        assertThat(result[1], is(ApplyAction.DELETE));
    }
}
