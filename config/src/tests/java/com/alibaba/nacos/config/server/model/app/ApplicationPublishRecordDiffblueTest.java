package com.alibaba.nacos.config.server.model.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.app.ApplicationPublishRecord
 *
 * @author Diffblue JCover
 */

public class ApplicationPublishRecordDiffblueTest {

    @Test(timeout=10000)
    public void getAppName() {
        assertThat(new ApplicationPublishRecord("/bin/bash", "something", "octet-stream").getAppName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void getConfigInfo() {
        ApplicationPublishRecord applicationPublishRecord = new ApplicationPublishRecord("/bin/bash", "something", "octet-stream");
        GroupKey result = applicationPublishRecord.getConfigInfo();
        assertThat(result.getDataId(), is("something"));
        assertThat(result.getGroup(), is("octet-stream"));
        assertThat(result.getGroupkeyString(), is("something+octet-stream"));
        assertThat(applicationPublishRecord.getConfigInfo(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void setAppName() {
        new ApplicationPublishRecord("/bin/bash", "something", "octet-stream").setAppName("/bin/bash");
    }

    @Test(timeout=10000)
    public void setConfigInfo() {
        ApplicationPublishRecord applicationPublishRecord = new ApplicationPublishRecord("/bin/bash", "something", "octet-stream");
        GroupKey configInfo = new GroupKey("foo");
        applicationPublishRecord.setConfigInfo(configInfo);
        assertThat(applicationPublishRecord.getConfigInfo(), sameInstance(configInfo));
    }
}
