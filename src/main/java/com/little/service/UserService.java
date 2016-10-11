package com.little.service;

import com.little.model.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

/**
 * @author pengx
 * @date 2016/9/30
 */
@Service
public class UserService {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    /**
     * 根据id获取user对象
     * @param id
     * @return
     */
    public User getUser(String id){
            return hibernateTemplate.get(User.class,id);
    }
}
