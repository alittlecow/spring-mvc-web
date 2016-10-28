package com.little.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_value", schema = "little", catalog = "")
public class TmValue {
    private Integer id;
    private Integer optionId;
    private String valueEn;
    private String valueFr;
    private String notesEn;
    private String notesFr;
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
    @Column(name = "option_id", nullable = false)
    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    @Basic
    @Column(name = "value_en", nullable = false, length = 100)
    public String getValueEn() {
        return valueEn;
    }

    public void setValueEn(String valueEn) {
        this.valueEn = valueEn;
    }

    @Basic
    @Column(name = "value_fr", nullable = false, length = 100)
    public String getValueFr() {
        return valueFr;
    }

    public void setValueFr(String valueFr) {
        this.valueFr = valueFr;
    }

    @Basic
    @Column(name = "notes_en", nullable = false, length = 100)
    public String getNotesEn() {
        return notesEn;
    }

    public void setNotesEn(String notesEn) {
        this.notesEn = notesEn;
    }

    @Basic
    @Column(name = "notes_fr", nullable = false, length = 100)
    public String getNotesFr() {
        return notesFr;
    }

    public void setNotesFr(String notesFr) {
        this.notesFr = notesFr;
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

        TmValue tmValue = (TmValue) o;

        if (id != null ? !id.equals(tmValue.id) : tmValue.id != null) return false;
        if (optionId != null ? !optionId.equals(tmValue.optionId) : tmValue.optionId != null) return false;
        if (valueEn != null ? !valueEn.equals(tmValue.valueEn) : tmValue.valueEn != null) return false;
        if (valueFr != null ? !valueFr.equals(tmValue.valueFr) : tmValue.valueFr != null) return false;
        if (notesEn != null ? !notesEn.equals(tmValue.notesEn) : tmValue.notesEn != null) return false;
        if (notesFr != null ? !notesFr.equals(tmValue.notesFr) : tmValue.notesFr != null) return false;
        if (price != null ? !price.equals(tmValue.price) : tmValue.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (optionId != null ? optionId.hashCode() : 0);
        result = 31 * result + (valueEn != null ? valueEn.hashCode() : 0);
        result = 31 * result + (valueFr != null ? valueFr.hashCode() : 0);
        result = 31 * result + (notesEn != null ? notesEn.hashCode() : 0);
        result = 31 * result + (notesFr != null ? notesFr.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
