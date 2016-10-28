package com.little.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author pengx
 * @date 2016/10/28
 */
public class MyRequsetLisenter implements ServletRequestListener {
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println(sre.getServletRequest()+"销毁了！！！");
    }

    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println(sre.getServletRequest()+"创建了！！！");

    }
}
