package com.alibaba.nacos.api.selector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.selector.SelectorType
 *
 * @author Diffblue JCover
 */

public class SelectorTypeTest {

    @Test(timeout=10000)
    public void valuesReturnsUnknownNoneLabel() {
        SelectorType[] result = SelectorType.values();
        assertThat(result[0], is(SelectorType.unknown));
        assertThat(result[1], is(SelectorType.none));
        assertThat(result[2], is(SelectorType.label));
    }
}
