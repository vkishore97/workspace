package com.vimal.springcoredemo.rest;

import com.vimal.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
//    private Coach anotherCoach;

//    @Autowired
//    public void setMyCoach(Coach coach) {
//        myCoach = coach;
//    }

    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach
//                         ,@Qualifier("cricketCoach") Coach theAnotherCoach
                         ) {
        System.out.println("Constructor - " + getClass().getSimpleName());
        myCoach = theCoach;
//        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String DailyWorkout() {
        return myCoach.getDailyWorkout();
    }

//    @GetMapping("/check")
//    public String check() {
//        return "Comparing beans: myCoach = anotherCoach, " + (myCoach == anotherCoach);
//    }

}
