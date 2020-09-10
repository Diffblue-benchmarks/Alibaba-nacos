package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.nacos.api.naming.pojo.AbstractHealthChecker;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.HealthCheckType
 *
 * @author Diffblue Cover
 */

public class HealthCheckTypeTest {

    @Test
    public void registerHealthCheckerHealthCheckerClassIsStringAndTypeIsBASIC() {
        HealthCheckType.registerHealthChecker("BASIC", String.class);
    }

    @Test
    public void ofHealthCheckerClassTypeIsBASICReturnsNull() {
        assertThat(HealthCheckType.ofHealthCheckerClass("BASIC"), is(nullValue()));
    }

    @Test
    public void getLoadedHealthCheckerClassesReturnsInnerClassInnerClassInnerClassInnerClass() {
        List<Class> result = HealthCheckType.getLoadedHealthCheckerClasses();
        assertThat(result.size(), is(4));
        assertThat((Class<AbstractHealthChecker.Tcp>) result.get(0), equalTo((Class) AbstractHealthChecker.Tcp.class));
        assertThat((Class<AbstractHealthChecker.Http>) result.get(1), equalTo((Class) AbstractHealthChecker.Http.class));
        assertThat((Class<AbstractHealthChecker.Mysql>) result.get(2), equalTo((Class) AbstractHealthChecker.Mysql.class));
        assertThat((Class<AbstractHealthChecker.None>) result.get(3), equalTo((Class) AbstractHealthChecker.None.class));
    }
}
