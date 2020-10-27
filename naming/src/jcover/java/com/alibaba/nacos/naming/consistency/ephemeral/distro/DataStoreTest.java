package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.naming.consistency.Datum;
import com.alibaba.nacos.naming.pojo.Record;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.ephemeral.distro.DataStore
 *
 * @author Diffblue Cover
 */

@ContextConfiguration(classes = {DataStore.class})
@RunWith(SpringRunner.class)
public class DataStoreTest {

    @Autowired
    private DataStore service;

    @Test
    public void putKeyIsKey() {
        service.put("key", new Datum<Record>());
    }

    @Test
    public void removeKeyIsKeyReturnsNull() {
        assertThat(service.remove("key"), is(nullValue()));
    }

    @Test
    public void keysReturnsEmpty() {
        assertThat(service.keys(), empty());
    }

    @Test
    public void getKeyIsKeyReturnsNull() {
        assertThat(service.get("key"), is(nullValue()));
    }

    @Test
    public void containsKeyIsKeyReturnsFalse() {
        assertThat(service.contains("key"), is(false));
    }

    @Test
    public void batchGetKeysIsFoo() {
        ArrayList<String> keys = new ArrayList<String>();
        keys.add("foo");
        assertThat(service.batchGet(keys).isEmpty(), is(true));
    }

    @Test
    public void getters() {
        assertThat(service.batchGet(new ArrayList<String>()).isEmpty(), is(true));
        assertThat(service.getDataMap().isEmpty(), is(true));
    }

    @Test
    public void getInstanceCountReturnsZero() {
        assertThat(service.getInstanceCount(), is(0));
    }
}
