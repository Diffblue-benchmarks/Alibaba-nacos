package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.User
 *
 * @author Diffblue JCover
 */

public class UserTest {

    @Test(timeout=10000)
    public void getPasswordReturnsNull() {
        assertThat(new User().getPassword(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getUsernameReturnsNull() {
        assertThat(new User().getUsername(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setPasswordToFoo() {
        User user = new User();
        user.setPassword("foo");
        assertThat(user.getPassword(), is("foo"));
    }

    @Test(timeout=10000)
    public void setUsernameToFoo() {
        User user = new User();
        user.setUsername("foo");
        assertThat(user.getUsername(), is("foo"));
    }
}
