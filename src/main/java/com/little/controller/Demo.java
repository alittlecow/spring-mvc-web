package com.little.controller;

import java.util.Scanner;

/**
 * @author pengx
 * @date 2016/9/30
 */
public class Demo {

    public static void main(String[] args) {
        String location = "classpath*:/aaa/bbb/spring-*.xml";
        System.out.println(determineRootDir(location));
        System.out.println("lalalal");

    }

    public static String determineRootDir(String location) {
        int prefixEnd = location.indexOf(":") + 1;
        int rootDirEnd = location.length();
        while (rootDirEnd > prefixEnd) {
            rootDirEnd = location.lastIndexOf('/', rootDirEnd - 2) + 1;
        }
        if (rootDirEnd == 0) {
            rootDirEnd = prefixEnd;
        }
        return location.substring(0, rootDirEnd);
    }
}
