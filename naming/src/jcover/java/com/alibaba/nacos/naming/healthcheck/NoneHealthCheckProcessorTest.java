package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.NoneHealthCheckProcessor
 *
 * @author Diffblue Cover
 */

@ContextConfiguration(classes = {NoneHealthCheckProcessor.class})
@RunWith(SpringRunner.class)
public class NoneHealthCheckProcessorTest {

    @Autowired
    private NoneHealthCheckProcessor service;

    @Test
    public void getTypeReturnsNONE() {
        assertThat(service.getType(), is("NONE"));
    }
}
