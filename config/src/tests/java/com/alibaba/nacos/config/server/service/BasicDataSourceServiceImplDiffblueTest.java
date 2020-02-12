//package com.alibaba.nacos.config.server.service;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.core.Is.is;
//import static org.hamcrest.core.IsNull.nullValue;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.core.env.Environment;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//
///**
// * Unit tests for com.alibaba.nacos.config.server.service.BasicDataSourceServiceImpl
// *
// * @author Diffblue JCover
// */
//
//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = BasicDataSourceServiceImpl.class)
//public class BasicDataSourceServiceImplDiffblueTest {
//
//    @MockBean(name = "env")
//    private Environment env;
//
//    @Autowired
//    private BasicDataSourceServiceImpl service;
//
//    @Test(timeout=10000)
//    public void getJdbcTemplateReturnsNull() {
//        assertThat(service.getJdbcTemplate(), is(nullValue()));
//    }
//
//    @Test(timeout=10000)
//    public void getTransactionTemplateReturnsNull() {
//        assertThat(service.getTransactionTemplate(), is(nullValue()));
//    }
//}
