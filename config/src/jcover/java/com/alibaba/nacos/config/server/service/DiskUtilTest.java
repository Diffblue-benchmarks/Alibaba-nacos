package com.alibaba.nacos.config.server.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.DiskUtil
 *
 * @author Diffblue JCover
 */

public class DiskUtilTest {

    @Test(timeout=10000)
    public void clearAll() {
        DiskUtil.clearAll();
    }

    @Test(timeout=10000)
    public void clearAllBeta() {
        DiskUtil.clearAllBeta();
    }

    @Test(timeout=10000)
    public void clearAllTag() {
        DiskUtil.clearAllTag();
    }

    @Test(timeout=10000)
    public void getConfigDataIdIsEmptyAndGroupIsFooAndTenantIsFooReturnsEmpty() throws java.io.IOException {
        assertThat(DiskUtil.getConfig("", "foo", "foo"), is(""));
    }

    @Test(timeout=10000)
    public void getLocalConfigMd5() throws java.io.IOException {
        assertThat(DiskUtil.getLocalConfigMd5("something", "bar", "545321456"), is("d41d8cd98f00b204e9800998ecf8427e"));
        assertThat(DiskUtil.getLocalConfigMd5("something", "545321456", ""), is("d41d8cd98f00b204e9800998ecf8427e"));
    }

    @Test(timeout=10000)
    public void getPath() {
        assertThat(DiskUtil.heartBeatFile().getPath(), is("/home/thomas_perkins/nacos/status/heartBeat.txt"));
        assertThat(DiskUtil.targetBetaFile("something", "bar", "/bin/bash").getPath(), is("/home/thomas_perkins/nacos/data/tenant-beta-data/bin/bash/bar/something"));
        assertThat(DiskUtil.targetBetaFile("something", "/bin/bash", "").getPath(), is("/home/thomas_perkins/nacos/data/beta-data/bin/bash/something"));
        assertThat(DiskUtil.targetTagFile("something", "bar", "/bin/bash", "/bin/bash").getPath(), is("/home/thomas_perkins/nacos/data/tag-beta-data/bin/bash/bar/something/bin/bash"));
        assertThat(DiskUtil.targetTagFile("something", "/bin/bash", "", "/bin/bash").getPath(), is("/home/thomas_perkins/nacos/data/tag-data/bin/bash/something/bin/bash"));
    }

    @Test(timeout=10000)
    public void relativePathDataIdIsSomething() {
        assertThat(DiskUtil.relativePath("something", "/bin/bash"), is("/data/config-data/something//bin/bash"));
    }

    @Test(timeout=10000)
    public void removeConfigInfo4BetaDataIdIsSomethingAndGroupIsBarAndTenantIsFoo() {
        DiskUtil.removeConfigInfo4Beta("something", "bar", "foo");
    }

    @Test(timeout=10000)
    public void removeConfigInfo4TagDataIdIsSomethingAndGroupIsBarAndTagIsFooAndTenantIsFoo() {
        DiskUtil.removeConfigInfo4Tag("something", "bar", "foo", "foo");
    }

    @Test(timeout=10000)
    public void removeConfigInfoDataIdIsSomethingAndGroupIsBarAndTenantIsFoo() {
        DiskUtil.removeConfigInfo("something", "bar", "foo");
    }

    @Test(timeout=10000)
    public void removeHeartHeat() {
        DiskUtil.removeHeartHeat();
    }

    @Test(timeout=10000)
    public void saveBetaToDiskContentIsFooAndDataIdIsSomethingAndGroupIsBarAndTenantIsFoo() throws java.io.IOException {
        DiskUtil.saveBetaToDisk("something", "bar", "foo", "foo");
    }

    @Test(timeout=10000)
    public void saveHeartBeatToDiskHeartBeatTimeIsGif() throws java.io.IOException {
        DiskUtil.saveHeartBeatToDisk("gif");
    }

    @Test(timeout=10000)
    public void saveTagToDiskContentIsFooAndDataIdIsSomethingAndGroupIsBarAndTagIsFooAndTenantIsFoo() throws java.io.IOException {
        DiskUtil.saveTagToDisk("something", "bar", "foo", "foo", "foo");
    }

    @Test(timeout=10000)
    public void saveToDiskContentIsFooAndDataIdIsSomethingAndGroupIsBarAndTenantIsFoo() throws java.io.IOException {
        DiskUtil.saveToDisk("something", "bar", "foo", "foo");
    }
}
