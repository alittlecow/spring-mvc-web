package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "ts_systemconfig", schema = "little", catalog = "")
public class TsSystemconfig {
    private Integer id;
    private String nameEn;
    private String nameFr;
    private String valueEn;
    private String valueFr;
    private Serializable operatetime;
    private String operator;
    private String groupCode;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name_en", nullable = false, length = 50)
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Basic
    @Column(name = "name_fr", nullable = false, length = 50)
    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    @Basic
    @Column(name = "value_en", nullable = false, length = 50)
    public String getValueEn() {
        return valueEn;
    }

    public void setValueEn(String valueEn) {
        this.valueEn = valueEn;
    }

    @Basic
    @Column(name = "value_fr", nullable = false, length = 50)
    public String getValueFr() {
        return valueFr;
    }

    public void setValueFr(String valueFr) {
        this.valueFr = valueFr;
    }

    @Basic
    @Column(name = "operatetime", nullable = false)
    public Serializable getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Serializable operatetime) {
        this.operatetime = operatetime;
    }

    @Basic
    @Column(name = "operator", nullable = false, length = 30)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "group_code", nullable = true, length = 20)
    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TsSystemconfig that = (TsSystemconfig) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nameEn != null ? !nameEn.equals(that.nameEn) : that.nameEn != null) return false;
        if (nameFr != null ? !nameFr.equals(that.nameFr) : that.nameFr != null) return false;
        if (valueEn != null ? !valueEn.equals(that.valueEn) : that.valueEn != null) return false;
        if (valueFr != null ? !valueFr.equals(that.valueFr) : that.valueFr != null) return false;
        if (operatetime != null ? !operatetime.equals(that.operatetime) : that.operatetime != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (groupCode != null ? !groupCode.equals(that.groupCode) : that.groupCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nameEn != null ? nameEn.hashCode() : 0);
        result = 31 * result + (nameFr != null ? nameFr.hashCode() : 0);
        result = 31 * result + (valueEn != null ? valueEn.hashCode() : 0);
        result = 31 * result + (valueFr != null ? valueFr.hashCode() : 0);
        result = 31 * result + (operatetime != null ? operatetime.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (groupCode != null ? groupCode.hashCode() : 0);
        return result;
    }
}
