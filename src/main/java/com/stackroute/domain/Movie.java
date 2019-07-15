package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    @Autowired
    private Actor actorDiljit;

    public Movie(){

    }

    public Movie(Actor actorDiljit) {
        this.actorDiljit = actorDiljit;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory : " + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name : " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext : " + applicationContext);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actorDiljit +
                '}';
    }
}
