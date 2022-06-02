package org.roman;

import org.roman.xmlconfig.Calculator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Spring XML configuration");
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory.xml");
        Calculator calculator = beanFactory.getBean("calculator", Calculator.class);
        System.out.println("Summa : " + calculator.calculate(3, 5));
        System.out.println("Diferent : " + calculator.calculate(6, 5));
    }
}