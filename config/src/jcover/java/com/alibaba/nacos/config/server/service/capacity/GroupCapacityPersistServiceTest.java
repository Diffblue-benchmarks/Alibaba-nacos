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
// * Unit tests for com.alibaba.nacos.config.server.service.capacity.GroupCapacityPersistService
// *
// * @author Diffblue JCover
// */
//
//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = GroupCapacityPersistService.class)
//public class GroupCapacityPersistServiceTest {
//
//    @MockBean(name = "dynamicDataSource")
//    private DynamicDataSource dynamicDataSource;
//
//    @Autowired
//    private GroupCapacityPersistService service;
//
//    @Test(timeout=10000)
//    public void init() {
//        DataSourceService dataSourceService = mock(DataSourceService.class);
//        when(dynamicDataSource.getDataSource())
//            .thenReturn(dataSourceService);
//        service.init();
//    }
//}
