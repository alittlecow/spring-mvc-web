package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_tour", schema = "little", catalog = "")
public class TmTour {
    private Integer id;
    private String code;
    private String deptCode;
    private Integer categoryId;
    private String titleEn;
    private String titleFr;
    private Integer startcity;
    private Integer endcity;
    private Integer days;
    private Integer rating;
    private String status;
    private Serializable operatetime;
    private String operator;
    private String subtitleEn;
    private String subtitleFr;
    private Integer advancedays;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code", nullable = false, length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "dept_code", nullable = true, length = 20)
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Basic
    @Column(name = "category_id", nullable = false)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "title_en", nullable = false, length = 100)
    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    @Basic
    @Column(name = "title_fr", nullable = false, length = 100)
    public String getTitleFr() {
        return titleFr;
    }

    public void setTitleFr(String titleFr) {
        this.titleFr = titleFr;
    }

    @Basic
    @Column(name = "startcity", nullable = false)
    public Integer getStartcity() {
        return startcity;
    }

    public void setStartcity(Integer startcity) {
        this.startcity = startcity;
    }

    @Basic
    @Column(name = "endcity", nullable = false)
    public Integer getEndcity() {
        return endcity;
    }

    public void setEndcity(Integer endcity) {
        this.endcity = endcity;
    }

    @Basic
    @Column(name = "days", nullable = false)
    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    @Basic
    @Column(name = "rating", nullable = false)
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "operatetime", nullable = false)
    public Serializable getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Serializable operatetime) {
        this.operatetime = operatetime;
    }

    @Basic
    @Column(name = "operator", nullable = false, length = 30)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "subtitle_en", nullable = true, length = 300)
    public String getSubtitleEn() {
        return subtitleEn;
    }

    public void setSubtitleEn(String subtitleEn) {
        this.subtitleEn = subtitleEn;
    }

    @Basic
    @Column(name = "subtitle_fr", nullable = true, length = 300)
    public String getSubtitleFr() {
        return subtitleFr;
    }

    public void setSubtitleFr(String subtitleFr) {
        this.subtitleFr = subtitleFr;
    }

    @Basic
    @Column(name = "advancedays", nullable = true)
    public Integer getAdvancedays() {
        return advancedays;
    }

    public void setAdvancedays(Integer advancedays) {
        this.advancedays = advancedays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmTour tmTour = (TmTour) o;

        if (id != null ? !id.equals(tmTour.id) : tmTour.id != null) return false;
        if (code != null ? !code.equals(tmTour.code) : tmTour.code != null) return false;
        if (deptCode != null ? !deptCode.equals(tmTour.deptCode) : tmTour.deptCode != null) return false;
        if (categoryId != null ? !categoryId.equals(tmTour.categoryId) : tmTour.categoryId != null) return false;
        if (titleEn != null ? !titleEn.equals(tmTour.titleEn) : tmTour.titleEn != null) return false;
        if (titleFr != null ? !titleFr.equals(tmTour.titleFr) : tmTour.titleFr != null) return false;
        if (startcity != null ? !startcity.equals(tmTour.startcity) : tmTour.startcity != null) return false;
        if (endcity != null ? !endcity.equals(tmTour.endcity) : tmTour.endcity != null) return false;
        if (days != null ? !days.equals(tmTour.days) : tmTour.days != null) return false;
        if (rating != null ? !rating.equals(tmTour.rating) : tmTour.rating != null) return false;
        if (status != null ? !status.equals(tmTour.status) : tmTour.status != null) return false;
        if (operatetime != null ? !operatetime.equals(tmTour.operatetime) : tmTour.operatetime != null) return false;
        if (operator != null ? !operator.equals(tmTour.operator) : tmTour.operator != null) return false;
        if (subtitleEn != null ? !subtitleEn.equals(tmTour.subtitleEn) : tmTour.subtitleEn != null) return false;
        if (subtitleFr != null ? !subtitleFr.equals(tmTour.subtitleFr) : tmTour.subtitleFr != null) return false;
        if (advancedays != null ? !advancedays.equals(tmTour.advancedays) : tmTour.advancedays != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (deptCode != null ? deptCode.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (titleEn != null ? titleEn.hashCode() : 0);
        result = 31 * result + (titleFr != null ? titleFr.hashCode() : 0);
        result = 31 * result + (startcity != null ? startcity.hashCode() : 0);
        result = 31 * result + (endcity != null ? endcity.hashCode() : 0);
        result = 31 * result + (days != null ? days.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (operatetime != null ? operatetime.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (subtitleEn != null ? subtitleEn.hashCode() : 0);
        result = 31 * result + (subtitleFr != null ? subtitleFr.hashCode() : 0);
        result = 31 * result + (advancedays != null ? advancedays.hashCode() : 0);
        return result;
    }
}
