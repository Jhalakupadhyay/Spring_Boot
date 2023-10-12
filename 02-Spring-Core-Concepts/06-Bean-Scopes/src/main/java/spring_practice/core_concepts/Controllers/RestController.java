package spring_practice.core_concepts.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import spring_practice.core_concepts.General.Coach;

@org.springframework.web.bind.annotation.RestController
public class RestController
{
    private Coach myCoach;
    private Coach mySecondCoach;
    @Autowired
    public void setMyCoach(@Qualifier("danceCoach")Coach theCoach, @Qualifier("danceCoach")Coach AnotherCoach)
    {
        myCoach = theCoach;
        mySecondCoach = AnotherCoach;
    }

    @GetMapping("/DailyWorkour")
    public String dailyWorkout()
    {
        return myCoach.getDailyWorkOut();
    }

    @GetMapping("/Check")
    public String Check()
    {
        return "Compairing beans myCoach == mySecondCoach " +(myCoach == mySecondCoach);
    }
}
