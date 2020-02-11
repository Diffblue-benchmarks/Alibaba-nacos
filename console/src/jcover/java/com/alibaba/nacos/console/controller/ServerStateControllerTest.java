package com.alibaba.nacos.console.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit tests for com.alibaba.nacos.console.controller.ServerStateController
 *
 * @author Diffblue JCover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ServerStateController.class)
public class ServerStateControllerTest {

    @Autowired
    private ServerStateController controller;

    @Test(timeout=10000)
    public void serverState() throws Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/v1/console/server/state", new Object[] { }))
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(content().string("{\"version\":\"1.1.0\",\"standalone_mode\":\"cluster\",\"function_mode\":null}"));
    }
}
