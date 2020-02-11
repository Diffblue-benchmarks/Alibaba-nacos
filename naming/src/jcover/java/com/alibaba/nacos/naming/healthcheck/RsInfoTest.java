package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.hamcrest.number.IsCloseTo.closeTo;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.RsInfo
 *
 * @author Diffblue JCover
 */

public class RsInfoTest {

    @Test(timeout=10000)
    public void getAkReturnsNull() {
        assertThat(new RsInfo().getAk(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getClusterReturnsNull() {
        assertThat(new RsInfo().getCluster(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getCpuReturnsZero() {
        assertThat(new RsInfo().getCpu(), closeTo(0.0, 0.0));
    }

    @Test(timeout=10000)
    public void getIpReturnsNull() {
        assertThat(new RsInfo().getIp(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLoadReturnsZero() {
        assertThat(new RsInfo().getLoad(), closeTo(0.0, 0.0));
    }

    @Test(timeout=10000)
    public void getMemReturnsZero() {
        assertThat(new RsInfo().getMem(), closeTo(0.0, 0.0));
    }

    @Test(timeout=10000)
    public void getMetadataReturnsNull() {
        assertThat(new RsInfo().getMetadata(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPortReturnsZero() {
        assertThat(new RsInfo().getPort(), is(0));
    }

    @Test(timeout=10000)
    public void getQpsReturnsZero() {
        assertThat(new RsInfo().getQps(), closeTo(0.0, 0.0));
    }

    @Test(timeout=10000)
    public void getRtReturnsZero() {
        assertThat(new RsInfo().getRt(), closeTo(0.0, 0.0));
    }

    @Test(timeout=10000)
    public void getServiceNameReturnsNull() {
        assertThat(new RsInfo().getServiceName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getWeightReturnsZero() {
        assertThat(new RsInfo().getWeight(), closeTo(0.0, 0.0));
    }

    @Test(timeout=10000)
    public void isEphemeralReturnsTrue() {
        assertThat(new RsInfo().isEphemeral(), is(true));
    }

    @Test(timeout=10000)
    public void setAkToFoo() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setAk("foo");
        assertThat(rsInfo.getAk(), is("foo"));
    }

    @Test(timeout=10000)
    public void setClusterToFoo() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setCluster("foo");
        assertThat(rsInfo.getCluster(), is("foo"));
    }

    @Test(timeout=10000)
    public void setCpuToOne() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setCpu(1.0);
        assertThat(rsInfo.getCpu(), closeTo(1.0, 0.0));
    }

    @Test(timeout=10000)
    public void setEphemeralToFalse() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setEphemeral(false);
        assertThat(rsInfo.isEphemeral(), is(false));
    }

    @Test(timeout=10000)
    public void setIpToFoo() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setIp("foo");
        assertThat(rsInfo.getIp(), is("foo"));
    }

    @Test(timeout=10000)
    public void setLoadToOne() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setLoad(1.0);
        assertThat(rsInfo.getLoad(), closeTo(1.0, 0.0));
    }

    @Test(timeout=10000)
    public void setMemToOne() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setMem(1.0);
        assertThat(rsInfo.getMem(), closeTo(1.0, 0.0));
    }

    @Test(timeout=10000)
    public void setMetadataToEmpty() {
        RsInfo rsInfo = new RsInfo();
        Map<String, String> metadata = new HashMap<String, String>();
        rsInfo.setMetadata(metadata);
        assertThat(rsInfo.getMetadata(), sameInstance(metadata));
    }

    @Test(timeout=10000)
    public void setPortToOne() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setPort(1);
        assertThat(rsInfo.getPort(), is(1));
    }

    @Test(timeout=10000)
    public void setQpsToOne() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setQps(1.0);
        assertThat(rsInfo.getQps(), closeTo(1.0, 0.0));
    }

    @Test(timeout=10000)
    public void setRtToOne() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setRt(1.0);
        assertThat(rsInfo.getRt(), closeTo(1.0, 0.0));
    }

    @Test(timeout=10000)
    public void setServiceName() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setServiceName("/bin/bash");
        assertThat(rsInfo.getServiceName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setWeightToOne() {
        RsInfo rsInfo = new RsInfo();
        rsInfo.setWeight(1.0);
        assertThat(rsInfo.getWeight(), closeTo(1.0, 0.0));
    }
}
