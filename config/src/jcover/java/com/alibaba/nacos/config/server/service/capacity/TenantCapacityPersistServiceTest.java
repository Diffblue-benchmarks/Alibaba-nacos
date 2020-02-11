//package com.alibaba.nacos.config.server.service.capacity;
//
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//import com.alibaba.nacos.config.server.service.DataSourceService;
//import com.alibaba.nacos.config.server.service.DynamicDataSource;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//
///**
// * Unit tests for com.alibaba.nacos.config.server.service.capacity.TenantCapacityPersistService
// *
// * @author Diffblue JCover
// */
//
//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = TenantCapacityPersistService.class)
//public class TenantCapacityPersistServiceTest {
//
//    @MockBean(name = "dynamicDataSource")
//    private DynamicDataSource dynamicDataSource;
//
//    @Autowired
//    private TenantCapacityPersistService service;
//
//    @Test(timeout=10000)
//    public void init() {
//        DataSourceService dataSourceService = mock(DataSourceService.class);
//        when(dataSourceService.getJdbcTemplate())
//            .thenReturn(new org.springframework.jdbc.core.JdbcTemplate());
//        when(dynamicDataSource.getDataSource())
//            .thenReturn(dataSourceService);
//        service.init();
//    }
//}
