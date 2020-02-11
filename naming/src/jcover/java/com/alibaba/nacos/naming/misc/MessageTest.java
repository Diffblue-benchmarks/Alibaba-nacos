package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.Message
 *
 * @author Diffblue JCover
 */

public class MessageTest {

    @Test(timeout=10000)
    public void getDataReturnsNull() {
        assertThat(new Message().getData(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setDataToSomething() {
        Message message = new Message();
        message.setData("something");
        assertThat(message.getData(), is("something"));
    }
}
