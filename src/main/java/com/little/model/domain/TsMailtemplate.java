package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "ts_mailtemplate", schema = "little", catalog = "")
public class TsMailtemplate {
    private Integer id;
    private String name;
    private String titleEn;
    private String titleFr;
    private String contentEn;
    private String contentFr;
    private Serializable operatetime;
    private Integer passId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "title_en", nullable = true, length = 100)
    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    @Basic
    @Column(name = "title_fr", nullable = true, length = 100)
    public String getTitleFr() {
        return titleFr;
    }

    public void setTitleFr(String titleFr) {
        this.titleFr = titleFr;
    }

    @Basic
    @Column(name = "content_en", nullable = true, length = 1000)
    public String getContentEn() {
        return contentEn;
    }

    public void setContentEn(String contentEn) {
        this.contentEn = contentEn;
    }

    @Basic
    @Column(name = "content_fr", nullable = true, length = 1000)
    public String getContentFr() {
        return contentFr;
    }

    public void setContentFr(String contentFr) {
        this.contentFr = contentFr;
    }

    @Basic
    @Column(name = "operatetime", nullable = true)
    public Serializable getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Serializable operatetime) {
        this.operatetime = operatetime;
    }

    @Basic
    @Column(name = "pass_id", nullable = true)
    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TsMailtemplate that = (TsMailtemplate) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (titleEn != null ? !titleEn.equals(that.titleEn) : that.titleEn != null) return false;
        if (titleFr != null ? !titleFr.equals(that.titleFr) : that.titleFr != null) return false;
        if (contentEn != null ? !contentEn.equals(that.contentEn) : that.contentEn != null) return false;
        if (contentFr != null ? !contentFr.equals(that.contentFr) : that.contentFr != null) return false;
        if (operatetime != null ? !operatetime.equals(that.operatetime) : that.operatetime != null) return false;
        if (passId != null ? !passId.equals(that.passId) : that.passId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (titleEn != null ? titleEn.hashCode() : 0);
        result = 31 * result + (titleFr != null ? titleFr.hashCode() : 0);
        result = 31 * result + (contentEn != null ? contentEn.hashCode() : 0);
        result = 31 * result + (contentFr != null ? contentFr.hashCode() : 0);
        result = 31 * result + (operatetime != null ? operatetime.hashCode() : 0);
        result = 31 * result + (passId != null ? passId.hashCode() : 0);
        return result;
    }
}
