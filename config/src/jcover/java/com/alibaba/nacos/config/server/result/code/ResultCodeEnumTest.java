package com.alibaba.nacos.config.server.result.code;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.result.code.ResultCodeEnum
 *
 * @author Diffblue Cover
 */

class ResultCodeEnumTest {

    @Test
    void valuesReturnsSuccessErrorNamespace_not_existMetadata_illegalData_validation_failedParsing_data_failedData_empty() {
        ResultCodeEnum[] result = ResultCodeEnum.values();
        assertThat(result[0], is(ResultCodeEnum.SUCCESS));
        assertThat(result[1], is(ResultCodeEnum.ERROR));
        assertThat(result[2], is(ResultCodeEnum.NAMESPACE_NOT_EXIST));
        assertThat(result[3], is(ResultCodeEnum.METADATA_ILLEGAL));
        assertThat(result[4], is(ResultCodeEnum.DATA_VALIDATION_FAILED));
        assertThat(result[5], is(ResultCodeEnum.PARSING_DATA_FAILED));
        assertThat(result[6], is(ResultCodeEnum.DATA_EMPTY));
    }
}
