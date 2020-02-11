package com.alibaba.nacos.naming.controllers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.alibaba.nacos.naming.cluster.ServerListManager;
import com.alibaba.nacos.naming.core.DistroMapper;
import com.alibaba.nacos.naming.core.ServiceManager;
import com.alibaba.nacos.naming.core.SubscribeManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit tests for com.alibaba.nacos.naming.controllers.ServiceController
 *
 * @author Diffblue JCover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ServiceController.class)
public class ServiceControllerTest {

    @MockBean(name = "serviceManager")
    private ServiceManager serviceManager;

    @MockBean(name = "distroMapper")
    private DistroMapper distroMapper;

    @MockBean(name = "serverListManager")
    private ServerListManager serverListManager;

    @MockBean(name = "subscribeManager")
    private SubscribeManager subscribeManager;

    @Autowired
    private ServiceController controller;

    @Test(timeout=10000)
    public void searchService() throws Exception {
        when(serviceManager.getAllNamespaces())
            .thenReturn(new java.util.HashSet<String>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/v1/ns/service/names", new Object[] { }))
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(content().string("{\"count\":0,\"services\":{}}"));
    }
}
