package com.alibaba.nacos.naming.selector;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.naming.core.Instance;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.selector.NoneSelector
 *
 * @author Diffblue Cover
 */

public class NoneSelectorTest {

    @Test
    public void selectConsumerIsFooAndProvidersIsEmpty() {
        ArrayList<Instance> providers = new ArrayList<Instance>();
        assertThat(new NoneSelector().select("foo", providers), instanceOf(ArrayList.class));
        assertThat((ArrayList<Instance>) new NoneSelector().select("foo", providers), sameInstance(providers));
    }
}
