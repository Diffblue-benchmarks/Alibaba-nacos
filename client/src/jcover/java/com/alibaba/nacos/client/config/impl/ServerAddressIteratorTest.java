package com.alibaba.nacos.client.config.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.impl.ServerAddressIterator
 *
 * @author Diffblue JCover
 */

public class ServerAddressIteratorTest {

    @Test(timeout=10000)
    public void constructor() {
        List<String> source = new ArrayList<String>();
        ((ArrayList<String>)source).add("280 Broadway");
        assertThat(new ServerAddressIterator(source).hasNext(), is(true));
    }

    @Test(timeout=10000)
    public void hasNextReturnsFalse() {
        assertThat(new ServerAddressIterator(new ArrayList<String>()).hasNext(), is(false));
    }

    @Test(timeout=10000)
    public void hasNextReturnsTrue() {
        List<String> source = new ArrayList<String>();
        ((ArrayList<String>)source).add("280 Broadway");
        assertThat(new ServerAddressIterator(source).hasNext(), is(true));
    }

    @Test(timeout=10000)
    public void next() {
        List<String> source = new ArrayList<String>();
        ((ArrayList<String>)source).add("280 Broadway");
        ServerAddressIterator serverAddressIterator = new ServerAddressIterator(source);
        assertThat(serverAddressIterator.next(), is("280 Broadway"));
        assertThat(serverAddressIterator.hasNext(), is(false));
    }
}
