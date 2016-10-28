package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_tour_theme", schema = "little", catalog = "")
public class TmTourTheme {
    private Integer tourId;
    private Integer thmId;

    @Id
    @Column(name = "tour_id", nullable = false)
    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    @Basic
    @Column(name = "thm_id", nullable = false)
    public Integer getThmId() {
        return thmId;
    }

    public void setThmId(Integer thmId) {
        this.thmId = thmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmTourTheme that = (TmTourTheme) o;

        if (tourId != null ? !tourId.equals(that.tourId) : that.tourId != null) return false;
        if (thmId != null ? !thmId.equals(that.thmId) : that.thmId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tourId != null ? tourId.hashCode() : 0;
        result = 31 * result + (thmId != null ? thmId.hashCode() : 0);
        return result;
    }
}
