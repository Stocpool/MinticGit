/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *
 * @author Alexander
 */
@Component
public class SpringContext implements ApplicationContextAware {
    private static ApplicationContext context;
    
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        SpringContext.context= context ;
    }
    
    public static <T extends Object> T getBean(Class<T> beanClass){
        return context.getBean(beanClass);
    }
}
