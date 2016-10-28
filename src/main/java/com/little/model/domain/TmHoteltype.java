package com.little.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_hoteltype", schema = "little", catalog = "")
public class TmHoteltype {
    private Integer htpId;
    private Integer htlId;
    private String htlNameEn;
    private String htlNameFr;
    private Integer htlPeople;
    private BigDecimal htlPrice;
    private BigDecimal htlSpread;
    private String htlRule;

    @Id
    @Column(name = "htp_id", nullable = false)
    public Integer getHtpId() {
        return htpId;
    }

    public void setHtpId(Integer htpId) {
        this.htpId = htpId;
    }

    @Basic
    @Column(name = "htl_id", nullable = false)
    public Integer getHtlId() {
        return htlId;
    }

    public void setHtlId(Integer htlId) {
        this.htlId = htlId;
    }

    @Basic
    @Column(name = "htl_name_en", nullable = false, length = 50)
    public String getHtlNameEn() {
        return htlNameEn;
    }

    public void setHtlNameEn(String htlNameEn) {
        this.htlNameEn = htlNameEn;
    }

    @Basic
    @Column(name = "htl_name_fr", nullable = false, length = 50)
    public String getHtlNameFr() {
        return htlNameFr;
    }

    public void setHtlNameFr(String htlNameFr) {
        this.htlNameFr = htlNameFr;
    }

    @Basic
    @Column(name = "htl_people", nullable = false)
    public Integer getHtlPeople() {
        return htlPeople;
    }

    public void setHtlPeople(Integer htlPeople) {
        this.htlPeople = htlPeople;
    }

    @Basic
    @Column(name = "htl_price", nullable = true, precision = 2)
    public BigDecimal getHtlPrice() {
        return htlPrice;
    }

    public void setHtlPrice(BigDecimal htlPrice) {
        this.htlPrice = htlPrice;
    }

    @Basic
    @Column(name = "htl_spread", nullable = true, precision = 2)
    public BigDecimal getHtlSpread() {
        return htlSpread;
    }

    public void setHtlSpread(BigDecimal htlSpread) {
        this.htlSpread = htlSpread;
    }

    @Basic
    @Column(name = "htl_rule", nullable = true, length = 50)
    public String getHtlRule() {
        return htlRule;
    }

    public void setHtlRule(String htlRule) {
        this.htlRule = htlRule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmHoteltype that = (TmHoteltype) o;

        if (htpId != null ? !htpId.equals(that.htpId) : that.htpId != null) return false;
        if (htlId != null ? !htlId.equals(that.htlId) : that.htlId != null) return false;
        if (htlNameEn != null ? !htlNameEn.equals(that.htlNameEn) : that.htlNameEn != null) return false;
        if (htlNameFr != null ? !htlNameFr.equals(that.htlNameFr) : that.htlNameFr != null) return false;
        if (htlPeople != null ? !htlPeople.equals(that.htlPeople) : that.htlPeople != null) return false;
        if (htlPrice != null ? !htlPrice.equals(that.htlPrice) : that.htlPrice != null) return false;
        if (htlSpread != null ? !htlSpread.equals(that.htlSpread) : that.htlSpread != null) return false;
        if (htlRule != null ? !htlRule.equals(that.htlRule) : that.htlRule != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = htpId != null ? htpId.hashCode() : 0;
        result = 31 * result + (htlId != null ? htlId.hashCode() : 0);
        result = 31 * result + (htlNameEn != null ? htlNameEn.hashCode() : 0);
        result = 31 * result + (htlNameFr != null ? htlNameFr.hashCode() : 0);
        result = 31 * result + (htlPeople != null ? htlPeople.hashCode() : 0);
        result = 31 * result + (htlPrice != null ? htlPrice.hashCode() : 0);
        result = 31 * result + (htlSpread != null ? htlSpread.hashCode() : 0);
        result = 31 * result + (htlRule != null ? htlRule.hashCode() : 0);
        return result;
    }
}
