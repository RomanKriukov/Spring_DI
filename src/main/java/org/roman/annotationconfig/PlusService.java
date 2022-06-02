package org.roman.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class PlusService {
    public int summa(int a, int b){
        return a + b;
    }
}
