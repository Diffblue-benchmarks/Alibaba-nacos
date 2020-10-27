package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.RsInfo
 *
 * @author Diffblue Cover
 */

public class RsInfoTest {

    @Test
    public void factory() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setAk("foo");
        rsInfo.setCluster("John Smith");
        rsInfo.setCpu(1.0);
        rsInfo.setEphemeral(false);
        rsInfo.setIp("foo");
        rsInfo.setLoad(1.0);
        rsInfo.setMem(1.0);
        rsInfo.setMetadata(new HashMap<String, String>());
        rsInfo.setPort(1);
        rsInfo.setQps(1.0);
        rsInfo.setRt(1.0);
        rsInfo.setServiceName("Acme");
        rsInfo.setWeight(1.0);
        assertThat(rsInfo.getAk(), is("foo"));
        assertThat(rsInfo.getCluster(), is("John Smith"));
        assertThat(rsInfo.getCpu(), closeTo(1.0, 0.0));
        assertThat(rsInfo.getIp(), is("foo"));
        assertThat(rsInfo.getLoad(), closeTo(1.0, 0.0));
        assertThat(rsInfo.getMem(), closeTo(1.0, 0.0));
        assertThat(rsInfo.getMetadata().isEmpty(), is(true));
        assertThat(rsInfo.getPort(), is(1));
        assertThat(rsInfo.getQps(), closeTo(1.0, 0.0));
        assertThat(rsInfo.getRt(), closeTo(1.0, 0.0));
        assertThat(rsInfo.getServiceName(), is("Acme"));
        assertThat(rsInfo.getWeight(), closeTo(1.0, 0.0));
        assertThat(rsInfo.isEphemeral(), is(false));
    }
}
