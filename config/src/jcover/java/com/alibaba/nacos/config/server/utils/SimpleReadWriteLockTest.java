package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.SimpleReadWriteLock
 *
 * @author Diffblue JCover
 */

public class SimpleReadWriteLockTest {

    @Test(timeout=10000)
    public void releaseReadLock() {
        new SimpleReadWriteLock().releaseReadLock();
    }

    @Test(timeout=10000)
    public void releaseWriteLock() {
        new SimpleReadWriteLock().releaseWriteLock();
    }

    @Test(timeout=10000)
    public void tryReadLockReturnsTrue() {
        assertThat(new SimpleReadWriteLock().tryReadLock(), is(true));
    }

    @Test(timeout=10000)
    public void tryWriteLockReturnsTrue() {
        assertThat(new SimpleReadWriteLock().tryWriteLock(), is(true));
    }
}
