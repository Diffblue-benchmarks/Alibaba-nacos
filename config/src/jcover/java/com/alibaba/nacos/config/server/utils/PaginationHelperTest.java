package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.nacos.config.server.model.Page;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.PaginationHelper
 *
 * @author Diffblue Cover
 */

class PaginationHelperTest {

    @Test
    void fetchPageLimitPageNoIsOneAndPageSizeIsOne() throws org.springframework.dao.DataAccessException {

        // arrange
        List<String> list = new ArrayList<String>();
        list.add("foo=bar");
        JdbcTemplate jt = mock(JdbcTemplate.class);
        when(jt.query(Mockito.<String>any(), Mockito.<Object[]>any(), Mockito.<RowMapper<String>>any()))
            .thenReturn(list);
        Object[] args = new Object[] { new Object() };
        @SuppressWarnings("unchecked")
        RowMapper<String> rowMapper = mock(RowMapper.class);

        // act
        Page<String> result =
             new PaginationHelper<String>().fetchPageLimit(jt, "foo=bar", args, 1, 1, rowMapper);

        // assert
        assertThat(result.getPageItems(), hasSize(1));
        assertThat(result.getPageItems().get(0), is("foo=bar"));
        assertThat(result.getPageNumber(), is(0));
        assertThat(result.getPagesAvailable(), is(0));
        assertThat(result.getTotalCount(), is(0));
    }

    @Test
    void updateLimit() throws org.springframework.dao.DataAccessException {
        JdbcTemplate jt = mock(JdbcTemplate.class);
        when(jt.update(Mockito.<String>any(), Mockito.<Object[]>any()))
            .thenReturn(1);
        Object[] args = new Object[] { new Object() };
        new PaginationHelper<String>().updateLimit(jt, "foo=bar", args);
    }
}
