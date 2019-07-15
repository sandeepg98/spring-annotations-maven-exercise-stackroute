package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie);

        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean(BeanLifecycleDemoBean.class);
        System.out.println(beanLifecycleDemoBean);
        context.registerShutdownHook();
    }
}
