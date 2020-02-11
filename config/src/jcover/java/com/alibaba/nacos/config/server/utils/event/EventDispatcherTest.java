package com.alibaba.nacos.config.server.utils.event;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.event.EventDispatcher
 *
 * @author Diffblue JCover
 */

public class EventDispatcherTest {

    @Test(timeout=10000)
    public void addEventListener1() {
        EventDispatcher.AbstractEventListener listener = mock(EventDispatcher.AbstractEventListener.class);
        when(listener.interest())
            .thenReturn(new java.util.ArrayList<Class<? extends EventDispatcher.Event>>());
        EventDispatcher.addEventListener(listener);
    }

    @Test(timeout=10000)
    public void addEventListener2() {
        List<Class<? extends EventDispatcher.Event>> list = new ArrayList<Class<? extends EventDispatcher.Event>>();
        ((ArrayList<Class<? extends EventDispatcher.Event>>)list).add(EventDispatcher.Event.class);
        EventDispatcher.AbstractEventListener listener = mock(EventDispatcher.AbstractEventListener.class);
        when(listener.interest())
            .thenReturn(list);
        EventDispatcher.addEventListener(listener);
    }

    @Test(timeout=10000)
    public void clear() {
        EventDispatcher.clear();
    }

    @Test(timeout=10000)
    public void fireEvent() {
        EventDispatcher.Event event = mock(EventDispatcher.Event.class);
        EventDispatcher.fireEvent(event);
    }

    @Test(timeout=10000)
    public void getEntryEventTypeIsInnerClass() {
        Object result = EventDispatcher.getEntry(EventDispatcher.Event.class);
        assertThat(result, sameInstance(result));
    }
}
