package com.alibaba.nacos.api.cmdb.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.cmdb.pojo.Entity
 *
 * @author Diffblue JCover
 */

public class EntityTest {

    @Test(timeout=10000)
    public void getLabelsReturnsNull() {
        assertThat(new Entity().getLabels(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getNameReturnsNull() {
        assertThat(new Entity().getName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTypeReturnsNull() {
        assertThat(new Entity().getType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setLabelsToEmpty() {
        Entity entity = new Entity();
        Map<String, String> labels = new HashMap<String, String>();
        entity.setLabels(labels);
        assertThat(entity.getLabels(), sameInstance(labels));
    }

    @Test(timeout=10000)
    public void setName() {
        Entity entity = new Entity();
        entity.setName("/bin/bash");
        assertThat(entity.getName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setTypeToGif() {
        Entity entity = new Entity();
        entity.setType("gif");
        assertThat(entity.getType(), is("gif"));
    }
}
