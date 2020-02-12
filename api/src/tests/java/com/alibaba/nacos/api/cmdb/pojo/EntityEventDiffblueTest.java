package com.alibaba.nacos.api.cmdb.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.cmdb.pojo.EntityEvent
 *
 * @author Diffblue JCover
 */

public class EntityEventDiffblueTest {

    @Test(timeout=10000)
    public void getEntityNameReturnsNull() {
        assertThat(new EntityEvent().getEntityName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getEntityTypeReturnsNull() {
        assertThat(new EntityEvent().getEntityType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTypeReturnsNull() {
        assertThat(new EntityEvent().getType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setEntityName() {
        EntityEvent entityEvent = new EntityEvent();
        entityEvent.setEntityName("/bin/bash");
        assertThat(entityEvent.getEntityName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setEntityTypeToGif() {
        EntityEvent entityEvent = new EntityEvent();
        entityEvent.setEntityType("gif");
        assertThat(entityEvent.getEntityType(), is("gif"));
    }

    @Test(timeout=10000)
    public void setTypeToENTITY_ADD_OR_UPDATE() {
        EntityEvent entityEvent = new EntityEvent();
        entityEvent.setType(EntityEventType.ENTITY_ADD_OR_UPDATE);
        assertThat(entityEvent.getType(), is(EntityEventType.ENTITY_ADD_OR_UPDATE));
    }
}
