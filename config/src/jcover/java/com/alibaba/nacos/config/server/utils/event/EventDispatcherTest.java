package com.alibaba.nacos.config.server.utils.event;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.event.EventDispatcher
 *
 * @author Diffblue Cover
 */

class EventDispatcherTest {

    @Test
    void addEventListener() {
        List<Class<? extends EventDispatcher.Event>> list =
             new ArrayList<Class<? extends EventDispatcher.Event>>();
        list.add(EventDispatcher.Event.class);
        EventDispatcher.AbstractEventListener listener =
             mock(EventDispatcher.AbstractEventListener.class);
        when(listener.interest())
            .thenReturn(list);
        EventDispatcher.addEventListener(listener);
    }

    @Test
    void fireEvent() {
        EventDispatcher.Event event = mock(EventDispatcher.Event.class);
        EventDispatcher.fireEvent(event);
    }

    @Test
    void clear() {
        EventDispatcher.clear();
    }

    @Test
    void getEntryEventTypeIsNestedClass() {
        // pojo EventDispatcher.Entry
    }
}
