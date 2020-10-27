package com.alibaba.nacos.config.server.service.merge;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.config.server.model.ConfigInfo;
import com.alibaba.nacos.config.server.model.ConfigInfoAggr;
import com.alibaba.nacos.config.server.service.DataSourceService;
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
        DataSourceService dataSourceService1 = mock(DataSourceService.class);
        persistService1.setBasicDataSourceService(dataSourceService1);
        PersistService persistService2 = new PersistService();
        DataSourceService dataSourceService2 = mock(DataSourceService.class);
        persistService2.setBasicDataSourceService(dataSourceService2);
        // pojo MergeTaskProcessor new MergeTaskProcessor(persistService1, new MergeDatumService(persistService2))
    }

    @Test
    void merge() {

        // arrange
        ArrayList<ConfigInfoAggr> datumList = new ArrayList<ConfigInfoAggr>();
        ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
        configInfoAggr.setContent("hello");
        datumList.add(configInfoAggr);

        // act
        ConfigInfo result =
             MergeTaskProcessor.merge("1234", "/some/path.html", "/some/path.html", datumList);

        // assert
        assertThat(result.getAppName(), is(nullValue()));
        assertThat(result.getTenant(), is("/some/path.html"));
        assertThat(result.getContent(), is("hello"));
        assertThat(result.getDataId(), is("1234"));
        assertThat(result.getGroup(), is("/some/path.html"));
        assertThat(result.getId(), is(0L));
        assertThat(result.getMd5(), is("5d41402abc4b2a76b9719d911017c592"));
    }

    @Test
    void mergeGroupIsBar() {

        // arrange
        ArrayList<ConfigInfoAggr> datumList = new ArrayList<ConfigInfoAggr>();
        ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
        configInfoAggr.setAppName("Acme");
        configInfoAggr.setContent("hello");
        datumList.add(configInfoAggr);

        // act
        ConfigInfo result =
             MergeTaskProcessor.merge("1234", "bar", "/some/path.html", datumList);

        // assert
        assertThat(result.getAppName(), is("Acme"));
        assertThat(result.getTenant(), is("/some/path.html"));
        assertThat(result.getContent(), is("hello"));
        assertThat(result.getDataId(), is("1234"));
        assertThat(result.getGroup(), is("bar"));
        assertThat(result.getId(), is(0L));
        assertThat(result.getMd5(), is("5d41402abc4b2a76b9719d911017c592"));
    }
}
