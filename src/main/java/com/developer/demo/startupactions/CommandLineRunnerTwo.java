package com.developer.demo.startupactions;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class CommandLineRunnerTwo implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("###############   Command line Order2 ");
    }
}
