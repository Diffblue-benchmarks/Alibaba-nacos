package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ACLInfo
 *
 * @author Diffblue Cover
 */

class ACLInfoTest {

    @Test
    void factory() {
        ACLInfo obj = new ACLInfo();
        obj.setIps(new ArrayList<String>());
        obj.setIsOpen(false);
        assertThat(obj.getIps(), empty());
        assertThat(obj.getIsOpen(), is(false));
    }
}
