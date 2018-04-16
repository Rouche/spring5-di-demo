package com.resolutech.services;

/**
 * Created by jt on 5/24/17.
 */
public class PrimaryFrenchGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryFrenchGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Salut - d'un bean francais";
    }
}
