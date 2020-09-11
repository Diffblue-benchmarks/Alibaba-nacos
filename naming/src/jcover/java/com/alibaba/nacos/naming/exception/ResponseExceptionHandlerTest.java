package com.alibaba.nacos.naming.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;

/**
 * Unit tests for com.alibaba.nacos.naming.exception.ResponseExceptionHandler
 *
 * @author Diffblue Cover
 */

public class ResponseExceptionHandlerTest {

    @Test
    public void handleParameterError() {
        ResponseEntity<String> result =
             new ResponseExceptionHandler().handleParameterError(new IllegalArgumentException());
        assertThat(result.getBody(), is(nullValue()));
        assertThat(result.getHeaders().isEmpty(), is(true));
    }

    @Test
    public void handleMissingParams() {
        ResponseEntity<String> result =
             new ResponseExceptionHandler().handleMissingParams(new MissingServletRequestParameterException("name", "data"));
        assertThat(result.getBody(), is("Parameter 'name' is missing"));
        assertThat(result.getHeaders().isEmpty(), is(true));
    }
}
