package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.SimpleReadWriteLock
 *
 * @author Diffblue Cover
 */

class SimpleReadWriteLockTest {

    @Test
    void tryReadLockReturnsTrue() {
        assertThat(new SimpleReadWriteLock().tryReadLock(), is(true));
    }

    @Test
    void releaseReadLock() {
        new SimpleReadWriteLock().releaseReadLock();
    }

    @Test
    void tryWriteLockReturnsTrue() {
        assertThat(new SimpleReadWriteLock().tryWriteLock(), is(true));
    }

    @Test
    void releaseWriteLock() {
        new SimpleReadWriteLock().releaseWriteLock();
    }
}
