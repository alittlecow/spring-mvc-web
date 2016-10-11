package com.little.common.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Huzl
 * @version 1.0.0
 */
public class DinaUUIDIdentifierGenerator implements IdentifierGenerator {
    public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
        return UUID.randomUUID().toString().replace("-","");
    }
}
