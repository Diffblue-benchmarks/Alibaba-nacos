package com.alibaba.nacos.naming.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.naming.cluster.servers.Server;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.core.DistroMapper
 *
 * @author Diffblue JCover
 */

public class DistroMapperTest {

    @Test(timeout=10000)
    public void distroHash() {
        assertThat(new DistroMapper().distroHash("bar"), is(97_299));
        assertThat(new DistroMapper().distroHash(""), is(0));
    }

    @Test(timeout=10000)
    public void getHealthyListReturnsEmpty() {
        DistroMapper distroMapper = new DistroMapper();
        List<String> result = distroMapper.getHealthyList();
        assertThat(result, empty());
        assertThat(distroMapper.getHealthyList(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void mapSrvServiceNameIsBar() {
        assertThat(new DistroMapper().mapSrv("bar"), is("10.128.0.37:0"));
    }

    @Test(timeout=10000)
    public void onChangeHealthyServerList() {
        DistroMapper distroMapper = new DistroMapper();
        List<Server> latestReachableMembers = new ArrayList<Server>();
        ((ArrayList<Server>)latestReachableMembers).add(new Server());
        distroMapper.onChangeHealthyServerList(latestReachableMembers);
        assertThat(distroMapper.getHealthyList(), hasSize(1));
        assertThat(distroMapper.getHealthyList().get(0), is("null:0"));
    }

    @Test(timeout=10000)
    public void onChangeServerListLatestMembersIsEmpty() {
        new DistroMapper().onChangeServerList(new ArrayList<Server>());
    }
}
