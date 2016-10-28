package com.little.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_tourhotel", schema = "little", catalog = "")
public class TmTourhotel {
    private Integer tohId;
    private String htlId;
    private BigDecimal htlPrice;

    @Id
    @Column(name = "toh_id", nullable = false)
    public Integer getTohId() {
        return tohId;
    }

    public void setTohId(Integer tohId) {
        this.tohId = tohId;
    }

    @Basic
    @Column(name = "htl_id", nullable = false, length = 100)
    public String getHtlId() {
        return htlId;
    }

    public void setHtlId(String htlId) {
        this.htlId = htlId;
    }

    @Basic
    @Column(name = "htl_price", nullable = false, precision = 2)
    public BigDecimal getHtlPrice() {
        return htlPrice;
    }

    public void setHtlPrice(BigDecimal htlPrice) {
        this.htlPrice = htlPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmTourhotel that = (TmTourhotel) o;

        if (tohId != null ? !tohId.equals(that.tohId) : that.tohId != null) return false;
        if (htlId != null ? !htlId.equals(that.htlId) : that.htlId != null) return false;
        if (htlPrice != null ? !htlPrice.equals(that.htlPrice) : that.htlPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tohId != null ? tohId.hashCode() : 0;
        result = 31 * result + (htlId != null ? htlId.hashCode() : 0);
        result = 31 * result + (htlPrice != null ? htlPrice.hashCode() : 0);
        return result;
    }
}
