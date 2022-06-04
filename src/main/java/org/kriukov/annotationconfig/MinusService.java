package org.kriukov.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class MinusService {
    public int diferent(int a, int b){
        return a - b;
    }
}
