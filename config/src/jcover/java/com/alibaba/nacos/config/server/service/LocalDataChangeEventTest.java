package com.alibaba.nacos.config.server.service;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.LocalDataChangeEvent
 *
 * @author Diffblue Cover
 */

class LocalDataChangeEventTest {

    @Test
    void factory1() {
        // pojo LocalDataChangeEvent new LocalDataChangeEvent("key")
    }

    @Test
    void factory2() {
        ArrayList<String> betaIps = new ArrayList<String>();
        betaIps.add("some event");
        // pojo LocalDataChangeEvent new LocalDataChangeEvent("key", false, betaIps)
    }

    @Test
    void factory3() {
        ArrayList<String> betaIps = new ArrayList<String>();
        betaIps.add("some event");
        // pojo LocalDataChangeEvent new LocalDataChangeEvent("key", false, betaIps, "tag")
    }
}
