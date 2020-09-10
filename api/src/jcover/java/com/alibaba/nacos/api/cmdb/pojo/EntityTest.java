package com.alibaba.nacos.api.cmdb.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.cmdb.pojo.Entity
 *
 * @author Diffblue Cover
 */

class EntityTest {

    @Test
    void factory() {
        Entity entity = new Entity();
        HashMap<String, String> labels = new HashMap<String, String>();
        labels.put("foo", "foo");
        entity.setLabels(labels);
        entity.setName("entity");
        entity.setType("BASIC");
        assertThat(entity.getLabels().get("foo"), is("foo"));
        assertThat(entity.getName(), is("entity"));
        assertThat(entity.getType(), is("BASIC"));
    }
}
