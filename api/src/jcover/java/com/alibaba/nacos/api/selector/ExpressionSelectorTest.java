package com.alibaba.nacos.api.selector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.selector.ExpressionSelector
 *
 * @author Diffblue Cover
 */

class ExpressionSelectorTest {

    @Test
    void factory() {
        ExpressionSelector expressionSelector = new ExpressionSelector();
        expressionSelector.setExpression("1");
        assertThat(expressionSelector.getExpression(), is("1"));
        assertThat(expressionSelector.getType(), is("label"));
    }
}
