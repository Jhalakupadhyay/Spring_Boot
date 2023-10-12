package spring_practice.core_concepts.General;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class yogaCoach implements Coach
{
    public yogaCoach()
    {
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Kapal Bharti Karo Balak";
    }
}
