package spring_practice.core_concepts;

import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements Coach{
    @Override
    public String getDailyWorkOut()
    {
        return "Do a Loaft Shot on next Ball";
    }
}
