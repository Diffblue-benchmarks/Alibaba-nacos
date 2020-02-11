package com.alibaba.nacos.naming.controllers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.alibaba.nacos.naming.cluster.transport.Serializer;
import com.alibaba.nacos.naming.consistency.ephemeral.distro.DataStore;
import com.alibaba.nacos.naming.consistency.ephemeral.distro.DistroConsistencyServiceImpl;
import com.alibaba.nacos.naming.core.ServiceManager;
import com.alibaba.nacos.naming.misc.SwitchDomain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit tests for com.alibaba.nacos.naming.controllers.DistroController
 *
 * @author Diffblue JCover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DistroController.class)
public class DistroControllerTest {

    @MockBean(name = "serializer")
    private Serializer serializer;

    @MockBean(name = "consistencyService")
    private DistroConsistencyServiceImpl consistencyService;

    @MockBean(name = "dataStore")
    private DataStore dataStore;

    @MockBean(name = "serviceManager")
    private ServiceManager serviceManager;

    @MockBean(name = "switchDomain")
    private SwitchDomain switchDomain;

    @Autowired
    private DistroController controller;

    @Test(timeout=10000)
    public void getAllDatums() throws Exception {
        byte[] obj = new byte[] { 1 };
        when(serializer.serialize(Mockito.<Object>any()))
            .thenReturn(obj);
        when(dataStore.getDataMap())
            .thenReturn(new java.util.HashMap<String, com.alibaba.nacos.naming.consistency.Datum>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/v1/ns/distro/datums", new Object[] { }))
            .andExpect(status().isOk())
            .andExpect(content().string("\u0001"));
    }
}
