package com.alibaba.nacos.naming.selector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.selector.LabelSelector
 *
 * @author Diffblue JCover
 */

public class LabelSelectorTest {

    @Test(timeout=10000)
    public void getLabelsReturnsNull() {
        assertThat(new LabelSelector().getLabels(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setExpressionToJpg() {
        LabelSelector labelSelector = new LabelSelector();
        labelSelector.setExpression("jpg");
        assertThat(labelSelector.getExpression(), is("jpg"));
    }

    @Test(timeout=10000)
    public void setLabelsToEmpty() {
        LabelSelector labelSelector = new LabelSelector();
        Set<String> labels = new HashSet<String>();
        labelSelector.setLabels(labels);
        assertThat(labelSelector.getLabels(), sameInstance(labels));
    }
}
