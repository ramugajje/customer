package com.developer.demo.startupactions.applicationrunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ApplicationRunnerImplOne implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("############## ApplicationRunnerImplOne Called");

//print all arguemnts: arg: status=running, arg: --mood=happy, 10, --20
        for (String arg : args.getSourceArgs()) {
            System.out.println("arg: "+arg);
        }
        System.out.println("NonOptionArgs: "+args.getNonOptionArgs()); //[status=running,10]
        System.out.println("OptionNames: "+args.getOptionNames());  //[mood, 20]

        System.out.println("Printing key and value in loop:");
        for (String key : args.getOptionNames()) {
            System.out.println("key: "+key);     //key: mood  //key: 20
            System.out.println("val: "+args.getOptionValues(key)); //val:[happy] //val:[]
        }
    }
}
