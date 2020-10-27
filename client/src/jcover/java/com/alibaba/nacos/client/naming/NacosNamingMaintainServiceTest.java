package com.alibaba.nacos.client.naming;

import java.util.Properties;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.NacosNamingMaintainService
 *
 * @author Diffblue Cover
 */

class NacosNamingMaintainServiceTest {

    @Test
    void factory1() {
        // pojo NacosNamingMaintainService new NacosNamingMaintainService("Smith")
    }

    @Test
    void factory2() {
        Properties properties = new Properties();
        properties.put("endpoint", "foo");
        properties.put("isUseCloudNamespaceParsing", "foo");
        properties.put("isUseEndpointParsingRule", "foo");
        properties.put("namespace", "foo");
        properties.put("serverAddr", "foo");
        // pojo NacosNamingMaintainService new NacosNamingMaintainService(properties)
    }
}
