package com.px.test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author pengx
 * @date 2016/10/17
 */
public class Test {
    public static void main(String[] args) {

        int[] ints = new int[]{2,4,5,77,88,334,1,34,33,778,34};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+"\t");
            if(i % 4 == 0)
                System.out.println();

        }
    }


}
