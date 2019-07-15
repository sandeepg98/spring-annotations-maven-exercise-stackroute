package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public Actor actor() {
        Actor actor = new Actor();
        actor.setAge(35);
        actor.setGender("Male");
        actor.setName("Diljit Dosanjh");
        return actor;
    }

    @Bean
    public Movie movie() {
        Movie movie =new Movie(actor());
        return movie;
    }
}
