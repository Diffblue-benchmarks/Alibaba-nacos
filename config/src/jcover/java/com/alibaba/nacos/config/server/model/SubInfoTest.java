package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.SubInfo
 *
 * @author Diffblue Cover
 */

class SubInfoTest {

    @Test
    void factory() {
        SubInfo subInfo = new SubInfo();
        subInfo.setAppName("Acme");
        subInfo.setDataId("1234");
        subInfo.setDate(Timestamp.valueOf("2019-12-31 23:10:59"));
        subInfo.setGroup("/some/path.html");
        subInfo.setLocalIp("en_GB");
        assertThat(subInfo.getAppName(), is("Acme"));
        assertThat(subInfo.getDataId(), is("1234"));
        assertThat(subInfo.getGroup(), is("/some/path.html"));
        assertThat(subInfo.getLocalIp(), is("en_GB"));
    }

    @Test
    void getDate() {
        SubInfo subInfo = new SubInfo();
        subInfo.setDate(Timestamp.valueOf("2019-12-31 23:10:59"));
        assertThat(subInfo.getDate(), equalTo(Timestamp.valueOf("2019-12-31 23:10:59.0")));
    }
}
