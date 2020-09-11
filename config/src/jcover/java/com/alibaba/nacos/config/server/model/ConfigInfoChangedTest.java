package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoChanged
 *
 * @author Diffblue Cover
 */

class ConfigInfoChangedTest {

    @Test
    void factory1() {
        ConfigInfoChanged configInfoChanged = new ConfigInfoChanged();
        configInfoChanged.setDataId("1234");
        configInfoChanged.setGroup("/some/path.html");
        configInfoChanged.setTenant("/some/path.html");
        assertThat(configInfoChanged.getDataId(), is("1234"));
        assertThat(configInfoChanged.getGroup(), is("/some/path.html"));
        assertThat(configInfoChanged.getTenant(), is("/some/path.html"));
    }

    @Test
    void factory2() {
        ConfigInfoChanged configInfoChanged =
             new ConfigInfoChanged("1234", "/some/path.html", "/some/path.html");
        configInfoChanged.setDataId("1234");
        configInfoChanged.setGroup("/some/path.html");
        configInfoChanged.setTenant("/some/path.html");
        assertThat(configInfoChanged.getDataId(), is("1234"));
        assertThat(configInfoChanged.getGroup(), is("/some/path.html"));
        assertThat(configInfoChanged.getTenant(), is("/some/path.html"));
    }

    @Test
    void testEquals() {
        assertThat(new ConfigInfoChanged().equals(new Object()), is(false));
        assertThat(new ConfigInfoChanged().equals(null), is(false));
    }
}
