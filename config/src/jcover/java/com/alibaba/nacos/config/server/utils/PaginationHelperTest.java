package com.alibaba.nacos.config.server.utils;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.PaginationHelper
 *
 * @author Diffblue Cover
 */

class PaginationHelperTest {

    @Test
    void updateLimit() throws java.sql.SQLException, org.springframework.dao.DataAccessException, org.springframework.jdbc.SQLWarningException {
        JdbcTemplate jt = mock(JdbcTemplate.class);
        when(jt.update(Mockito.<String>any(), Mockito.<Object[]>any()))
            .thenReturn(1);
        Object[] args = new Object[] { new Object() };
        new PaginationHelper<String>().updateLimit(jt, "foo=bar", args);
    }
}
