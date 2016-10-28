package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_tour_dest", schema = "little", catalog = "")
public class TmTourDest {
    private Integer tourId;
    private Integer destId;

    @Id
    @Column(name = "tour_id", nullable = true)
    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    @Basic
    @Column(name = "dest_id", nullable = true)
    public Integer getDestId() {
        return destId;
    }

    public void setDestId(Integer destId) {
        this.destId = destId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmTourDest that = (TmTourDest) o;

        if (tourId != null ? !tourId.equals(that.tourId) : that.tourId != null) return false;
        if (destId != null ? !destId.equals(that.destId) : that.destId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tourId != null ? tourId.hashCode() : 0;
        result = 31 * result + (destId != null ? destId.hashCode() : 0);
        return result;
    }
}
