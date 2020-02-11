package com.alibaba.nacos.config.server.service.dump;

import static org.mockito.Mockito.mock;

import com.alibaba.nacos.config.server.manager.AbstractTask;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.dump.DumpChangeTask
 *
 * @author Diffblue JCover
 */

public class DumpChangeTaskTest {

    @Test(timeout=10000)
    public void merge() {
        AbstractTask task = mock(AbstractTask.class);
        new DumpChangeTask().merge(task);
    }
}
