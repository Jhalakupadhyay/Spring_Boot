package spring_practice.core_concepts.General;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class DanceCoach implements Coach
{

    public DanceCoach()
    {
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Naach Meri Jaan Naach !!!";
    }
}
