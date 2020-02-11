package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.ephemeral.distro.TaskDispatcher
 *
 * @author Diffblue JCover
 */

public class TaskDispatcherTest {

    @Test(timeout=10000)
    public void init() {
        new TaskDispatcher().init();
    }
}
