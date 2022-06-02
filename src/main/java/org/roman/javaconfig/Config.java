package org.roman.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Calculator calculator(){
        Calculator calculator = new Calculator(plusService(), minusService());
        return calculator;
    }

    @Bean
    public PlusService plusService(){
        PlusService plusService = new PlusService();
        return plusService;
    }

    @Bean
    public MinusService minusService(){
        MinusService minusService = new MinusService();
        return minusService;
    }
}
