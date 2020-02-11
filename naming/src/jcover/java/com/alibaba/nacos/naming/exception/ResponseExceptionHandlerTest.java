package com.alibaba.nacos.naming.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;

/**
 * Unit tests for com.alibaba.nacos.naming.exception.ResponseExceptionHandler
 *
 * @author Diffblue JCover
 */

public class ResponseExceptionHandlerTest {

    @Test(timeout=10000)
    public void handleMissingParams() {
        ResponseEntity<String> result = new ResponseExceptionHandler().handleMissingParams(new MissingServletRequestParameterException("name", "name"));
        assertThat(result.getStatusCode(), is(HttpStatus.BAD_REQUEST));
        assertThat(result.getStatusCodeValue(), is(400));
        assertThat(result.getBody(), is("Parameter 'name' is missing"));
        assertThat(result.getHeaders().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void handleParameterError() {
        ResponseEntity<String> result = new ResponseExceptionHandler().handleParameterError(new IllegalArgumentException());
        assertThat(result.getStatusCode(), is(HttpStatus.BAD_REQUEST));
        assertThat(result.getStatusCodeValue(), is(400));
        assertThat(result.getBody(), is(nullValue()));
        assertThat(result.getHeaders().isEmpty(), is(true));
    }
}
