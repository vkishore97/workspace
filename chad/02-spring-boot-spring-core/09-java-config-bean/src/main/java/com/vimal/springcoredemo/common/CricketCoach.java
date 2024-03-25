package com.vimal.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
 
    public CricketCoach() {
        System.out.println("Constructor - " + getClass().getSimpleName());
    }

    //define inti method
//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("doMyStartupStuff(): "+getClass().getSimpleName());
//    }
//
//    //define destroy method
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("doMyCleanupStuff(): "+getClass().getSimpleName());
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!! - From Setter injection";
    }

}
