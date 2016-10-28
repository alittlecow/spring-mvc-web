package com.little.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author pengx
 * @date 2016/10/24
 */
@Entity
@Table(name = "ts_dept", schema = "little", catalog = "")
public class TsDept {
    private Integer deptId;
    private String deptCode;
    private String levelCode;
    private String deptNameEn;
    private String deptNameFr;
    private String deptParent;
    private String status;
    private Serializable operateTime;
    private String passLoginname;

    @Id
    @Column(name = "dept_id", nullable = false)
    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
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
    @Column(name = "level_code", nullable = true, length = 20)
    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    @Basic
    @Column(name = "dept_name_en", nullable = true, length = 50)
    public String getDeptNameEn() {
        return deptNameEn;
    }

    public void setDeptNameEn(String deptNameEn) {
        this.deptNameEn = deptNameEn;
    }

    @Basic
    @Column(name = "dept_name_fr", nullable = true, length = 100)
    public String getDeptNameFr() {
        return deptNameFr;
    }

    public void setDeptNameFr(String deptNameFr) {
        this.deptNameFr = deptNameFr;
    }

    @Basic
    @Column(name = "dept_parent", nullable = true, length = 20)
    public String getDeptParent() {
        return deptParent;
    }

    public void setDeptParent(String deptParent) {
        this.deptParent = deptParent;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

        TsDept tsDept = (TsDept) o;

        if (deptId != null ? !deptId.equals(tsDept.deptId) : tsDept.deptId != null) return false;
        if (deptCode != null ? !deptCode.equals(tsDept.deptCode) : tsDept.deptCode != null) return false;
        if (levelCode != null ? !levelCode.equals(tsDept.levelCode) : tsDept.levelCode != null) return false;
        if (deptNameEn != null ? !deptNameEn.equals(tsDept.deptNameEn) : tsDept.deptNameEn != null) return false;
        if (deptNameFr != null ? !deptNameFr.equals(tsDept.deptNameFr) : tsDept.deptNameFr != null) return false;
        if (deptParent != null ? !deptParent.equals(tsDept.deptParent) : tsDept.deptParent != null) return false;
        if (status != null ? !status.equals(tsDept.status) : tsDept.status != null) return false;
        if (operateTime != null ? !operateTime.equals(tsDept.operateTime) : tsDept.operateTime != null) return false;
        if (passLoginname != null ? !passLoginname.equals(tsDept.passLoginname) : tsDept.passLoginname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptId != null ? deptId.hashCode() : 0;
        result = 31 * result + (deptCode != null ? deptCode.hashCode() : 0);
        result = 31 * result + (levelCode != null ? levelCode.hashCode() : 0);
        result = 31 * result + (deptNameEn != null ? deptNameEn.hashCode() : 0);
        result = 31 * result + (deptNameFr != null ? deptNameFr.hashCode() : 0);
        result = 31 * result + (deptParent != null ? deptParent.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + (passLoginname != null ? passLoginname.hashCode() : 0);
        return result;
    }
}
