package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.RegexParser
 *
 * @author Diffblue JCover
 */

public class RegexParserTest {

    @Test(timeout=10000)
    public void containsWildcard() {
        assertThat(RegexParser.containsWildcard("[A-Z]*"), is(true));
        assertThat(RegexParser.containsWildcard("?"), is(true));
        assertThat(RegexParser.containsWildcard("bar"), is(false));
    }

    @Test(timeout=10000)
    public void regexFormat() {
        assertThat(RegexParser.regexFormat("[A-Z]*"), is("^\\[A\\-Z\\].*$"));
        assertThat(RegexParser.regexFormat("bar"), is("^bar$"));
    }
}
