package com.resolutech.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hi - from set";
    }
}