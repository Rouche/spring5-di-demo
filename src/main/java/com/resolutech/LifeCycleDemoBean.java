package com.resolutech;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Factory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Name: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Property set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post Construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre destroy");
    }

    public void beforeInit() {
        System.out.println("Before init");
    }

    public void afterInit() {
        System.out.println("After init");
    }
}
