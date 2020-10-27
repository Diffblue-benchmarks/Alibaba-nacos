package com.alibaba.nacos.naming.selector;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.naming.core.Instance;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.selector.LabelSelector
 *
 * @author Diffblue Cover
 */

public class LabelSelectorTest {

    @Test
    public void factory() {
        LabelSelector labelSelector = new LabelSelector();
        labelSelector.setLabels(new HashSet<String>());
        labelSelector.setExpression("1");
        assertThat(labelSelector.getLabels(), is(notNullValue()));
        assertThat(labelSelector.getExpression(), is("1"));
        assertThat(labelSelector.getType(), is("label"));
    }

    @Test
    public void parseExpressionExpressionIsEmptyReturnsEmpty() throws com.alibaba.nacos.naming.exception.NacosException {
        assertThat(LabelSelector.parseExpression(""), empty());
    }

    @Test
    public void select1() {
        LabelSelector labelSelector = new LabelSelector();
        labelSelector.setLabels(new HashSet<String>());
        ArrayList<Instance> providers = new ArrayList<Instance>();
        assertThat(labelSelector.select("label", providers), instanceOf(ArrayList.class));
        assertThat((ArrayList<Instance>) labelSelector.select("label", providers), sameInstance(providers));
    }

    @Test
    public void select2() {
        LabelSelector labelSelector = new LabelSelector();
        HashSet<String> labels = new HashSet<String>();
        labels.add("");
        labelSelector.setLabels(labels);
        ArrayList<Instance> providers = new ArrayList<Instance>();
        assertThat(labelSelector.select("label", providers), instanceOf(ArrayList.class));
        assertThat((ArrayList<Instance>) labelSelector.select("label", providers), sameInstance(providers));
    }
}
