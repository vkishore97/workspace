package com.vimal.springcoredemo.config;

import com.vimal.springcoredemo.common.Coach;
import com.vimal.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
