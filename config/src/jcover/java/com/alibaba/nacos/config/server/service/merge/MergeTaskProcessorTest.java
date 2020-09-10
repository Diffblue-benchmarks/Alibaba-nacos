package com.alibaba.nacos.config.server.service.merge;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.config.server.model.ConfigInfo;
import com.alibaba.nacos.config.server.model.ConfigInfoAggr;
import com.alibaba.nacos.config.server.service.BasicDataSourceServiceImpl;
import com.alibaba.nacos.config.server.service.PersistService;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.merge.MergeTaskProcessor
 *
 * @author Diffblue Cover
 */

class MergeTaskProcessorTest {

    @Test
    void factory() {
        PersistService persistService1 = new PersistService();
        persistService1.setBasicDataSourceService(new BasicDataSourceServiceImpl());
        PersistService persistService2 = new PersistService();
        persistService2.setBasicDataSourceService(new BasicDataSourceServiceImpl());
        // pojo MergeTaskProcessor
    }

    @Test
    void mergeDataIdIsBar() {

        // arrange
        ArrayList<ConfigInfoAggr> datumList = new ArrayList<ConfigInfoAggr>();
        ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
        configInfoAggr.setAppName("Acme");
        configInfoAggr.setContent("hello");
        datumList.add(configInfoAggr);

        // act
        ConfigInfo result =
             MergeTaskProcessor.merge("bar", "/some/path.html", "/some/path.html", datumList);

        // assert
        assertThat(result.getAppName(), is("Acme"));
        assertThat(result.getTenant(), is("/some/path.html"));
        assertThat(result.getContent(), is("hello"));
        assertThat(result.getDataId(), is("bar"));
        assertThat(result.getGroup(), is("/some/path.html"));
        assertThat(result.getId(), is(0L));
        assertThat(result.getMd5(), is("5d41402abc4b2a76b9719d911017c592"));
    }
}
