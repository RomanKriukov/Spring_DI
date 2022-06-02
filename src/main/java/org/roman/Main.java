package org.roman;

import org.roman.xmlconfig.Calculator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Spring XML configuration");
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory.xml");
        Calculator calculator = beanFactory.getBean("calculator", org.roman.xmlconfig.Calculator.class);
        System.out.println("Summa : " + calculator.calculate(3, 5));
        System.out.println("Diferent : " + calculator.calculate(6, 5));

        System.out.println("=====================================");

        System.out.println("Spring annotation configuration");
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("org/roman/annotationconfig");
        org.roman.annotationconfig.Calculator calculator1 = applicationContext.getBean("calculator", org.roman.annotationconfig.Calculator.class);
        System.out.println("Summa : " + calculator1.calculate(10, 7));
        System.out.println("Diferent : " + calculator1.calculate(4, 8));

        System.out.println("=====================================");

        System.out.println("Spring Java configuration");
        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext("org/roman/javaconfig");
        org.roman.javaconfig.Calculator calculator2 = applicationContext1.getBean("calculator", org.roman.javaconfig.Calculator.class);
        System.out.println("Summa : " + calculator2.calculate(11, 6));
        System.out.println("Diferent : " + calculator2.calculate(5, 10));

    }
}