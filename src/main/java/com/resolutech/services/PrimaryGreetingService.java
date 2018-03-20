package com.resolutech.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
public class PrimaryGreetingService implements GreetingService, DisposableBean {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hi - from primary";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("im destroyed! " + this.getClass().getName());
    }
}
