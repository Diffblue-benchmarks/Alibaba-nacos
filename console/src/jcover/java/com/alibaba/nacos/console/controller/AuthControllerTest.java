package com.alibaba.nacos.console.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.alibaba.nacos.console.utils.JwtTokenUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit tests for com.alibaba.nacos.console.controller.AuthController
 *
 * @author Diffblue JCover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AuthController.class)
public class AuthControllerTest {

    @MockBean(name = "jwtTokenUtils")
    private JwtTokenUtils jwtTokenUtils;

    @MockBean(name = "authenticationManager")
    private AuthenticationManager authenticationManager;

    @Autowired
    private AuthController controller;

    @Test(timeout=10000)
    public void login() throws Exception {
        when(jwtTokenUtils.createToken(Mockito.<Authentication>any()))
            .thenReturn("foo");
        Authentication authentication = mock(Authentication.class);
        when(authenticationManager.authenticate(Mockito.<Authentication>any()))
            .thenReturn(authentication);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/v1/auth/login", new Object[] { }))
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(content().string("{\"code\":200,\"message\":null,\"data\":\"Bearer foo\"}"));
    }
}
