package com.alibaba.nacos.api.config;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.config.ConfigType
 *
 * @author Diffblue Cover
 */

class ConfigTypeTest {

    @Test
    void valuesReturnsPROPERTIESXMLJSONTEXTHTMLYAML() {
        ConfigType[] result = ConfigType.values();
        assertThat(result[0], is(ConfigType.PROPERTIES));
        assertThat(result[1], is(ConfigType.XML));
        assertThat(result[2], is(ConfigType.JSON));
        assertThat(result[3], is(ConfigType.TEXT));
        assertThat(result[4], is(ConfigType.HTML));
        assertThat(result[5], is(ConfigType.YAML));
    }
}
