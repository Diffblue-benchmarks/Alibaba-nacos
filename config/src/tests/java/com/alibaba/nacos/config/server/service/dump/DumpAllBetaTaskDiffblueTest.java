package com.alibaba.nacos.config.server.service.dump;

import static org.mockito.Mockito.mock;

import com.alibaba.nacos.config.server.manager.AbstractTask;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.dump.DumpAllBetaTask
 *
 * @author Diffblue JCover
 */

public class DumpAllBetaTaskDiffblueTest {

    @Test(timeout=10000)
    public void merge() {
        AbstractTask task = mock(AbstractTask.class);
        new DumpAllBetaTask().merge(task);
    }
}
