package com.byedbl.spring.custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserBeanDefinitionParserTest {


    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("user-test.xml");
        User user = (User) ac.getBean("testbean");
        System.out.println("email: " +user.getEmail());
        System.out.println("userName: " +user.getUserName());
        System.out.println("id:" + user.getId());
    }
}