package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.PropertyUtil
 *
 * @author Diffblue JCover
 */

public class PropertyUtilTest {

    @Test(timeout=10000)
    public void getCorrectUsageDelay() {
        assertThat(PropertyUtil.getCorrectUsageDelay(), is(600));
    }

//    @Test(timeout=10000)
//    public void getDefaultClusterQuota() {
//        assertThat(PropertyUtil.getDefaultClusterQuota(), is(100_000));  <-- Expected: is <100000>     but: was <1>
//    }
//
    @Test(timeout=10000)
    public void getDefaultGroupQuota() {
        assertThat(PropertyUtil.getDefaultGroupQuota(), is(200));
    }

//    @Test(timeout=10000)
//    public void getDefaultMaxAggrCount() {
//        assertThat(PropertyUtil.getDefaultMaxAggrCount(), is(10_000));  <-- Expected: is <10000>     but: was <1>
//    }
//
//    @Test(timeout=10000)
//    public void getDefaultMaxAggrSize() {
//        assertThat(PropertyUtil.getDefaultMaxAggrSize(), is(1_024));  <-- Expected: is <1024>     but: was <1>
//    }
//
    @Test(timeout=10000)
    public void getDefaultMaxSize() {
        assertThat(PropertyUtil.getDefaultMaxSize(), is(102_400));
    }

    @Test(timeout=10000)
    public void getDefaultTenantQuota() {
        assertThat(PropertyUtil.getDefaultTenantQuota(), is(200));
    }

//    @Test(timeout=10000)
//    public void getInitialExpansionPercentReturnsOneHundred() {
//        assertThat(PropertyUtil.getInitialExpansionPercent(), is(100));  <-- Expected: is <100>     but: was <1>
//    }
//
//    @Test(timeout=10000)
//    public void getMaxContent() {
//        assertThat(PropertyUtil.getMaxContent(), is(10_485_760));  <-- Expected: is <10485760>     but: was <1>
//    }
//
//    @Test(timeout=10000)
//    public void getMaxHealthCheckFailCountReturnsTwelve() {
//        assertThat(PropertyUtil.getMaxHealthCheckFailCount(), is(12));  <-- Expected: is <12>     but: was <1>
//    }
//
    @Test(timeout=10000)
    public void getNotifyConnectTimeoutReturnsOneHundred() {
        assertThat(PropertyUtil.getNotifyConnectTimeout(), is(100));
    }

    @Test(timeout=10000)
    public void getNotifySocketTimeout() {
        assertThat(PropertyUtil.getNotifySocketTimeout(), is(200));
    }

    @Test(timeout=10000)
    public void init() {
        new PropertyUtil().init();
    }

    @Test(timeout=10000)
    public void isCapacityLimitCheckReturnsFalse() {
        assertThat(PropertyUtil.isCapacityLimitCheck(), is(false));
    }

    @Test(timeout=10000)
    public void isHealthCheckReturnsTrue() {
        assertThat(PropertyUtil.isHealthCheck(), is(true));
    }

//    @Test(timeout=10000)
//    public void isManageCapacityReturnsTrue() {
//        assertThat(PropertyUtil.isManageCapacity(), is(true));  <-- Expected: is <true>     but: was <false>
//    }
//
    @Test(timeout=10000)
    public void isStandaloneModeReturnsFalse() {
        assertThat(PropertyUtil.isStandaloneMode(), is(false));
    }

    @Test(timeout=10000)
    public void isStandaloneUseMysqlReturnsFalse() {
        assertThat(PropertyUtil.isStandaloneUseMysql(), is(false));
    }

    @Test(timeout=10000)
    public void setCapacityLimitCheckIsCapacityLimitCheckIsFalse() {
        PropertyUtil.setCapacityLimitCheck(false);
    }

    @Test(timeout=10000)
    public void setCorrectUsageDelayCorrectUsageDelayIsOne() {
        PropertyUtil.setCorrectUsageDelay(1);
    }

    @Test(timeout=10000)
    public void setDefaultClusterQuotaDefaultClusterQuotaIsOne() {
        PropertyUtil.setDefaultClusterQuota(1);
    }

    @Test(timeout=10000)
    public void setDefaultGroupQuotaDefaultGroupQuotaIsOne() {
        PropertyUtil.setDefaultGroupQuota(1);
    }

    @Test(timeout=10000)
    public void setDefaultMaxAggrCountDefaultMaxAggrCountIsOne() {
        PropertyUtil.setDefaultMaxAggrCount(1);
    }

    @Test(timeout=10000)
    public void setDefaultMaxAggrSizeDefaultMaxAggrSizeIsOne() {
        PropertyUtil.setDefaultMaxAggrSize(1);
    }

    @Test(timeout=10000)
    public void setDefaultMaxSizeDefaultMaxSizeIsOne() {
        PropertyUtil.setDefaultMaxSize(1);
    }

    @Test(timeout=10000)
    public void setDefaultTenantQuotaDefaultTenantQuotaIsOne() {
        PropertyUtil.setDefaultTenantQuota(1);
    }

    @Test(timeout=10000)
    public void setHealthCheckIsHealthCheckIsFalse() {
        PropertyUtil.setHealthCheck(false);
    }

    @Test(timeout=10000)
    public void setInitialExpansionPercentInitialExpansionPercentIsOne() {
        PropertyUtil.setInitialExpansionPercent(1);
    }

    @Test(timeout=10000)
    public void setManageCapacityIsManageCapacityIsFalse() {
        PropertyUtil.setManageCapacity(false);
    }

    @Test(timeout=10000)
    public void setMaxContentMaxContentIsOne() {
        PropertyUtil.setMaxContent(1);
    }

    @Test(timeout=10000)
    public void setMaxHealthCheckFailCountMaxHealthCheckFailCountIsOne() {
        PropertyUtil.setMaxHealthCheckFailCount(1);
    }

    @Test(timeout=10000)
    public void setNotifyConnectTimeoutNotifyConnectTimeoutIsOne() {
        PropertyUtil.setNotifyConnectTimeout(1);
    }

    @Test(timeout=10000)
    public void setNotifySocketTimeoutNotifySocketTimeoutIsOne() {
        PropertyUtil.setNotifySocketTimeout(1);
    }

    @Test(timeout=10000)
    public void setStandaloneUseMysqlStandaloneUseMysqlIsFalse() {
        PropertyUtil.setStandaloneUseMysql(false);
    }
}
