package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.MysqlHealthCheckProcessor
 *
 * @author Diffblue JCover
 */

public class MysqlHealthCheckProcessorDiffblueTest {

    @Test(timeout=10000)
    public void getTypeReturnsMYSQL() {
        assertThat(new MysqlHealthCheckProcessor().getType(), is("MYSQL"));
    }
}
