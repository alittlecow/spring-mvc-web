package com.little.common.hibernate;

import com.little.common.handle.PropertyHandler;
import org.hibernate.HibernateException;
import org.hibernate.connection.C3P0ConnectionProvider;

import java.util.Properties;

/**
 * @author pengx
 * @date 2016/10/8
 */
public class LittleC3P0ConnectionProvider extends C3P0ConnectionProvider {
    @Override
    public void configure(Properties props) throws HibernateException {
//        props.setProperty("hibernate.connection.url", PropertyHandler.getProperty(props.getProperty("connection.url")));
//        props.setProperty("hibernate.connection.username", PropertyHandler.getProperty(props.getProperty("connection.username")));
//        props.setProperty("hibernate.connection.password", PropertyHandler.getProperty(props.getProperty("connection.password")));
        super.configure(props);
    }
}
