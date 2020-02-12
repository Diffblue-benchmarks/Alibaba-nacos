package com.alibaba.nacos.api.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.naming.pojo.ListView
 *
 * @author Diffblue JCover
 */

public class ListViewDiffblueTest {

    @Test(timeout=10000)
    public void getCountReturnsZero() {
        assertThat(new ListView<Object>().getCount(), is(0));
    }

    @Test(timeout=10000)
    public void getDataReturnsNull() {
        assertThat(new ListView<Object>().getData(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setCountToOne() {
        ListView<Object> listView = new ListView<Object>();
        listView.setCount(1);
        assertThat(listView.getCount(), is(1));
    }

    @Test(timeout=10000)
    public void setDataToEmpty() {
        ListView<Object> listView = new ListView<Object>();
        List<Object> data = new ArrayList<Object>();
        listView.setData(data);
        assertThat(listView.getData(), sameInstance(data));
    }
}
