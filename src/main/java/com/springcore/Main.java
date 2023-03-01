package com.springcore;

import com.springcore.Ambiguity.Addition;
import com.springcore.collections.Emp;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionsconfig.xml");
         //= new ClassPathXmlApplicationContext("config.xml");
        Emp e = (Emp) context.getBean("emp1");
        System.out.println(e);

        context = new ClassPathXmlApplicationContext("ciconfig.xml");
        Addition add = (Addition) context.getBean("Add1");
        add.doSum();


    }
}