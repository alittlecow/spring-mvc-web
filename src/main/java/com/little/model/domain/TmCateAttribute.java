package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_cate_attribute", schema = "little", catalog = "")
public class TmCateAttribute {
    private Integer sort;
    private Integer id;
    private String nameEn;
    private String nameFr;
    private String cateCode;

    @Basic
    @Column(name = "sort", nullable = false)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name_en", nullable = false, length = 100)
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Basic
    @Column(name = "name_fr", nullable = false, length = 100)
    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    @Basic
    @Column(name = "cate_code", nullable = false, length = 100)
    public String getCateCode() {
        return cateCode;
    }

    public void setCateCode(String cateCode) {
        this.cateCode = cateCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmCateAttribute that = (TmCateAttribute) o;

        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nameEn != null ? !nameEn.equals(that.nameEn) : that.nameEn != null) return false;
        if (nameFr != null ? !nameFr.equals(that.nameFr) : that.nameFr != null) return false;
        if (cateCode != null ? !cateCode.equals(that.cateCode) : that.cateCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sort != null ? sort.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (nameEn != null ? nameEn.hashCode() : 0);
        result = 31 * result + (nameFr != null ? nameFr.hashCode() : 0);
        result = 31 * result + (cateCode != null ? cateCode.hashCode() : 0);
        return result;
    }
}
