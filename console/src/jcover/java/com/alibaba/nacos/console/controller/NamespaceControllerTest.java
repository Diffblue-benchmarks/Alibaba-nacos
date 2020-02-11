package com.alibaba.nacos.console.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.alibaba.nacos.config.server.model.TenantInfo;
import com.alibaba.nacos.config.server.service.PersistService;

import java.util.ArrayList;
import java.util.List;

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
 * Unit tests for com.alibaba.nacos.console.controller.NamespaceController
 *
 * @author Diffblue JCover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = NamespaceController.class)
public class NamespaceControllerTest {

    @MockBean(name = "persistService")
    private PersistService persistService;

    @Autowired
    private NamespaceController controller;

    @Test(timeout=10000)
    public void createNamespace() throws Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/v1/console/namespaces/", new Object[] { })
                .param("namespaceName", "/bin/bash")
                .param("namespaceDesc", "foo"))
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(content().string("true"));
    }

    @Test(timeout=10000)
    public void deleteConfig() throws Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.delete("/v1/console/namespaces/", new Object[] { })
                .param("namespaceId", "foo"))
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(content().string("true"));
    }

    @Test(timeout=10000)
    public void editNamespace() throws Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.put("/v1/console/namespaces/", new Object[] { })
                .param("namespace", "foo")
                .param("namespaceShowName", "/bin/bash")
                .param("namespaceDesc", "foo"))
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(content().string("true"));
    }

    @Test(timeout=10000)
    public void getNamespaces1() throws Exception {
        when(persistService.configInfoCount(Mockito.<String>any()))
            .thenReturn(1);
        when(persistService.findTenantByKp(Mockito.<String>any()))
            .thenReturn(new java.util.ArrayList<com.alibaba.nacos.config.server.model.TenantInfo>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/v1/console/namespaces/", new Object[] { }))
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(content().string("{\"code\":200,\"message\":null,\"data\":[{\"namespace\":\"\",\"namespaceShowName\":\"public\",\"quota\":200,\"configCount\":1,\"type\":0}]}"));
    }

    @Test(timeout=10000)
    public void getNamespaces2() throws Exception {
        List<TenantInfo> list = new ArrayList<TenantInfo>();
        ((ArrayList<TenantInfo>)list).add(new TenantInfo());
        when(persistService.configInfoCount(Mockito.<String>any()))
            .thenReturn(0)
            .thenReturn(1);
        when(persistService.findTenantByKp(Mockito.<String>any()))
            .thenReturn(list);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/v1/console/namespaces/", new Object[] { }))
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(content().string("{\"code\":200,\"message\":null,\"data\":[{\"namespace\":\"\",\"namespaceShowName\":\"public\",\"quota\":200,\"configCount\":0,\"type\":0},{\"namespace\":null,\"namespaceShowName\":null,\"quota\":200,\"configCount\":1,\"type\":2}]}"));
    }
}
