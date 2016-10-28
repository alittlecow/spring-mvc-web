package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_tourconfig", schema = "little", catalog = "")
public class TmTourconfig {
    private Integer id;
    private Integer tourId;
    private String type;
    private String name;
    private String contentEn;
    private String contentFr;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tour_id", nullable = false)
    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 50)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "content_en", nullable = true, length = -1)
    public String getContentEn() {
        return contentEn;
    }

    public void setContentEn(String contentEn) {
        this.contentEn = contentEn;
    }

    @Basic
    @Column(name = "content_fr", nullable = true, length = -1)
    public String getContentFr() {
        return contentFr;
    }

    public void setContentFr(String contentFr) {
        this.contentFr = contentFr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmTourconfig that = (TmTourconfig) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (tourId != null ? !tourId.equals(that.tourId) : that.tourId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (contentEn != null ? !contentEn.equals(that.contentEn) : that.contentEn != null) return false;
        if (contentFr != null ? !contentFr.equals(that.contentFr) : that.contentFr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (tourId != null ? tourId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (contentEn != null ? contentEn.hashCode() : 0);
        result = 31 * result + (contentFr != null ? contentFr.hashCode() : 0);
        return result;
    }
}
