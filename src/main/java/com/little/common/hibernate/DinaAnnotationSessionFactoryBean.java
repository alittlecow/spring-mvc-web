package com.little.common.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.ImprovedNamingStrategy;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

/**
 * @author Huzl
 * @version 1.0.0
 */
public class DinaAnnotationSessionFactoryBean extends AnnotationSessionFactoryBean {
    @Override
    protected SessionFactory newSessionFactory(Configuration config) throws HibernateException {
        getConfiguration().getIdentifierGeneratorFactory().register("dinaUUID",DinaUUIDIdentifierGenerator.class);
        return super.newSessionFactory(config);
    }

    public static void main(String[] args) {
        System.out.println(ImprovedNamingStrategy.INSTANCE.propertyToColumnName("sallerId"));
    }

    @Override
    protected Configuration newConfiguration() throws HibernateException {
        Configuration configuration =  super.newConfiguration();
        configuration.setNamingStrategy(ImprovedNamingStrategy.INSTANCE);
        return configuration;
    }
}
