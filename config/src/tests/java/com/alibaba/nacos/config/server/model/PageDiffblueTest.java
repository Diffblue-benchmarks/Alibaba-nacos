package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.Page
 *
 * @author Diffblue JCover
 */

public class PageDiffblueTest {

    @Test(timeout=10000)
    public void getPageItemsReturnsEmpty() {
        Page<Object> page = new Page<Object>();
        List<Object> result = page.getPageItems();
        assertTrue(result.isEmpty());
        assertThat(page.getPageItems(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getPageNumberReturnsZero() {
        assertThat(new Page<Object>().getPageNumber(), is(0));
    }

    @Test(timeout=10000)
    public void getPagesAvailableReturnsZero() {
        assertThat(new Page<Object>().getPagesAvailable(), is(0));
    }

    @Test(timeout=10000)
    public void getTotalCountReturnsZero() {
        assertThat(new Page<Object>().getTotalCount(), is(0));
    }

    @Test(timeout=10000)
    public void setPageItemsToEmpty() {
        Page<Object> page = new Page<Object>();
        List<Object> pageItems = new ArrayList<Object>();
        page.setPageItems(pageItems);
        assertThat(page.getPageItems(), sameInstance(pageItems));
    }

    @Test(timeout=10000)
    public void setPageNumberToOne() {
        Page<Object> page = new Page<Object>();
        page.setPageNumber(1);
        assertThat(page.getPageNumber(), is(1));
    }

    @Test(timeout=10000)
    public void setPagesAvailableToOne() {
        Page<Object> page = new Page<Object>();
        page.setPagesAvailable(1);
        assertThat(page.getPagesAvailable(), is(1));
    }

    @Test(timeout=10000)
    public void setTotalCountToOne() {
        Page<Object> page = new Page<Object>();
        page.setTotalCount(1);
        assertThat(page.getTotalCount(), is(1));
    }
}
