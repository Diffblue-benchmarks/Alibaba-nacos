package com.alibaba.nacos.api.cmdb.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.cmdb.pojo.Label
 *
 * @author Diffblue Cover
 */

class LabelTest {

    @Test
    void factory() {
        Label label = new Label();
        label.setDescription("some text");
        label.setName("Acme");
        label.setValues(new HashSet<String>());
        assertThat(label.getDescription(), is("some text"));
        assertThat(label.getName(), is("Acme"));
        assertThat(label.getValues(), is(notNullValue()));
    }
}
