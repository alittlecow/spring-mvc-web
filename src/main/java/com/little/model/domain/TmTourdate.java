package com.little.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_tourdate", schema = "little", catalog = "")
public class TmTourdate {
    private Integer trdId;
    private Integer tourId;
    private Date trdTime;
    private BigDecimal trdPrice;
    private Integer trdInventory;
    private Integer trdSales;
    private Integer trdPending;
    private Integer trdRemain;
    private Integer trdWarn;

    @Id
    @Column(name = "trd_id", nullable = false)
    public Integer getTrdId() {
        return trdId;
    }

    public void setTrdId(Integer trdId) {
        this.trdId = trdId;
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
    @Column(name = "trd_time", nullable = false)
    public Date getTrdTime() {
        return trdTime;
    }

    public void setTrdTime(Date trdTime) {
        this.trdTime = trdTime;
    }

    @Basic
    @Column(name = "trd_price", nullable = false, precision = 2)
    public BigDecimal getTrdPrice() {
        return trdPrice;
    }

    public void setTrdPrice(BigDecimal trdPrice) {
        this.trdPrice = trdPrice;
    }

    @Basic
    @Column(name = "trd_inventory", nullable = false)
    public Integer getTrdInventory() {
        return trdInventory;
    }

    public void setTrdInventory(Integer trdInventory) {
        this.trdInventory = trdInventory;
    }

    @Basic
    @Column(name = "trd_sales", nullable = false)
    public Integer getTrdSales() {
        return trdSales;
    }

    public void setTrdSales(Integer trdSales) {
        this.trdSales = trdSales;
    }

    @Basic
    @Column(name = "trd_pending", nullable = false)
    public Integer getTrdPending() {
        return trdPending;
    }

    public void setTrdPending(Integer trdPending) {
        this.trdPending = trdPending;
    }

    @Basic
    @Column(name = "trd_remain", nullable = false)
    public Integer getTrdRemain() {
        return trdRemain;
    }

    public void setTrdRemain(Integer trdRemain) {
        this.trdRemain = trdRemain;
    }

    @Basic
    @Column(name = "trd_warn", nullable = false)
    public Integer getTrdWarn() {
        return trdWarn;
    }

    public void setTrdWarn(Integer trdWarn) {
        this.trdWarn = trdWarn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmTourdate that = (TmTourdate) o;

        if (trdId != null ? !trdId.equals(that.trdId) : that.trdId != null) return false;
        if (tourId != null ? !tourId.equals(that.tourId) : that.tourId != null) return false;
        if (trdTime != null ? !trdTime.equals(that.trdTime) : that.trdTime != null) return false;
        if (trdPrice != null ? !trdPrice.equals(that.trdPrice) : that.trdPrice != null) return false;
        if (trdInventory != null ? !trdInventory.equals(that.trdInventory) : that.trdInventory != null) return false;
        if (trdSales != null ? !trdSales.equals(that.trdSales) : that.trdSales != null) return false;
        if (trdPending != null ? !trdPending.equals(that.trdPending) : that.trdPending != null) return false;
        if (trdRemain != null ? !trdRemain.equals(that.trdRemain) : that.trdRemain != null) return false;
        if (trdWarn != null ? !trdWarn.equals(that.trdWarn) : that.trdWarn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trdId != null ? trdId.hashCode() : 0;
        result = 31 * result + (tourId != null ? tourId.hashCode() : 0);
        result = 31 * result + (trdTime != null ? trdTime.hashCode() : 0);
        result = 31 * result + (trdPrice != null ? trdPrice.hashCode() : 0);
        result = 31 * result + (trdInventory != null ? trdInventory.hashCode() : 0);
        result = 31 * result + (trdSales != null ? trdSales.hashCode() : 0);
        result = 31 * result + (trdPending != null ? trdPending.hashCode() : 0);
        result = 31 * result + (trdRemain != null ? trdRemain.hashCode() : 0);
        result = 31 * result + (trdWarn != null ? trdWarn.hashCode() : 0);
        return result;
    }
}
