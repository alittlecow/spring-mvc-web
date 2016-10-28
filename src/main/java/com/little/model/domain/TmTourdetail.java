package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_tourdetail", schema = "little", catalog = "")
public class TmTourdetail {
    private Integer trdeId;
    private Integer tourId;
    private Integer trdeDay;
    private String trdeTitleEn;
    private String trdeTitleFr;
    private String trdeContentEn;
    private String trdeContentFr;
    private String trdeDestinationEn;
    private String trdeDestinationFr;
    private String trdeMealsEn;
    private String trdeMealsFr;
    private String trdeTransportEn;
    private String trdeTransportFr;
    private String trdeHotelEn;
    private String trdeHotelFr;

    @Id
    @Column(name = "trde_id", nullable = false)
    public Integer getTrdeId() {
        return trdeId;
    }

    public void setTrdeId(Integer trdeId) {
        this.trdeId = trdeId;
    }

    @Basic
    @Column(name = "tour_id", nullable = true)
    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    @Basic
    @Column(name = "trde_day", nullable = false)
    public Integer getTrdeDay() {
        return trdeDay;
    }

    public void setTrdeDay(Integer trdeDay) {
        this.trdeDay = trdeDay;
    }

    @Basic
    @Column(name = "trde_title_en", nullable = false, length = 100)
    public String getTrdeTitleEn() {
        return trdeTitleEn;
    }

    public void setTrdeTitleEn(String trdeTitleEn) {
        this.trdeTitleEn = trdeTitleEn;
    }

    @Basic
    @Column(name = "trde_title_fr", nullable = false, length = 100)
    public String getTrdeTitleFr() {
        return trdeTitleFr;
    }

    public void setTrdeTitleFr(String trdeTitleFr) {
        this.trdeTitleFr = trdeTitleFr;
    }

    @Basic
    @Column(name = "trde_content_en", nullable = false, length = 2000)
    public String getTrdeContentEn() {
        return trdeContentEn;
    }

    public void setTrdeContentEn(String trdeContentEn) {
        this.trdeContentEn = trdeContentEn;
    }

    @Basic
    @Column(name = "trde_content_fr", nullable = false, length = 2000)
    public String getTrdeContentFr() {
        return trdeContentFr;
    }

    public void setTrdeContentFr(String trdeContentFr) {
        this.trdeContentFr = trdeContentFr;
    }

    @Basic
    @Column(name = "trde_destination_en", nullable = true, length = 1000)
    public String getTrdeDestinationEn() {
        return trdeDestinationEn;
    }

    public void setTrdeDestinationEn(String trdeDestinationEn) {
        this.trdeDestinationEn = trdeDestinationEn;
    }

    @Basic
    @Column(name = "trde_destination_fr", nullable = true, length = 1000)
    public String getTrdeDestinationFr() {
        return trdeDestinationFr;
    }

    public void setTrdeDestinationFr(String trdeDestinationFr) {
        this.trdeDestinationFr = trdeDestinationFr;
    }

    @Basic
    @Column(name = "trde_meals_en", nullable = true, length = 500)
    public String getTrdeMealsEn() {
        return trdeMealsEn;
    }

    public void setTrdeMealsEn(String trdeMealsEn) {
        this.trdeMealsEn = trdeMealsEn;
    }

    @Basic
    @Column(name = "trde_meals_fr", nullable = true, length = 500)
    public String getTrdeMealsFr() {
        return trdeMealsFr;
    }

    public void setTrdeMealsFr(String trdeMealsFr) {
        this.trdeMealsFr = trdeMealsFr;
    }

    @Basic
    @Column(name = "trde_transport_en", nullable = true, length = 500)
    public String getTrdeTransportEn() {
        return trdeTransportEn;
    }

    public void setTrdeTransportEn(String trdeTransportEn) {
        this.trdeTransportEn = trdeTransportEn;
    }

    @Basic
    @Column(name = "trde_transport_fr", nullable = true, length = 500)
    public String getTrdeTransportFr() {
        return trdeTransportFr;
    }

    public void setTrdeTransportFr(String trdeTransportFr) {
        this.trdeTransportFr = trdeTransportFr;
    }

