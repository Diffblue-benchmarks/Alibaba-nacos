package com.alibaba.nacos.config.server.service.merge;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import com.alibaba.nacos.config.server.model.ConfigInfo;
import com.alibaba.nacos.config.server.model.ConfigInfoAggr;
import com.alibaba.nacos.config.server.service.PersistService;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.merge.MergeTaskProcessor
 *
 * @author Diffblue JCover
 */

public class MergeTaskProcessorTest {

    @Test(timeout=10000)
    public void constructor() {
        // pojo MergeTaskProcessor
    }

    @Test(timeout=10000)
    public void mergeGroupIsBar() {
        List<ConfigInfoAggr> datumList = new ArrayList<ConfigInfoAggr>();
        ((ArrayList<ConfigInfoAggr>)datumList).add(new ConfigInfoAggr());
        ConfigInfo result = MergeTaskProcessor.merge("something", "bar", "foo", datumList);
        assertThat(result.getAppName(), is(nullValue()));
        assertThat(result.getTenant(), is("foo"));
        assertThat(result.getContent(), is("null"));
        assertThat(result.getDataId(), is("something"));
        assertThat(result.getGroup(), is("bar"));
        assertThat(result.getId(), is(0L));
        assertThat(result.getMd5(), is("37a6259cc0c1dae299a7866489dff0bd"));
    }

    @Test(timeout=10000)
    public void mergeGroupIsFoo() {
        List<ConfigInfoAggr> datumList = new ArrayList<ConfigInfoAggr>();
        ((ArrayList<ConfigInfoAggr>)datumList).add(new ConfigInfoAggr("something", "foo", "foo", "/bin/bash", "foo"));
        ConfigInfo result = MergeTaskProcessor.merge("something", "foo", "foo", datumList);
        assertThat(result.getAppName(), is("/bin/bash"));
        assertThat(result.getTenant(), is("foo"));
        assertThat(result.getContent(), is("foo"));
        assertThat(result.getDataId(), is("something"));
        assertThat(result.getGroup(), is("foo"));
        assertThat(result.getId(), is(0L));
        assertThat(result.getMd5(), is("acbd18db4cc2f85cedef654fccc4a4d8"));
    }
}
