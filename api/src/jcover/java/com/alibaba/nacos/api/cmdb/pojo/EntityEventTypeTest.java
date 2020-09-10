package com.alibaba.nacos.api.cmdb.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.cmdb.pojo.EntityEventType
 *
 * @author Diffblue Cover
 */

class EntityEventTypeTest {

    @Test
    void valuesReturnsENTITY_ADD_OR_UPDATEENTITY_REMOVE() {
        EntityEventType[] result = EntityEventType.values();
        assertThat(result[0], is(EntityEventType.ENTITY_ADD_OR_UPDATE));
        assertThat(result[1], is(EntityEventType.ENTITY_REMOVE));
    }
}
