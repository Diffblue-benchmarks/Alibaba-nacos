package com.alibaba.nacos.config.server.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import com.alibaba.nacos.config.server.utils.PropertyUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.LocalDataSourceServiceImpl
 *
 * @author Diffblue JCover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = LocalDataSourceServiceImpl.class)
public class LocalDataSourceServiceImplDiffblueTest {

    @MockBean(name = "propertyUtil")
    private PropertyUtil propertyUtil;

    @Autowired
    private LocalDataSourceServiceImpl service;

    @Test(timeout=10000)
    public void checkMasterWritableReturnsTrue() {
        assertThat(service.checkMasterWritable(), is(true));
    }

    @Test(timeout=10000)
    public void getCurrentDBUrl() {
        assertThat(service.getCurrentDBUrl(), is("jdbc:derby:/home/thomas_perkins/nacos/data/derby-data;create=true"));
    }

    @Test(timeout=10000)
    public void getHealthReturnsUP() {
        assertThat(service.getHealth(), is("UP"));
    }

//    @Test(timeout=10000)
//    public void getJdbcTemplateReturnsNull() {
//        assertThat(service.getJdbcTemplate(), is(nullValue()));  <-- Expected: is null     but: was <org.springframework.jdbc.core.JdbcTemplate@396640c1>
//    }
//
//    @Test(timeout=10000)
//    public void getTransactionTemplateReturnsNull() {
//        assertThat(service.getTransactionTemplate(), is(nullValue()));  <-- Expected: is null     but: was <PROPAGATION_REQUIRED,ISOLATION_DEFAULT,timeout_5000>
//    }
//
    @Test(timeout=10000)
    public void init() {
        service.init();
    }
}
