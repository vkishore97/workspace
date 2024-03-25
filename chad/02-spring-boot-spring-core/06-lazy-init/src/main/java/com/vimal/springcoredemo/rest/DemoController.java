package com.vimal.springcoredemo.rest;

import com.vimal.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

//    @Autowired
//    public void setMyCoach(Coach coach) {
//        myCoach = coach;
//    }

    @Autowired
    public DemoController(@Qualifier("trackCoach") Coach theCoach) {
        System.out.println("Constructor - " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String DailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
