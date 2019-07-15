package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties set");
    }

    public BeanLifecycleDemoBean beanLifecycleDemoBean() {
        BeanLifecycleDemoBean beanLifecycleDemoBean = new BeanLifecycleDemoBean();
        return beanLifecycleDemoBean;
    }
}
