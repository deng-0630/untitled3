package com.bdqn.test;

import org.springframework.stereotype.Component;

@Component
public class CaculaterImpl implements Caculater {
    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public double div(int a, int b) {
        return a/(double)b;
    }
}
