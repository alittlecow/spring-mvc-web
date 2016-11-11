package com.px.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengx
 * @date 2016/11/4
 */
public class AopTest {
    public static void main(String[] args) {
        System.out.println(111);
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring/appContext-core.xml");
        HelloWorld hw1 = (HelloWorld)ctx.getBean("h1");
        HelloWorld hw2 = (HelloWorld)ctx.getBean("h2");
        hw1.printHelloWorld();
        System.out.println();
        hw1.doPrint();

        System.out.println();
        hw2.printHelloWorld();
        System.out.println();
        hw2.doPrint();
    }
}
