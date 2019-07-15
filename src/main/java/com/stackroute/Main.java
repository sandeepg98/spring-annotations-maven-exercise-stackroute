package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

        Movie movieA = context.getBean("movieA", Movie.class);
        Movie movieB = context.getBean("movieB", Movie.class);
        System.out.println(movieA == movieB);
    }
}
