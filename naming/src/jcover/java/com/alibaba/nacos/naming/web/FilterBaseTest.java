package com.alibaba.nacos.naming.web;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for com.alibaba.nacos.naming.web.FilterBase
 *
 * @author Diffblue Cover
 */

@ContextConfiguration(classes = {FilterBase.class})
@RunWith(SpringRunner.class)
public class FilterBaseTest {

    @Autowired
    private FilterBase service;

    @Test
    public void getMethodHttpMethodIsGETReturnsNull() {
        assertThat(service.getMethod("GET", "/bin/bash"), is(nullValue()));
    }
}
