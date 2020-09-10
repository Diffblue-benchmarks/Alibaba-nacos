package com.alibaba.nacos.config.server.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.DiskUtil
 *
 * @author Diffblue Cover
 */

class DiskUtilTest {

    @Test
    void saveHeartBeatToDiskHeartBeatTimeIsGif() throws java.io.IOException {
        DiskUtil.saveHeartBeatToDisk("gif");
    }

    @Test
    void saveToDiskContentIsHelloAndGroupIsBar() throws java.io.IOException {
        DiskUtil.saveToDisk("1234", "bar", "/some/path.html", "hello");
    }

    @Test
    void saveBetaToDiskContentIsHelloAndGroupIsBar() throws java.io.IOException {
        DiskUtil.saveBetaToDisk("1234", "bar", "/some/path.html", "hello");
    }

    @Test
    void saveTagToDiskContentIsHelloAndGroupIsFooAndTagIsBarAndTenantIsTag() throws java.io.IOException {
        DiskUtil.saveTagToDisk("1234", "foo", "tag", "bar", "hello");
    }

    @Test
    void removeConfigInfoGroupIsBar() {
        DiskUtil.removeConfigInfo("1234", "bar", "/some/path.html");
    }

    @Test
    void removeConfigInfo4BetaGroupIsBar() {
        DiskUtil.removeConfigInfo4Beta("1234", "bar", "/some/path.html");
    }

    @Test
    void removeConfigInfo4TagGroupIsBarAndTagIsTagAndTenantIsTag() {
        DiskUtil.removeConfigInfo4Tag("1234", "bar", "tag", "tag");
    }

    @Test
    void removeHeartHeat() {
        DiskUtil.removeHeartHeat();
    }

    @Test
    void targetFile() {
        assertThat(DiskUtil.targetFile("1234", "bar", "/bin/bash").getPath(), is("/home/thomas_perkins/nacos/data/tenant-config-data/bin/bash/bar/1234"));
        assertThat(DiskUtil.targetFile("1234", "/bin/bash", "").getPath(), is("/home/thomas_perkins/nacos/data/config-data/bin/bash/1234"));
    }

    @Test
    void targetBetaFile() {
        assertThat(DiskUtil.targetBetaFile("1234", "bar", "/bin/bash").getPath(), is("/home/thomas_perkins/nacos/data/tenant-beta-data/bin/bash/bar/1234"));
        assertThat(DiskUtil.targetBetaFile("1234", "/bin/bash", "").getPath(), is("/home/thomas_perkins/nacos/data/beta-data/bin/bash/1234"));
    }

    @Test
    void targetTagFile() {
        assertThat(DiskUtil.targetTagFile("1234", "bar", "/bin/bash", "tag").getPath(), is("/home/thomas_perkins/nacos/data/tag-beta-data/bin/bash/bar/1234/tag"));
        assertThat(DiskUtil.targetTagFile("1234", "/bin/bash", "", "tag").getPath(), is("/home/thomas_perkins/nacos/data/tag-data/bin/bash/1234/tag"));
    }

    @Test
    void getLocalConfigMd5() throws java.io.IOException {
        assertThat(DiskUtil.getLocalConfigMd5("", "/some/path.html", "/some/path.html"), is("d41d8cd98f00b204e9800998ecf8427e"));
        assertThat(DiskUtil.getLocalConfigMd5("1234", "bar", "/some/path.html"), is("d41d8cd98f00b204e9800998ecf8427e"));
    }

    @Test
    void heartBeatFile() {
        assertThat(DiskUtil.heartBeatFile().getPath(), is("/home/thomas_perkins/nacos/status/heartBeat.txt"));
    }

    @Test
    void relativePath() {
        assertThat(DiskUtil.relativePath("1234", "/bin/bash"), is("/data/config-data/1234//bin/bash"));
    }

    @Test
    void clearAll() {
        DiskUtil.clearAll();
    }

    @Test
    void clearAllBeta() {
        DiskUtil.clearAllBeta();
    }

    @Test
    void clearAllTag() {
        DiskUtil.clearAllTag();
    }
}
