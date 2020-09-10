package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.Message
 *
 * @author Diffblue Cover
 */

public class MessageTest {

    @Test
    public void factory() {
        Message message = new Message();
        message.setData("something");
        assertThat(message.getData(), is("something"));
    }
}
