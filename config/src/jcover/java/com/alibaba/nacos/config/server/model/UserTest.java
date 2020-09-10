package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.User
 *
 * @author Diffblue Cover
 */

class UserTest {

    @Test
    void factory() {
        User user = new User();
        user.setPassword("secret");
        user.setUsername("John Smith");
        assertThat(user.getPassword(), is("secret"));
        assertThat(user.getUsername(), is("John Smith"));
    }
}
