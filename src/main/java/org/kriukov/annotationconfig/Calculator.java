package org.kriukov.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private PlusService plus;
    private MinusService minus;

    public Calculator(PlusService plus, MinusService minus) {
        this.plus = plus;
        this.minus = minus;
    }

    public int calculate(int a, int b){
        if(a > b){
            return minus.diferent(a, b);
        }
        return plus.summa(a, b);
    }
}
