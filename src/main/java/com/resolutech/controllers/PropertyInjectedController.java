package com.resolutech.controllers;

import com.resolutech.services.GreetingService;


/**
 * Created by jt on 5/24/17.
 */

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
