package com.developer.demo.startupactions.initializingbeaninterface;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class InitializingBeanImpl implements InitializingBean {
    static int number = 1;
    public InitializingBeanImpl() {
        System.out.println("###########   InitializingBeanImpl Constructor called");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("########           InitializingBeanImpl afterPropertiesSet method called "+number);
        number++;
    }
}