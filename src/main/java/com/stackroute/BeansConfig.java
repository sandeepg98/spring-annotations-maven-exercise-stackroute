package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfig {

    @Bean
    public Actor actorDiljit()
    {
        Actor actor=new Actor("Diljit Dosanjh","Male",35);
        return actor;
    }
    @Bean
    public Actor actorSargun()
    {
        Actor actor=new Actor("Sargun Mehta","female",30);
        return actor;
    }
    @Bean
    public Actor actorSangha()
    {
        Actor actor=new Actor("Harby Sangha","Male",45);
        return actor;
    }

    @Bean({"movieA","movieB"})
    @Scope("prototype")
    public Movie movie() {
        Movie movie =new Movie(actorDiljit());
        return movie;
    }
}
