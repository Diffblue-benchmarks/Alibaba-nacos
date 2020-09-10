package com.alibaba.nacos.api.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.naming.pojo.ListView
 *
 * @author Diffblue Cover
 */

class ListViewTest {

    @Test
    void factory() {
        ListView<String> listView = new ListView<String>();
        listView.setCount(1);
        listView.setData(new ArrayList<String>());
        assertThat(listView.getCount(), is(1));
        assertThat(listView.getData(), empty());
    }
}
