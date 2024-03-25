package com.vimal.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("Constructor - " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!! - From Setter injection";
    }

}
