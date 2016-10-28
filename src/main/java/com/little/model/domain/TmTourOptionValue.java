package com.little.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_tour_option_value", schema = "little", catalog = "")
public class TmTourOptionValue {
    private Integer tourId;
    private Integer valueId;
    private BigDecimal valuePrice;

    @Id
    @Column(name = "tour_id", nullable = false)
    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    @Basic
    @Column(name = "value_id", nullable = false)
    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    @Basic
    @Column(name = "value_price", nullable = false, precision = 2)
    public BigDecimal getValuePrice() {
        return valuePrice;
    }

    public void setValuePrice(BigDecimal valuePrice) {
        this.valuePrice = valuePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmTourOptionValue that = (TmTourOptionValue) o;

        if (tourId != null ? !tourId.equals(that.tourId) : that.tourId != null) return false;
        if (valueId != null ? !valueId.equals(that.valueId) : that.valueId != null) return false;
        if (valuePrice != null ? !valuePrice.equals(that.valuePrice) : that.valuePrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tourId != null ? tourId.hashCode() : 0;
        result = 31 * result + (valueId != null ? valueId.hashCode() : 0);
        result = 31 * result + (valuePrice != null ? valuePrice.hashCode() : 0);
        return result;
    }
}
