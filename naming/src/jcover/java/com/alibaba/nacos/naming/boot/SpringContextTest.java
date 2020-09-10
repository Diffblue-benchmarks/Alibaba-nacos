package com.alibaba.nacos.naming.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for com.alibaba.nacos.naming.boot.SpringContext
 *
 * @author Diffblue Cover
 */

@ContextConfiguration(classes = {SpringContext.class})
@RunWith(SpringRunner.class)
public class SpringContextTest {

    @Autowired
    private SpringContext service;

    @Test
    public void setApplicationContextToNull() throws org.springframework.beans.BeansException {
        service.setApplicationContext(SpringContext.getAppContext());
    }
}
