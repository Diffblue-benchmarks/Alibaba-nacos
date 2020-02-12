package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.naming.core.Service;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.ClientBeatProcessor
 *
 * @author Diffblue JCover
 */

public class ClientBeatProcessorDiffblueTest {

    @Test(timeout=10000)
    public void getRsInfoReturnsNull() {
        assertThat(new ClientBeatProcessor().getRsInfo(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getServiceReturnsNull() {
        assertThat(new ClientBeatProcessor().getService(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setRsInfo() {
        ClientBeatProcessor clientBeatProcessor = new ClientBeatProcessor();
        RsInfo rsInfo = new RsInfo();
        clientBeatProcessor.setRsInfo(rsInfo);
        assertThat(clientBeatProcessor.getRsInfo(), sameInstance(rsInfo));
    }

    @Test(timeout=10000)
    public void setService() {
        ClientBeatProcessor clientBeatProcessor = new ClientBeatProcessor();
        Service service = new Service();
        clientBeatProcessor.setService(service);
        assertThat(clientBeatProcessor.getService(), sameInstance(service));
    }
}
