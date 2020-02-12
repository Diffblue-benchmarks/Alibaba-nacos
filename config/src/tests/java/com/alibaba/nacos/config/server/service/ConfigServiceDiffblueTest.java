package com.alibaba.nacos.config.server.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.ConfigService
 *
 * @author Diffblue JCover
 */

public class ConfigServiceDiffblueTest {

//    @Test(timeout=10000)
//    public void checkMd5ReturnsEmpty() {
//        assertTrue(ConfigService.checkMd5().isEmpty());  <-- NullPointer
//    }
//
//    @Test(timeout=10000)
//    public void dump() {
//        assertThat(ConfigService.dump("something", "bar", "d save disk errorx ", "foo", 1L), is(true));
//        assertThat(ConfigService.dump("bar", "No space left on device", "foo", "foo", 1L), is(false));  <-- Expected: is <false>     but: was <true>
//        assertThat(ConfigService.dump("something", "bar", "foo", "foo", 0L), is(true));
//    }
//
    @Test(timeout=10000)
    public void dumpBeta() {
        assertThat(ConfigService.dumpBeta("something", "bar", "foo", "foo", 1L, "foo"), is(true));
        assertThat(ConfigService.dumpBeta("something", "foo", "foo", "foo", 1L, "bar"), is(true));
        assertThat(ConfigService.dumpBeta("", "bar", "foo", "foo", 1L, "foo"), is(false));
    }

    @Test(timeout=10000)
    public void dumpChange() {
        assertThat(ConfigService.dumpChange("something", "foo", "foo", "bar", 1L), is(true));
        assertThat(ConfigService.dumpChange("", "foo", "foo", "foo", 1L), is(false));
        assertThat(ConfigService.dumpChange("something", "bar", "foo", "foo", 1L), is(true));
    }

//    @Test(timeout=10000)
//    public void dumpTag() {
//        assertThat(ConfigService.dumpTag("something", "foo", "foo", "d save disk errorx ", "foo", 1L), is(true));
//        assertThat(ConfigService.dumpTag("something", "foo", "foo", "foo", "bar", 1L), is(true));
//        assertThat(ConfigService.dumpTag("foo", "foo", "foo", "foo", "foo", 1L), is(false));  <-- Expected: is <false>     but: was <true>
//        assertThat(ConfigService.dumpTag("something", "bar", "foo", "foo", "foo", 1L), is(true));
//        assertThat(ConfigService.dumpTag("something", "foo", "foo", "foo", "foo", 0L), is(true));
//    }
//
    @Test(timeout=10000)
    public void getBetaIpsGroupKeyIsFooReturnsEmpty() {
        assertTrue(ConfigService.getBetaIps("foo").isEmpty());
    }

    @Test(timeout=10000)
    public void getContentBetaMd5GroupKeyIsFooReturnsEmpty() {
        assertThat(ConfigService.getContentBetaMd5("foo"), is(""));
    }

    @Test(timeout=10000)
    public void getContentCacheGroupKeyIsFooReturnsNull() {
        assertThat(ConfigService.getContentCache("foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getContentTagMd5GroupKeyIsFooAndTagIsFooReturnsEmpty() {
        assertThat(ConfigService.getContentTagMd5("foo", "foo"), is(""));
    }

    @Test(timeout=10000)
    public void getLastModifiedTsGroupKeyIsSmithReturnsZero() {
        assertThat(ConfigService.getLastModifiedTs("Smith"), is(0L));
    }

//    @Test(timeout=10000)
//    public void groupCountReturnsOne() {
//        assertThat(ConfigService.groupCount(), is(1));  <-- Expected: is <1>     but: was <2>
//    }
//
    @Test(timeout=10000)
    public void hasGroupKeyGroupKeyIsFooReturnsFalse() {
        assertThat(ConfigService.hasGroupKey("foo"), is(false));
    }

    @Test(timeout=10000)
    public void isUptodate() {
        assertThat(ConfigService.isUptodate("bar", "foo", "foo", "foo"), is(false));
        assertThat(ConfigService.isUptodate("bar", "foo"), is(false));
        assertThat(ConfigService.isUptodate("foo", "", "foo", "foo"), is(true));
        assertThat(ConfigService.isUptodate("foo", ""), is(true));
    }

    @Test(timeout=10000)
    public void releaseReadLockGroupKeyIsBar() {
        ConfigService.releaseReadLock("bar");
    }

    @Test(timeout=10000)
    public void releaseReadLockGroupKeyIsFoo() {
        ConfigService.releaseReadLock("foo");
    }

    @Test(timeout=10000)
    public void reloadConfig() {
        ConfigService.reloadConfig();
    }

    @Test(timeout=10000)
    public void removeBetaDataIdIsSomethingAndGroupIsBarAndTenantIsFooReturnsTrue() {
        assertThat(ConfigService.removeBeta("something", "bar", "foo"), is(true));
    }

    @Test(timeout=10000)
    public void removeDataIdIsSomethingAndGroupIsBarAndTenantIsFooReturnsTrue() {
        assertThat(ConfigService.remove("something", "bar", "foo"), is(true));
    }

//    @Test(timeout=10000)
//    public void removeTag() {
//        assertThat(ConfigService.removeTag("something", "bar", "foo", "foo"), is(true));  <-- NullPointer
//        assertThat(ConfigService.removeTag("something", "foo", "foo", "bar"), is(true));
//    }
//
//    @Test(timeout=10000)
//    public void tryReadLock() {
//        assertThat(ConfigService.tryReadLock("bar"), is(-1));  <-- Expected: is <-1>     but: was <0>
//        assertThat(ConfigService.tryReadLock("foo"), is(0));
//    }
//
//    @Test(timeout=10000)
//    public void tryWriteLock() {
//        assertThat(ConfigService.tryWriteLock("bar"), is(-1));  <-- Expected: is <-1>     but: was <0>
//        assertThat(ConfigService.tryWriteLock("foo"), is(0));
//    }
//
    @Test(timeout=10000)
    public void updateBetaMd5Ips4BetaIsEmptyAndLastModifiedTsIsOneAndMd5IsEmpty() {
        ConfigService.updateBetaMd5("1999-12-31", "", new ArrayList<String>(), 1L);
    }

    @Test(timeout=10000)
    public void updateMd5LastModifiedTsIsOneAndMd5IsEmpty() {
        ConfigService.updateMd5("1999-12-31", "", 1L);
    }
}
