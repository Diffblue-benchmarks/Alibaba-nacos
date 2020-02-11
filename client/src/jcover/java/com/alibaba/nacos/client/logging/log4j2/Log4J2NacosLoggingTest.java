//package com.alibaba.nacos.client.logging.log4j2;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.core.Is.is;
//
//import org.junit.Test;
//
///**
// * Unit tests for com.alibaba.nacos.client.logging.log4j2.Log4J2NacosLogging
// *
// * @author Diffblue JCover
// */
//
//public class Log4J2NacosLoggingTest {
//
//    @Test(timeout=10000)
//    public void getLocationDefaultLocationIsGermanyReturnsGermany() {
//        assertThat(new Log4J2NacosLogging().getLocation("Germany"), is("Germany"));  <-- getLocation(java.lang.String) has protected access in com.alibaba.nacos.client.logging.AbstractNacosLogging
//    }
//}
