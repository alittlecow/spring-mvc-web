package com.px.re;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author pengx
 * @date 2016/10/14
 */
public class PatternTest {

    @Test
    public void test(){
        Pattern p = Pattern.compile("^.*([0-9]+)");
        Matcher matcher = p.matcher("abc efsfs12090gggggggggggg");
        boolean b = matcher.matches();
        System.out.println(b);
        Matcher m = Pattern.compile("a*b").matcher("aaaaaaabbbbbb");
        System.out.println(m.find());
        System.out.println(m.group());
    }
}
