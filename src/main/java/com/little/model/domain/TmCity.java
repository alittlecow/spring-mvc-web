package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_city", schema = "little", catalog = "")
public class TmCity {
    private Integer id;
    private String nameEn;
    private String nameFr;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name_en", nullable = true, length = 100)
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Basic
    @Column(name = "name_fr", nullable = true, length = 100)
    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmCity tmCity = (TmCity) o;

        if (id != null ? !id.equals(tmCity.id) : tmCity.id != null) return false;
        if (nameEn != null ? !nameEn.equals(tmCity.nameEn) : tmCity.nameEn != null) return false;
        if (nameFr != null ? !nameFr.equals(tmCity.nameFr) : tmCity.nameFr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nameEn != null ? nameEn.hashCode() : 0);
        result = 31 * result + (nameFr != null ? nameFr.hashCode() : 0);
        return result;
    }
}
