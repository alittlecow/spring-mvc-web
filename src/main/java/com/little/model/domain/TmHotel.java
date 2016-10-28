package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "tm_hotel", schema = "little", catalog = "")
public class TmHotel {
    private Integer htlId;
    private String deptCode;
    private String htlNameCn;
    private String htlNameEn;
    private String htlNameFr;
    private String htlTel;
    private String htlFax;
    private String htlDescEn;
    private String htlDescFr;
    private String htlAddressCn;
    private String htlAddressEn;
    private String htlAddressFr;
    private String htlStatus;
    private Serializable htlCreatetime;
    private String htlUser;
    private Integer htlCityId;

    @Id
    @Column(name = "htl_id", nullable = false)
    public Integer getHtlId() {
        return htlId;
    }

    public void setHtlId(Integer htlId) {
        this.htlId = htlId;
    }

    @Basic
    @Column(name = "dept_code", nullable = false, length = 20)
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Basic
    @Column(name = "htl_name_cn", nullable = false, length = 50)
    public String getHtlNameCn() {
        return htlNameCn;
    }

    public void setHtlNameCn(String htlNameCn) {
        this.htlNameCn = htlNameCn;
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
    @Column(name = "htl_tel", nullable = false, length = 50)
    public String getHtlTel() {
        return htlTel;
    }

    public void setHtlTel(String htlTel) {
        this.htlTel = htlTel;
    }

    @Basic
    @Column(name = "htl_fax", nullable = false, length = 50)
    public String getHtlFax() {
        return htlFax;
    }

    public void setHtlFax(String htlFax) {
        this.htlFax = htlFax;
    }

    @Basic
    @Column(name = "htl_desc_en", nullable = false, length = 50)
    public String getHtlDescEn() {
        return htlDescEn;
    }

    public void setHtlDescEn(String htlDescEn) {
        this.htlDescEn = htlDescEn;
    }

    @Basic
    @Column(name = "htl_desc_fr", nullable = false, length = 50)
    public String getHtlDescFr() {
        return htlDescFr;
    }

    public void setHtlDescFr(String htlDescFr) {
        this.htlDescFr = htlDescFr;
    }

    @Basic
    @Column(name = "htl_address_cn", nullable = false, length = 50)
    public String getHtlAddressCn() {
        return htlAddressCn;
    }

    public void setHtlAddressCn(String htlAddressCn) {
        this.htlAddressCn = htlAddressCn;
    }

    @Basic
    @Column(name = "htl_address_en", nullable = false, length = 50)
    public String getHtlAddressEn() {
        return htlAddressEn;
    }

    public void setHtlAddressEn(String htlAddressEn) {
        this.htlAddressEn = htlAddressEn;
    }

    @Basic
    @Column(name = "htl_address_fr", nullable = false, length = 50)
    public String getHtlAddressFr() {
        return htlAddressFr;
    }

    public void setHtlAddressFr(String htlAddressFr) {
        this.htlAddressFr = htlAddressFr;
    }

    @Basic
    @Column(name = "htl_status", nullable = false, length = 1)
    public String getHtlStatus() {
        return htlStatus;
    }

    public void setHtlStatus(String htlStatus) {
        this.htlStatus = htlStatus;
    }

    @Basic
    @Column(name = "htl_createtime", nullable = false)
    public Serializable getHtlCreatetime() {
        return htlCreatetime;
    }

    public void setHtlCreatetime(Serializable htlCreatetime) {
        this.htlCreatetime = htlCreatetime;
    }

    @Basic
    @Column(name = "htl_user", nullable = false, length = 50)
    public String getHtlUser() {
        return htlUser;
    }

    public void setHtlUser(String htlUser) {
        this.htlUser = htlUser;
    }

    @Basic
    @Column(name = "htl_city_id", nullable = false)
    public Integer getHtlCityId() {
        return htlCityId;
    }

    public void setHtlCityId(Integer htlCityId) {
        this.htlCityId = htlCityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmHotel tmHotel = (TmHotel) o;

        if (htlId != null ? !htlId.equals(tmHotel.htlId) : tmHotel.htlId != null) return false;
        if (deptCode != null ? !deptCode.equals(tmHotel.deptCode) : tmHotel.deptCode != null) return false;
        if (htlNameCn != null ? !htlNameCn.equals(tmHotel.htlNameCn) : tmHotel.htlNameCn != null) return false;
        if (htlNameEn != null ? !htlNameEn.equals(tmHotel.htlNameEn) : tmHotel.htlNameEn != null) return false;
        if (htlNameFr != null ? !htlNameFr.equals(tmHotel.htlNameFr) : tmHotel.htlNameFr != null) return false;
        if (htlTel != null ? !htlTel.equals(tmHotel.htlTel) : tmHotel.htlTel != null) return false;
        if (htlFax != null ? !htlFax.equals(tmHotel.htlFax) : tmHotel.htlFax != null) return false;
        if (htlDescEn != null ? !htlDescEn.equals(tmHotel.htlDescEn) : tmHotel.htlDescEn != null) return false;
        if (htlDescFr != null ? !htlDescFr.equals(tmHotel.htlDescFr) : tmHotel.htlDescFr != null) return false;
        if (htlAddressCn != null ? !htlAddressCn.equals(tmHotel.htlAddressCn) : tmHotel.htlAddressCn != null)
            return false;
        if (htlAddressEn != null ? !htlAddressEn.equals(tmHotel.htlAddressEn) : tmHotel.htlAddressEn != null)
            return false;
        if (htlAddressFr != null ? !htlAddressFr.equals(tmHotel.htlAddressFr) : tmHotel.htlAddressFr != null)
            return false;
        if (htlStatus != null ? !htlStatus.equals(tmHotel.htlStatus) : tmHotel.htlStatus != null) return false;
        if (htlCreatetime != null ? !htlCreatetime.equals(tmHotel.htlCreatetime) : tmHotel.htlCreatetime != null)
            return false;
        if (htlUser != null ? !htlUser.equals(tmHotel.htlUser) : tmHotel.htlUser != null) return false;
        if (htlCityId != null ? !htlCityId.equals(tmHotel.htlCityId) : tmHotel.htlCityId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = htlId != null ? htlId.hashCode() : 0;
        result = 31 * result + (deptCode != null ? deptCode.hashCode() : 0);
        result = 31 * result + (htlNameCn != null ? htlNameCn.hashCode() : 0);
        result = 31 * result + (htlNameEn != null ? htlNameEn.hashCode() : 0);
        result = 31 * result + (htlNameFr != null ? htlNameFr.hashCode() : 0);
        result = 31 * result + (htlTel != null ? htlTel.hashCode() : 0);
        result = 31 * result + (htlFax != null ? htlFax.hashCode() : 0);
        result = 31 * result + (htlDescEn != null ? htlDescEn.hashCode() : 0);
        result = 31 * result + (htlDescFr != null ? htlDescFr.hashCode() : 0);
        result = 31 * result + (htlAddressCn != null ? htlAddressCn.hashCode() : 0);
        result = 31 * result + (htlAddressEn != null ? htlAddressEn.hashCode() : 0);
        result = 31 * result + (htlAddressFr != null ? htlAddressFr.hashCode() : 0);
        result = 31 * result + (htlStatus != null ? htlStatus.hashCode() : 0);
        result = 31 * result + (htlCreatetime != null ? htlCreatetime.hashCode() : 0);
        result = 31 * result + (htlUser != null ? htlUser.hashCode() : 0);
        result = 31 * result + (htlCityId != null ? htlCityId.hashCode() : 0);
        return result;
    }
}
