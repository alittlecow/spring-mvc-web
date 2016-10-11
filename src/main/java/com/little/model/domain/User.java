package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/9/30
 */

@Entity
@Table(name = "user")
public class User {

    private String id;

    private String name;

    private String sex;

    private int age;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sex", nullable = false, insertable = true, updatable = true, length = 20)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "age", nullable = false, insertable = true, updatable = true, length = 11)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
