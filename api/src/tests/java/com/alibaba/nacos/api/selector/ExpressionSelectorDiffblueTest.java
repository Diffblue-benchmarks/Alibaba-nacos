package com.alibaba.nacos.api.selector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.selector.ExpressionSelector
 *
 * @author Diffblue JCover
 */

public class ExpressionSelectorDiffblueTest {

    @Test(timeout=10000)
    public void getExpressionReturnsNull() {
        assertThat(new ExpressionSelector().getExpression(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setExpressionToJpg() {
        ExpressionSelector expressionSelector = new ExpressionSelector();
        expressionSelector.setExpression("jpg");
        assertThat(expressionSelector.getExpression(), is("jpg"));
    }
}
