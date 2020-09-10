package com.alibaba.nacos.api.cmdb.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.cmdb.pojo.EntityEvent
 *
 * @author Diffblue Cover
 */

class EntityEventTest {

    @Test
    void factory() {
        EntityEvent entityEvent = new EntityEvent();
        entityEvent.setEntityName("entity");
        entityEvent.setEntityType("entity");
        entityEvent.setType(EntityEventType.ENTITY_ADD_OR_UPDATE);
        assertThat(entityEvent.getEntityName(), is("entity"));
        assertThat(entityEvent.getEntityType(), is("entity"));
        assertThat(entityEvent.getType(), is(EntityEventType.ENTITY_ADD_OR_UPDATE));
    }
}
