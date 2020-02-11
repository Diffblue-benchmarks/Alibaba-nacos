package com.alibaba.nacos.api.cmdb.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.cmdb.pojo.Label
 *
 * @author Diffblue JCover
 */

public class LabelTest {

    @Test(timeout=10000)
    public void getDescriptionReturnsNull() {
        assertThat(new Label().getDescription(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getNameReturnsNull() {
        assertThat(new Label().getName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getValuesReturnsNull() {
        assertThat(new Label().getValues(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setDescriptionToFoo() {
        Label label = new Label();
        label.setDescription("foo");
        assertThat(label.getDescription(), is("foo"));
    }

    @Test(timeout=10000)
    public void setName() {
        Label label = new Label();
        label.setName("/bin/bash");
        assertThat(label.getName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setValuesToEmpty() {
        Label label = new Label();
        Set<String> values = new HashSet<String>();
        label.setValues(values);
        assertThat(label.getValues(), sameInstance(values));
    }
}
