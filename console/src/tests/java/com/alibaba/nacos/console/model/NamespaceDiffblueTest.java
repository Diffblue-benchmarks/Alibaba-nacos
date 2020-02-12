package com.alibaba.nacos.console.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.console.model.Namespace
 *
 * @author Diffblue JCover
 */

public class NamespaceDiffblueTest {

    @Test(timeout=10000)
    public void getConfigCount() {
        assertThat(new Namespace().getConfigCount(), is(0));
        assertThat(new Namespace("foo", "/bin/bash").getConfigCount(), is(0));
        assertThat(new Namespace("foo", "/bin/bash", 1, 1, 1).getConfigCount(), is(1));
    }

    @Test(timeout=10000)
    public void getNamespaceReturnsNull() {
        assertThat(new Namespace().getNamespace(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getNamespaceShowNameReturnsNull() {
        assertThat(new Namespace().getNamespaceShowName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getQuota() {
        assertThat(new Namespace("foo", "/bin/bash", 1, 1, 1).getQuota(), is(1));
        assertThat(new Namespace().getQuota(), is(0));
    }

    @Test(timeout=10000)
    public void getType() {
        assertThat(new Namespace("foo", "/bin/bash", 1, 1, 1).getType(), is(1));
        assertThat(new Namespace().getType(), is(0));
    }

    @Test(timeout=10000)
    public void setConfigCountToOne() {
        Namespace namespace1 = new Namespace();
        namespace1.setConfigCount(1);
        assertThat(namespace1.getConfigCount(), is(1));
    }

    @Test(timeout=10000)
    public void setNamespaceShowName() {
        Namespace namespace1 = new Namespace();
        namespace1.setNamespaceShowName("/bin/bash");
        assertThat(namespace1.getNamespaceShowName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setNamespaceToFoo() {
        Namespace namespace1 = new Namespace();
        namespace1.setNamespace("foo");
        assertThat(namespace1.getNamespace(), is("foo"));
    }

    @Test(timeout=10000)
    public void setQuotaToOne() {
        Namespace namespace1 = new Namespace();
        namespace1.setQuota(1);
        assertThat(namespace1.getQuota(), is(1));
    }

    @Test(timeout=10000)
    public void setTypeToOne() {
        Namespace namespace1 = new Namespace();
        namespace1.setType(1);
        assertThat(namespace1.getType(), is(1));
    }
}
