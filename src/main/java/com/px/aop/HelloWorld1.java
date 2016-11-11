package com.px.aop;

/**
 * @author pengx
 * @date 2016/11/4
 */
public class HelloWorld1 implements HelloWorld {
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
    }

    public void doPrint() {
        System.out.println("Enter HelloWorldImpl1.doPrint()");
    }
}
