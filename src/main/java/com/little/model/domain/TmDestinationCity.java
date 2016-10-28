package com.little.model.domain;

import javax.persistence.*;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_destination_city", schema = "little", catalog = "")
public class TmDestinationCity {
    private Integer id;
    private Integer cityId;
    private String titleEn;
    private String titleFr;
    private String descEn;
    private String descFr;
    private String status;
    private String photoOne;
    private String photoTwo;
    private String photoThree;
    private String photoFour;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "city_id", nullable = false)
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "title_en", nullable = false, length = 50)
    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    @Basic
    @Column(name = "title_fr", nullable = false, length = 50)
    public String getTitleFr() {
        return titleFr;
    }

    public void setTitleFr(String titleFr) {
        this.titleFr = titleFr;
    }

    @Basic
    @Column(name = "desc_en", nullable = true, length = -1)
    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    @Basic
    @Column(name = "desc_fr", nullable = true, length = -1)
    public String getDescFr() {
        return descFr;
    }

    public void setDescFr(String descFr) {
        this.descFr = descFr;
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
    @Column(name = "photo_one", nullable = true, length = 100)
    public String getPhotoOne() {
        return photoOne;
    }

    public void setPhotoOne(String photoOne) {
        this.photoOne = photoOne;
    }

    @Basic
    @Column(name = "photo_two", nullable = true, length = 100)
    public String getPhotoTwo() {
        return photoTwo;
    }

    public void setPhotoTwo(String photoTwo) {
        this.photoTwo = photoTwo;
    }

    @Basic
    @Column(name = "photo_three", nullable = true, length = 100)
    public String getPhotoThree() {
        return photoThree;
    }

    public void setPhotoThree(String photoThree) {
        this.photoThree = photoThree;
    }

    @Basic
    @Column(name = "photo_four", nullable = true, length = 100)
    public String getPhotoFour() {
        return photoFour;
    }

    public void setPhotoFour(String photoFour) {
        this.photoFour = photoFour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmDestinationCity that = (TmDestinationCity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (titleEn != null ? !titleEn.equals(that.titleEn) : that.titleEn != null) return false;
        if (titleFr != null ? !titleFr.equals(that.titleFr) : that.titleFr != null) return false;
        if (descEn != null ? !descEn.equals(that.descEn) : that.descEn != null) return false;
        if (descFr != null ? !descFr.equals(that.descFr) : that.descFr != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (photoOne != null ? !photoOne.equals(that.photoOne) : that.photoOne != null) return false;
        if (photoTwo != null ? !photoTwo.equals(that.photoTwo) : that.photoTwo != null) return false;
        if (photoThree != null ? !photoThree.equals(that.photoThree) : that.photoThree != null) return false;
        if (photoFour != null ? !photoFour.equals(that.photoFour) : that.photoFour != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (titleEn != null ? titleEn.hashCode() : 0);
        result = 31 * result + (titleFr != null ? titleFr.hashCode() : 0);
        result = 31 * result + (descEn != null ? descEn.hashCode() : 0);
        result = 31 * result + (descFr != null ? descFr.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (photoOne != null ? photoOne.hashCode() : 0);
        result = 31 * result + (photoTwo != null ? photoTwo.hashCode() : 0);
        result = 31 * result + (photoThree != null ? photoThree.hashCode() : 0);
        result = 31 * result + (photoFour != null ? photoFour.hashCode() : 0);
        return result;
    }
}
