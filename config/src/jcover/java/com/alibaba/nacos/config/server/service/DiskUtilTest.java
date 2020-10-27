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
    void saveBetaToDiskGroupIsBar() throws java.io.IOException {
        DiskUtil.saveBetaToDisk("1234", "bar", "/some/path.html", "hello");
    }

    @Test
    void saveBetaToDiskTenantIsEmpty() throws java.io.IOException {
        DiskUtil.saveBetaToDisk("1234", "/some/path.html", "", "hello");
    }

    @Test
    void saveTagToDiskGroupIsBarAndTenantIsTag() throws java.io.IOException {
        DiskUtil.saveTagToDisk("1234", "bar", "tag", "tag", "hello");
    }

    @Test
    void saveTagToDiskGroupIsTagAndTenantIsEmpty() throws java.io.IOException {
        DiskUtil.saveTagToDisk("1234", "tag", "", "tag", "hello");
    }

    @Test
    void removeConfigInfo() {
        DiskUtil.removeConfigInfo("1234", "/some/path.html", "/some/path.html");
    }

    @Test
    void removeConfigInfo4Beta() {
        DiskUtil.removeConfigInfo4Beta("1234", "/some/path.html", "/some/path.html");
    }

    @Test
    void removeConfigInfo4TagGroupIsTagAndTagIsTagAndTenantIsTag() {
        DiskUtil.removeConfigInfo4Tag("1234", "tag", "tag", "tag");
    }

    @Test
    void removeHeartHeat() {
        DiskUtil.removeHeartHeat();
    }

    @Test
    void getConfig() throws java.io.IOException {
        assertThat(DiskUtil.getConfig("", "/some/path.html", "/some/path.html"), is(""));
        assertThat(DiskUtil.getConfig("1234", "bar", "/some/path.html"), is("hello"));
        assertThat(DiskUtil.getConfig("1234", "/some/path.html", ""), is("hello"));
    }

    @Test
    void getLocalConfigMd5() throws java.io.IOException {
        assertThat(DiskUtil.getLocalConfigMd5("1234", "en_GB", "en_GB"), is("d41d8cd98f00b204e9800998ecf8427e"));
    }

    @Test
    void getters() {
        assertThat(DiskUtil.heartBeatFile().getPath(), is("/home/thomas_perkins/nacos/status/heartBeat.txt"));
        assertThat(DiskUtil.targetBetaFile("1234", "/bin/bash", "/bin/bash").getPath(), is("/home/thomas_perkins/nacos/data/tenant-beta-data/bin/bash/bin/bash/1234"));
        assertThat(DiskUtil.targetTagFile("1234", "/bin/bash", "/bin/bash", "tag").getPath(), is("/home/thomas_perkins/nacos/data/tag-beta-data/bin/bash/bin/bash/1234/tag"));
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
