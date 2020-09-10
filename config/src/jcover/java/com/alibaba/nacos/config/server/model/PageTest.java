package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.Page
 *
 * @author Diffblue Cover
 */

class PageTest {

    @Test
    void factory() {
        Page<String> page = new Page<String>();
        page.setPageItems(new ArrayList<String>());
        page.setPageNumber(-1);
        page.setPagesAvailable(0);
        page.setTotalCount(1);
        assertThat(page.getPageItems(), empty());
        assertThat(page.getPageNumber(), is(-1));
        assertThat(page.getPagesAvailable(), is(0));
        assertThat(page.getTotalCount(), is(1));
    }
}
