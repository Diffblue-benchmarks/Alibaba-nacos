package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.naming.consistency.Datum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.ephemeral.distro.DataStore
 *
 * @author Diffblue JCover
 */

public class DataStoreDiffblueTest {

    @Test(timeout=10000)
    public void batchGetKeysIsEmpty() {
        assertThat(new DataStore().batchGet(new ArrayList<String>()).isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void batchGetKeysIsSomething() {
        List<String> keys = new ArrayList<String>();
        ((ArrayList<String>)keys).add("something");
        assertThat(new DataStore().batchGet(keys).isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void containsKeyIsSomethingReturnsFalse() {
        assertThat(new DataStore().contains("something"), is(false));
    }

    @Test(timeout=10000)
    public void getDataMapReturnsEmpty() {
        DataStore dataStore = new DataStore();
        Map<String, com.alibaba.nacos.naming.consistency.Datum> result = dataStore.getDataMap();
        assertThat(result.isEmpty(), is(true));
        assertThat(dataStore.getDataMap(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getInstanceCountReturnsZero() {
        assertThat(new DataStore().getInstanceCount(), is(0));
    }

    @Test(timeout=10000)
    public void getKeyIsSomethingReturnsNull() {
        assertThat(new DataStore().get("something"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void keysReturnsEmpty() {
        assertThat(new DataStore().keys(), empty());
    }

    @Test(timeout=10000)
    public void putKeyIsSomething() {
        DataStore dataStore = new DataStore();
        Datum value = new Datum();
        dataStore.put("something", value);
        assertThat(dataStore.getDataMap().get("something"), sameInstance(value));
    }

    @Test(timeout=10000)
    public void removeKeyIsSomethingReturnsNull() {
        assertThat(new DataStore().remove("something"), is(nullValue()));
    }
}
