package com.alibaba.nacos.config.server.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.enums.FileTypeEnum
 *
 * @author Diffblue Cover
 */

class FileTypeEnumTest {

    @Test
    void valuesReturnsYmlYamlTxtTextJsonXmlHtmHtmlProperties() {
        FileTypeEnum[] result = FileTypeEnum.values();
        assertThat(result[0], is(FileTypeEnum.YML));
        assertThat(result[1], is(FileTypeEnum.YAML));
        assertThat(result[2], is(FileTypeEnum.TXT));
        assertThat(result[3], is(FileTypeEnum.TEXT));
        assertThat(result[4], is(FileTypeEnum.JSON));
        assertThat(result[5], is(FileTypeEnum.XML));
        assertThat(result[6], is(FileTypeEnum.HTM));
        assertThat(result[7], is(FileTypeEnum.HTML));
        assertThat(result[8], is(FileTypeEnum.PROPERTIES));
    }
}
