package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
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
        ArrayList<String> ips = new ArrayList<String>();
        ips.add("/some/path.html");
        obj.setIps(ips);
        obj.setIsOpen(false);
        assertThat(obj.getIps(), hasSize(1));
        assertThat(obj.getIps().get(0), is("/some/path.html"));
        assertThat(obj.getIsOpen(), is(false));
    }
}
