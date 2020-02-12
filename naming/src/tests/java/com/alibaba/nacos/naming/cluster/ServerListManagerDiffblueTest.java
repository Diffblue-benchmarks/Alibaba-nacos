package com.alibaba.nacos.naming.cluster;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.naming.cluster.servers.ServerChangeListener;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.cluster.ServerListManager
 *
 * @author Diffblue JCover
 */

public class ServerListManagerDiffblueTest {

    @Test(timeout=10000)
    public void clean() {
        new ServerListManager().clean();
    }

    @Test(timeout=10000)
    public void containsSIsSmithReturnsFalse() {
        assertThat(new ServerListManager().contains("Smith"), is(false));
    }

    @Test(timeout=10000)
    public void getDistroConfigReturnsEmpty() {
        ServerListManager serverListManager = new ServerListManager();
        Map<String, java.util.List<com.alibaba.nacos.naming.cluster.servers.Server>> result = serverListManager.getDistroConfig();
        assertThat(result.isEmpty(), is(true));
        assertThat(serverListManager.getDistroConfig(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getHealthyServersReturnsEmpty() {
        ServerListManager serverListManager = new ServerListManager();
        List<com.alibaba.nacos.naming.cluster.servers.Server> result = serverListManager.getHealthyServers();
        assertThat(result, empty());
        assertThat(serverListManager.getHealthyServers(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getLiveSitesReturnsEmpty() {
        ServerListManager serverListManager = new ServerListManager();
        Set<String> result = serverListManager.getLiveSites();
        assertThat(result, empty());
        assertThat(serverListManager.getLiveSites(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getServersReturnsEmpty() {
        ServerListManager serverListManager = new ServerListManager();
        List<com.alibaba.nacos.naming.cluster.servers.Server> result = serverListManager.getServers();
        assertThat(result, empty());
        assertThat(serverListManager.getServers(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void init() {
        new ServerListManager().init();
    }

    @Test(timeout=10000)
    public void listen() {
        ServerChangeListener listener = mock(ServerChangeListener.class);
        new ServerListManager().listen(listener);
    }

    @Test(timeout=10000)
    public void onReceiveServerStatus() {
        new ServerListManager().onReceiveServerStatus("\r\n");
    }

    @Test(timeout=10000)
    public void onReceiveServerStatusConfigInfoIsSmith() {
        new ServerListManager().onReceiveServerStatus("Smith");
    }
}
