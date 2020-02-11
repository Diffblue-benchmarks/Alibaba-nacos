package com.alibaba.nacos.console.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.console.model.NamespaceAllInfo
 *
 * @author Diffblue JCover
 */

public class NamespaceAllInfoTest {

    @Test(timeout=10000)
    public void getNamespaceDescReturnsNull() {
        assertThat(new NamespaceAllInfo().getNamespaceDesc(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setNamespaceDescToFoo() {
        NamespaceAllInfo namespaceAllInfo = new NamespaceAllInfo();
        namespaceAllInfo.setNamespaceDesc("foo");
        assertThat(namespaceAllInfo.getNamespaceDesc(), is("foo"));
    }
}
