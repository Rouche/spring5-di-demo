package com.resolutech.services;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/24/17.
 */
public interface GreetingRepository {

    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}