package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tb_destinationday", schema = "little", catalog = "")
public class TbDestinationday {
    private Integer cstId;
    private Integer cityId;
    private Integer day;

    @Id
    @Column(name = "cst_id", nullable = false)
    public Integer getCstId() {
        return cstId;
    }

    public void setCstId(Integer cstId) {
        this.cstId = cstId;
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
    @Column(name = "day", nullable = false)
    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbDestinationday that = (TbDestinationday) o;

        if (cstId != null ? !cstId.equals(that.cstId) : that.cstId != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (day != null ? !day.equals(that.day) : that.day != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cstId != null ? cstId.hashCode() : 0;
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (day != null ? day.hashCode() : 0);
        return result;
    }
}
