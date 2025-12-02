package com.developer.demo.startupactions.applicationreadyevent;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RunAfterStartupTwo {

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        System.out.println("############# ApplicationReadyEvent from two");
    }
}

