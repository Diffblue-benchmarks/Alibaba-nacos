package com.alibaba.nacos.api.config;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.config.ConfigType
 *
 * @author Diffblue JCover
 */

public class ConfigTypeDiffblueTest {

    @Test(timeout=10000)
    public void getTypeReturnsProperties() {
        assertThat(ConfigType.PROPERTIES.getType(), is("properties"));
    }

    @Test(timeout=10000)
    public void valuesReturnsPROPERTIESXMLJSONTEXTHTMLYAML() {
        ConfigType[] result = ConfigType.values();
        assertThat(result[0], is(ConfigType.PROPERTIES));
        assertThat(result[1], is(ConfigType.XML));
        assertThat(result[2], is(ConfigType.JSON));
        assertThat(result[3], is(ConfigType.TEXT));
        assertThat(result[4], is(ConfigType.HTML));
        assertThat(result[5], is(ConfigType.YAML));
    }
}
