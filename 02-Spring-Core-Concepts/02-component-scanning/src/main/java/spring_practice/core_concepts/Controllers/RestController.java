package spring_practice.core_concepts.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import General.Coach;

@org.springframework.web.bind.annotation.RestController
public class RestController
{
    @Autowired
    private Coach myCoach;
    RestController(Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping("/DailyWorkour")
    public String dailyWorkout()
    {
        return myCoach.getDailyWorkOut();
    }
}
