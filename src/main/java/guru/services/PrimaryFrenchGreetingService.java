package guru.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Profile("fr")
@Primary
public class PrimaryFrenchGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Salut - d'un bean francais";
    }
}
