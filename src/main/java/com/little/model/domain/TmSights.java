package com.little.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_sights", schema = "little", catalog = "")
public class TmSights {
    private Integer id;
    private Integer cityId;
    private String nameEn;
    private String nameFr;
    private String descEn;
    private String descFr;
    private String level;
    private BigDecimal price;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "city_id", nullable = false)
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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
    @Column(name = "desc_en", nullable = true, length = 2000)
    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    @Basic
    @Column(name = "desc_fr", nullable = true, length = 2000)
    public String getDescFr() {
        return descFr;
    }

    public void setDescFr(String descFr) {
        this.descFr = descFr;
    }

    @Basic
    @Column(name = "level", nullable = false, length = 20)
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmSights tmSights = (TmSights) o;

        if (id != null ? !id.equals(tmSights.id) : tmSights.id != null) return false;
        if (cityId != null ? !cityId.equals(tmSights.cityId) : tmSights.cityId != null) return false;
        if (nameEn != null ? !nameEn.equals(tmSights.nameEn) : tmSights.nameEn != null) return false;
        if (nameFr != null ? !nameFr.equals(tmSights.nameFr) : tmSights.nameFr != null) return false;
        if (descEn != null ? !descEn.equals(tmSights.descEn) : tmSights.descEn != null) return false;
        if (descFr != null ? !descFr.equals(tmSights.descFr) : tmSights.descFr != null) return false;
        if (level != null ? !level.equals(tmSights.level) : tmSights.level != null) return false;
        if (price != null ? !price.equals(tmSights.price) : tmSights.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (nameEn != null ? nameEn.hashCode() : 0);
        result = 31 * result + (nameFr != null ? nameFr.hashCode() : 0);
        result = 31 * result + (descEn != null ? descEn.hashCode() : 0);
        result = 31 * result + (descFr != null ? descFr.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
