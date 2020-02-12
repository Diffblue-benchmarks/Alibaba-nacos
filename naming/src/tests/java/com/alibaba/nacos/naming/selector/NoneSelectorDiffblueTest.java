package com.alibaba.nacos.naming.selector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.selector.NoneSelector
 *
 * @author Diffblue JCover
 */

public class NoneSelectorDiffblueTest {

    @Test(timeout=10000)
    public void selectConsumerIsFooAndProvidersIsEmpty() {
        List<com.alibaba.nacos.naming.core.Instance> providers = new ArrayList<com.alibaba.nacos.naming.core.Instance>();
        assertThat(new NoneSelector().select("foo", providers), sameInstance(providers));
    }
}
