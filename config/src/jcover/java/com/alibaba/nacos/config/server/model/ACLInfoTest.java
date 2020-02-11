package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ACLInfo
 *
 * @author Diffblue JCover
 */

public class ACLInfoTest {

    @Test(timeout=10000)
    public void getIpsReturnsNull() {
        assertThat(new ACLInfo().getIps(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getIsOpenReturnsNull() {
        assertThat(new ACLInfo().getIsOpen(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setIpsToEmpty() {
        ACLInfo obj = new ACLInfo();
        List<String> ips = new ArrayList<String>();
        obj.setIps(ips);
        assertThat(obj.getIps(), sameInstance(ips));
    }

    @Test(timeout=10000)
    public void setIsOpenToFalse() {
        ACLInfo obj = new ACLInfo();
        obj.setIsOpen(false);
        assertThat(obj.getIsOpen(), is(false));
    }
}
