package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Properties;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.InitUtils
 *
 * @author Diffblue JCover
 */

public class InitUtilsDiffblueTest {

    @Test(timeout=10000)
    public void initEndpoint() {
        assertThat(InitUtils.initEndpoint(new Properties()), is(""));
        assertThat(InitUtils.initEndpoint(null), is(""));
    }

    @Test(timeout=10000)
    public void initEndpointPropertiesIsFoo1() {
        Properties properties = new Properties();
        properties.setProperty("endpoint", "foo");
        assertThat(InitUtils.initEndpoint(properties), is("foo:8080"));
    }

    @Test(timeout=10000)
    public void initEndpointPropertiesIsFoo2() {
        Properties properties = new Properties();
        properties.setProperty("isUseEndpointParsingRule", "foo");
        assertThat(InitUtils.initEndpoint(properties), is(""));
    }

    @Test(timeout=10000)
    public void initNamespaceForNamingPropertiesIsEmpty() {
        assertThat(InitUtils.initNamespaceForNaming(new Properties()), is("public"));
    }

    @Test(timeout=10000)
    public void initNamespaceForNamingPropertiesIsFoo() {
        Properties properties = new Properties();
        properties.setProperty("isUseCloudNamespaceParsing", "foo");
        assertThat(InitUtils.initNamespaceForNaming(properties), is("public"));
    }

    @Test(timeout=10000)
    public void initWebRootContext() {
        InitUtils.initWebRootContext();
    }
}
