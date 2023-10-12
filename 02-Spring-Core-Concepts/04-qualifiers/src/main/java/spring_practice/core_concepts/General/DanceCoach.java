package spring_practice.core_concepts.General;

import org.springframework.stereotype.Component;

@Component
public class DanceCoach implements Coach
{

    @Override
    public String getDailyWorkOut() {
        return "Naach Meri Jaan Naach !!!";
    }
}
