package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.naming.core.Service;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.ClientBeatCheckTask
 *
 * @author Diffblue Cover
 */

public class ClientBeatCheckTaskTest {

    @Test
    public void taskKeyReturnsAcme() {
        Service service1 = new Service();
        service1.setName("Acme");
        assertThat(new ClientBeatCheckTask(service1).taskKey(), is("Acme"));
    }

    @Test
    public void run() {
        new ClientBeatCheckTask(new Service()).run();
    }
}
