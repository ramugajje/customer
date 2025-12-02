package com.developer.demo.startupactions.postconstructcomponent;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class PostConstructComponents {

    public PostConstructComponents() {
        System.out.println("###########  PostContructImpl Constructor called");
    }

    @PostConstruct
    public void runAfterObjectCreated() {
        System.out.println("##############   PostContruct method called");
    }

}
