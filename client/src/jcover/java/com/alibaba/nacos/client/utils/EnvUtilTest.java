package com.alibaba.nacos.client.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.utils.EnvUtil
 *
 * @author Diffblue JCover
 */

public class EnvUtilTest {

    @Test(timeout=10000)
    public void getSelfAmorayTagReturnsNull() {
        assertThat(EnvUtil.getSelfAmorayTag(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getSelfLocationTagReturnsNull() {
        assertThat(EnvUtil.getSelfLocationTag(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getSelfVipserverTagReturnsNull() {
        assertThat(EnvUtil.getSelfVipserverTag(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setSelfEnv1() {
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        List<String> x7 = new ArrayList<String>();
        ((ArrayList<String>)x7).add("foo");
        ((HashMap<String, List<String>>)headers).put("Amory-Tag", x7);
        EnvUtil.setSelfEnv(headers);
    }

    @Test(timeout=10000)
    public void setSelfEnv2() {
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        List<String> x7 = new ArrayList<String>();
        ((ArrayList<String>)x7).add("foo");
        ((HashMap<String, List<String>>)headers).put("Location-Tag", x7);
        EnvUtil.setSelfEnv(headers);
    }

    @Test(timeout=10000)
    public void setSelfEnv3() {
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        List<String> x7 = new ArrayList<String>();
        ((ArrayList<String>)x7).add("foo");
        ((HashMap<String, List<String>>)headers).put("Vipserver-Tag", x7);
        EnvUtil.setSelfEnv(headers);
    }

    @Test(timeout=10000)
    public void setSelfEnv4() {
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        List<String> x7 = new ArrayList<String>();
        ((ArrayList<String>)x7).add("foo");
        ((HashMap<String, List<String>>)headers).put("selfLocationTag:{}", x7);
        EnvUtil.setSelfEnv(headers);
    }

    @Test(timeout=10000)
    public void setSelfEnv5() {
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        List<String> x7 = new ArrayList<String>();
        ((ArrayList<String>)x7).add("foo");
        ((HashMap<String, List<String>>)headers).put("selfVipserverTag:{}", x7);
        EnvUtil.setSelfEnv(headers);
    }

    @Test(timeout=10000)
    public void setSelfEnv6() {
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        List<String> x7 = new ArrayList<String>();
        ((ArrayList<String>)x7).add("selfAmoryTag:{}");
        ((HashMap<String, List<String>>)headers).put("bar", x7);
        EnvUtil.setSelfEnv(headers);
    }

    @Test(timeout=10000)
    public void setSelfEnvHeadersIsEmpty() {
        EnvUtil.setSelfEnv(new HashMap<String, List<String>>());
    }

    @Test(timeout=10000)
    public void setSelfEnvHeadersIsNull() {
        EnvUtil.setSelfEnv(null);
    }
}
