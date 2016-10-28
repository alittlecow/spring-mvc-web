package com.px.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengx
 * @date 2016/10/19
 */
public class Demo1 {

    public static void main(String[] args) {
//        Girl girl = new Girl();
        List<Girl> girls = new ArrayList<Girl>();
        for (int i = 0; i < 100; i++) {
            Girl girl = new Girl();
            girls.add(girl);
        }

    }
}


class Girl {

    private int age;
    private double bust;
    private double waist;
    private double hip;

    public Girl(){

    }

    public Girl(int age) {
        this.age = age;
    }

    public Girl(int age, double bust, double waist, double hip) {
        this.age = age;
        this.bust = bust;
        this.waist = waist;
        this.hip = hip;
    }
}
