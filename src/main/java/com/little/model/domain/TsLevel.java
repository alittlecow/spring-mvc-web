package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "ts_level", schema = "little", catalog = "")
public class TsLevel {
    private String levelCode;
    private String levelNameEn;
    private String levelNameFr;
    private String levelParent;
    private Serializable operateTime;
    private String passLoginname;

    @Id
    @Column(name = "level_code", nullable = false, length = 20)
    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    @Basic
    @Column(name = "level_name_en", nullable = true, length = 50)
    public String getLevelNameEn() {
        return levelNameEn;
    }

    public void setLevelNameEn(String levelNameEn) {
        this.levelNameEn = levelNameEn;
    }

    @Basic
    @Column(name = "level_name_fr", nullable = true, length = 50)
    public String getLevelNameFr() {
        return levelNameFr;
    }

    public void setLevelNameFr(String levelNameFr) {
        this.levelNameFr = levelNameFr;
    }

    @Basic
    @Column(name = "level_parent", nullable = true, length = 20)
    public String getLevelParent() {
        return levelParent;
    }

    public void setLevelParent(String levelParent) {
        this.levelParent = levelParent;
    }

    @Basic
    @Column(name = "operate_time", nullable = true)
    public Serializable getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Serializable operateTime) {
        this.operateTime = operateTime;
    }

    @Basic
    @Column(name = "pass_loginname", nullable = true, length = 30)
    public String getPassLoginname() {
        return passLoginname;
    }

    public void setPassLoginname(String passLoginname) {
        this.passLoginname = passLoginname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TsLevel tsLevel = (TsLevel) o;

        if (levelCode != null ? !levelCode.equals(tsLevel.levelCode) : tsLevel.levelCode != null) return false;
        if (levelNameEn != null ? !levelNameEn.equals(tsLevel.levelNameEn) : tsLevel.levelNameEn != null) return false;
        if (levelNameFr != null ? !levelNameFr.equals(tsLevel.levelNameFr) : tsLevel.levelNameFr != null) return false;
        if (levelParent != null ? !levelParent.equals(tsLevel.levelParent) : tsLevel.levelParent != null) return false;
        if (operateTime != null ? !operateTime.equals(tsLevel.operateTime) : tsLevel.operateTime != null) return false;
        if (passLoginname != null ? !passLoginname.equals(tsLevel.passLoginname) : tsLevel.passLoginname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelCode != null ? levelCode.hashCode() : 0;
        result = 31 * result + (levelNameEn != null ? levelNameEn.hashCode() : 0);
        result = 31 * result + (levelNameFr != null ? levelNameFr.hashCode() : 0);
        result = 31 * result + (levelParent != null ? levelParent.hashCode() : 0);
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + (passLoginname != null ? passLoginname.hashCode() : 0);
        return result;
    }
}
