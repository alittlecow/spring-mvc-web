package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_attribute_value", schema = "little", catalog = "")
public class TmAttributeValue {
    private Integer id;
    private Integer attrId;
    private String valueEn;
    private String valueFr;
    private Integer sort;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attr_id", nullable = false)
    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    @Basic
    @Column(name = "value_en", nullable = false, length = 100)
    public String getValueEn() {
        return valueEn;
    }

    public void setValueEn(String valueEn) {
        this.valueEn = valueEn;
    }

    @Basic
    @Column(name = "value_fr", nullable = false, length = 100)
    public String getValueFr() {
        return valueFr;
    }

    public void setValueFr(String valueFr) {
        this.valueFr = valueFr;
    }

    @Basic
    @Column(name = "sort", nullable = false)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmAttributeValue that = (TmAttributeValue) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (attrId != null ? !attrId.equals(that.attrId) : that.attrId != null) return false;
        if (valueEn != null ? !valueEn.equals(that.valueEn) : that.valueEn != null) return false;
        if (valueFr != null ? !valueFr.equals(that.valueFr) : that.valueFr != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (attrId != null ? attrId.hashCode() : 0);
        result = 31 * result + (valueEn != null ? valueEn.hashCode() : 0);
        result = 31 * result + (valueFr != null ? valueFr.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        return result;
    }
}
