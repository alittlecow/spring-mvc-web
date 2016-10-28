package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_endcity", schema = "little", catalog = "")
public class TmEndcity {
    private Integer tourId;
    private Integer cityId;

    @Id
    @Column(name = "tour_id", nullable = false)
    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    @Basic
    @Column(name = "city_id", nullable = false)
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmEndcity tmEndcity = (TmEndcity) o;

        if (tourId != null ? !tourId.equals(tmEndcity.tourId) : tmEndcity.tourId != null) return false;
        if (cityId != null ? !cityId.equals(tmEndcity.cityId) : tmEndcity.cityId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tourId != null ? tourId.hashCode() : 0;
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        return result;
    }
}
