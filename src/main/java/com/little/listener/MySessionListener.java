package com.little.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author pengx
 * @date 2016/10/28
 */
public class MySessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println(se.getSession()+"创建了！！！");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println(se.getSession()+"销毁了！！！");

    }
}
