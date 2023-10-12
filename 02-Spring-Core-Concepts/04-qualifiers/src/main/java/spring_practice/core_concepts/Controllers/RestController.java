package spring_practice.core_concepts.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import spring_practice.core_concepts.General.Coach;

@org.springframework.web.bind.annotation.RestController
public class RestController
{
    private Coach myCoach;
    @Autowired
    public void setMyCoach(@Qualifier("danceCoach")Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/DailyWorkour")
    public String dailyWorkout()
    {
        return myCoach.getDailyWorkOut();
    }
}
