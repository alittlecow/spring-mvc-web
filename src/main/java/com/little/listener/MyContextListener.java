package com.little.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author pengx
 * @date 2016/10/28
 */
public class MyContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext创建");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext销毁");
    }
}
