package spring_practice.core_concepts.General;

import org.springframework.stereotype.Component;

@Component
public class yogaCoach implements Coach
{

    @Override
    public String getDailyWorkOut() {
        return "Kapal Bharti Karo Balak";
    }
}
