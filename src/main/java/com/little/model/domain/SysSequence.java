package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "sys_sequence", schema = "little", catalog = "")
public class SysSequence {
    private String name;
    private Integer currentValue;
    private Integer increment;

    @Id
    @Column(name = "NAME", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "CURRENT_VALUE", nullable = false)
    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    @Basic
    @Column(name = "INCREMENT", nullable = false)
    public Integer getIncrement() {
        return increment;
    }

    public void setIncrement(Integer increment) {
        this.increment = increment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysSequence that = (SysSequence) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (currentValue != null ? !currentValue.equals(that.currentValue) : that.currentValue != null) return false;
        if (increment != null ? !increment.equals(that.increment) : that.increment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (currentValue != null ? currentValue.hashCode() : 0);
        result = 31 * result + (increment != null ? increment.hashCode() : 0);
        return result;
    }
}
