package com.alibaba.nacos.api.selector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.selector.SelectorType
 *
 * @author Diffblue Cover
 */

class SelectorTypeTest {

    @Test
    void valuesReturnsUnknownNoneLabel() {
        SelectorType[] result = SelectorType.values();
        assertThat(result[0], is(SelectorType.unknown));
        assertThat(result[1], is(SelectorType.none));
        assertThat(result[2], is(SelectorType.label));
    }
}
