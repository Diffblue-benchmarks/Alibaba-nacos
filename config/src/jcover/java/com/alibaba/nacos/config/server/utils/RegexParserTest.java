package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.RegexParser
 *
 * @author Diffblue Cover
 */

class RegexParserTest {

    @Test
    void regexFormat() {
        assertThat(RegexParser.regexFormat("[A-Z]*"), is("^\\[A\\-Z\\].*$"));
        assertThat(RegexParser.regexFormat("bar"), is("^bar$"));
    }

    @Test
    void containsWildcard() {
        assertThat(RegexParser.containsWildcard("[A-Z]*"), is(true));
        assertThat(RegexParser.containsWildcard("?"), is(true));
        assertThat(RegexParser.containsWildcard("bar"), is(false));
    }
}
