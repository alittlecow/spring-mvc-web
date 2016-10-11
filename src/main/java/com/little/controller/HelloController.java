package com.little.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author pengx
 * @date 2016/9/30
 */
@Controller
@RequestMapping(value = "/")
public class HelloController {

    private static final Logger log = Logger.getLogger(HelloController.class);
    @RequestMapping
    public String index (HttpServletRequest request, HttpServletResponse response){

        System.out.println("hello world");
        log.info("可以");

        request.setAttribute("name","px");
        return "index";
    }
}
