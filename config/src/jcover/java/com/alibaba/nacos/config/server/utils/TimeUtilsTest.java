//package com.alibaba.nacos.config.server.utils;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.core.Is.is;
//
//import java.sql.Timestamp;
//
//import org.junit.Test;
//
///**
// * Unit tests for com.alibaba.nacos.config.server.utils.TimeUtils
// *
// * @author Diffblue JCover
// */
//
//public class TimeUtilsTest {
//
//    @Test(timeout=10000)
//    public void getCurrentTime() {
//        Timestamp result = TimeUtils.getCurrentTime();
//        assertThat(result.getNanos(), is(847_000_000));  <-- Expected: is <847000000>     but: was <397000000>
//        assertThat(result.getTime(), is(1_581_384_597_847L));
//        assertThat(result.getDate(), is(11));
//        assertThat(result.getDay(), is(2));
//        assertThat(result.getHours(), is(1));
//        assertThat(result.getMinutes(), is(29));
//        assertThat(result.getMonth(), is(1));
//        assertThat(result.getSeconds(), is(57));
//        assertThat(result.getTimezoneOffset(), is(0));
//        assertThat(result.getYear(), is(120));
//    }
//
//    @Test(timeout=10000)
//    public void getCurrentTimeStr() {
//        assertThat(TimeUtils.getCurrentTimeStr(), is("2020-02-11 01:29:57"));  <-- Expected: is "2020-02-11 01:29:57"     but: was "2020-02-11 02:12:23"
//    }
//}
