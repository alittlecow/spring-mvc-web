package com.px.aop;

/**
 * @author pengx
 * @date 2016/11/4
 */
public class TimeHandler {
    static int i;
    public void printTime() {
        System.out.println("CurrentTime = " + System.currentTimeMillis());
    }

    public void sayHello(){
        System.out.println("now: "+System.currentTimeMillis());
        System.out.println("hello " +i);
    }
}
