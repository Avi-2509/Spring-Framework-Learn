package com.springcore.conInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testCi {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
        person p1 = (person)context.getBean("p1");
        System.out.println(p1);
    }
}
