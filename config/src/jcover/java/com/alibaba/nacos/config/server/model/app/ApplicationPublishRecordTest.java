package com.alibaba.nacos.config.server.model.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.app.ApplicationPublishRecord
 *
 * @author Diffblue Cover
 */

class ApplicationPublishRecordTest {

    @Test
    void factory() {
        ApplicationPublishRecord applicationPublishRecord = new ApplicationPublishRecord("Acme", "1234", "1234");
        applicationPublishRecord.setAppName("Acme");
        GroupKey configInfo = new GroupKey("key");
        configInfo.setDataId("1234");
        configInfo.setGroup("key");
        applicationPublishRecord.setConfigInfo(configInfo);
        assertThat(applicationPublishRecord.getAppName(), is("Acme"));
        assertThat(applicationPublishRecord.getConfigInfo(), sameInstance(configInfo));
    }
}