    @Basic
    @Column(name = "trde_hotel_en", nullable = true, length = 1000)
    public String getTrdeHotelEn() {
        return trdeHotelEn;
    }

    public void setTrdeHotelEn(String trdeHotelEn) {
        this.trdeHotelEn = trdeHotelEn;
    }

    @Basic
    @Column(name = "trde_hotel_fr", nullable = true, length = 1000)
    public String getTrdeHotelFr() {
        return trdeHotelFr;
    }

    public void setTrdeHotelFr(String trdeHotelFr) {
        this.trdeHotelFr = trdeHotelFr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmTourdetail that = (TmTourdetail) o;

        if (trdeId != null ? !trdeId.equals(that.trdeId) : that.trdeId != null) return false;
        if (tourId != null ? !tourId.equals(that.tourId) : that.tourId != null) return false;
        if (trdeDay != null ? !trdeDay.equals(that.trdeDay) : that.trdeDay != null) return false;
        if (trdeTitleEn != null ? !trdeTitleEn.equals(that.trdeTitleEn) : that.trdeTitleEn != null) return false;
        if (trdeTitleFr != null ? !trdeTitleFr.equals(that.trdeTitleFr) : that.trdeTitleFr != null) return false;
        if (trdeContentEn != null ? !trdeContentEn.equals(that.trdeContentEn) : that.trdeContentEn != null)
            return false;
        if (trdeContentFr != null ? !trdeContentFr.equals(that.trdeContentFr) : that.trdeContentFr != null)
            return false;
        if (trdeDestinationEn != null ? !trdeDestinationEn.equals(that.trdeDestinationEn) : that.trdeDestinationEn != null)
            return false;
        if (trdeDestinationFr != null ? !trdeDestinationFr.equals(that.trdeDestinationFr) : that.trdeDestinationFr != null)
            return false;
        if (trdeMealsEn != null ? !trdeMealsEn.equals(that.trdeMealsEn) : that.trdeMealsEn != null) return false;
        if (trdeMealsFr != null ? !trdeMealsFr.equals(that.trdeMealsFr) : that.trdeMealsFr != null) return false;
        if (trdeTransportEn != null ? !trdeTransportEn.equals(that.trdeTransportEn) : that.trdeTransportEn != null)
            return false;
        if (trdeTransportFr != null ? !trdeTransportFr.equals(that.trdeTransportFr) : that.trdeTransportFr != null)
            return false;
        if (trdeHotelEn != null ? !trdeHotelEn.equals(that.trdeHotelEn) : that.trdeHotelEn != null) return false;
        if (trdeHotelFr != null ? !trdeHotelFr.equals(that.trdeHotelFr) : that.trdeHotelFr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trdeId != null ? trdeId.hashCode() : 0;
        result = 31 * result + (tourId != null ? tourId.hashCode() : 0);
        result = 31 * result + (trdeDay != null ? trdeDay.hashCode() : 0);
        result = 31 * result + (trdeTitleEn != null ? trdeTitleEn.hashCode() : 0);
        result = 31 * result + (trdeTitleFr != null ? trdeTitleFr.hashCode() : 0);
        result = 31 * result + (trdeContentEn != null ? trdeContentEn.hashCode() : 0);
        result = 31 * result + (trdeContentFr != null ? trdeContentFr.hashCode() : 0);
        result = 31 * result + (trdeDestinationEn != null ? trdeDestinationEn.hashCode() : 0);
        result = 31 * result + (trdeDestinationFr != null ? trdeDestinationFr.hashCode() : 0);
        result = 31 * result + (trdeMealsEn != null ? trdeMealsEn.hashCode() : 0);
        result = 31 * result + (trdeMealsFr != null ? trdeMealsFr.hashCode() : 0);
        result = 31 * result + (trdeTransportEn != null ? trdeTransportEn.hashCode() : 0);
        result = 31 * result + (trdeTransportFr != null ? trdeTransportFr.hashCode() : 0);
        result = 31 * result + (trdeHotelEn != null ? trdeHotelEn.hashCode() : 0);
        result = 31 * result + (trdeHotelFr != null ? trdeHotelFr.hashCode() : 0);
        return result;
    }
}
