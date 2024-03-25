package com.vimal.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("Constructor - " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 in baseball practice";
    }

}
