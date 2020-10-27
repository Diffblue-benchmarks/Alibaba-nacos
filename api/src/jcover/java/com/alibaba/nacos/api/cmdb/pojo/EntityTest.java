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
        entity.setLabels(new HashMap<String, String>());
        entity.setName("entity");
        entity.setType("BASIC");
        assertThat(entity.getLabels().isEmpty(), is(true));
        assertThat(entity.getName(), is("entity"));
        assertThat(entity.getType(), is("BASIC"));
    }
}
