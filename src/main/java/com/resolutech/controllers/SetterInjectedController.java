package com.resolutech.controllers;

import com.resolutech.services.GreetingService;

/**
 * Created by jt on 5/24/17.
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
