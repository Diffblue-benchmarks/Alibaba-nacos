package com.alibaba.nacos.api.cmdb.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.cmdb.pojo.EntityEventType
 *
 * @author Diffblue JCover
 */

public class EntityEventTypeTest {

    @Test(timeout=10000)
    public void valuesReturnsENTITY_ADD_OR_UPDATEENTITY_REMOVE() {
        EntityEventType[] result = EntityEventType.values();
        assertThat(result[0], is(EntityEventType.ENTITY_ADD_OR_UPDATE));
        assertThat(result[1], is(EntityEventType.ENTITY_REMOVE));
    }
}
